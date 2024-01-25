import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class99_Sub5 extends Class99 {

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "F")
	private float aFloat118;

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "Lclient!bia;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
	private int anInt6923;

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "Lclient!bb;")
	private final Class30 aClass30_3;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!jt;")
	private Class191 aClass191_1;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[F")
	private float[] aFloatArray64;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ffa;Lclient!bb;)V")
	public Class99_Sub5(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_3 = arg1;
		if (super.aClass57_Sub2_38.aBoolean224 && super.aClass57_Sub2_38.anInt2775 >= 2) {
			this.aClass191_1 = Static613.method8709("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass57_Sub2_38);
			if (this.aClass191_1 != null) {
				@Pc(44) int[][] local44 = Static450.method6675(0.4F);
				@Pc(55) int[][] local55 = Static450.method6675(0.4F);
				@Pc(57) int local57 = 0;
				this.aFloatArray64 = new float[32768];
				for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
					@Pc(69) int[] local69 = local44[local63];
					@Pc(73) int[] local73 = local55[local63];
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.aFloatArray64[local57++] = (float) local69[local75] / 4096.0F;
						this.aFloatArray64[local57++] = (float) local73[local75] / 4096.0F;
					}
				}
				this.method5926();
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8720(@OriginalArg(0) boolean arg0) {
		if (this.aClass42_5 == null) {
			return;
		}
		this.aClass42_5.method758('\u0000');
		super.aClass57_Sub2_38.method2345(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass57_Sub2_38.aClass203_Sub2_5.method6190(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass57_Sub2_38.method2345(0);
		if (this.anInt6923 == super.aClass57_Sub2_38.anInt2750) {
			return;
		}
		@Pc(54) int local54 = super.aClass57_Sub2_38.anInt2750 % 5000 * 128 / 5000;
		for (@Pc(56) int local56 = 0; local56 < 64; local56++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local56, this.aFloatArray64, local54);
			local54 += 2;
		}
		if (this.aClass30_3.aBoolean47) {
			this.aFloat118 = (float) (super.aClass57_Sub2_38.anInt2750 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6923 = super.aClass57_Sub2_38.anInt2750;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLclient!mw;)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(2) Class32 arg1) {
		super.aClass57_Sub2_38.method2362(arg1);
		super.aClass57_Sub2_38.method2382(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8718() {
		return true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass42_5 == null) {
			return;
		}
		super.aClass57_Sub2_38.method2345(1);
		@Pc(81) int local81;
		if ((arg1 & 0x80) != 0) {
			super.aClass57_Sub2_38.method2362((Class32) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass30_3.aBoolean47) {
				super.aClass57_Sub2_38.method2362(this.aClass30_3.aClass32_Sub2_1);
			} else {
				super.aClass57_Sub2_38.method2362(this.aClass30_3.aClass32_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass30_3.aBoolean47) {
			super.aClass57_Sub2_38.method2362(this.aClass30_3.aClass32_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat118, 0.0F, 0.0F, 1.0F);
		} else {
			local81 = super.aClass57_Sub2_38.anInt2750 % 4000 * 16 / 4000;
			super.aClass57_Sub2_38.method2362(this.aClass30_3.aClass32_Sub1Array2[local81]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass57_Sub2_38.method2345(0);
		if ((arg1 & 0x40) == 0) {
			Static262.aFloatArray90[1] = super.aClass57_Sub2_38.aFloat40 * super.aClass57_Sub2_38.aFloat43;
			Static262.aFloatArray90[2] = super.aClass57_Sub2_38.aFloat48 * super.aClass57_Sub2_38.aFloat43;
			Static262.aFloatArray90[0] = super.aClass57_Sub2_38.aFloat38 * super.aClass57_Sub2_38.aFloat43;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static262.aFloatArray90, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local81 = arg1 & 0x3;
		if (local81 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local81 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	@Override
	public void method8726() {
		if (this.aClass42_5 != null) {
			this.aClass42_5.method758('\u0001');
			super.aClass57_Sub2_38.method2345(1);
			super.aClass57_Sub2_38.method2362((Class32) null);
			super.aClass57_Sub2_38.method2345(0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	private void method5926() {
		this.aClass42_5 = new Class42(super.aClass57_Sub2_38, 2);
		this.aClass42_5.method759(0);
		super.aClass57_Sub2_38.method2345(1);
		super.aClass57_Sub2_38.method2322(-16777216);
		super.aClass57_Sub2_38.method2313(7681, 260);
		super.aClass57_Sub2_38.method2312(34166, 0);
		super.aClass57_Sub2_38.method2345(0);
		OpenGL.glBindProgramARB(34336, this.aClass191_1.anInt5064);
		OpenGL.glEnable(34336);
		this.aClass42_5.method760();
		this.aClass42_5.method759(1);
		super.aClass57_Sub2_38.method2345(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass57_Sub2_38.method2382(0);
		super.aClass57_Sub2_38.method2312(5890, 0);
		super.aClass57_Sub2_38.method2345(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass42_5.method760();
	}
}
