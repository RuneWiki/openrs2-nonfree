import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class63_Sub4 extends Class63 {

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "Lclient!rk;")
	private final Class215 aClass215_2;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "Lclient!ie;")
	private Class113 aClass113_5;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!pg;Lclient!rk;)V")
	public Class63_Sub4(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class215 arg1) {
		super(arg0);
		this.aClass215_2 = arg1;
		if (this.aClass215_2.aClass20_Sub2_2 != null && super.aClass163_Sub2_43.aBoolean384 && super.aClass163_Sub2_43.aBoolean362) {
			@Pc(30) Class19 local30 = Static22.method267(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass163_Sub2_43);
			@Pc(37) Class19 local37 = Static22.method267(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass163_Sub2_43);
			this.aClass113_5 = Static125.method1834(new Class19[] { local30, local37 }, super.aClass163_Sub2_43);
			this.aBoolean220 = this.aClass113_5 != null;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean221) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass113_5.aLong104;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (local17 * super.aClass163_Sub2_43.anInt5219 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean221) {
			super.aClass163_Sub2_43.method4118(arg0);
			super.aClass163_Sub2_43.method4107(arg1);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		if (!this.aBoolean221) {
			return;
		}
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4118(null);
		super.aClass163_Sub2_43.method4131(0);
		super.aClass163_Sub2_43.method4118(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean221 = false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class20_Sub3 local12 = super.aClass163_Sub2_43.method4143();
		if (!this.aBoolean220 || local12 == null) {
			return;
		}
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4118(local12);
		super.aClass163_Sub2_43.method4131(0);
		super.aClass163_Sub2_43.method4118(this.aClass215_2.aClass20_Sub2_2);
		@Pc(43) long local43 = this.aClass113_5.aLong104;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass163_Sub2_43.aFloatArray27[0], -super.aClass163_Sub2_43.aFloatArray27[1], -super.aClass163_Sub2_43.aFloatArray27[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass163_Sub2_43.aFloat63, super.aClass163_Sub2_43.aFloat74, super.aClass163_Sub2_43.aFloat77, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass163_Sub2_43.aFloatArray27[1]) * 928.0F + 96.0F);
		this.aBoolean221 = true;
	}
}
