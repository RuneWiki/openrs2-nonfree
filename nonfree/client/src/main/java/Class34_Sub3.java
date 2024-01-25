import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
	private boolean aBoolean290 = false;

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "Z")
	private boolean aBoolean291 = false;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "Lclient!lba;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!nfa;")
	private Class241 aClass241_1;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!rda;Lclient!lba;)V")
	public Class34_Sub3(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_1 = arg1;
		if (this.aClass201_1.aClass24_Sub2_1 != null && super.aClass126_Sub3_39.aBoolean688 && super.aClass126_Sub3_39.aBoolean687) {
			@Pc(30) Class46 local30 = Static304.method4409("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass126_Sub3_39);
			@Pc(37) Class46 local37 = Static304.method4409("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, super.aClass126_Sub3_39);
			this.aClass241_1 = Static38.method711(super.aClass126_Sub3_39, new Class46[] { local30, local37 });
			this.aBoolean291 = this.aClass241_1 != null;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (!this.aBoolean290) {
			super.aClass126_Sub3_39.method7113(arg1);
			super.aClass126_Sub3_39.method7105(arg0);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class24_Sub3 local8 = super.aClass126_Sub3_39.method7099();
		if (!this.aBoolean291 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass126_Sub3_39.aFloatArray65[1])) * 2.0F + 1.0F;
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113(local8);
		super.aClass126_Sub3_39.method7104(0);
		super.aClass126_Sub3_39.method7113(this.aClass201_1.aClass24_Sub2_1);
		@Pc(53) long local53 = this.aClass241_1.aLong184;
		OpenGL.glUseProgramObjectARB(local53);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "sunDir"), -super.aClass126_Sub3_39.aFloatArray65[0], -super.aClass126_Sub3_39.aFloatArray65[1], -super.aClass126_Sub3_39.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local53, "sunColour"), local27 * super.aClass126_Sub3_39.aFloat164, local27 * super.aClass126_Sub3_39.aFloat161, super.aClass126_Sub3_39.aFloat165 * local27, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local53, "sunExponent"), Math.abs(super.aClass126_Sub3_39.aFloatArray65[1]) * 928.0F + 64.0F);
		this.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return this.aBoolean291;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean290) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg0 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg1 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg1 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass241_1.aLong184;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (super.aClass126_Sub3_39.anInt8272 * local20 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		if (!this.aBoolean290) {
			return;
		}
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113((Class24) null);
		super.aClass126_Sub3_39.method7104(0);
		super.aClass126_Sub3_39.method7113((Class24) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean290 = false;
	}
}
