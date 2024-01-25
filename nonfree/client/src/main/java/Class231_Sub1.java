import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class231_Sub1 extends Class231 {

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
	private int anInt7517;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Lclient!nc;")
	private Class243 aClass243_2;

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "F")
	private float aFloat157;

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "Lclient!wo;")
	private final Class391 aClass391_1;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "Lclient!oca;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "[F")
	private float[] aFloatArray74;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!ck;Lclient!wo;)V")
	public Class231_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class391 arg1) {
		super(arg0);
		this.aClass391_1 = arg1;
		if (super.aClass65_Sub1_41.aBoolean93 && super.aClass65_Sub1_41.anInt1397 >= 2) {
			this.aClass261_1 = Static234.method3621("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass65_Sub1_41);
			if (this.aClass261_1 != null) {
				@Pc(39) int[][] local39 = Static172.method2967(0.4F);
				@Pc(50) int[][] local50 = Static172.method2967(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray74 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(63) int[] local63 = local39[local58];
					@Pc(67) int[] local67 = local50[local58];
					for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
						this.aFloatArray74[local52++] = (float) local63[local69] / 4096.0F;
						this.aFloatArray74[local52++] = (float) local67[local69] / 4096.0F;
					}
				}
				this.method6351();
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	private void method6351() {
		this.aClass243_2 = new Class243(super.aClass65_Sub1_41, 2);
		this.aClass243_2.method5742(0);
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1232(-16777216);
		super.aClass65_Sub1_41.method1228(260, 7681);
		super.aClass65_Sub1_41.method1233(0, 34166);
		super.aClass65_Sub1_41.method1256(0);
		OpenGL.glBindProgramARB(34336, this.aClass261_1.anInt7333);
		OpenGL.glEnable(34336);
		this.aClass243_2.method5741();
		this.aClass243_2.method5742(1);
		super.aClass65_Sub1_41.method1256(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass65_Sub1_41.method1290(0);
		super.aClass65_Sub1_41.method1233(0, 5890);
		super.aClass65_Sub1_41.method1256(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass243_2.method5741();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass243_2 == null) {
			return;
		}
		super.aClass65_Sub1_41.method1256(1);
		@Pc(49) int local49;
		if ((arg1 & 0x80) != 0) {
			super.aClass65_Sub1_41.method1286((Class80) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass391_1.aBoolean911) {
				super.aClass65_Sub1_41.method1286(this.aClass391_1.aClass80_Sub3_1);
			} else {
				super.aClass65_Sub1_41.method1286(this.aClass391_1.aClass80_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass391_1.aBoolean911) {
			super.aClass65_Sub1_41.method1286(this.aClass391_1.aClass80_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat157, 0.0F, 0.0F, 1.0F);
		} else {
			local49 = super.aClass65_Sub1_41.anInt1383 % 4000 * 16 / 4000;
			super.aClass65_Sub1_41.method1286(this.aClass391_1.aClass80_Sub2Array3[local49]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass65_Sub1_41.method1256(0);
		if ((arg1 & 0x40) == 0) {
			Static537.aFloatArray34[1] = super.aClass65_Sub1_41.aFloat13 * super.aClass65_Sub1_41.aFloat22;
			Static537.aFloatArray34[2] = super.aClass65_Sub1_41.aFloat13 * super.aClass65_Sub1_41.aFloat24;
			Static537.aFloatArray34[0] = super.aClass65_Sub1_41.aFloat23 * super.aClass65_Sub1_41.aFloat13;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static537.aFloatArray34, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local49 = arg1 & 0x3;
		if (local49 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local49 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return true;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		if (this.aClass243_2 == null) {
			return;
		}
		this.aClass243_2.method5740('\u0000');
		super.aClass65_Sub1_41.method1256(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass65_Sub1_41.aClass254_Sub1_4.method5932(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass65_Sub1_41.method1256(0);
		if (this.anInt7517 == super.aClass65_Sub1_41.anInt1383) {
			return;
		}
		@Pc(61) int local61 = super.aClass65_Sub1_41.anInt1383 % 5000 * 128 / 5000;
		for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local63, this.aFloatArray74, local61);
			local61 += 2;
		}
		if (this.aClass391_1.aBoolean911) {
			this.aFloat157 = (float) (super.aClass65_Sub1_41.anInt1383 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7517 = super.aClass65_Sub1_41.anInt1383;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		if (this.aClass243_2 != null) {
			this.aClass243_2.method5740('\u0001');
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1286((Class80) null);
			super.aClass65_Sub1_41.method1256(0);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		super.aClass65_Sub1_41.method1286(arg0);
		super.aClass65_Sub1_41.method1290(arg1);
	}
}
