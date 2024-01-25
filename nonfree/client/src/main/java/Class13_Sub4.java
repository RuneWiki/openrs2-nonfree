import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Lclient!ln;")
	private final Class184 aClass184_2;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Lclient!qca;")
	private Class243 aClass243_1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!uq;Lclient!ln;)V")
	public Class13_Sub4(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class184 arg1) {
		super(arg0);
		this.aClass184_2 = arg1;
		if (this.aClass184_2.aClass73_Sub3_1 != null && super.aClass122_Sub3_40.aBoolean595 && super.aClass122_Sub3_40.aBoolean589) {
			@Pc(30) Class221 local30 = Static538.method7473("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass122_Sub3_40, 35633);
			@Pc(37) Class221 local37 = Static538.method7473("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass122_Sub3_40, 35632);
			this.aClass243_1 = Static37.method843(super.aClass122_Sub3_40, new Class221[] { local30, local37 });
			this.aBoolean186 = this.aClass243_1 != null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean187) {
			return;
		}
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(47) long local47 = this.aClass243_1.aLong296;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "time"), (float) (super.aClass122_Sub3_40.anInt8419 * local19 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "scale"), local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "breakWaterDepth"), (float) local34);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "breakWaterOffset"), local43);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		if (!this.aBoolean187) {
			return;
		}
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6850(null);
		super.aClass122_Sub3_40.method6932(0);
		super.aClass122_Sub3_40.method6850(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean187 = false;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return false;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean187) {
			super.aClass122_Sub3_40.method6850(arg0);
			super.aClass122_Sub3_40.method6875(arg1);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class73_Sub4 local8 = super.aClass122_Sub3_40.method6895();
		if (!this.aBoolean186 || local8 == null) {
			return;
		}
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6850(local8);
		super.aClass122_Sub3_40.method6932(0);
		super.aClass122_Sub3_40.method6850(this.aClass184_2.aClass73_Sub3_1);
		@Pc(43) long local43 = this.aClass243_1.aLong296;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass122_Sub3_40.aFloatArray65[0], -super.aClass122_Sub3_40.aFloatArray65[1], -super.aClass122_Sub3_40.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass122_Sub3_40.aFloat175, super.aClass122_Sub3_40.aFloat165, super.aClass122_Sub3_40.aFloat168, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass122_Sub3_40.aFloatArray65[1]) * 928.0F + 96.0F);
		this.aBoolean187 = true;
	}
}
