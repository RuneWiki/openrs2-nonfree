import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class44_Sub9 extends Class44 {

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "Z")
	private boolean aBoolean653 = false;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!lm;")
	private final Class188 aClass188_6;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Lclient!vv;")
	private Class308 aClass308_7;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!jj;Lclient!lm;)V")
	public Class44_Sub9(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class188 arg1) {
		super(arg0);
		this.aClass188_6 = arg1;
		if (this.aClass188_6.aClass4_Sub1_2 != null && super.aClass62_Sub3_43.aBoolean293 && super.aClass62_Sub3_43.aBoolean274) {
			@Pc(30) Class289 local30 = Static89.method1961(35633, super.aClass62_Sub3_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class289 local37 = Static89.method1961(35632, super.aClass62_Sub3_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass308_7 = Static392.method5719(new Class289[] { local30, local37 }, super.aClass62_Sub3_43);
			this.aBoolean652 = this.aClass308_7 != null;
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class4_Sub4 local8 = super.aClass62_Sub3_43.method3996();
		if (!this.aBoolean652 || local8 == null) {
			return;
		}
		@Pc(35) float local35 = (1.0F - Math.abs(super.aClass62_Sub3_43.aFloatArray34[1])) * 2.0F + 1.0F;
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method4007(local8);
		super.aClass62_Sub3_43.method4009(0);
		super.aClass62_Sub3_43.method4007(this.aClass188_6.aClass4_Sub1_2);
		@Pc(61) long local61 = this.aClass308_7.aLong245;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass62_Sub3_43.aFloatArray34[0], -super.aClass62_Sub3_43.aFloatArray34[1], -super.aClass62_Sub3_43.aFloatArray34[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), super.aClass62_Sub3_43.aFloat204 * local35, local35 * super.aClass62_Sub3_43.aFloat185, super.aClass62_Sub3_43.aFloat190 * local35, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass62_Sub3_43.aFloatArray34[1]) * 928.0F + 64.0F);
		this.aBoolean653 = true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		if (!this.aBoolean653) {
			return;
		}
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method4007(null);
		super.aClass62_Sub3_43.method4009(0);
		super.aClass62_Sub3_43.method4007(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean653 = false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean653) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg1 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass308_7.aLong245;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (super.aClass62_Sub3_43.anInt4623 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		if (!this.aBoolean653) {
			super.aClass62_Sub3_43.method4007(arg1);
			super.aClass62_Sub3_43.method3999(arg0);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
	}
}
