import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "Z")
	private boolean aBoolean547 = false;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Z")
	private boolean aBoolean546 = false;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Lclient!ln;")
	private final Class184 aClass184_4;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!qca;")
	private Class243 aClass243_6;

	static {
		new Class306("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!uq;Lclient!ln;)V")
	public Class13_Sub7(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class184 arg1) {
		super(arg0);
		this.aClass184_4 = arg1;
		if (this.aClass184_4.aClass73_Sub3_1 != null && super.aClass122_Sub3_40.aBoolean595 && super.aClass122_Sub3_40.aBoolean589) {
			@Pc(30) Class221 local30 = Static538.method7473("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass122_Sub3_40, 35633);
			@Pc(37) Class221 local37 = Static538.method7473("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass122_Sub3_40, 35632);
			this.aClass243_6 = Static37.method843(super.aClass122_Sub3_40, new Class221[] { local30, local37 });
			this.aBoolean546 = this.aClass243_6 != null;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return this.aBoolean546;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean547) {
			super.aClass122_Sub3_40.method6850(arg0);
			super.aClass122_Sub3_40.method6875(arg1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		if (!this.aBoolean547) {
			return;
		}
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6850(null);
		super.aClass122_Sub3_40.method6932(0);
		super.aClass122_Sub3_40.method6850(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean547 = false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class73_Sub4 local8 = super.aClass122_Sub3_40.method6895();
		if (!this.aBoolean546 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass122_Sub3_40.aFloatArray65[1])) * 2.0F + 1.0F;
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6850(local8);
		super.aClass122_Sub3_40.method6932(0);
		super.aClass122_Sub3_40.method6850(this.aClass184_4.aClass73_Sub3_1);
		@Pc(53) long local53 = this.aClass243_6.aLong296;
		OpenGL.glUseProgramObjectARB(local53);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "sunDir"), -super.aClass122_Sub3_40.aFloatArray65[0], -super.aClass122_Sub3_40.aFloatArray65[1], -super.aClass122_Sub3_40.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local53, "sunColour"), super.aClass122_Sub3_40.aFloat175 * local27, super.aClass122_Sub3_40.aFloat165 * local27, local27 * super.aClass122_Sub3_40.aFloat168, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local53, "sunExponent"), Math.abs(super.aClass122_Sub3_40.aFloatArray65[1]) * 928.0F + 64.0F);
		this.aBoolean547 = true;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean547) {
			return;
		}
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) float local46 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(55) float local55 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(61) int local61 = arg1 >> 27 & 0xF;
		@Pc(65) long local65 = this.aClass243_6.aLong296;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local65, "time"), (float) (super.aClass122_Sub3_40.anInt8419 * local13 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local65, "scale"), local24);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local65, "breakWaterDepth"), (float) local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local65, "breakWaterOffset"), local37);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local65, "waveIntensity"), local55, local46);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local65, "waveExponent"), (float) local61);
	}
}
