import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class69_Sub3 extends Class69 {

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!au;")
	private final Class27 aClass27_1;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!vr;")
	private Class384 aClass384_2;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ml;Lclient!au;)V")
	public Class69_Sub3(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class27 arg1) {
		super(arg0);
		this.aClass27_1 = arg1;
		if (this.aClass27_1.aClass44_Sub3_3 != null && super.aClass75_Sub3_41.aBoolean493 && super.aClass75_Sub3_41.aBoolean494) {
			@Pc(34) Class362 local34 = Static182.method3448(35633, super.aClass75_Sub3_41, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(43) Class362 local43 = Static182.method3448(35632, super.aClass75_Sub3_41, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass384_2 = Static420.method6421(super.aClass75_Sub3_41, new Class362[] { local34, local43 });
			this.aBoolean202 = this.aClass384_2 != null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		if (!this.aBoolean201) {
			return;
		}
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774((Class44) null);
		super.aClass75_Sub3_41.method5775(0);
		super.aClass75_Sub3_41.method5774((Class44) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean201 = false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		if (!this.aBoolean201) {
			super.aClass75_Sub3_41.method5774(arg1);
			super.aClass75_Sub3_41.method5787(arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean201) {
			return;
		}
		@Pc(15) int local15 = 0x1 << (arg0 & 0x3);
		@Pc(26) float local26 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(30) int local30 = arg1 & 0xFFFF;
		@Pc(39) float local39 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(43) long local43 = this.aClass384_2.aLong333;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "time"), (float) (local15 * super.aClass75_Sub3_41.anInt6532 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "scale"), local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterDepth"), (float) local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterOffset"), local39);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class44_Sub2 local16 = super.aClass75_Sub3_41.method5807();
		if (!this.aBoolean202 || local16 == null) {
			return;
		}
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774(local16);
		super.aClass75_Sub3_41.method5775(0);
		super.aClass75_Sub3_41.method5774(this.aClass27_1.aClass44_Sub3_3);
		@Pc(49) long local49 = this.aClass384_2.aLong333;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), -super.aClass75_Sub3_41.aFloatArray51[0], -super.aClass75_Sub3_41.aFloatArray51[1], -super.aClass75_Sub3_41.aFloatArray51[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass75_Sub3_41.aFloat123, super.aClass75_Sub3_41.aFloat128, super.aClass75_Sub3_41.aFloat114, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass75_Sub3_41.aFloatArray51[1]) * 928.0F + 96.0F);
		this.aBoolean201 = true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return false;
	}
}
