import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
	private int anInt1189;

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "Lclient!up;")
	private Class358 aClass358_2;

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "F")
	private float aFloat6;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Lclient!sa;")
	private final Class314 aClass314_2;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "Lclient!cca;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "[F")
	private float[] aFloatArray4;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!pq;Lclient!sa;)V")
	public Class11_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0);
		this.aClass314_2 = arg1;
		if (super.aClass132_Sub3_43.aBoolean540 && super.aClass132_Sub3_43.anInt7895 >= 2) {
			this.aClass48_1 = Static433.method6408("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass132_Sub3_43);
			if (this.aClass48_1 != null) {
				@Pc(39) int[][] local39 = Static315.method4554(0.4F);
				@Pc(50) int[][] local50 = Static315.method4554(0.4F);
				this.aFloatArray4 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray4[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray4[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method1136();
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
	private void method1136() {
		this.aClass358_2 = new Class358(super.aClass132_Sub3_43, 2);
		this.aClass358_2.method8419(0);
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6733(-16777216);
		super.aClass132_Sub3_43.method6770(7681, 260);
		super.aClass132_Sub3_43.method6760(34166, 0);
		super.aClass132_Sub3_43.method6802(0);
		OpenGL.glBindProgramARB(34336, this.aClass48_1.anInt1211);
		OpenGL.glEnable(34336);
		this.aClass358_2.method8417();
		this.aClass358_2.method8419(1);
		super.aClass132_Sub3_43.method6802(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass132_Sub3_43.method6803(0);
		super.aClass132_Sub3_43.method6760(5890, 0);
		super.aClass132_Sub3_43.method6802(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass358_2.method8417();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass358_2 == null) {
			return;
		}
		super.aClass132_Sub3_43.method6802(1);
		@Pc(61) int local61;
		if ((arg1 & 0x80) != 0) {
			super.aClass132_Sub3_43.method6759((Class53) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass314_2.aBoolean614) {
				super.aClass132_Sub3_43.method6759(this.aClass314_2.aClass53_Sub4_2);
			} else {
				super.aClass132_Sub3_43.method6759(this.aClass314_2.aClass53_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass314_2.aBoolean614) {
			super.aClass132_Sub3_43.method6759(this.aClass314_2.aClass53_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat6, 0.0F, 0.0F, 1.0F);
		} else {
			local61 = super.aClass132_Sub3_43.anInt7881 % 4000 * 16 / 4000;
			super.aClass132_Sub3_43.method6759(this.aClass314_2.aClass53_Sub2Array3[local61]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass132_Sub3_43.method6802(0);
		if ((arg1 & 0x40) == 0) {
			Static240.aFloatArray13[2] = super.aClass132_Sub3_43.aFloat135 * super.aClass132_Sub3_43.aFloat143;
			Static240.aFloatArray13[1] = super.aClass132_Sub3_43.aFloat143 * super.aClass132_Sub3_43.aFloat147;
			Static240.aFloatArray13[0] = super.aClass132_Sub3_43.aFloat144 * super.aClass132_Sub3_43.aFloat143;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static240.aFloatArray13, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local61 = arg1 & 0x3;
		if (local61 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local61 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		super.aClass132_Sub3_43.method6759(arg1);
		super.aClass132_Sub3_43.method6803(arg0);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		if (this.aClass358_2 != null) {
			this.aClass358_2.method8418('\u0001');
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6759((Class53) null);
			super.aClass132_Sub3_43.method6802(0);
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return true;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		if (this.aClass358_2 == null) {
			return;
		}
		this.aClass358_2.method8418('\u0000');
		super.aClass132_Sub3_43.method6802(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass132_Sub3_43.aClass207_Sub1_5.method4994(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass132_Sub3_43.method6802(0);
		if (super.aClass132_Sub3_43.anInt7881 == this.anInt1189) {
			return;
		}
		@Pc(55) int local55 = super.aClass132_Sub3_43.anInt7881 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray4, local55);
			local55 += 2;
		}
		if (this.aClass314_2.aBoolean614) {
			this.aFloat6 = (float) (super.aClass132_Sub3_43.anInt7881 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt1189 = super.aClass132_Sub3_43.anInt7881;
	}
}
