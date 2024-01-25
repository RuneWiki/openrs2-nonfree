import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class160_Sub3 extends Class160 {

	@OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
	private boolean aBoolean330 = false;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "Lclient!pia;")
	private final Class288 aClass288_3;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Lclient!ir;")
	private Class175 aClass175_5;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!vf;Lclient!pia;)V")
	public Class160_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class288 arg1) {
		super(arg0);
		this.aClass288_3 = arg1;
		if (this.aClass288_3.aClass29_Sub1_1 != null && super.aClass100_Sub3_40.aBoolean727 && super.aClass100_Sub3_40.aBoolean738) {
			@Pc(34) Class224 local34 = Static500.method6963(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass100_Sub3_40);
			@Pc(43) Class224 local43 = Static500.method6963(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass100_Sub3_40);
			this.aClass175_5 = Static542.method7425(new Class224[] { local34, local43 }, super.aClass100_Sub3_40);
			this.aBoolean329 = this.aClass175_5 != null;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return this.aBoolean329;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean330) {
			super.aClass100_Sub3_40.method8743(arg0);
			super.aClass100_Sub3_40.method8671(arg1);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (!this.aBoolean330) {
			return;
		}
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743((Class29) null);
		super.aClass100_Sub3_40.method8678(0);
		super.aClass100_Sub3_40.method8743((Class29) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		@Pc(13) Class29_Sub2 local13 = super.aClass100_Sub3_40.method8714();
		if (!this.aBoolean329 || local13 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass100_Sub3_40.aFloatArray71[1])) * 2.0F + 1.0F;
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743(local13);
		super.aClass100_Sub3_40.method8678(0);
		super.aClass100_Sub3_40.method8743(this.aClass288_3.aClass29_Sub1_1);
		@Pc(59) long local59 = this.aClass175_5.aLong134;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass100_Sub3_40.aFloatArray71[0], -super.aClass100_Sub3_40.aFloatArray71[1], -super.aClass100_Sub3_40.aFloatArray71[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), local33 * super.aClass100_Sub3_40.aFloat201, super.aClass100_Sub3_40.aFloat199 * local33, super.aClass100_Sub3_40.aFloat192 * local33, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass100_Sub3_40.aFloatArray71[1]) * 928.0F + 64.0F);
		this.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean330) {
			return;
		}
		@Pc(21) int local21 = 0x1 << (arg0 & 0x3);
		@Pc(32) float local32 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(36) int local36 = arg1 & 0xFFFF;
		@Pc(45) float local45 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(54) float local54 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(63) float local63 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(69) int local69 = arg1 >> 27 & 0xF;
		@Pc(73) long local73 = this.aClass175_5.aLong134;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local73, "time"), (float) (local21 * super.aClass100_Sub3_40.anInt10257 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local73, "scale"), local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local73, "breakWaterDepth"), (float) local36);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local73, "breakWaterOffset"), local45);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local73, "waveIntensity"), local63, local54);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local73, "waveExponent"), (float) local69);
	}
}
