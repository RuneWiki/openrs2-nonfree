import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "Lclient!uo;")
	private final Class249 aClass249_2;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "Lclient!fe;")
	private Class72 aClass72_6;

	static {
		new Class7("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!kd;Lclient!uo;)V")
	public Class17_Sub3(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class249 arg1) {
		super(arg0);
		this.aClass249_2 = arg1;
		if (this.aClass249_2.aClass3_Sub4_2 != null && super.aClass39_Sub2_41.aBoolean247 && super.aClass39_Sub2_41.aBoolean256) {
			@Pc(30) Class224 local30 = Static92.method1684("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass39_Sub2_41, 35633);
			@Pc(37) Class224 local37 = Static92.method1684("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass39_Sub2_41, 35632);
			this.aClass72_6 = Static346.method4845(super.aClass39_Sub2_41, new Class224[] { local30, local37 });
			this.aBoolean146 = this.aClass72_6 != null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean147) {
			return;
		}
		@Pc(11) int local11 = 0x1 << (arg1 & 0x3);
		@Pc(22) float local22 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(26) int local26 = arg0 & 0xFFFF;
		@Pc(35) float local35 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(39) long local39 = this.aClass72_6.aLong73;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "time"), (float) (local11 * super.aClass39_Sub2_41.anInt3776 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "scale"), local22);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "breakWaterDepth"), (float) local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "breakWaterOffset"), local35);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class3_Sub3 local12 = super.aClass39_Sub2_41.method3175();
		if (!this.aBoolean146 || local12 == null) {
			return;
		}
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3203(local12);
		super.aClass39_Sub2_41.method3221(0);
		super.aClass39_Sub2_41.method3203(this.aClass249_2.aClass3_Sub4_2);
		@Pc(43) long local43 = this.aClass72_6.aLong73;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass39_Sub2_41.aFloatArray11[0], -super.aClass39_Sub2_41.aFloatArray11[1], -super.aClass39_Sub2_41.aFloatArray11[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass39_Sub2_41.aFloat48, super.aClass39_Sub2_41.aFloat50, super.aClass39_Sub2_41.aFloat54, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass39_Sub2_41.aFloatArray11[1]) * 928.0F + 96.0F);
		this.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		if (!this.aBoolean147) {
			return;
		}
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3203(null);
		super.aClass39_Sub2_41.method3221(0);
		super.aClass39_Sub2_41.method3203(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return false;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean147) {
			super.aClass39_Sub2_41.method3203(arg0);
			super.aClass39_Sub2_41.method3162(arg1);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
	}
}
