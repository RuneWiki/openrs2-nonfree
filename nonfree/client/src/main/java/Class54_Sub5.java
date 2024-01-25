import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class54_Sub5 extends Class54 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!fr;")
	private Class76 aClass76_5;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	private int anInt4719;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!mk;")
	private final Class135 aClass135_4;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!ad;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!ge;Lclient!mk;)V")
	public Class54_Sub5(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_4 = arg1;
		if (this.aClass81_Sub1_37.aBoolean143 && this.aClass81_Sub1_37.anInt1841 >= 2) {
			this.aClass5_1 = Static4.method52(this.aClass81_Sub1_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass5_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static299.method5130(0.4F);
			@Pc(47) int[][] local47 = Static299.method5130(0.4F);
			@Pc(52) Class6_Sub10_Sub2 local52 = new Class6_Sub10_Sub2(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass81_Sub1_37.aBoolean156) {
						local52.method4026((float) local61[local67] / 4096.0F);
						local52.method4026((float) local65[local67] / 4096.0F);
						local52.method4026(1.0F);
						local52.method4026(1.0F);
					} else {
						local52.method4027((float) local61[local67] / 4096.0F);
						local52.method4027((float) local65[local67] / 4096.0F);
						local52.method4027(1.0F);
						local52.method4027(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt4188).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray67, 0, local52.anInt4188);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method4349();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!mo;)V")
	@Override
	public void method5296(@OriginalArg(0) Class28 arg0) {
		this.aClass81_Sub1_37.method2022(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
	@Override
	public void method5298() {
		if (this.aClass76_5 != null) {
			this.aClass76_5.method1586('\u0001');
			this.aClass81_Sub1_37.method1953(1);
			this.aClass81_Sub1_37.method2022(null);
			this.aClass81_Sub1_37.method1953(0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		if (this.aClass76_5 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass76_5.method1586('\u0000');
		this.aClass81_Sub1_37.method1953(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass81_Sub1_37.aClass72_Sub1_2.method1534(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass81_Sub1_37.method1953(0);
		if (this.anInt4719 == this.aClass81_Sub1_37.anInt1804) {
			return;
		}
		@Pc(55) int local55 = this.aClass81_Sub1_37.anInt1804 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass135_4.aBoolean278) {
			@Pc(91) float local91 = (float) (this.aClass81_Sub1_37.anInt1804 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4719 = this.aClass81_Sub1_37.anInt1804;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		if (this.aClass76_5 == null) {
			return;
		}
		this.aClass81_Sub1_37.method1953(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass81_Sub1_37.method2022(null);
		} else if (this.aClass135_4.aBoolean278) {
			this.aClass81_Sub1_37.method2022(this.aClass135_4.aClass28_Sub4_2);
		} else {
			@Pc(25) int local25 = this.aClass81_Sub1_37.anInt1804 % 4000 * 16 / 4000;
			this.aClass81_Sub1_37.method2022(this.aClass135_4.aClass28_Sub3Array3[local25]);
		}
		this.aClass81_Sub1_37.method1953(0);
		@Pc(53) opengl local53 = this.aClass81_Sub1_37.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static254.aFloatArray23, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static254.aFloatArray23, 0);
		} else {
			local53.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(81) int local81 = arg0 & 0x3;
		if (local81 == 2) {
			local53.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local81 == 3) {
			local53.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			local53.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
	private void method4349() {
		@Pc(3) opengl local3 = this.aClass81_Sub1_37.anOpengl1;
		this.aClass76_5 = new Class76(this.aClass81_Sub1_37, 2);
		this.aClass76_5.method1585(0);
		this.aClass81_Sub1_37.method1953(1);
		this.aClass81_Sub1_37.method1965(260, 7681);
		this.aClass81_Sub1_37.method1984(0, 34168);
		this.aClass81_Sub1_37.method1953(0);
		local3.glBindProgramARB(34336, this.aClass5_1.anInt53);
		local3.glEnable(34336);
		this.aClass76_5.method1584();
		this.aClass76_5.method1585(1);
		this.aClass81_Sub1_37.method1953(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass81_Sub1_37.method1979(1);
		this.aClass81_Sub1_37.method1984(0, 5890);
		this.aClass81_Sub1_37.method1953(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass76_5.method1584();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5299(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}
}
