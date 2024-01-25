import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
	private boolean aBoolean361 = false;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!mt;")
	private final Class171 aClass171_5;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!sj;")
	private Class230 aClass230_7;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!bl;Lclient!mt;)V")
	public Class5_Sub7(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		this.aClass171_5 = arg1;
		if (this.aClass171_5.aClass40_Sub2_2 != null && super.aClass28_Sub1_42.aBoolean50 && super.aClass28_Sub1_42.aBoolean44) {
			@Pc(30) Class243 local30 = Static239.method3725(35633, super.aClass28_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class243 local37 = Static239.method3725(35632, super.aClass28_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass230_7 = Static313.method4477(super.aClass28_Sub1_42, new Class243[] { local30, local37 });
			this.aBoolean361 = this.aClass230_7 != null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class40_Sub4 local16 = super.aClass28_Sub1_42.method674();
		if (!this.aBoolean361 || local16 == null) {
			return;
		}
		@Pc(35) float local35 = (1.0F - Math.abs(super.aClass28_Sub1_42.aFloatArray6[1])) * 2.0F + 1.0F;
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method654(local16);
		super.aClass28_Sub1_42.method650(0);
		super.aClass28_Sub1_42.method654(this.aClass171_5.aClass40_Sub2_2);
		@Pc(61) long local61 = this.aClass230_7.aLong180;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass28_Sub1_42.aFloatArray6[0], -super.aClass28_Sub1_42.aFloatArray6[1], -super.aClass28_Sub1_42.aFloatArray6[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), local35 * super.aClass28_Sub1_42.aFloat26, super.aClass28_Sub1_42.aFloat8 * local35, super.aClass28_Sub1_42.aFloat19 * local35, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass28_Sub1_42.aFloatArray6[1]) * 928.0F + 64.0F);
		this.aBoolean360 = true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		if (!this.aBoolean360) {
			return;
		}
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method654(null);
		super.aClass28_Sub1_42.method650(0);
		super.aClass28_Sub1_42.method654(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean360) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg0 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg1 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg1 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass230_7.aLong180;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (super.aClass28_Sub1_42.anInt737 * local20 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return this.aBoolean361;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean360) {
			super.aClass28_Sub1_42.method654(arg0);
			super.aClass28_Sub1_42.method678(arg1);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
	}
}
