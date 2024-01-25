import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class16_Sub4 extends Class16 {

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!dja;")
	private final Class65 aClass65_5;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!uj;")
	private Class342 aClass342_7;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!ac;Lclient!dja;)V")
	public Class16_Sub4(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class65 arg1) {
		super(arg0);
		this.aClass65_5 = arg1;
		if (this.aClass65_5.aClass2_Sub4_1 != null && super.aClass5_Sub1_42.aBoolean25 && super.aClass5_Sub1_42.aBoolean34) {
			@Pc(30) Class349 local30 = Static327.method5481(35633, super.aClass5_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class349 local37 = Static327.method5481(35632, super.aClass5_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass342_7 = Static333.method5541(super.aClass5_Sub1_42, new Class349[] { local30, local37 });
			this.aBoolean494 = this.aClass342_7 != null;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean493) {
			super.aClass5_Sub1_42.method352(arg0);
			super.aClass5_Sub1_42.method385(arg1);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean493) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass342_7.aLong257;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass5_Sub1_42.anInt361 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class2_Sub2 local12 = super.aClass5_Sub1_42.method316();
		if (!this.aBoolean494 || local12 == null) {
			return;
		}
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352(local12);
		super.aClass5_Sub1_42.method334(0);
		super.aClass5_Sub1_42.method352(this.aClass65_5.aClass2_Sub4_1);
		@Pc(43) long local43 = this.aClass342_7.aLong257;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass5_Sub1_42.aFloatArray3[0], -super.aClass5_Sub1_42.aFloatArray3[1], -super.aClass5_Sub1_42.aFloatArray3[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass5_Sub1_42.aFloat17, super.aClass5_Sub1_42.aFloat14, super.aClass5_Sub1_42.aFloat21, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass5_Sub1_42.aFloatArray3[1]) * 928.0F + 96.0F);
		this.aBoolean493 = true;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		if (!this.aBoolean493) {
			return;
		}
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352((Class2) null);
		super.aClass5_Sub1_42.method334(0);
		super.aClass5_Sub1_42.method352((Class2) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean493 = false;
	}
}
