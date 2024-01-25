import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Z")
	private boolean aBoolean288 = false;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "Lclient!ul;")
	private final Class330 aClass330_2;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!qn;")
	private Class281 aClass281_2;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!kfa;Lclient!ul;)V")
	public Class105_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		this.aClass330_2 = arg1;
		if (this.aClass330_2.aClass3_Sub3_3 != null && super.aClass7_Sub2_41.aBoolean382 && super.aClass7_Sub2_41.aBoolean401) {
			@Pc(30) Class11 local30 = Static427.method6369(super.aClass7_Sub2_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class11 local37 = Static427.method6369(super.aClass7_Sub2_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass281_2 = Static110.method2036(new Class11[] { local30, local37 }, super.aClass7_Sub2_41);
			this.aBoolean288 = this.aClass281_2 != null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (!this.aBoolean289) {
			super.aClass7_Sub2_41.method4313(arg1);
			super.aClass7_Sub2_41.method4288(arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		if (!this.aBoolean289) {
			return;
		}
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(null);
		super.aClass7_Sub2_41.method4326(0);
		super.aClass7_Sub2_41.method4313(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean289 = false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class3_Sub4 local8 = super.aClass7_Sub2_41.method4353();
		if (!this.aBoolean288 || local8 == null) {
			return;
		}
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(local8);
		super.aClass7_Sub2_41.method4326(0);
		super.aClass7_Sub2_41.method4313(this.aClass330_2.aClass3_Sub3_3);
		@Pc(41) long local41 = this.aClass281_2.aLong222;
		OpenGL.glUseProgramObjectARB(local41);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local41, "sunDir"), -super.aClass7_Sub2_41.aFloatArray43[0], super.aClass7_Sub2_41.aFloatArray43[1], super.aClass7_Sub2_41.aFloatArray43[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local41, "sunColour"), super.aClass7_Sub2_41.aFloat145, super.aClass7_Sub2_41.aFloat137, super.aClass7_Sub2_41.aFloat129, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "sunExponent"), Math.abs(super.aClass7_Sub2_41.aFloatArray43[1]) * 928.0F + 96.0F);
		this.aBoolean289 = true;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean289) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass281_2.aLong222;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass7_Sub2_41.anInt5597 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
