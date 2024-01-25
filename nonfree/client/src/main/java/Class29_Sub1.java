import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Lclient!ai;")
	private final Class9 aClass9_1;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!vo;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!da;Lclient!ai;)V")
	public Class29_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class9 arg1) {
		super(arg0);
		this.aClass9_1 = arg1;
		if (this.aClass9_1.aClass4_Sub3_3 != null && super.aClass50_Sub1_37.aBoolean85 && super.aClass50_Sub1_37.aBoolean89) {
			@Pc(30) Class214 local30 = Static223.method3364(35633, super.aClass50_Sub1_37, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class214 local37 = Static223.method3364(35632, super.aClass50_Sub1_37, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass261_1 = Static91.method1694(super.aClass50_Sub1_37, new Class214[] { local30, local37 });
			this.aBoolean42 = this.aClass261_1 != null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5383(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5375() {
		return false;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	@Override
	public void method5381() {
		if (!this.aBoolean41) {
			return;
		}
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1295(null);
		super.aClass50_Sub1_37.method1300(0);
		super.aClass50_Sub1_37.method1295(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	@Override
	public void method5378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean41) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass261_1.aLong248;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (local18 * super.aClass50_Sub1_37.anInt1403 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5376(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class4_Sub2 local8 = super.aClass50_Sub1_37.method1301();
		if (!this.aBoolean42 || local8 == null) {
			return;
		}
		super.aClass50_Sub1_37.method1300(1);
		super.aClass50_Sub1_37.method1295(local8);
		super.aClass50_Sub1_37.method1300(0);
		super.aClass50_Sub1_37.method1295(this.aClass9_1.aClass4_Sub3_3);
		@Pc(39) long local39 = this.aClass261_1.aLong248;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass50_Sub1_37.aFloatArray8[0], -super.aClass50_Sub1_37.aFloatArray8[1], -super.aClass50_Sub1_37.aFloatArray8[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass50_Sub1_37.aFloat23, super.aClass50_Sub1_37.aFloat24, super.aClass50_Sub1_37.aFloat32, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass50_Sub1_37.aFloatArray8[1]) * 928.0F + 96.0F);
		this.aBoolean41 = true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILclient!ac;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		if (!this.aBoolean41) {
			super.aClass50_Sub1_37.method1295(arg1);
			super.aClass50_Sub1_37.method1256(arg0);
		}
	}
}
