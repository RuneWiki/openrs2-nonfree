import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class39_Sub4 extends Class39 {

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!pt;")
	private final Class201 aClass201_3;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!ej;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!bt;Lclient!pt;)V")
	public Class39_Sub4(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_3 = arg1;
		if (this.aClass201_3.aClass62_Sub1_3 != null && super.aClass30_Sub1_42.aBoolean36 && super.aClass30_Sub1_42.aBoolean37) {
			@Pc(30) Class27 local30 = Static15.method256(super.aClass30_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class27 local37 = Static15.method256(super.aClass30_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
			this.aClass63_2 = Static325.method4858(super.aClass30_Sub1_42, new Class27[] { local30, local37 });
			this.aBoolean233 = this.aClass63_2 != null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean234) {
			super.aClass30_Sub1_42.method730(arg0);
			super.aClass30_Sub1_42.method713(arg1);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		@Pc(10) Class62_Sub3 local10 = super.aClass30_Sub1_42.method766();
		if (!this.aBoolean233 || local10 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass30_Sub1_42.aFloatArray1[1])) * 2.0F + 1.0F;
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method730(local10);
		super.aClass30_Sub1_42.method726(0);
		super.aClass30_Sub1_42.method730(this.aClass201_3.aClass62_Sub1_3);
		@Pc(59) long local59 = this.aClass63_2.aLong62;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass30_Sub1_42.aFloatArray1[0], -super.aClass30_Sub1_42.aFloatArray1[1], -super.aClass30_Sub1_42.aFloatArray1[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), super.aClass30_Sub1_42.aFloat6 * local33, local33 * super.aClass30_Sub1_42.aFloat9, super.aClass30_Sub1_42.aFloat14 * local33, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass30_Sub1_42.aFloatArray1[1]) * 928.0F + 64.0F);
		this.aBoolean234 = true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		if (!this.aBoolean234) {
			return;
		}
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method730(null);
		super.aClass30_Sub1_42.method726(0);
		super.aClass30_Sub1_42.method730(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean234 = false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean234) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg0 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass63_2.aLong62;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (local20 * super.aClass30_Sub1_42.anInt841 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return this.aBoolean233;
	}
}
