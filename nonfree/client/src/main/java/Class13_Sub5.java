import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class13_Sub5 extends Class13 {

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!cn;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "F")
	private float aFloat89;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private int anInt3887;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!ln;")
	private final Class184 aClass184_3;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!qj;")
	private Class248 aClass248_1;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!uq;Lclient!ln;)V")
	public Class13_Sub5(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class184 arg1) {
		super(arg0);
		this.aClass184_3 = arg1;
		if (super.aClass122_Sub3_40.aBoolean591 && super.aClass122_Sub3_40.bf >= 2) {
			this.aClass248_1 = Static273.method4470(super.aClass122_Sub3_40, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass248_1 != null) {
				@Pc(39) int[][] local39 = Static259.method4363(0.4F);
				@Pc(50) int[][] local50 = Static259.method4363(0.4F);
				this.aFloatArray26 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray26[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray26[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method3441();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	@Override
	public void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass51_4 == null) {
			return;
		}
		super.aClass122_Sub3_40.method6932(1);
		@Pc(100) int local100;
		if ((arg0 & 0x80) != 0) {
			super.aClass122_Sub3_40.method6850(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass184_3.aBoolean371) {
				super.aClass122_Sub3_40.method6850(this.aClass184_3.aClass73_Sub3_3);
			} else {
				super.aClass122_Sub3_40.method6850(this.aClass184_3.aClass73_Sub1Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass184_3.aBoolean371) {
			super.aClass122_Sub3_40.method6850(this.aClass184_3.aClass73_Sub3_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat89, 0.0F, 0.0F, 1.0F);
		} else {
			local100 = super.aClass122_Sub3_40.anInt8419 % 4000 * 16 / 4000;
			super.aClass122_Sub3_40.method6850(this.aClass184_3.aClass73_Sub1Array3[local100]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass122_Sub3_40.method6932(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static395.aFloatArray55, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static395.aFloatArray55, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local100 = arg0 & 0x3;
		if (local100 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local100 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	@Override
	public void method6728() {
		if (this.aClass51_4 != null) {
			this.aClass51_4.method1248('\u0001');
			super.aClass122_Sub3_40.method6932(1);
			super.aClass122_Sub3_40.method6850(null);
			super.aClass122_Sub3_40.method6932(0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6731(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6732() {
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6727(@OriginalArg(0) boolean arg0) {
		if (this.aClass51_4 == null) {
			return;
		}
		this.aClass51_4.method1248('\u0000');
		super.aClass122_Sub3_40.method6932(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass122_Sub3_40.aClass118_Sub1_3.method2637(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass122_Sub3_40.method6932(0);
		if (this.anInt3887 == super.aClass122_Sub3_40.anInt8419) {
			return;
		}
		@Pc(64) int local64 = super.aClass122_Sub3_40.anInt8419 % 5120 * 128 / 5120;
		local64 *= 128;
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local70, this.aFloatArray26, local64);
			local64 += 2;
		}
		if (this.aClass184_3.aBoolean371) {
			this.aFloat89 = (float) (super.aClass122_Sub3_40.anInt8419 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3887 = super.aClass122_Sub3_40.anInt8419;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	private void method3441() {
		this.aClass51_4 = new Class51(super.aClass122_Sub3_40, 2);
		this.aClass51_4.method1250(0);
		super.aClass122_Sub3_40.method6932(1);
		super.aClass122_Sub3_40.method6851(-16777216);
		super.aClass122_Sub3_40.method6853(260, 7681);
		super.aClass122_Sub3_40.method6913(34166, 0);
		super.aClass122_Sub3_40.method6932(0);
		OpenGL.glBindProgramARB(34336, this.aClass248_1.anInt7049);
		OpenGL.glEnable(34336);
		this.aClass51_4.method1253();
		this.aClass51_4.method1250(1);
		super.aClass122_Sub3_40.method6932(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass122_Sub3_40.method6875(0);
		super.aClass122_Sub3_40.method6913(5890, 0);
		super.aClass122_Sub3_40.method6932(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass51_4.method1253();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ea;IZ)V")
	@Override
	public void method6729(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1) {
		super.aClass122_Sub3_40.method6850(arg0);
		super.aClass122_Sub3_40.method6875(arg1);
	}
}
