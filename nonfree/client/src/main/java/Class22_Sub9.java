import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class22_Sub9 extends Class22 {

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Z")
	private boolean aBoolean331 = false;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "Lclient!bt;")
	private final Class30 aClass30_5;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "Lclient!ij;")
	private Class114 aClass114_7;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!vd;Lclient!bt;)V")
	public Class22_Sub9(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_5 = arg1;
		if (this.aClass30_5.aClass59_Sub2_3 != null && super.aClass51_Sub2_33.aBoolean440 && super.aClass51_Sub2_33.aBoolean441) {
			@Pc(30) Class225 local30 = Static237.method3236(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass51_Sub2_33);
			@Pc(37) Class225 local37 = Static237.method3236(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass51_Sub2_33);
			this.aClass114_7 = Static322.method4280(new Class225[] { local30, local37 }, super.aClass51_Sub2_33);
			this.aBoolean331 = this.aClass114_7 != null;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class59_Sub4 local13 = super.aClass51_Sub2_33.method5407();
		if (!this.aBoolean331 || local13 == null) {
			return;
		}
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5364(local13);
		super.aClass51_Sub2_33.method5371(0);
		super.aClass51_Sub2_33.method5364(this.aClass30_5.aClass59_Sub2_3);
		@Pc(44) long local44 = this.aClass114_7.aLong97;
		OpenGL.glUseProgramObjectARB(local44);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local44, "sunDir"), -super.aClass51_Sub2_33.aFloatArray30[0], -super.aClass51_Sub2_33.aFloatArray30[1], -super.aClass51_Sub2_33.aFloatArray30[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local44, "sunColour"), super.aClass51_Sub2_33.aFloat203, super.aClass51_Sub2_33.aFloat193, super.aClass51_Sub2_33.aFloat202, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "sunExponent"), Math.abs(super.aClass51_Sub2_33.aFloatArray30[1]) * 928.0F + 96.0F);
		this.aBoolean332 = true;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return false;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean332) {
			return;
		}
		@Pc(23) int local23 = 0x1 << (arg0 & 0x3);
		@Pc(34) float local34 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(38) int local38 = arg1 & 0xFFFF;
		@Pc(47) float local47 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(51) long local51 = this.aClass114_7.aLong97;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "time"), (float) (local23 * super.aClass51_Sub2_33.anInt6911 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "scale"), local34);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "breakWaterDepth"), (float) local38);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "breakWaterOffset"), local47);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean332) {
			super.aClass51_Sub2_33.method5364(arg0);
			super.aClass51_Sub2_33.method5400(arg1);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		if (!this.aBoolean332) {
			return;
		}
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5364(null);
		super.aClass51_Sub2_33.method5371(0);
		super.aClass51_Sub2_33.method5364(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean332 = false;
	}
}
