import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!go;")
	private final Class130 aClass130_1;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!hw;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!qfa;Lclient!go;)V")
	public Class33_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class130 arg1) {
		super(arg0);
		this.aClass130_1 = arg1;
		if (this.aClass130_1.aClass66_Sub2_3 != null && super.aClass137_Sub3_42.aBoolean598 && super.aClass137_Sub3_42.aBoolean599) {
			@Pc(30) Class237 local30 = Static489.method7252(35633, super.aClass137_Sub3_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class237 local37 = Static489.method7252(35632, super.aClass137_Sub3_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass152_1 = Static174.method9031(new Class237[] { local30, local37 }, super.aClass137_Sub3_42);
			this.aBoolean90 = this.aClass152_1 != null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		if (!this.aBoolean91) {
			return;
		}
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090((Class66) null);
		super.aClass137_Sub3_42.method7095(0);
		super.aClass137_Sub3_42.method7090((Class66) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean91 = false;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class66_Sub4 local12 = super.aClass137_Sub3_42.method7085();
		if (!this.aBoolean90 || local12 == null) {
			return;
		}
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090(local12);
		super.aClass137_Sub3_42.method7095(0);
		super.aClass137_Sub3_42.method7090(this.aClass130_1.aClass66_Sub2_3);
		@Pc(43) long local43 = this.aClass152_1.aLong121;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass137_Sub3_42.aFloatArray65[0], -super.aClass137_Sub3_42.aFloatArray65[1], -super.aClass137_Sub3_42.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass137_Sub3_42.aFloat205, super.aClass137_Sub3_42.aFloat210, super.aClass137_Sub3_42.aFloat191, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass137_Sub3_42.aFloatArray65[1]) * 928.0F + 96.0F);
		this.aBoolean91 = true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		if (!this.aBoolean91) {
			super.aClass137_Sub3_42.method7090(arg1);
			super.aClass137_Sub3_42.method7077(arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean91) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass152_1.aLong121;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (local17 * super.aClass137_Sub3_42.anInt8544 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}
}
