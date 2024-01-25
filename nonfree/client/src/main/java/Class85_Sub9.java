import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class85_Sub9 extends Class85 {

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Z")
	private boolean aBoolean597 = false;

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Lclient!ud;")
	private final Class329 aClass329_6;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!wba;")
	private Class355 aClass355_7;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!lj;Lclient!ud;)V")
	public Class85_Sub9(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_6 = arg1;
		if (this.aClass329_6.aClass46_Sub3_1 != null && super.aClass78_Sub3_37.aBoolean415 && super.aClass78_Sub3_37.aBoolean418) {
			@Pc(30) Class230 local30 = Static226.method3357(super.aClass78_Sub3_37, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class230 local37 = Static226.method3357(super.aClass78_Sub3_37, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass355_7 = Static211.method3208(super.aClass78_Sub3_37, new Class230[] { local30, local37 });
			this.aBoolean597 = this.aClass355_7 != null;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		if (!this.aBoolean598) {
			super.aClass78_Sub3_37.method4535(arg1);
			super.aClass78_Sub3_37.method4534(arg0);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		if (!this.aBoolean598) {
			return;
		}
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(null);
		super.aClass78_Sub3_37.method4549(0);
		super.aClass78_Sub3_37.method4535(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean598 = false;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class46_Sub4 local16 = super.aClass78_Sub3_37.method4497();
		if (!this.aBoolean597 || local16 == null) {
			return;
		}
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(local16);
		super.aClass78_Sub3_37.method4549(0);
		super.aClass78_Sub3_37.method4535(this.aClass329_6.aClass46_Sub3_1);
		@Pc(47) long local47 = this.aClass355_7.aLong264;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass78_Sub3_37.aFloatArray49[0], super.aClass78_Sub3_37.aFloatArray49[1], super.aClass78_Sub3_37.aFloatArray49[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass78_Sub3_37.aFloat148, super.aClass78_Sub3_37.aFloat149, super.aClass78_Sub3_37.aFloat153, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass78_Sub3_37.aFloatArray49[1]) * 928.0F + 96.0F);
		this.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean598) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass355_7.aLong264;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass78_Sub3_37.anInt5559 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
