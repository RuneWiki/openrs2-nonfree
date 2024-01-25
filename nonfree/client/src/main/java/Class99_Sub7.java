import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class99_Sub7 extends Class99 {

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "Ljava/lang/String;")
	public static final String aString107;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString108;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
	private boolean aBoolean617 = false;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "Lclient!bb;")
	private final Class30 aClass30_4;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!vc;")
	private Class364 aClass364_6;

	static {
		@Pc(144) String local144 = "Unknown";
		try {
			local144 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(152) Exception local152) {
		}
		local144.toLowerCase();
		local144 = "Unknown";
		try {
			local144 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(167) Exception local167) {
		}
		local144.toLowerCase();
		local144 = "Unknown";
		try {
			local144 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(182) Exception local182) {
		}
		aString107 = local144.toLowerCase();
		local144 = "Unknown";
		try {
			local144 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(197) Exception local197) {
		}
		aString108 = local144.toLowerCase();
		local144 = "Unknown";
		try {
			local144 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(212) Exception local212) {
		}
		local144.toLowerCase();
		local144 = "~/";
		try {
			local144 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(227) Exception local227) {
		}
		new File(local144);
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!ffa;Lclient!bb;)V")
	public Class99_Sub7(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_4 = arg1;
		if (this.aClass30_4.aClass32_Sub2_2 != null && super.aClass57_Sub2_38.aBoolean217 && super.aClass57_Sub2_38.aBoolean220) {
			@Pc(34) Class388 local34 = Static542.method7939(super.aClass57_Sub2_38, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(43) Class388 local43 = Static542.method7939(super.aClass57_Sub2_38, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass364_6 = Static586.method8421(super.aClass57_Sub2_38, (byte) -126, new Class388[] { local34, local43 });
			this.aBoolean617 = this.aClass364_6 != null;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		if (!this.aBoolean616) {
			super.aClass57_Sub2_38.method2362(arg1);
			super.aClass57_Sub2_38.method2382(arg0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean616) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg0 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass364_6.aLong292;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (super.aClass57_Sub2_38.anInt2750 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return this.aBoolean617;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		if (!this.aBoolean616) {
			return;
		}
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362((Class32) null);
		super.aClass57_Sub2_38.method2345(0);
		super.aClass57_Sub2_38.method2362((Class32) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean616 = false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class32_Sub3 local8 = super.aClass57_Sub2_38.method2332();
		if (!this.aBoolean617 || local8 == null) {
			return;
		}
		@Pc(28) float local28 = (1.0F - Math.abs(super.aClass57_Sub2_38.lb[1])) * 2.0F + 1.0F;
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2362(local8);
		super.aClass57_Sub2_38.method2345(0);
		super.aClass57_Sub2_38.method2362(this.aClass30_4.aClass32_Sub2_2);
		@Pc(54) long local54 = this.aClass364_6.aLong292;
		OpenGL.glUseProgramObjectARB(local54);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local54, "sunDir"), -super.aClass57_Sub2_38.lb[0], -super.aClass57_Sub2_38.lb[1], -super.aClass57_Sub2_38.lb[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local54, "sunColour"), super.aClass57_Sub2_38.aFloat38 * local28, local28 * super.aClass57_Sub2_38.aFloat40, super.aClass57_Sub2_38.aFloat48 * local28, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local54, "sunExponent"), Math.abs(super.aClass57_Sub2_38.lb[1]) * 928.0F + 64.0F);
		this.aBoolean616 = true;
	}
}
