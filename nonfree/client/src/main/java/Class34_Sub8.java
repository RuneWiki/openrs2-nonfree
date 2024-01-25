import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class34_Sub8 extends Class34 {

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Z")
	private boolean aBoolean810 = false;

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "Z")
	private boolean aBoolean811 = false;

	@OriginalMember(owner = "client!vha", name = "j", descriptor = "Lclient!lba;")
	private final Class201 aClass201_4;

	@OriginalMember(owner = "client!vha", name = "n", descriptor = "Lclient!nfa;")
	private Class241 aClass241_6;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lclient!rda;Lclient!lba;)V")
	public Class34_Sub8(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_4 = arg1;
		if (this.aClass201_4.aClass24_Sub2_1 != null && super.aClass126_Sub3_39.aBoolean688 && super.aClass126_Sub3_39.aBoolean687) {
			@Pc(30) Class46 local30 = Static304.method4409("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass126_Sub3_39);
			@Pc(37) Class46 local37 = Static304.method4409("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, super.aClass126_Sub3_39);
			this.aClass241_6 = Static38.method711(super.aClass126_Sub3_39, new Class46[] { local30, local37 });
			this.aBoolean811 = this.aClass241_6 != null;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		if (!this.aBoolean810) {
			return;
		}
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113((Class24) null);
		super.aClass126_Sub3_39.method7104(0);
		super.aClass126_Sub3_39.method7113((Class24) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean810 = false;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return false;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean810) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass241_6.aLong184;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass126_Sub3_39.anInt8272 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (!this.aBoolean810) {
			super.aClass126_Sub3_39.method7113(arg1);
			super.aClass126_Sub3_39.method7105(arg0);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class24_Sub3 local14 = super.aClass126_Sub3_39.method7099();
		if (!this.aBoolean811 || local14 == null) {
			return;
		}
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113(local14);
		super.aClass126_Sub3_39.method7104(0);
		super.aClass126_Sub3_39.method7113(this.aClass201_4.aClass24_Sub2_1);
		@Pc(45) long local45 = this.aClass241_6.aLong184;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass126_Sub3_39.aFloatArray65[0], -super.aClass126_Sub3_39.aFloatArray65[1], -super.aClass126_Sub3_39.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass126_Sub3_39.aFloat164, super.aClass126_Sub3_39.aFloat161, super.aClass126_Sub3_39.aFloat165, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass126_Sub3_39.aFloatArray65[1]) * 928.0F + 96.0F);
		this.aBoolean810 = true;
	}
}
