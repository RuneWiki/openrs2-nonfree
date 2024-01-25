import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!eba", name = "z", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "Lclient!tf;")
	private final Class336 aClass336_3;

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Lclient!gw;")
	private Class142 aClass142_2;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!lf;Lclient!tf;)V")
	public Class22_Sub3(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_3 = arg1;
		if (this.aClass336_3.aClass10_Sub1_2 != null && super.aClass95_Sub3_37.aBoolean366 && super.aClass95_Sub3_37.aBoolean378) {
			@Pc(30) Class232 local30 = Static406.method5599(super.aClass95_Sub3_37, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class232 local37 = Static406.method5599(super.aClass95_Sub3_37, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass142_2 = Static45.method801(new Class232[] { local30, local37 }, super.aClass95_Sub3_37);
			this.aBoolean169 = this.aClass142_2 != null;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean168) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass142_2.aLong98;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass95_Sub3_37.anInt5751 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean168) {
			super.aClass95_Sub3_37.method4864(arg0);
			super.aClass95_Sub3_37.method4870(arg1);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		if (!this.aBoolean168) {
			return;
		}
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864((Class10) null);
		super.aClass95_Sub3_37.method4900(0);
		super.aClass95_Sub3_37.method4864((Class10) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean168 = false;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class10_Sub3 local14 = super.aClass95_Sub3_37.method4846();
		if (!this.aBoolean169 || local14 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass95_Sub3_37.aFloatArray33[1])) * 2.0F + 1.0F;
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864(local14);
		super.aClass95_Sub3_37.method4900(0);
		super.aClass95_Sub3_37.method4864(this.aClass336_3.aClass10_Sub1_2);
		@Pc(59) long local59 = this.aClass142_2.aLong98;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass95_Sub3_37.aFloatArray33[0], -super.aClass95_Sub3_37.aFloatArray33[1], -super.aClass95_Sub3_37.aFloatArray33[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), local33 * super.aClass95_Sub3_37.aFloat101, super.aClass95_Sub3_37.aFloat85 * local33, local33 * super.aClass95_Sub3_37.aFloat99, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass95_Sub3_37.aFloatArray33[1]) * 928.0F + 64.0F);
		this.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return this.aBoolean169;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
	}
}
