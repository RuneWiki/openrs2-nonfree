import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!qha;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!ag", name = "x", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!pr;")
	private final Class264 aClass264_1;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!pi;")
	private Class256 aClass256_1;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "[F")
	private float[] aFloatArray1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!nv;Lclient!pr;)V")
	public Class13_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_1 = arg1;
		if (super.aClass16_Sub3_42.aBoolean516 && super.aClass16_Sub3_42.anInt7353 >= 2) {
			this.aClass256_1 = Static205.method3781(super.aClass16_Sub3_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass256_1 != null) {
				@Pc(39) int[][] local39 = Static203.method3760(0.4F);
				@Pc(50) int[][] local50 = Static203.method3760(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray1 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray1[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray1[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method161();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass273_1 == null) {
			return;
		}
		super.aClass16_Sub3_42.method5944(1);
		@Pc(73) int local73;
		if ((arg0 & 0x80) != 0) {
			super.aClass16_Sub3_42.method6020(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass264_1.aBoolean588) {
				super.aClass16_Sub3_42.method6020(this.aClass264_1.aClass20_Sub2_3);
			} else {
				super.aClass16_Sub3_42.method6020(this.aClass264_1.aClass20_Sub4Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass264_1.aBoolean588) {
			super.aClass16_Sub3_42.method6020(this.aClass264_1.aClass20_Sub2_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat3, 0.0F, 0.0F, 1.0F);
		} else {
			local73 = super.aClass16_Sub3_42.anInt7338 % 4000 * 16 / 4000;
			super.aClass16_Sub3_42.method6020(this.aClass264_1.aClass20_Sub4Array3[local73]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass16_Sub3_42.method5944(0);
		if ((arg0 & 0x40) == 0) {
			Static367.aFloatArray61[0] = super.aClass16_Sub3_42.aFloat150 * super.aClass16_Sub3_42.aFloat169;
			Static367.aFloatArray61[1] = super.aClass16_Sub3_42.aFloat169 * super.aClass16_Sub3_42.aFloat167;
			Static367.aFloatArray61[2] = super.aClass16_Sub3_42.aFloat153 * super.aClass16_Sub3_42.aFloat169;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static367.aFloatArray61, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local73 = arg0 & 0x3;
		if (local73 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local73 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		if (this.aClass273_1 == null) {
			return;
		}
		this.aClass273_1.method6916('\u0000');
		super.aClass16_Sub3_42.method5944(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass16_Sub3_42.aClass54_Sub2_5.method2596(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass16_Sub3_42.method5944(0);
		if (this.anInt158 == super.aClass16_Sub3_42.anInt7338) {
			return;
		}
		@Pc(57) int local57 = super.aClass16_Sub3_42.anInt7338 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray1, local57);
			local57 += 2;
		}
		if (this.aClass264_1.aBoolean588) {
			this.aFloat3 = (float) (super.aClass16_Sub3_42.anInt7338 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt158 = super.aClass16_Sub3_42.anInt7338;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (this.aClass273_1 != null) {
			this.aClass273_1.method6916('\u0001');
			super.aClass16_Sub3_42.method5944(1);
			super.aClass16_Sub3_42.method6020(null);
			super.aClass16_Sub3_42.method5944(0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	private void method161() {
		this.aClass273_1 = new Class273(super.aClass16_Sub3_42, 2);
		this.aClass273_1.method6909(0);
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method5980(-16777216);
		super.aClass16_Sub3_42.method5957(260, 7681);
		super.aClass16_Sub3_42.method6029(0, 34166);
		super.aClass16_Sub3_42.method5944(0);
		OpenGL.glBindProgramARB(34336, this.aClass256_1.anInt8001);
		OpenGL.glEnable(34336);
		this.aClass273_1.method6915();
		this.aClass273_1.method6909(1);
		super.aClass16_Sub3_42.method5944(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass16_Sub3_42.method5972(0);
		super.aClass16_Sub3_42.method6029(0, 5890);
		super.aClass16_Sub3_42.method5944(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass273_1.method6915();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		super.aClass16_Sub3_42.method6020(arg0);
		super.aClass16_Sub3_42.method5972(arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return true;
	}
}
