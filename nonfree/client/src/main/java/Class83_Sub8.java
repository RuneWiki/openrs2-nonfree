import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class83_Sub8 extends Class83 {

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "Lclient!pda;")
	private final Class224 aClass224_4;

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "Lclient!pi;")
	private Class227 aClass227_7;

	static {
		new Class45(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!mh;Lclient!pda;)V")
	public Class83_Sub8(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class224 arg1) {
		super(arg0);
		this.aClass224_4 = arg1;
		if (this.aClass224_4.aClass164_Sub2_2 != null && super.aClass4_Sub3_41.aBoolean447 && super.aClass4_Sub3_41.aBoolean424) {
			@Pc(30) Class205 local30 = Static60.method1520(super.aClass4_Sub3_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class205 local37 = Static60.method1520(super.aClass4_Sub3_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass227_7 = Static136.method5800(new Class205[] { local30, local37 }, super.aClass4_Sub3_41);
			this.aBoolean507 = this.aClass227_7 != null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		if (!this.aBoolean508) {
			return;
		}
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5250(null);
		super.aClass4_Sub3_41.method5245(0);
		super.aClass4_Sub3_41.method5250(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean508 = false;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class164_Sub1 local12 = super.aClass4_Sub3_41.method5278();
		if (!this.aBoolean507 || local12 == null) {
			return;
		}
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5250(local12);
		super.aClass4_Sub3_41.method5245(0);
		super.aClass4_Sub3_41.method5250(this.aClass224_4.aClass164_Sub2_2);
		@Pc(43) long local43 = this.aClass227_7.aLong185;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass4_Sub3_41.aFloatArray52[0], -super.aClass4_Sub3_41.aFloatArray52[1], -super.aClass4_Sub3_41.aFloatArray52[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass4_Sub3_41.aFloat128, super.aClass4_Sub3_41.aFloat112, super.aClass4_Sub3_41.aFloat116, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass4_Sub3_41.aFloatArray52[1]) * 928.0F + 96.0F);
		this.aBoolean508 = true;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
		if (!this.aBoolean508) {
			super.aClass4_Sub3_41.method5250(arg1);
			super.aClass4_Sub3_41.method5230(arg0);
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return false;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean508) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass227_7.aLong185;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass4_Sub3_41.anInt5794 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
