import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class100_Sub6 extends Class100 {

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Z")
	private boolean aBoolean336 = false;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "Lclient!jq;")
	private final Class135 aClass135_4;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "Lclient!eq;")
	private Class77 aClass77_6;

	static {
		new Class158("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
		new Class158("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!ih;Lclient!jq;)V")
	public Class100_Sub6(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_4 = arg1;
		if (this.aClass135_4.aClass8_Sub4_3 != null && super.aClass106_Sub2_43.aBoolean218 && super.aClass106_Sub2_43.aBoolean232) {
			@Pc(30) Class10 local30 = Static403.method5533(35633, super.aClass106_Sub2_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class10 local37 = Static403.method5533(35632, super.aClass106_Sub2_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass77_6 = Static86.method1530(new Class10[] { local30, local37 }, super.aClass106_Sub2_43);
			this.aBoolean336 = this.aClass77_6 != null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class8_Sub3 local13 = super.aClass106_Sub2_43.method2876();
		if (!this.aBoolean336 || local13 == null) {
			return;
		}
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2912(local13);
		super.aClass106_Sub2_43.method2881(0);
		super.aClass106_Sub2_43.method2912(this.aClass135_4.aClass8_Sub4_3);
		@Pc(44) long local44 = this.aClass77_6.aLong69;
		OpenGL.glUseProgramObjectARB(local44);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local44, "sunDir"), -super.aClass106_Sub2_43.aFloatArray18[0], -super.aClass106_Sub2_43.aFloatArray18[1], -super.aClass106_Sub2_43.aFloatArray18[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local44, "sunColour"), super.aClass106_Sub2_43.aFloat51, super.aClass106_Sub2_43.aFloat50, super.aClass106_Sub2_43.aFloat45, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "sunExponent"), Math.abs(super.aClass106_Sub2_43.aFloatArray18[1]) * 928.0F + 96.0F);
		this.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean335) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass77_6.aLong69;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass106_Sub2_43.anInt3735 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		if (!this.aBoolean335) {
			return;
		}
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2912(null);
		super.aClass106_Sub2_43.method2881(0);
		super.aClass106_Sub2_43.method2912(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean335 = false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
		if (!this.aBoolean335) {
			super.aClass106_Sub2_43.method2912(arg1);
			super.aClass106_Sub2_43.method2851(arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return false;
	}
}
