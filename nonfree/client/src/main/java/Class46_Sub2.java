import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!ud;")
	private final Class335 aClass335_2;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!di;")
	private Class70 aClass70_5;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!vj;Lclient!ud;)V")
	public Class46_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class335 arg1) {
		super(arg0);
		this.aClass335_2 = arg1;
		if (this.aClass335_2.aClass24_Sub2_1 != null && super.aClass45_Sub3_40.aBoolean706 && super.aClass45_Sub3_40.aBoolean689) {
			@Pc(30) Class203 local30 = Static131.method2612(35633, super.aClass45_Sub3_40, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class203 local37 = Static131.method2612(35632, super.aClass45_Sub3_40, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass70_5 = Static403.method5837(new Class203[] { local30, local37 }, super.aClass45_Sub3_40);
			this.aBoolean242 = this.aClass70_5 != null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (!this.aBoolean243) {
			super.aClass45_Sub3_40.method7475(arg1);
			super.aClass45_Sub3_40.method7500(arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		@Pc(10) Class24_Sub3 local10 = super.aClass45_Sub3_40.method7446();
		if (!this.aBoolean242 || local10 == null) {
			return;
		}
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(local10);
		super.aClass45_Sub3_40.method7510(0);
		super.aClass45_Sub3_40.method7475(this.aClass335_2.aClass24_Sub2_1);
		@Pc(47) long local47 = this.aClass70_5.aLong48;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass45_Sub3_40.aFloatArray98[0], super.aClass45_Sub3_40.aFloatArray98[1], super.aClass45_Sub3_40.aFloatArray98[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass45_Sub3_40.aFloat196, super.aClass45_Sub3_40.aFloat186, super.aClass45_Sub3_40.aFloat184, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass45_Sub3_40.aFloatArray98[1]) * 928.0F + 96.0F);
		this.aBoolean243 = true;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		if (!this.aBoolean243) {
			return;
		}
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(null);
		super.aClass45_Sub3_40.method7510(0);
		super.aClass45_Sub3_40.method7475(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean243 = false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean243) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass70_5.aLong48;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass45_Sub3_40.anInt9042 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return false;
	}
}
