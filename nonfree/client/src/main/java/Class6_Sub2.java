import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!as", name = "i", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Lclient!hq;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "Lclient!cd;")
	private final Class45 aClass45_2;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Lclient!am;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "[F")
	private float[] aFloatArray1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!dw;Lclient!cd;)V")
	public Class6_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class45 arg1) {
		super(arg0);
		this.aClass45_2 = arg1;
		if (super.aClass82_Sub1_41.aBoolean189 && super.aClass82_Sub1_41.anInt2503 >= 2) {
			this.aClass16_1 = Static411.method6903("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass82_Sub1_41);
			if (this.aClass16_1 != null) {
				@Pc(41) int[][] local41 = Static74.method1259(0.4F);
				@Pc(52) int[][] local52 = Static74.method1259(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray1 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray1[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray1[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method342();
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
	private void method342() {
		this.aClass149_1 = new Class149(super.aClass82_Sub1_41, 2);
		this.aClass149_1.method3800(0);
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2100(-16777216);
		super.aClass82_Sub1_41.method2077(260, 7681);
		super.aClass82_Sub1_41.method2063(34166, 0);
		super.aClass82_Sub1_41.method2086(0);
		OpenGL.glBindProgramARB(34336, this.aClass16_1.anInt254);
		OpenGL.glEnable(34336);
		this.aClass149_1.method3803();
		this.aClass149_1.method3800(1);
		super.aClass82_Sub1_41.method2086(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass82_Sub1_41.method2068(0);
		super.aClass82_Sub1_41.method2063(5890, 0);
		super.aClass82_Sub1_41.method2086(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass149_1.method3803();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass149_1 == null) {
			return;
		}
		super.aClass82_Sub1_41.method2086(1);
		@Pc(44) int local44;
		if ((arg0 & 0x80) != 0) {
			super.aClass82_Sub1_41.method2029((Class94) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass45_2.aBoolean58) {
				super.aClass82_Sub1_41.method2029(this.aClass45_2.aClass94_Sub3_2);
			} else {
				super.aClass82_Sub1_41.method2029(this.aClass45_2.aClass94_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass45_2.aBoolean58) {
			super.aClass82_Sub1_41.method2029(this.aClass45_2.aClass94_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat5, 0.0F, 0.0F, 1.0F);
		} else {
			local44 = super.aClass82_Sub1_41.anInt2463 % 4000 * 16 / 4000;
			super.aClass82_Sub1_41.method2029(this.aClass45_2.aClass94_Sub2Array2[local44]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass82_Sub1_41.method2086(0);
		if ((arg0 & 0x40) == 0) {
			Static216.aFloatArray83[2] = super.aClass82_Sub1_41.aFloat35 * super.aClass82_Sub1_41.aFloat36;
			Static216.aFloatArray83[1] = super.aClass82_Sub1_41.aFloat36 * super.aClass82_Sub1_41.aFloat34;
			Static216.aFloatArray83[0] = super.aClass82_Sub1_41.aFloat36 * super.aClass82_Sub1_41.aFloat40;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static216.aFloatArray83, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local44 = arg0 & 0x3;
		if (local44 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local44 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (this.aClass149_1 != null) {
			this.aClass149_1.method3804('\u0001');
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2029((Class94) null);
			super.aClass82_Sub1_41.method2086(0);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		super.aClass82_Sub1_41.method2029(arg0);
		super.aClass82_Sub1_41.method2068(arg1);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		if (this.aClass149_1 == null) {
			return;
		}
		this.aClass149_1.method3804('\u0000');
		super.aClass82_Sub1_41.method2086(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass82_Sub1_41.aClass31_Sub3_5.method7942(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass82_Sub1_41.method2086(0);
		if (super.aClass82_Sub1_41.anInt2463 == this.anInt371) {
			return;
		}
		@Pc(57) int local57 = super.aClass82_Sub1_41.anInt2463 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray1, local57);
			local57 += 2;
		}
		if (this.aClass45_2.aBoolean58) {
			this.aFloat5 = (float) (super.aClass82_Sub1_41.anInt2463 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt371 = super.aClass82_Sub1_41.anInt2463;
	}
}
