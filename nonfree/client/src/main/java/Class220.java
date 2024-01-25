import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class220 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!ln;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "Lclient!ge;")
	private Class81 aClass81_6;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!ge;")
	private Class81 aClass81_7;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "Lclient!ln;")
	private Class132 aClass132_2;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_43;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class220(@OriginalArg(0) Class89_Sub1 arg0) {
		this.aClass89_Sub1_43 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()Z")
	public boolean method5713() {
		if (this.aClass89_Sub1_43.aBoolean197 && this.aClass89_Sub1_43.aBoolean200) {
			if (this.aClass132_1 == null) {
				this.aClass132_1 = Static190.method3449(this.aClass89_Sub1_43, 35632, "const float XO=1.0\n;const float YO=47.0\n;const float ZO=103.0\n;vec4 random(const vec4 s) {\nvec4 z=mod(s,5612.0);\nz=mod(z,2.0*3.141628);\nreturn fract(cos(z)*56784.5354);\n}\nfloat cnoise(const vec3 c, const vec3 period) {\nvec3 ic1=floor(c);\nvec3 fc=c-ic1;\nic1=mod(ic1, period);\nvec3 ic2=mod(ic1+1.0, period);\nvec3 d=(ic2-ic1)*vec3(XO, YO, ZO);\nfloat base=dot(ic1, vec3(XO, YO, ZO));\nvec4 s1=random(base+vec4(0.0,     d.y,     d.z,     d.y+d.z));\nvec4 s2=random(base+vec4(d.x, d.x+d.y, d.x+d.z, d.x+d.y+d.z));\nvec3 f=fc*fc*fc*(fc*(6.0*fc-15.0)+10.0);\nvec4 xi=mix(s1, s2, fc.x);\nreturn 1.0-2.0*mix(mix(xi.x, xi.y, fc.y), mix(xi.z, xi.w, fc.y), fc.z);\n}\n");
			}
			if (this.aClass132_2 == null) {
				this.aClass132_2 = Static190.method3449(this.aClass89_Sub1_43, 35632, "float cnoise(const vec3 c, const vec3 period);\nuniform vec3 scale;\nuniform vec3 scalecoef;\nuniform vec2 amplitude;\nvoid main() {\nfloat n=0.0, a=amplitude.x;\nvec3 p=scale, c=gl_TexCoord[0].xyz;for (int i=0; i<8; ++i) {\nn+=cnoise(c, p)*a;\na*=amplitude.y;\nc*=scalecoef;\np*=scalecoef;\n}\ngl_FragColor=vec4(n*0.5+0.5);\n}\n");
			}
		}
		return this.aClass132_1 != null && this.aClass132_2 != null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hj;Lclient!hj;)Z")
	public boolean method5714(@OriginalArg(0) Class92_Sub1 arg0, @OriginalArg(1) Class92_Sub1 arg1) {
		if (!this.method5715()) {
			return false;
		}
		@Pc(8) opengl local8 = this.aClass89_Sub1_43.anOpengl2;
		@Pc(12) Class85 local12 = this.aClass89_Sub1_43.aClass85_3;
		this.aClass89_Sub1_43.method2468(local12);
		local8.glPushMatrix();
		local8.glLoadIdentity();
		local8.glMatrixMode(5889);
		local8.glPushMatrix();
		local8.glLoadIdentity();
		local8.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local8.glPushAttrib(2048);
		local8.glViewport(0, 0, arg1.anInt2684, arg1.anInt2685);
		this.aClass89_Sub1_43.method2445(arg0);
		local8.glUseProgramObjectARB(this.aClass81_7.anInt2398);
		local8.glUniform1iARB(local8.glGetUniformLocation(this.aClass81_7.anInt2398, "heightMap"), 0);
		local8.glUniform2fARB(local8.glGetUniformLocation(this.aClass81_7.anInt2398, "sampleSize"), 1.0F / (float) arg0.anInt2684, 1.0F / (float) arg0.anInt2685);
		@Pc(84) boolean local84 = true;
		for (@Pc(86) int local86 = 0; local86 < arg1.anInt2683; local86++) {
			@Pc(97) float local97 = (float) local86 / (float) arg1.anInt2683;
			local12.method2073(arg1, local86);
			if (!local12.method2069()) {
				local84 = false;
				break;
			}
			local8.glBegin(7);
			local8.glTexCoord3f(0.0F, 0.0F, local97);
			local8.glVertex2f(0.0F, 0.0F);
			local8.glTexCoord3f(1.0F, 0.0F, local97);
			local8.glVertex2f(1.0F, 0.0F);
			local8.glTexCoord3f(1.0F, 1.0F, local97);
			local8.glVertex2f(1.0F, 1.0F);
			local8.glTexCoord3f(0.0F, 1.0F, local97);
			local8.glVertex2f(0.0F, 1.0F);
			local8.glEnd();
		}
		local8.glUseProgramObjectARB(0);
		local8.glPopAttrib();
		local8.glPopMatrix();
		local8.glMatrixMode(5888);
		local8.glPopMatrix();
		local12.method2072(0);
		this.aClass89_Sub1_43.method2447(local12);
		return local84;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "()Z")
	public boolean method5715() {
		if (this.aClass89_Sub1_43.aBoolean197 && this.aClass89_Sub1_43.aBoolean200 && this.aClass81_7 == null) {
			@Pc(16) Class132 local16 = Static190.method3449(this.aClass89_Sub1_43, 35632, "uniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, 1.0))*0.5, 1.0);\n}\n");
			this.aClass81_7 = Static99.method1992(this.aClass89_Sub1_43, new Class132[] { local16 });
		}
		return this.aClass81_7 != null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hj;Lclient!ge;FFFFFFFF)Z")
	private boolean method5716(@OriginalArg(0) Class92_Sub1 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_43.anOpengl2;
		@Pc(7) Class85 local7 = this.aClass89_Sub1_43.aClass85_3;
		this.aClass89_Sub1_43.method2468(local7);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, arg0.anInt2684, arg0.anInt2685);
		local3.glUseProgramObjectARB(arg1.anInt2398);
		local3.glUniform2fARB(local3.glGetUniformLocation(arg1.anInt2398, "amplitude"), arg8, arg9);
		local3.glUniform3fARB(local3.glGetUniformLocation(arg1.anInt2398, "scale"), arg2, arg3, arg4);
		local3.glUniform3fARB(local3.glGetUniformLocation(arg1.anInt2398, "scalecoef"), arg5, arg6, arg7);
		@Pc(76) boolean local76 = true;
		for (@Pc(78) int local78 = 0; local78 < arg0.anInt2683; local78++) {
			@Pc(91) float local91 = arg4 * (float) local78 / (float) arg0.anInt2683;
			local7.method2073(arg0, local78);
			if (!local7.method2069()) {
				local76 = false;
				break;
			}
			local3.glBegin(7);
			local3.glTexCoord3f(0.0F, 0.0F, local91);
			local3.glVertex2f(0.0F, 0.0F);
			local3.glTexCoord3f(arg2, 0.0F, local91);
			local3.glVertex2f(1.0F, 0.0F);
			local3.glTexCoord3f(arg2, arg3, local91);
			local3.glVertex2f(1.0F, 1.0F);
			local3.glTexCoord3f(0.0F, arg3, local91);
			local3.glVertex2f(0.0F, 1.0F);
			local3.glEnd();
		}
		local3.glUseProgramObjectARB(0);
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
		local3.glPopMatrix();
		local7.method2072(0);
		this.aClass89_Sub1_43.method2447(local7);
		return local76;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hj;)Z")
	public boolean method5717(@OriginalArg(0) Class92_Sub1 arg0) {
		return this.method5718(arg0, 8.0F, 8.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.5F, 0.5F);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!hj;IFFFFFFFF)Z")
	private boolean method5718(@OriginalArg(0) Class92_Sub1 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		if (this.aClass81_6 == null) {
			this.aClass81_6 = Static99.method1992(this.aClass89_Sub1_43, new Class132[] { this.aClass132_1, this.aClass132_2 });
		}
		return this.aClass81_6 == null ? false : this.method5716(arg0, this.aClass81_6, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
