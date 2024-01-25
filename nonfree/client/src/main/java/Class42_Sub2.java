import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "Lclient!al;")
	private final Class14 aClass14_2;

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lclient!nba;")
	private Class233 aClass233_1;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!uca;Lclient!al;)V")
	public Class42_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class14 arg1) {
		super(arg0);
		this.aClass14_2 = arg1;
		if (this.aClass14_2.aClass3_Sub4_2 != null && super.aClass162_Sub3_44.aBoolean724 && super.aClass162_Sub3_44.aBoolean728) {
			@Pc(30) Class118 local30 = Static61.method1063("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass162_Sub3_44, 35633);
			@Pc(37) Class118 local37 = Static61.method1063("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass162_Sub3_44, 35632);
			this.aClass233_1 = Static9.method178(new Class118[] { local30, local37 }, super.aClass162_Sub3_44);
			this.aBoolean121 = this.aClass233_1 != null;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean119) {
			return;
		}
		@Pc(15) int local15 = 0x1 << (arg1 & 0x3);
		@Pc(26) float local26 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(30) int local30 = arg0 & 0xFFFF;
		@Pc(39) float local39 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(48) float local48 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(57) float local57 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(63) int local63 = arg0 >> 27 & 0xF;
		@Pc(67) long local67 = this.aClass233_1.aLong160;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "time"), (float) (super.aClass162_Sub3_44.anInt8686 * local15 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "scale"), local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "breakWaterDepth"), (float) local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "breakWaterOffset"), local39);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local67, "waveIntensity"), local57, local48);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "waveExponent"), (float) local63);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		if (!this.aBoolean119) {
			return;
		}
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(null);
		super.aClass162_Sub3_44.method6947(0);
		super.aClass162_Sub3_44.method6911(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean119 = false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return this.aBoolean121;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class3_Sub3 local12 = super.aClass162_Sub3_44.method6900();
		if (!this.aBoolean121 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass162_Sub3_44.aFloatArray70[1])) * 2.0F + 1.0F;
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(local12);
		super.aClass162_Sub3_44.method6947(0);
		super.aClass162_Sub3_44.method6911(this.aClass14_2.aClass3_Sub4_2);
		@Pc(56) long local56 = this.aClass233_1.aLong160;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass162_Sub3_44.aFloatArray70[0], -super.aClass162_Sub3_44.aFloatArray70[1], -super.aClass162_Sub3_44.aFloatArray70[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), super.aClass162_Sub3_44.aFloat218 * local30, super.aClass162_Sub3_44.aFloat214 * local30, super.aClass162_Sub3_44.aFloat211 * local30, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass162_Sub3_44.aFloatArray70[1]) * 928.0F + 64.0F);
		this.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (!this.aBoolean119) {
			super.aClass162_Sub3_44.method6911(arg1);
			super.aClass162_Sub3_44.method6953(arg0);
		}
	}
}
