import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class34_Sub4 extends Class34 {

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "Lclient!vi;")
	private Class360 aClass360_4;

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "I")
	private int anInt3607;

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "Lclient!lba;")
	private final Class201 aClass201_2;

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "Lclient!rd;")
	private Class300 aClass300_1;

	@OriginalMember(owner = "client!hea", name = "p", descriptor = "[F")
	private float[] aFloatArray10;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!rda;Lclient!lba;)V")
	public Class34_Sub4(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class201 arg1) {
		super(arg0);
		this.aClass201_2 = arg1;
		if (super.aClass126_Sub3_39.aBoolean673 && super.aClass126_Sub3_39.anInt8300 >= 2) {
			this.aClass300_1 = Static96.method1439("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass126_Sub3_39);
			if (this.aClass300_1 != null) {
				@Pc(41) int[][] local41 = Static567.method8016(0.4F);
				@Pc(52) int[][] local52 = Static567.method8016(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray10 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray10[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray10[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3189();
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass126_Sub3_39.method7113(arg1);
		super.aClass126_Sub3_39.method7105(arg0);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		if (this.aClass360_4 == null) {
			return;
		}
		this.aClass360_4.method8434('\u0000');
		super.aClass126_Sub3_39.method7104(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass126_Sub3_39.aClass117_Sub3_5.method7265(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass126_Sub3_39.method7104(0);
		if (super.aClass126_Sub3_39.anInt8272 == this.anInt3607) {
			return;
		}
		@Pc(55) int local55 = super.aClass126_Sub3_39.anInt8272 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray10, local55);
			local55 += 2;
		}
		if (this.aClass201_2.aBoolean465) {
			this.aFloat43 = (float) (super.aClass126_Sub3_39.anInt8272 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3607 = super.aClass126_Sub3_39.anInt8272;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass360_4 == null) {
			return;
		}
		super.aClass126_Sub3_39.method7104(1);
		@Pc(64) int local64;
		if ((arg0 & 0x80) != 0) {
			super.aClass126_Sub3_39.method7113((Class24) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass201_2.aBoolean465) {
				super.aClass126_Sub3_39.method7113(this.aClass201_2.aClass24_Sub2_3);
			} else {
				super.aClass126_Sub3_39.method7113(this.aClass201_2.aClass24_Sub4Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass201_2.aBoolean465) {
			super.aClass126_Sub3_39.method7113(this.aClass201_2.aClass24_Sub2_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat43, 0.0F, 0.0F, 1.0F);
		} else {
			local64 = super.aClass126_Sub3_39.anInt8272 % 4000 * 16 / 4000;
			super.aClass126_Sub3_39.method7113(this.aClass201_2.aClass24_Sub4Array2[local64]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass126_Sub3_39.method7104(0);
		if ((arg0 & 0x40) == 0) {
			Static262.aFloatArray13[1] = super.aClass126_Sub3_39.aFloat161 * super.aClass126_Sub3_39.aFloat163;
			Static262.aFloatArray13[0] = super.aClass126_Sub3_39.aFloat164 * super.aClass126_Sub3_39.aFloat163;
			Static262.aFloatArray13[2] = super.aClass126_Sub3_39.aFloat163 * super.aClass126_Sub3_39.aFloat165;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static262.aFloatArray13, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local64 = arg0 & 0x3;
		if (local64 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local64 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "(Z)V")
	private void method3189() {
		this.aClass360_4 = new Class360(super.aClass126_Sub3_39, 2);
		this.aClass360_4.method8433(0);
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7125(-16777216);
		super.aClass126_Sub3_39.method7082(7681, 260);
		super.aClass126_Sub3_39.method7073(0, 34166);
		super.aClass126_Sub3_39.method7104(0);
		OpenGL.glBindProgramARB(34336, this.aClass300_1.anInt8054);
		OpenGL.glEnable(34336);
		this.aClass360_4.method8436();
		this.aClass360_4.method8433(1);
		super.aClass126_Sub3_39.method7104(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass126_Sub3_39.method7105(0);
		super.aClass126_Sub3_39.method7073(0, 5890);
		super.aClass126_Sub3_39.method7104(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass360_4.method8436();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return true;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		if (this.aClass360_4 != null) {
			this.aClass360_4.method8434('\u0001');
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7113((Class24) null);
			super.aClass126_Sub3_39.method7104(0);
		}
	}
}
