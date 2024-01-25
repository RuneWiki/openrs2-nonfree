import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class19_Sub5 extends Class19 {

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!b;")
	private final Class25 aClass25_3;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!gb;")
	private Class125 aClass125_6;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!kv;Lclient!b;)V")
	public Class19_Sub5(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class25 arg1) {
		super(arg0);
		this.aClass25_3 = arg1;
		if (this.aClass25_3.aClass44_Sub2_3 != null && super.aClass143_Sub2_39.aBoolean412 && super.aClass143_Sub2_39.aBoolean421) {
			@Pc(30) Class227 local30 = Static285.method3923(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass143_Sub2_39);
			@Pc(37) Class227 local37 = Static285.method3923(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass143_Sub2_39);
			this.aClass125_6 = Static616.method8266(new Class227[] { local30, local37 }, super.aClass143_Sub2_39);
			this.aBoolean231 = this.aClass125_6 != null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean230) {
			super.aClass143_Sub2_39.method4945(arg0);
			super.aClass143_Sub2_39.method4994(arg1);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean230) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass125_6.aLong111;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (super.aClass143_Sub2_39.anInt5822 * local18 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		if (!this.aBoolean230) {
			return;
		}
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945((Class44) null);
		super.aClass143_Sub2_39.method4930(0);
		super.aClass143_Sub2_39.method4945((Class44) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean230 = false;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class44_Sub3 local12 = super.aClass143_Sub2_39.method4953();
		if (!this.aBoolean231 || local12 == null) {
			return;
		}
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945(local12);
		super.aClass143_Sub2_39.method4930(0);
		super.aClass143_Sub2_39.method4945(this.aClass25_3.aClass44_Sub2_3);
		@Pc(43) long local43 = this.aClass125_6.aLong111;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass143_Sub2_39.aFloatArray40[0], -super.aClass143_Sub2_39.aFloatArray40[1], -super.aClass143_Sub2_39.aFloatArray40[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass143_Sub2_39.aFloat100, super.aClass143_Sub2_39.aFloat98, super.aClass143_Sub2_39.aFloat96, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass143_Sub2_39.aFloatArray40[1]) * 928.0F + 96.0F);
		this.aBoolean230 = true;
	}
}
