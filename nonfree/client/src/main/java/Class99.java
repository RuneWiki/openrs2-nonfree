import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class99 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!ne;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Lclient!ne;")
	private Class141 aClass141_2;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "Lclient!b;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "Lclient!b;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_17;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class99(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass122_Sub2_17 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!nc;Lclient!nc;)Z")
	public boolean method2277(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class66_Sub3 arg1) {
		if (!this.method2281()) {
			return false;
		}
		@Pc(8) opengl local8 = this.aClass122_Sub2_17.anOpengl2;
		@Pc(12) Class109 local12 = this.aClass122_Sub2_17.aClass109_3;
		this.aClass122_Sub2_17.method4833(local12);
		local8.glPushMatrix();
		local8.glLoadIdentity();
		local8.glMatrixMode(5889);
		local8.glPushMatrix();
		local8.glLoadIdentity();
		local8.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local8.glPushAttrib(2048);
		local8.glViewport(0, 0, arg1.anInt4189, arg1.anInt4187);
		this.aClass122_Sub2_17.method4864(arg0);
		local8.glUseProgramObjectARB(this.aClass17_2.anInt524);
		local8.glUniform1iARB(local8.glGetUniformLocation(this.aClass17_2.anInt524, "heightMap"), 0);
		local8.glUniform2fARB(local8.glGetUniformLocation(this.aClass17_2.anInt524, "sampleSize"), 1.0F / (float) arg0.anInt4189, 1.0F / (float) arg0.anInt4187);
		@Pc(84) boolean local84 = true;
		for (@Pc(86) int local86 = 0; local86 < arg1.anInt4188; local86++) {
			@Pc(97) float local97 = (float) local86 / (float) arg1.anInt4188;
			local12.method2438(arg1, local86);
			if (!local12.method2437()) {
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
		local12.method2429(0);
		this.aClass122_Sub2_17.method4865(local12);
		return local84;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!nc;)Z")
	public boolean method2278(@OriginalArg(0) Class66_Sub3 arg0) {
		return this.method2279(arg0, 8.0F, 8.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.5F, 0.5F);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!nc;IFFFFFFFF)Z")
	private boolean method2279(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		if (this.aClass17_3 == null) {
			this.aClass17_3 = Static17.method400(this.aClass122_Sub2_17, new Class141[] { this.aClass141_1, this.aClass141_2 });
		}
		return this.aClass17_3 == null ? false : this.method2280(arg0, this.aClass17_3, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!nc;Lclient!b;FFFFFFFF)Z")
	private boolean method2280(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_17.anOpengl2;
		@Pc(7) Class109 local7 = this.aClass122_Sub2_17.aClass109_3;
		this.aClass122_Sub2_17.method4833(local7);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, arg0.anInt4189, arg0.anInt4187);
		local3.glUseProgramObjectARB(arg1.anInt524);
		local3.glUniform2fARB(local3.glGetUniformLocation(arg1.anInt524, "amplitude"), arg8, arg9);
		local3.glUniform3fARB(local3.glGetUniformLocation(arg1.anInt524, "scale"), arg2, arg3, arg4);
		local3.glUniform3fARB(local3.glGetUniformLocation(arg1.anInt524, "scalecoef"), arg5, arg6, arg7);
		@Pc(76) boolean local76 = true;
		for (@Pc(78) int local78 = 0; local78 < arg0.anInt4188; local78++) {
			@Pc(91) float local91 = arg4 * (float) local78 / (float) arg0.anInt4188;
			local7.method2438(arg0, local78);
			if (!local7.method2437()) {
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
		local7.method2429(0);
		this.aClass122_Sub2_17.method4865(local7);
		return local76;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()Z")
	public boolean method2281() {
		if (this.aClass122_Sub2_17.aBoolean355 && this.aClass122_Sub2_17.aBoolean373 && this.aClass17_2 == null) {
			@Pc(16) Class141 local16 = Static207.method3582(this.aClass122_Sub2_17, 35632, "uniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, 1.0))*0.5, 1.0);\n}\n");
			this.aClass17_2 = Static17.method400(this.aClass122_Sub2_17, new Class141[] { local16 });
		}
		return this.aClass17_2 != null;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "()Z")
	public boolean method2282() {
		if (this.aClass122_Sub2_17.aBoolean355 && this.aClass122_Sub2_17.aBoolean373) {
			if (this.aClass141_1 == null) {
				this.aClass141_1 = Static207.method3582(this.aClass122_Sub2_17, 35632, "const float XO=1.0\n;const float YO=47.0\n;const float ZO=103.0\n;vec4 random(const vec4 s) {\nvec4 z=mod(s,5612.0);\nz=mod(z,2.0*3.141628);\nreturn fract(cos(z)*56784.5354);\n}\nfloat cnoise(const vec3 c, const vec3 period) {\nvec3 ic1=floor(c);\nvec3 fc=c-ic1;\nic1=mod(ic1, period);\nvec3 ic2=mod(ic1+1.0, period);\nvec3 d=(ic2-ic1)*vec3(XO, YO, ZO);\nfloat base=dot(ic1, vec3(XO, YO, ZO));\nvec4 s1=random(base+vec4(0.0,     d.y,     d.z,     d.y+d.z));\nvec4 s2=random(base+vec4(d.x, d.x+d.y, d.x+d.z, d.x+d.y+d.z));\nvec3 f=fc*fc*fc*(fc*(6.0*fc-15.0)+10.0);\nvec4 xi=mix(s1, s2, fc.x);\nreturn 1.0-2.0*mix(mix(xi.x, xi.y, fc.y), mix(xi.z, xi.w, fc.y), fc.z);\n}\n");
			}
			if (this.aClass141_2 == null) {
				this.aClass141_2 = Static207.method3582(this.aClass122_Sub2_17, 35632, "float cnoise(const vec3 c, const vec3 period);\nuniform vec3 scale;\nuniform vec3 scalecoef;\nuniform vec2 amplitude;\nvoid main() {\nfloat n=0.0, a=amplitude.x;\nvec3 p=scale, c=gl_TexCoord[0].xyz;for (int i=0; i<8; ++i) {\nn+=cnoise(c, p)*a;\na*=amplitude.y;\nc*=scalecoef;\np*=scalecoef;\n}\ngl_FragColor=vec4(n*0.5+0.5);\n}\n");
			}
		}
		return this.aClass141_1 != null && this.aClass141_2 != null;
	}
}
