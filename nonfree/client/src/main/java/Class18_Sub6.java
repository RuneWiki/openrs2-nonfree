import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class18_Sub6 extends Class18 {

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "F")
	private float aFloat67;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	private int anInt3913;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "Lclient!rj;")
	private Class303 aClass303_3;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!fa;")
	private final Class101 aClass101_3;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "Lclient!sea;")
	private Class315 aClass315_5;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!ep;Lclient!fa;)V")
	public Class18_Sub6(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class101 arg1) {
		super(arg0);
		this.aClass101_3 = arg1;
		if (super.aClass95_Sub1_39.aBoolean192 && super.aClass95_Sub1_39.anInt2549 >= 2) {
			this.aClass315_5 = Static324.method4332("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass95_Sub1_39);
			if (this.aClass315_5 != null) {
				@Pc(39) int[][] local39 = Static140.method2128(0.4F);
				@Pc(50) int[][] local50 = Static140.method2128(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray19 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray19[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray19[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method3352();
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		super.aClass95_Sub1_39.method2077(arg1);
		super.aClass95_Sub1_39.method2106(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		if (this.aClass303_3 == null) {
			return;
		}
		this.aClass303_3.method6856('\u0000');
		super.aClass95_Sub1_39.method2098(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass95_Sub1_39.aClass177_Sub3_5.method7889(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass95_Sub1_39.method2098(0);
		if (super.aClass95_Sub1_39.anInt2513 == this.anInt3913) {
			return;
		}
		@Pc(62) int local62 = super.aClass95_Sub1_39.anInt2513 % 5000 * 128 / 5000;
		for (@Pc(64) int local64 = 0; local64 < 64; local64++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local64, this.aFloatArray19, local62);
			local62 += 2;
		}
		if (this.aClass101_3.aBoolean204) {
			this.aFloat67 = (float) (super.aClass95_Sub1_39.anInt2513 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3913 = super.aClass95_Sub1_39.anInt2513;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass303_3 == null) {
			return;
		}
		super.aClass95_Sub1_39.method2098(1);
		@Pc(94) int local94;
		if ((arg0 & 0x80) != 0) {
			super.aClass95_Sub1_39.method2077(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass101_3.aBoolean204) {
				super.aClass95_Sub1_39.method2077(this.aClass101_3.aClass65_Sub2_2);
			} else {
				super.aClass95_Sub1_39.method2077(this.aClass101_3.aClass65_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass101_3.aBoolean204) {
			super.aClass95_Sub1_39.method2077(this.aClass101_3.aClass65_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat67, 0.0F, 0.0F, 1.0F);
		} else {
			local94 = super.aClass95_Sub1_39.anInt2513 % 4000 * 16 / 4000;
			super.aClass95_Sub1_39.method2077(this.aClass101_3.aClass65_Sub1Array1[local94]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass95_Sub1_39.method2098(0);
		if ((arg0 & 0x40) == 0) {
			Static181.aFloatArray15[2] = super.aClass95_Sub1_39.aFloat35 * super.aClass95_Sub1_39.aFloat36;
			Static181.aFloatArray15[0] = super.aClass95_Sub1_39.aFloat36 * super.aClass95_Sub1_39.aFloat30;
			Static181.aFloatArray15[1] = super.aClass95_Sub1_39.aFloat36 * super.aClass95_Sub1_39.aFloat32;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static181.aFloatArray15, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local94 = arg0 & 0x3;
		if (local94 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local94 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)V")
	private void method3352() {
		this.aClass303_3 = new Class303(super.aClass95_Sub1_39, 2);
		this.aClass303_3.method6859(0);
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2109(-16777216);
		super.aClass95_Sub1_39.method2105(260, 7681);
		super.aClass95_Sub1_39.method2095(0, 34166);
		super.aClass95_Sub1_39.method2098(0);
		OpenGL.glBindProgramARB(34336, this.aClass315_5.anInt8563);
		OpenGL.glEnable(34336);
		this.aClass303_3.method6857();
		this.aClass303_3.method6859(1);
		super.aClass95_Sub1_39.method2098(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass95_Sub1_39.method2106(0);
		super.aClass95_Sub1_39.method2095(0, 5890);
		super.aClass95_Sub1_39.method2098(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass303_3.method6857();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.aClass303_3 != null) {
			this.aClass303_3.method6856('\u0001');
			super.aClass95_Sub1_39.method2098(1);
			super.aClass95_Sub1_39.method2077(null);
			super.aClass95_Sub1_39.method2098(0);
		}
	}
}
