import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class39_Sub6 extends Class39 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Lclient!hj;")
	private Class92_Sub1 aClass92_Sub1_3;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!ge;")
	private Class81 aClass81_5;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class39_Sub6(@OriginalArg(0) Class89_Sub1 arg0) {
		super(arg0);
		if (this.aClass89_Sub1_39.aBoolean191 && this.aClass89_Sub1_39.aBoolean193 && this.aClass89_Sub1_39.aBoolean200 && this.aClass89_Sub1_39.aBoolean197) {
			if (this.method4802() && this.method4801()) {
				this.aBoolean417 = true;
			} else {
				this.aClass92_Sub1_3 = null;
				this.aClass81_5 = null;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
		if (!this.aBoolean418) {
			this.aClass89_Sub1_39.method2445(arg0);
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		if (!this.aBoolean418) {
			return;
		}
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2445(null);
		this.aClass89_Sub1_39.method2433(0);
		this.aClass89_Sub1_39.method2445(null);
		this.aClass89_Sub1_39.anOpengl2.glUseProgramObjectARB(0);
		this.aBoolean418 = false;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "()Z")
	private boolean method4801() {
		@Pc(3) Class220 local3 = this.aClass89_Sub1_39.aClass220_1;
		if (local3.method5713() && local3.method5715()) {
			@Pc(19) Class92_Sub1 local19 = new Class92_Sub1(this.aClass89_Sub1_39, 6409, 256, 256, 64);
			if (local3.method5717(local19)) {
				this.aClass92_Sub1_3 = new Class92_Sub1(this.aClass89_Sub1_39, 6407, 256, 256, 64);
				if (local3.method5714(local19, this.aClass92_Sub1_3)) {
					this.aClass92_Sub1_3.method3527();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "()Z")
	private boolean method4802() {
		@Pc(5) Class132 local5 = Static190.method3449(this.aClass89_Sub1_39, 35633, "uniform float time;\nuniform vec4 scale;\nvarying vec3 wvVertex;\nvoid main() {\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_Position = gl_ProjectionMatrix*ecVertex;\ngl_TexCoord[0] = vec4(gl_Vertex.xz*0.001953125, time, 1.0)*scale;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\n}\n");
		@Pc(11) Class132 local11 = Static190.method3449(this.aClass89_Sub1_39, 35632, "#extension GL_ARB_texture_rectangle : enable\nvarying vec3 wvVertex;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec3 wnVector = normalize(wvVertex);\nvec3 wnNormal = 2.0*texture3D(normalSampler, gl_TexCoord[0].xyz).rbg-1.0;\nvec3 wnReflection = reflect(wnVector, wnNormal);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat ndote = dot(wnVector, wnNormal);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*0.75)+specularColour;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
		this.aClass81_5 = Static99.method1992(this.aClass89_Sub1_39, new Class132[] { local5, local11 });
		return this.aClass81_5 != null;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class92_Sub3 local3 = this.aClass89_Sub1_39.method2393();
		if (!this.aBoolean417 || local3 == null) {
			return;
		}
		@Pc(12) opengl local12 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2445(local3);
		this.aClass89_Sub1_39.method2433(0);
		this.aClass89_Sub1_39.method2445(this.aClass92_Sub1_3);
		@Pc(33) int local33 = this.aClass81_5.anInt2398;
		local12.glUseProgramObjectARB(local33);
		local12.glUniform1iARB(local12.glGetUniformLocation(local33, "normalSampler"), 0);
		local12.glUniform1iARB(local12.glGetUniformLocation(local33, "envMapSampler"), 1);
		local12.glUniform3fARB(local12.glGetUniformLocation(local33, "sunDir"), this.aClass89_Sub1_39.aFloatArray10[0], -this.aClass89_Sub1_39.aFloatArray10[1], -this.aClass89_Sub1_39.aFloatArray10[2]);
		local12.glUniform4fARB(local12.glGetUniformLocation(local33, "sunColour"), this.aClass89_Sub1_39.aFloat31, this.aClass89_Sub1_39.aFloat38, this.aClass89_Sub1_39.aFloat23, 1.0F);
		local12.glUniform1fARB(local12.glGetUniformLocation(local33, "sunExponent"), Math.abs(this.aClass89_Sub1_39.aFloatArray10[1]) * 928.0F + 96.0F);
		this.aBoolean418 = true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return this.aBoolean417;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
		if (!this.aBoolean418) {
			return;
		}
		@Pc(6) opengl local6 = this.aClass89_Sub1_39.anOpengl2;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = this.aClass81_5.anInt2398;
		@Pc(32) int local32 = local6.glGetUniformLocation(local27, "time");
		@Pc(37) int local37 = local6.glGetUniformLocation(local27, "scale");
		local6.glUniform1fARB(local32, (float) (local12 * this.aClass89_Sub1_39.anInt2599 % 40000) / 40000.0F);
		local6.glUniform4fARB(local37, local23, local23, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
	}
}
