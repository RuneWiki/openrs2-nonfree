import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class99_Sub3 extends Class99 {

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!bb;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!vc;")
	private Class364 aClass364_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!ffa;Lclient!bb;)V")
	public Class99_Sub3(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_1 = arg1;
		if (this.aClass30_1.aClass32_Sub2_2 != null && super.aClass57_Sub2_38.aBoolean217 && super.aClass57_Sub2_38.aBoolean220) {
			@Pc(34) Class388 local34 = Static542.method7939(super.aClass57_Sub2_38, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(43) Class388 local43 = Static542.method7939(super.aClass57_Sub2_38, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass364_1 = Static586.method8421(super.aClass57_Sub2_38, (byte) -128, new Class388[] { local34, local43 });
			this.aBoolean420 = this.aClass364_1 != null;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		if (!this.aBoolean419) {
			return;
		}
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362((Class32) null);
		super.aClass57_Sub2_38.method2345(0);
		super.aClass57_Sub2_38.method2362((Class32) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean419 = false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class32_Sub3 local16 = super.aClass57_Sub2_38.method2332();
		if (!this.aBoolean420 || local16 == null) {
			return;
		}
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362(local16);
		super.aClass57_Sub2_38.method2345(0);
		super.aClass57_Sub2_38.method2362(this.aClass30_1.aClass32_Sub2_2);
		@Pc(51) long local51 = this.aClass364_1.aLong292;
		OpenGL.glUseProgramObjectARB(local51);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local51, "sunDir"), -super.aClass57_Sub2_38.lb[0], -super.aClass57_Sub2_38.lb[1], -super.aClass57_Sub2_38.lb[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local51, "sunColour"), super.aClass57_Sub2_38.aFloat38, super.aClass57_Sub2_38.aFloat40, super.aClass57_Sub2_38.aFloat48, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "sunExponent"), Math.abs(super.aClass57_Sub2_38.lb[1]) * 928.0F + 96.0F);
		this.aBoolean419 = true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		if (!this.aBoolean419) {
			super.aClass57_Sub2_38.method2362(arg1);
			super.aClass57_Sub2_38.method2382(arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean419) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(48) long local48 = this.aClass364_1.aLong292;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "time"), (float) (local20 * super.aClass57_Sub2_38.anInt2750 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterOffset"), local44);
	}
}
