import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!nc;")
	private Class66_Sub3 aClass66_Sub3_1;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!b;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class43_Sub1(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
		if (this.aClass122_Sub2_37.aBoolean364 && this.aClass122_Sub2_37.aBoolean353 && this.aClass122_Sub2_37.aBoolean373 && this.aClass122_Sub2_37.aBoolean355) {
			if (this.method999() && this.method1000()) {
				this.aBoolean60 = true;
			} else {
				this.aClass66_Sub3_1 = null;
				this.aClass17_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		if (!this.aBoolean61) {
			return;
		}
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4864(null);
		this.aClass122_Sub2_37.method4811(0);
		this.aClass122_Sub2_37.method4864(null);
		this.aClass122_Sub2_37.anOpengl2.glUseProgramObjectARB(0);
		this.aBoolean61 = false;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()Z")
	private boolean method999() {
		@Pc(5) Class141 local5 = Static207.method3582(this.aClass122_Sub2_37, 35633, "uniform float time;\nuniform vec4 scale;\nvarying vec3 wvVertex;\nvoid main() {\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_Position = gl_ProjectionMatrix*ecVertex;\ngl_TexCoord[0] = vec4(gl_Vertex.xz*0.001953125, time, 1.0)*scale;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\n}\n");
		@Pc(11) Class141 local11 = Static207.method3582(this.aClass122_Sub2_37, 35632, "#extension GL_ARB_texture_rectangle : enable\nvarying vec3 wvVertex;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec3 wnVector = normalize(wvVertex);\nvec3 wnNormal = 2.0*texture3D(normalSampler, gl_TexCoord[0].xyz).rbg-1.0;\nvec3 wnReflection = reflect(wnVector, wnNormal);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat ndote = dot(wnVector, wnNormal);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*0.75)+specularColour;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
		this.aClass17_1 = Static17.method400(this.aClass122_Sub2_37, new Class141[] { local5, local11 });
		return this.aClass17_1 != null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
		if (!this.aBoolean61) {
			this.aClass122_Sub2_37.method4864(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()Z")
	private boolean method1000() {
		@Pc(3) Class99 local3 = this.aClass122_Sub2_37.aClass99_1;
		if (local3.method2282() && local3.method2281()) {
			@Pc(19) Class66_Sub3 local19 = new Class66_Sub3(this.aClass122_Sub2_37, 6409, 256, 256, 64);
			if (local3.method2278(local19)) {
				this.aClass66_Sub3_1 = new Class66_Sub3(this.aClass122_Sub2_37, 6407, 256, 256, 64);
				if (local3.method2277(local19, this.aClass66_Sub3_1)) {
					this.aClass66_Sub3_1.method4045();
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class66_Sub4 local3 = this.aClass122_Sub2_37.method4836();
		if (!this.aBoolean60 || local3 == null) {
			return;
		}
		@Pc(12) opengl local12 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4864(local3);
		this.aClass122_Sub2_37.method4811(0);
		this.aClass122_Sub2_37.method4864(this.aClass66_Sub3_1);
		@Pc(33) int local33 = this.aClass17_1.anInt524;
		local12.glUseProgramObjectARB(local33);
		local12.glUniform1iARB(local12.glGetUniformLocation(local33, "normalSampler"), 0);
		local12.glUniform1iARB(local12.glGetUniformLocation(local33, "envMapSampler"), 1);
		local12.glUniform3fARB(local12.glGetUniformLocation(local33, "sunDir"), this.aClass122_Sub2_37.aFloatArray26[0], -this.aClass122_Sub2_37.aFloatArray26[1], -this.aClass122_Sub2_37.aFloatArray26[2]);
		local12.glUniform4fARB(local12.glGetUniformLocation(local33, "sunColour"), this.aClass122_Sub2_37.aFloat59, this.aClass122_Sub2_37.aFloat63, this.aClass122_Sub2_37.aFloat68, 1.0F);
		local12.glUniform1fARB(local12.glGetUniformLocation(local33, "sunExponent"), Math.abs(this.aClass122_Sub2_37.aFloatArray26[1]) * 928.0F + 96.0F);
		this.aBoolean61 = true;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return this.aBoolean60;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
		if (!this.aBoolean61) {
			return;
		}
		@Pc(6) opengl local6 = this.aClass122_Sub2_37.anOpengl2;
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = this.aClass17_1.anInt524;
		@Pc(32) int local32 = local6.glGetUniformLocation(local27, "time");
		@Pc(37) int local37 = local6.glGetUniformLocation(local27, "scale");
		local6.glUniform1fARB(local32, (float) (local12 * this.aClass122_Sub2_37.anInt5610 % 40000) / 40000.0F);
		local6.glUniform4fARB(local37, local23, local23, 1.0F, 1.0F);
	}
}
