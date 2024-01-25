import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class39_Sub8 extends Class39 {

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "Lclient!iw;")
	private Class169 aClass169_6;

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "F")
	private float aFloat202;

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	private int anInt10399;

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Lclient!ah;")
	private final Class12 aClass12_5;

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "Lclient!ica;")
	private Class156 aClass156_5;

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "[F")
	private float[] aFloatArray78;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!rs;Lclient!ah;)V")
	public Class39_Sub8(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class12 arg1) {
		super(arg0);
		this.aClass12_5 = arg1;
		if (super.aClass133_Sub3_42.aBoolean634 && super.aClass133_Sub3_42.anInt8541 >= 2) {
			this.aClass156_5 = Static591.method8515(super.aClass133_Sub3_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass156_5 != null) {
				@Pc(39) int[][] local39 = Static101.method1632(0.4F);
				@Pc(50) int[][] local50 = Static101.method1632(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray78 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray78[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray78[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method8848();
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return true;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		if (this.aClass169_6 != null) {
			this.aClass169_6.method4025('\u0001');
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7375(null);
			super.aClass133_Sub3_42.method7368(0);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		super.aClass133_Sub3_42.method7375(arg1);
		super.aClass133_Sub3_42.method7401(arg0);
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
	private void method8848() {
		this.aClass169_6 = new Class169(super.aClass133_Sub3_42, 2);
		this.aClass169_6.method4029(0);
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7344(-16777216);
		super.aClass133_Sub3_42.method7342(7681, 260);
		super.aClass133_Sub3_42.method7347(34166, 0);
		super.aClass133_Sub3_42.method7368(0);
		OpenGL.glBindProgramARB(34336, this.aClass156_5.anInt4188);
		OpenGL.glEnable(34336);
		this.aClass169_6.method4027();
		this.aClass169_6.method4029(1);
		super.aClass133_Sub3_42.method7368(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass133_Sub3_42.method7401(0);
		super.aClass133_Sub3_42.method7347(5890, 0);
		super.aClass133_Sub3_42.method7368(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass169_6.method4027();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass169_6 == null) {
			return;
		}
		super.aClass133_Sub3_42.method7368(1);
		@Pc(59) int local59;
		if ((arg0 & 0x80) != 0) {
			super.aClass133_Sub3_42.method7375(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass12_5.aBoolean10) {
				super.aClass133_Sub3_42.method7375(this.aClass12_5.aClass167_Sub4_1);
			} else {
				super.aClass133_Sub3_42.method7375(this.aClass12_5.aClass167_Sub3Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass12_5.aBoolean10) {
			super.aClass133_Sub3_42.method7375(this.aClass12_5.aClass167_Sub4_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat202, 0.0F, 0.0F, 1.0F);
		} else {
			local59 = super.aClass133_Sub3_42.anInt8530 % 4000 * 16 / 4000;
			super.aClass133_Sub3_42.method7375(this.aClass12_5.aClass167_Sub3Array2[local59]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass133_Sub3_42.method7368(0);
		if ((arg0 & 0x40) == 0) {
			Static549.aFloatArray71[2] = super.aClass133_Sub3_42.aFloat150 * super.aClass133_Sub3_42.aFloat159;
			Static549.aFloatArray71[0] = super.aClass133_Sub3_42.aFloat150 * super.aClass133_Sub3_42.aFloat153;
			Static549.aFloatArray71[1] = super.aClass133_Sub3_42.aFloat151 * super.aClass133_Sub3_42.aFloat150;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static549.aFloatArray71, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local59 = arg0 & 0x3;
		if (local59 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local59 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (this.aClass169_6 == null) {
			return;
		}
		this.aClass169_6.method4025('\u0000');
		super.aClass133_Sub3_42.method7368(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass133_Sub3_42.aClass113_Sub2_5.method5673(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass133_Sub3_42.method7368(0);
		if (super.aClass133_Sub3_42.anInt8530 == this.anInt10399) {
			return;
		}
		@Pc(53) int local53 = super.aClass133_Sub3_42.anInt8530 % 5000 * 128 / 5000;
		for (@Pc(55) int local55 = 0; local55 < 64; local55++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local55, this.aFloatArray78, local53);
			local53 += 2;
		}
		if (this.aClass12_5.aBoolean10) {
			this.aFloat202 = (float) (super.aClass133_Sub3_42.anInt8530 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt10399 = super.aClass133_Sub3_42.anInt8530;
	}
}
