import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class38_Sub9 extends Class38 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
	private boolean aBoolean700 = false;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Z")
	private boolean aBoolean699 = false;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!mha;")
	private final Class219 aClass219_6;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!oca;")
	private Class249 aClass249_7;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!dia;Lclient!mha;)V")
	public Class38_Sub9(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class219 arg1) {
		super(arg0);
		this.aClass219_6 = arg1;
		if (this.aClass219_6.aClass85_Sub4_3 != null && super.aClass13_Sub2_39.aBoolean169 && super.aClass13_Sub2_39.aBoolean173) {
			@Pc(30) Class184 local30 = Static189.method5096(35633, super.aClass13_Sub2_39, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class184 local37 = Static189.method5096(35632, super.aClass13_Sub2_39, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass249_7 = Static69.method1361(new Class184[] { local30, local37 }, super.aClass13_Sub2_39);
			this.aBoolean699 = this.aClass249_7 != null;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		if (!this.aBoolean700) {
			return;
		}
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024((Class85) null);
		super.aClass13_Sub2_39.method2008(0);
		super.aClass13_Sub2_39.method2024((Class85) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean700 = false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean700) {
			super.aClass13_Sub2_39.method2024(arg0);
			super.aClass13_Sub2_39.method1960(arg1);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean700) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass249_7.aLong213;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass13_Sub2_39.anInt2155 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class85_Sub1 local8 = super.aClass13_Sub2_39.method1989();
		if (!this.aBoolean699 || local8 == null) {
			return;
		}
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method2024(local8);
		super.aClass13_Sub2_39.method2008(0);
		super.aClass13_Sub2_39.method2024(this.aClass219_6.aClass85_Sub4_3);
		@Pc(39) long local39 = this.aClass249_7.aLong213;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass13_Sub2_39.aFloatArray17[0], -super.aClass13_Sub2_39.aFloatArray17[1], -super.aClass13_Sub2_39.aFloatArray17[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass13_Sub2_39.aFloat54, super.aClass13_Sub2_39.aFloat57, super.aClass13_Sub2_39.aFloat46, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass13_Sub2_39.aFloatArray17[1]) * 928.0F + 96.0F);
		this.aBoolean700 = true;
	}
}
