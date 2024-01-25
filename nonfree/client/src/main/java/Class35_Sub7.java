import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class35_Sub7 extends Class35 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Z")
	private boolean aBoolean456 = false;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Lclient!wq;")
	private final Class319 aClass319_6;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!gda;")
	private Class99 aClass99_3;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!te;Lclient!wq;)V")
	public Class35_Sub7(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_6 = arg1;
		if (this.aClass319_6.aClass20_Sub1_2 != null && super.aClass9_Sub3_41.aBoolean532 && super.aClass9_Sub3_41.aBoolean520) {
			@Pc(30) Class315 local30 = Static405.method6070(35633, super.aClass9_Sub3_41, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class315 local37 = Static405.method6070(35632, super.aClass9_Sub3_41, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass99_3 = Static422.method6283(super.aClass9_Sub3_41, new Class315[] { local30, local37 });
			this.aBoolean456 = this.aClass99_3 != null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		if (!this.aBoolean455) {
			return;
		}
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6701(null);
		super.aClass9_Sub3_41.method6660(0);
		super.aClass9_Sub3_41.method6701(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean455 = false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		if (!this.aBoolean455) {
			super.aClass9_Sub3_41.method6701(arg1);
			super.aClass9_Sub3_41.method6670(arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean455) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass99_3.aLong90;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass9_Sub3_41.anInt7876 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class20_Sub2 local14 = super.aClass9_Sub3_41.method6663();
		if (!this.aBoolean456 || local14 == null) {
			return;
		}
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6701(local14);
		super.aClass9_Sub3_41.method6660(0);
		super.aClass9_Sub3_41.method6701(this.aClass319_6.aClass20_Sub1_2);
		@Pc(47) long local47 = this.aClass99_3.aLong90;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass9_Sub3_41.aFloatArray65[0], -super.aClass9_Sub3_41.aFloatArray65[1], -super.aClass9_Sub3_41.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass9_Sub3_41.aFloat169, super.aClass9_Sub3_41.aFloat165, super.aClass9_Sub3_41.aFloat172, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass9_Sub3_41.aFloatArray65[1]) * 928.0F + 96.0F);
		this.aBoolean455 = true;
	}
}
