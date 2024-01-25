import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class160_Sub7 extends Class160 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
	private boolean aBoolean503 = false;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!pia;")
	private final Class288 aClass288_6;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!ir;")
	private Class175 aClass175_7;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!vf;Lclient!pia;)V")
	public Class160_Sub7(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class288 arg1) {
		super(arg0);
		this.aClass288_6 = arg1;
		if (this.aClass288_6.aClass29_Sub1_1 != null && super.aClass100_Sub3_40.aBoolean727 && super.aClass100_Sub3_40.aBoolean738) {
			@Pc(34) Class224 local34 = Static500.method6963(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass100_Sub3_40);
			@Pc(43) Class224 local43 = Static500.method6963(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass100_Sub3_40);
			this.aClass175_7 = Static542.method7425(new Class224[] { local34, local43 }, super.aClass100_Sub3_40);
			this.aBoolean502 = this.aClass175_7 != null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean503) {
			return;
		}
		@Pc(21) int local21 = 0x1 << (arg0 & 0x3);
		@Pc(32) float local32 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(36) int local36 = arg1 & 0xFFFF;
		@Pc(45) float local45 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(49) long local49 = this.aClass175_7.aLong134;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "time"), (float) (super.aClass100_Sub3_40.anInt10257 * local21 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "scale"), local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "breakWaterDepth"), (float) local36);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "breakWaterOffset"), local45);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class29_Sub2 local15 = super.aClass100_Sub3_40.method8714();
		if (!this.aBoolean502 || local15 == null) {
			return;
		}
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743(local15);
		super.aClass100_Sub3_40.method8678(0);
		super.aClass100_Sub3_40.method8743(this.aClass288_6.aClass29_Sub1_1);
		@Pc(48) long local48 = this.aClass175_7.aLong134;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "sunDir"), -super.aClass100_Sub3_40.aFloatArray71[0], -super.aClass100_Sub3_40.aFloatArray71[1], -super.aClass100_Sub3_40.aFloatArray71[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local48, "sunColour"), super.aClass100_Sub3_40.aFloat201, super.aClass100_Sub3_40.aFloat199, super.aClass100_Sub3_40.aFloat192, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "sunExponent"), Math.abs(super.aClass100_Sub3_40.aFloatArray71[1]) * 928.0F + 96.0F);
		this.aBoolean503 = true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean503) {
			super.aClass100_Sub3_40.method8743(arg0);
			super.aClass100_Sub3_40.method8671(arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (!this.aBoolean503) {
			return;
		}
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743((Class29) null);
		super.aClass100_Sub3_40.method8678(0);
		super.aClass100_Sub3_40.method8743((Class29) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean503 = false;
	}
}
