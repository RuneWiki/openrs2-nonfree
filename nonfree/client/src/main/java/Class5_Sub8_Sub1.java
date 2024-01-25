import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class5_Sub8_Sub1 extends Class5_Sub8 {

	@OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
	private int anInt8331;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "Lclient!fs;")
	private Class103 aClass103_5;

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "Lclient!hp;")
	private Class4_Sub2 aClass4_Sub2_4;

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "I")
	private int anInt8337;

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "Lclient!vv;")
	private Class308 aClass308_3;

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
	private int anInt8341;

	@OriginalMember(owner = "client!tu", name = "L", descriptor = "Lclient!hp;")
	private Class4_Sub2 aClass4_Sub2_5;

	@OriginalMember(owner = "client!tu", name = "M", descriptor = "Lclient!vv;")
	private Class308 aClass308_4;

	@OriginalMember(owner = "client!tu", name = "N", descriptor = "Lclient!vv;")
	private Class308 aClass308_5;

	@OriginalMember(owner = "client!tu", name = "O", descriptor = "Lclient!vv;")
	private Class308 aClass308_6;

	@OriginalMember(owner = "client!tu", name = "Q", descriptor = "Lclient!fs;")
	private Class103 aClass103_6;

	@OriginalMember(owner = "client!tu", name = "R", descriptor = "[Lclient!hp;")
	private Class4_Sub2[] aClass4_Sub2Array4;

	@OriginalMember(owner = "client!tu", name = "S", descriptor = "I")
	private int anInt8342;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class5_Sub8_Sub1(@OriginalArg(0) Class62_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method6711() {
		this.aClass4_Sub2Array4 = null;
		this.aClass4_Sub2_4 = null;
		this.aClass308_3 = null;
		this.aClass4_Sub2_5 = null;
		this.aClass103_6 = null;
		this.aClass308_4 = null;
		this.aClass308_6 = null;
		this.aClass308_5 = null;
		this.aClass103_5 = null;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6712() {
		return this.aClass103_5 != null;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!hp;ZLclient!hp;)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(3) Class4_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass4_Sub2Array4 == null) {
			super.aClass62_Sub3_38.method4007(arg2);
			super.aClass62_Sub3_38.method3948(this.aClass103_5);
			this.aClass103_5.method2737(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass308_5.aLong245;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static170.aFloat162, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8337, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8337, (float) this.anInt8331);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8331);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass62_Sub3_38.method3948(this.aClass103_6);
			@Pc(108) int local108 = Static7.method265(this.anInt8337);
			@Pc(113) int local113 = Static7.method265(this.anInt8331);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass103_6.method2743(this.aClass4_Sub2Array4[local115], 0);
				if (local115 == 0) {
					super.aClass62_Sub3_38.method4007(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8337, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8337, (float) this.anInt8331);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8331);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass62_Sub3_38.method4007(this.aClass4_Sub2Array4[local115 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				local115++;
			}
			super.aClass62_Sub3_38.method3962(this.aClass103_6);
			super.aClass62_Sub3_38.method4007(this.aClass4_Sub2Array4[local115 - 1]);
			super.aClass62_Sub3_38.method3948(this.aClass103_5);
			this.aClass103_5.method2737(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(275) long local275 = this.aClass308_4.aLong245;
			OpenGL.glUseProgramObjectARB(local275);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local275, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "params"), Static170.aFloat162, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass103_5.method2737(1);
		super.aClass62_Sub3_38.method4007(this.aClass4_Sub2_4);
		local46 = this.aClass308_6.aLong245;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass103_5.method2737(0);
		super.aClass62_Sub3_38.method4007(this.aClass4_Sub2_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		super.aClass62_Sub3_38.method3962(this.aClass103_5);
		@Pc(435) long local435 = this.aClass308_3.aLong245;
		OpenGL.glUseProgramObjectARB(local435);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local435, "params"), Static172.aFloat367, Static116.aFloat134, 0.0F);
		super.aClass62_Sub3_38.method4009(1);
		super.aClass62_Sub3_38.method4007(this.aClass4_Sub2_4);
		super.aClass62_Sub3_38.method4009(0);
		super.aClass62_Sub3_38.method4007(arg2);
	}

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "(I)Z")
	public boolean method6719() {
		return super.aClass62_Sub3_38.aBoolean282 && super.aClass62_Sub3_38.aBoolean274 && super.aClass62_Sub3_38.aBoolean286;
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6716() {
		if (!super.aClass62_Sub3_38.aBoolean282 || !super.aClass62_Sub3_38.aBoolean274 || !super.aClass62_Sub3_38.aBoolean286) {
			return false;
		}
		this.aClass103_5 = new Class103(super.aClass62_Sub3_38);
		this.aClass4_Sub2_4 = new Class4_Sub2(super.aClass62_Sub3_38, 3553, 34842, 256, 256);
		this.aClass4_Sub2_4.method5467(false, false);
		this.aClass4_Sub2_5 = new Class4_Sub2(super.aClass62_Sub3_38, 3553, 34842, 256, 256);
		this.aClass4_Sub2_5.method5467(false, false);
		super.aClass62_Sub3_38.method3948(this.aClass103_5);
		this.aClass103_5.method2743(this.aClass4_Sub2_4, 0);
		this.aClass103_5.method2743(this.aClass4_Sub2_5, 1);
		this.aClass103_5.method2737(0);
		if (!this.aClass103_5.method2741()) {
			super.aClass62_Sub3_38.method3962(this.aClass103_5);
			return false;
		}
		super.aClass62_Sub3_38.method3962(this.aClass103_5);
		this.aClass308_5 = Static392.method5719(new Class289[] { Static89.method1961(35632, super.aClass62_Sub3_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass62_Sub3_38);
		this.aClass308_4 = Static392.method5719(new Class289[] { Static89.method1961(35632, super.aClass62_Sub3_38, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass62_Sub3_38);
		this.aClass308_3 = Static392.method5719(new Class289[] { Static89.method1961(35632, super.aClass62_Sub3_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass62_Sub3_38);
		this.aClass308_6 = Static392.method5719(new Class289[] { Static89.method1961(35632, super.aClass62_Sub3_38, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass62_Sub3_38);
		return this.aClass308_4 != null && this.aClass308_5 != null && this.aClass308_3 != null && this.aClass308_6 != null;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8337 = arg1;
		this.anInt8331 = arg0;
		@Pc(16) int local16 = Static7.method265(this.anInt8337);
		@Pc(26) int local26 = Static7.method265(this.anInt8331);
		if (this.anInt8341 == local16 && this.anInt8342 == local26) {
			return;
		}
		@Pc(43) int local43;
		if (this.aClass4_Sub2Array4 != null) {
			for (local43 = 0; local43 < this.aClass4_Sub2Array4.length; local43++) {
				this.aClass4_Sub2Array4[local43].method5494();
			}
			this.aClass4_Sub2Array4 = null;
		}
		if (local16 <= 256 && local26 <= 256) {
			this.aClass103_6 = null;
		} else {
			local43 = local16;
			@Pc(75) int local75 = local26;
			@Pc(77) int local77 = 0;
			label58: while (true) {
				if (local43 <= 256 && local75 <= 256) {
					if (this.aClass103_6 == null) {
						this.aClass103_6 = new Class103(super.aClass62_Sub3_38);
					}
					this.aClass4_Sub2Array4 = new Class4_Sub2[local77];
					local75 = local26;
					local43 = local16;
					local77 = 0;
					while (true) {
						if (local43 <= 256 && local75 <= 256) {
							break label58;
						}
						this.aClass4_Sub2Array4[local77++] = new Class4_Sub2(super.aClass62_Sub3_38, 3553, 34842, local43, local75);
						if (local75 > 256) {
							local75 >>= 0x1;
						}
						if (local43 > 256) {
							local43 >>= 0x1;
						}
					}
				}
				if (local75 > 256) {
					local75 >>= 0x1;
				}
				if (local43 > 256) {
					local43 >>= 0x1;
				}
				local77++;
			}
		}
		this.anInt8342 = local26;
		this.anInt8341 = local16;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	@Override
	public void method6706(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass62_Sub3_38.method4009(1);
		super.aClass62_Sub3_38.method4007(null);
		super.aClass62_Sub3_38.method4009(0);
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(Z)I")
	@Override
	public int method6715() {
		return 1;
	}
}
