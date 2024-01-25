import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!pt;")
	private final Class201 aClass201_2;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!ej;")
	private Class63 aClass63_1;

	static {
		new Class21("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!bt;Lclient!pt;)V")
	public Class39_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_2 = arg1;
		if (this.aClass201_2.aClass62_Sub1_3 != null && super.aClass30_Sub1_42.aBoolean36 && super.aClass30_Sub1_42.aBoolean37) {
			@Pc(30) Class27 local30 = Static15.method256(super.aClass30_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class27 local37 = Static15.method256(super.aClass30_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
			this.aClass63_1 = Static325.method4858(super.aClass30_Sub1_42, new Class27[] { local30, local37 });
			this.aBoolean115 = this.aClass63_1 != null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		if (!this.aBoolean116) {
			return;
		}
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method730(null);
		super.aClass30_Sub1_42.method726(0);
		super.aClass30_Sub1_42.method730(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean116 = false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class62_Sub3 local15 = super.aClass30_Sub1_42.method766();
		if (!this.aBoolean115 || local15 == null) {
			return;
		}
		super.aClass30_Sub1_42.method726(1);
		super.aClass30_Sub1_42.method730(local15);
		super.aClass30_Sub1_42.method726(0);
		super.aClass30_Sub1_42.method730(this.aClass201_2.aClass62_Sub1_3);
		@Pc(46) long local46 = this.aClass63_1.aLong62;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass30_Sub1_42.aFloatArray1[0], -super.aClass30_Sub1_42.aFloatArray1[1], -super.aClass30_Sub1_42.aFloatArray1[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass30_Sub1_42.aFloat6, super.aClass30_Sub1_42.aFloat9, super.aClass30_Sub1_42.aFloat14, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass30_Sub1_42.aFloatArray1[1]) * 928.0F + 96.0F);
		this.aBoolean116 = true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean116) {
			return;
		}
		@Pc(21) int local21 = 0x1 << (arg1 & 0x3);
		@Pc(32) float local32 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(36) int local36 = arg0 & 0xFFFF;
		@Pc(45) float local45 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(49) long local49 = this.aClass63_1.aLong62;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "time"), (float) (local21 * super.aClass30_Sub1_42.anInt841 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "scale"), local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "breakWaterDepth"), (float) local36);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "breakWaterOffset"), local45);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean116) {
			super.aClass30_Sub1_42.method730(arg0);
			super.aClass30_Sub1_42.method713(arg1);
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
	}
}
