import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "F")
	private float aFloat21;

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
	private int anInt2168;

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "Lclient!ik;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Lclient!tf;")
	private final Class336 aClass336_2;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "Lclient!ie;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "[F")
	private float[] aFloatArray8;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!lf;Lclient!tf;)V")
	public Class22_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_2 = arg1;
		if (super.aClass95_Sub3_37.aBoolean388 && super.aClass95_Sub3_37.anInt5764 >= 2) {
			this.aClass160_1 = Static384.method5389(super.aClass95_Sub3_37, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass160_1 != null) {
				@Pc(41) int[][] local41 = Static329.method4684(0.4F);
				@Pc(52) int[][] local52 = Static329.method4684(0.4F);
				this.aFloatArray8 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray8[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray8[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method1828();
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass164_1 == null) {
			return;
		}
		super.aClass95_Sub3_37.method4900(1);
		@Pc(59) int local59;
		if ((arg1 & 0x80) != 0) {
			super.aClass95_Sub3_37.method4864((Class10) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass336_2.aBoolean645) {
				super.aClass95_Sub3_37.method4864(this.aClass336_2.aClass10_Sub1_3);
			} else {
				super.aClass95_Sub3_37.method4864(this.aClass336_2.aClass10_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass336_2.aBoolean645) {
			super.aClass95_Sub3_37.method4864(this.aClass336_2.aClass10_Sub1_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat21, 0.0F, 0.0F, 1.0F);
		} else {
			local59 = super.aClass95_Sub3_37.anInt5751 % 4000 * 16 / 4000;
			super.aClass95_Sub3_37.method4864(this.aClass336_2.aClass10_Sub2Array3[local59]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass95_Sub3_37.method4900(0);
		if ((arg1 & 0x40) == 0) {
			Static351.aFloatArray40[2] = super.aClass95_Sub3_37.aFloat99 * super.aClass95_Sub3_37.aFloat84;
			Static351.aFloatArray40[1] = super.aClass95_Sub3_37.aFloat85 * super.aClass95_Sub3_37.aFloat84;
			Static351.aFloatArray40[0] = super.aClass95_Sub3_37.aFloat101 * super.aClass95_Sub3_37.aFloat84;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static351.aFloatArray40, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local59 = arg1 & 0x3;
		if (local59 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local59 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		if (this.aClass164_1 != null) {
			this.aClass164_1.method3843('\u0001');
			super.aClass95_Sub3_37.method4900(1);
			super.aClass95_Sub3_37.method4864((Class10) null);
			super.aClass95_Sub3_37.method4900(0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
	private void method1828() {
		this.aClass164_1 = new Class164(super.aClass95_Sub3_37, 2);
		this.aClass164_1.method3846(0);
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4893(-16777216);
		super.aClass95_Sub3_37.method4899(260, 7681);
		super.aClass95_Sub3_37.method4850(0, 34166);
		super.aClass95_Sub3_37.method4900(0);
		OpenGL.glBindProgramARB(34336, this.aClass160_1.anInt4345);
		OpenGL.glEnable(34336);
		this.aClass164_1.method3848();
		this.aClass164_1.method3846(1);
		super.aClass95_Sub3_37.method4900(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass95_Sub3_37.method4870(0);
		super.aClass95_Sub3_37.method4850(0, 5890);
		super.aClass95_Sub3_37.method4900(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass164_1.method3848();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub3_37.method4864(arg0);
		super.aClass95_Sub3_37.method4870(arg1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		if (this.aClass164_1 == null) {
			return;
		}
		this.aClass164_1.method3843('\u0000');
		super.aClass95_Sub3_37.method4900(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass95_Sub3_37.aClass17_Sub3_5.method6245(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass95_Sub3_37.method4900(0);
		if (this.anInt2168 == super.aClass95_Sub3_37.anInt5751) {
			return;
		}
		@Pc(58) int local58 = super.aClass95_Sub3_37.anInt5751 % 5000 * 128 / 5000;
		for (@Pc(60) int local60 = 0; local60 < 64; local60++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local60, this.aFloatArray8, local58);
			local58 += 2;
		}
		if (this.aClass336_2.aBoolean645) {
			this.aFloat21 = (float) (super.aClass95_Sub3_37.anInt5751 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2168 = super.aClass95_Sub3_37.anInt5751;
	}
}
