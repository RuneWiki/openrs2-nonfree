import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Lclient!pl;")
	private final Class198 aClass198_3;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!me;")
	private Class168 aClass168_3;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!ug;Lclient!pl;)V")
	public Class10_Sub6(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_3 = arg1;
		if (this.aClass198_3.aClass65_Sub1_2 != null && super.aClass135_Sub2_41.aBoolean480 && super.aClass135_Sub2_41.aBoolean459) {
			@Pc(30) Class228 local30 = Static103.method1539("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass135_Sub2_41);
			@Pc(37) Class228 local37 = Static103.method1539("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, super.aClass135_Sub2_41);
			this.aClass168_3 = Static400.method5265(super.aClass135_Sub2_41, new Class228[] { local30, local37 });
			this.aBoolean388 = this.aClass168_3 != null;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean391) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass168_3.aLong114;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (super.aClass135_Sub2_41.anInt6779 * local17 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return false;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub3 local8 = super.aClass135_Sub2_41.method5421();
		if (!this.aBoolean388 || local8 == null) {
			return;
		}
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5458(local8);
		super.aClass135_Sub2_41.method5457(0);
		super.aClass135_Sub2_41.method5458(this.aClass198_3.aClass65_Sub1_2);
		@Pc(45) long local45 = this.aClass168_3.aLong114;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass135_Sub2_41.aFloatArray29[0], -super.aClass135_Sub2_41.aFloatArray29[1], -super.aClass135_Sub2_41.aFloatArray29[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass135_Sub2_41.aFloat93, super.aClass135_Sub2_41.aFloat83, super.aClass135_Sub2_41.aFloat94, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass135_Sub2_41.aFloatArray29[1]) * 928.0F + 96.0F);
		this.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		if (!this.aBoolean391) {
			return;
		}
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5458(null);
		super.aClass135_Sub2_41.method5457(0);
		super.aClass135_Sub2_41.method5458(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean391 = false;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean391) {
			super.aClass135_Sub2_41.method5458(arg0);
			super.aClass135_Sub2_41.method5441(arg1);
		}
	}
}
