import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!re;")
	private final Class202 aClass202_1;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!rs;")
	private Class210 aClass210_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!bv;Lclient!re;)V")
	public Class2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_1 = arg1;
		if (this.aClass202_1.aClass1_Sub4_2 != null && super.aClass30_Sub1_42.aBoolean77 && super.aClass30_Sub1_42.aBoolean65) {
			@Pc(30) Class79 local30 = Static47.method994(super.aClass30_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class79 local37 = Static47.method994(super.aClass30_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
			this.aClass210_1 = Static94.method1545(new Class79[] { local30, local37 }, super.aClass30_Sub1_42);
			this.aBoolean26 = this.aClass210_1 != null;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		@Pc(15) Class1_Sub2 local15 = super.aClass30_Sub1_42.method934();
		if (!this.aBoolean26 || local15 == null) {
			return;
		}
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method916(local15);
		super.aClass30_Sub1_42.method948(0);
		super.aClass30_Sub1_42.method916(this.aClass202_1.aClass1_Sub4_2);
		@Pc(46) long local46 = this.aClass210_1.aLong180;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass30_Sub1_42.aFloatArray8[0], -super.aClass30_Sub1_42.aFloatArray8[1], -super.aClass30_Sub1_42.aFloatArray8[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass30_Sub1_42.aFloat23, super.aClass30_Sub1_42.aFloat36, super.aClass30_Sub1_42.aFloat38, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass30_Sub1_42.aFloatArray8[1]) * 928.0F + 96.0F);
		this.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		if (!this.aBoolean25) {
			return;
		}
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method916(null);
		super.aClass30_Sub1_42.method948(0);
		super.aClass30_Sub1_42.method916(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean25 = false;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		if (!this.aBoolean25) {
			super.aClass30_Sub1_42.method916(arg1);
			super.aClass30_Sub1_42.method923(arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean25) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg1 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg0 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass210_1.aLong180;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (super.aClass30_Sub1_42.anInt1244 * local17 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
	}
}
