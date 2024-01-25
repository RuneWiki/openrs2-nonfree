import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class60_Sub9 extends Class60 {

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Z")
	private boolean aBoolean726 = false;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "Z")
	private boolean aBoolean727 = false;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "Lclient!vb;")
	private final Class343 aClass343_6;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "Lclient!taa;")
	private Class315 aClass315_6;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!us;Lclient!vb;)V")
	public Class60_Sub9(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		this.aClass343_6 = arg1;
		if (this.aClass343_6.aClass34_Sub3_3 != null && super.aClass43_Sub3_43.aBoolean690 && super.aClass43_Sub3_43.aBoolean691) {
			@Pc(30) Class165 local30 = Static556.method7402(35633, super.aClass43_Sub3_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class165 local37 = Static556.method7402(35632, super.aClass43_Sub3_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass315_6 = Static280.method4448(new Class165[] { local30, local37 }, super.aClass43_Sub3_43);
			this.aBoolean726 = this.aClass315_6 != null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean727) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(48) long local48 = this.aClass315_6.aLong230;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "time"), (float) (local20 * super.aClass43_Sub3_43.anInt8735 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterOffset"), local44);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class34_Sub4 local8 = super.aClass43_Sub3_43.method7261();
		if (!this.aBoolean726 || local8 == null) {
			return;
		}
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(local8);
		super.aClass43_Sub3_43.method7277(0);
		super.aClass43_Sub3_43.method7220(this.aClass343_6.aClass34_Sub3_3);
		@Pc(39) long local39 = this.aClass315_6.aLong230;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass43_Sub3_43.aFloatArray64[0], super.aClass43_Sub3_43.aFloatArray64[1], super.aClass43_Sub3_43.aFloatArray64[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass43_Sub3_43.aFloat217, super.aClass43_Sub3_43.aFloat216, super.aClass43_Sub3_43.aFloat206, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass43_Sub3_43.aFloatArray64[1]) * 928.0F + 96.0F);
		this.aBoolean727 = true;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		if (!this.aBoolean727) {
			super.aClass43_Sub3_43.method7220(arg1);
			super.aClass43_Sub3_43.method7281(arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		if (!this.aBoolean727) {
			return;
		}
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(null);
		super.aClass43_Sub3_43.method7277(0);
		super.aClass43_Sub3_43.method7220(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean727 = false;
	}
}
