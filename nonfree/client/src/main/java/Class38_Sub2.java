import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private int anInt3887;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "F")
	private float aFloat88;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Lclient!pba;")
	private Class264 aClass264_3;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!mha;")
	private final Class219 aClass219_3;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!td;")
	private Class331 aClass331_1;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!dia;Lclient!mha;)V")
	public Class38_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class219 arg1) {
		super(arg0);
		this.aClass219_3 = arg1;
		if (super.aClass13_Sub2_39.aBoolean181 && super.aClass13_Sub2_39.anInt2175 >= 2) {
			this.aClass331_1 = Static146.method2735("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass13_Sub2_39);
			if (this.aClass331_1 != null) {
				@Pc(37) int[][] local37 = Static521.method6957(0.4F);
				@Pc(48) int[][] local48 = Static521.method6957(0.4F);
				this.aFloatArray23 = new float[32768];
				@Pc(54) int local54 = 0;
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray23[local54++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray23[local54++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method3558();
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	@Override
	public void method7814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass264_3 == null) {
			return;
		}
		super.aClass13_Sub2_39.method2008(1);
		@Pc(75) int local75;
		if ((arg0 & 0x80) != 0) {
			super.aClass13_Sub2_39.method2024((Class85) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass219_3.aBoolean431) {
				super.aClass13_Sub2_39.method2024(this.aClass219_3.aClass85_Sub4_2);
			} else {
				super.aClass13_Sub2_39.method2024(this.aClass219_3.aClass85_Sub3Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass219_3.aBoolean431) {
			super.aClass13_Sub2_39.method2024(this.aClass219_3.aClass85_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat88, 0.0F, 0.0F, 1.0F);
		} else {
			local75 = super.aClass13_Sub2_39.anInt2155 % 4000 * 16 / 4000;
			super.aClass13_Sub2_39.method2024(this.aClass219_3.aClass85_Sub3Array4[local75]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass13_Sub2_39.method2008(0);
		if ((arg0 & 0x40) == 0) {
			Static207.aFloatArray24[2] = super.aClass13_Sub2_39.aFloat61 * super.aClass13_Sub2_39.aFloat46;
			Static207.aFloatArray24[1] = super.aClass13_Sub2_39.aFloat57 * super.aClass13_Sub2_39.aFloat61;
			Static207.aFloatArray24[0] = super.aClass13_Sub2_39.aFloat54 * super.aClass13_Sub2_39.aFloat61;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static207.aFloatArray24, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local75 = arg0 & 0x3;
		if (local75 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local75 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	private void method3558() {
		this.aClass264_3 = new Class264(super.aClass13_Sub2_39, 2);
		this.aClass264_3.method6556(0);
		super.aClass13_Sub2_39.method2008(1);
		super.aClass13_Sub2_39.method1962(-16777216);
		super.aClass13_Sub2_39.method1993(7681, 260);
		super.aClass13_Sub2_39.method2028(0, 34166);
		super.aClass13_Sub2_39.method2008(0);
		OpenGL.glBindProgramARB(34336, this.aClass331_1.anInt9187);
		OpenGL.glEnable(34336);
		this.aClass264_3.method6558();
		this.aClass264_3.method6556(1);
		super.aClass13_Sub2_39.method2008(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass13_Sub2_39.method1960(0);
		super.aClass13_Sub2_39.method2028(0, 5890);
		super.aClass13_Sub2_39.method2008(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass264_3.method6558();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method7812(@OriginalArg(0) boolean arg0) {
		if (this.aClass264_3 == null) {
			return;
		}
		this.aClass264_3.method6557('\u0000');
		super.aClass13_Sub2_39.method2008(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass13_Sub2_39.aClass239_Sub2_5.method7199(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass13_Sub2_39.method2008(0);
		if (super.aClass13_Sub2_39.anInt2155 == this.anInt3887) {
			return;
		}
		@Pc(55) int local55 = super.aClass13_Sub2_39.anInt2155 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray23, local55);
			local55 += 2;
		}
		if (this.aClass219_3.aBoolean431) {
			this.aFloat88 = (float) (super.aClass13_Sub2_39.anInt2155 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3887 = super.aClass13_Sub2_39.anInt2155;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7818() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	@Override
	public void method7819() {
		if (this.aClass264_3 != null) {
			this.aClass264_3.method6557('\u0001');
			super.aClass13_Sub2_39.method2008(1);
			super.aClass13_Sub2_39.method2024((Class85) null);
			super.aClass13_Sub2_39.method2008(0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!il;I)V")
	@Override
	public void method7810(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass13_Sub2_39.method2024(arg0);
		super.aClass13_Sub2_39.method1960(arg1);
	}
}
