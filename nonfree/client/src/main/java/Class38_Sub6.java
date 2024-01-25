import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class38_Sub6 extends Class38 {

	@OriginalMember(owner = "client!qaa", name = "k", descriptor = "Z")
	private boolean aBoolean597 = false;

	@OriginalMember(owner = "client!qaa", name = "n", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "Lclient!mha;")
	private final Class219 aClass219_5;

	@OriginalMember(owner = "client!qaa", name = "h", descriptor = "Lclient!oca;")
	private Class249 aClass249_6;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!dia;Lclient!mha;)V")
	public Class38_Sub6(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class219 arg1) {
		super(arg0);
		this.aClass219_5 = arg1;
		if (this.aClass219_5.aClass85_Sub4_3 != null && super.aClass13_Sub2_39.aBoolean169 && super.aClass13_Sub2_39.aBoolean173) {
			@Pc(30) Class184 local30 = Static189.method5096(35633, super.aClass13_Sub2_39, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class184 local37 = Static189.method5096(35632, super.aClass13_Sub2_39, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass249_6 = Static69.method1361(new Class184[] { local30, local37 }, super.aClass13_Sub2_39);
			this.aBoolean598 = this.aClass249_6 != null;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class85_Sub1 local12 = super.aClass13_Sub2_39.method1989();
		if (!this.aBoolean598 || local12 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass13_Sub2_39.aFloatArray17[1])) * 2.0F + 1.0F;
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024(local12);
		super.aClass13_Sub2_39.method2008(0);
		super.aClass13_Sub2_39.method2024(this.aClass219_5.aClass85_Sub4_3);
		@Pc(57) long local57 = this.aClass249_6.aLong213;
		OpenGL.glUseProgramObjectARB(local57);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local57, "sunDir"), -super.aClass13_Sub2_39.aFloatArray17[0], -super.aClass13_Sub2_39.aFloatArray17[1], -super.aClass13_Sub2_39.aFloatArray17[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local57, "sunColour"), super.aClass13_Sub2_39.aFloat54 * local31, super.aClass13_Sub2_39.aFloat57 * local31, super.aClass13_Sub2_39.aFloat46 * local31, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local57, "sunExponent"), Math.abs(super.aClass13_Sub2_39.aFloatArray17[1]) * 928.0F + 64.0F);
		this.aBoolean597 = true;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		if (!this.aBoolean597) {
			return;
		}
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024((Class85) null);
		super.aClass13_Sub2_39.method2008(0);
		super.aClass13_Sub2_39.method2024((Class85) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean597 = false;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean597) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg1 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass249_6.aLong213;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (super.aClass13_Sub2_39.anInt2155 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean597) {
			super.aClass13_Sub2_39.method2024(arg0);
			super.aClass13_Sub2_39.method1960(arg1);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return this.aBoolean598;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
	}
}
