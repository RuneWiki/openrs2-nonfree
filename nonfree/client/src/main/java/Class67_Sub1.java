import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!cq;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!c;")
	private final Class31 aClass31_1;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Lclient!hr;")
	private Class97 aClass97_1;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!cg;Lclient!c;)V")
	public Class67_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		this.aClass31_1 = arg1;
		if (this.aClass37_Sub1_27.aBoolean67 && this.aClass37_Sub1_27.anInt641 >= 2) {
			this.aClass97_1 = Static131.method2546(this.aClass37_Sub1_27, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass97_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static285.method4832(0.4F);
			@Pc(47) int[][] local47 = Static285.method4832(0.4F);
			@Pc(52) Class2_Sub12_Sub1 local52 = new Class2_Sub12_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass37_Sub1_27.aBoolean72) {
						local52.method3094((float) local61[local67] / 4096.0F);
						local52.method3094((float) local65[local67] / 4096.0F);
						local52.method3094(1.0F);
						local52.method3094(1.0F);
					} else {
						local52.method3093((float) local61[local67] / 4096.0F);
						local52.method3093((float) local65[local67] / 4096.0F);
						local52.method3093(1.0F);
						local52.method3093(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt3606).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray30, 0, local52.anInt3606);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method1852();
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
	private void method1852() {
		@Pc(3) opengl local3 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass45_1 = new Class45(this.aClass37_Sub1_27, 2);
		this.aClass45_1.method947(0);
		this.aClass37_Sub1_27.method759(1);
		this.aClass37_Sub1_27.method735(260, 7681);
		this.aClass37_Sub1_27.method769(0, 34168);
		this.aClass37_Sub1_27.method759(0);
		local3.glBindProgramARB(34336, this.aClass97_1.anInt2807);
		local3.glEnable(34336);
		this.aClass45_1.method949();
		this.aClass45_1.method947(1);
		this.aClass37_Sub1_27.method759(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass37_Sub1_27.method774(1);
		this.aClass37_Sub1_27.method769(0, 5890);
		this.aClass37_Sub1_27.method759(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass45_1.method949();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	@Override
	public void method4163(@OriginalArg(0) boolean arg0) {
		if (this.aClass45_1 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass45_1.method948('\u0000');
		this.aClass37_Sub1_27.method759(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass37_Sub1_27.aClass38_Sub2_2.method4485(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass37_Sub1_27.method759(0);
		if (this.anInt1815 == this.aClass37_Sub1_27.anInt638) {
			return;
		}
		@Pc(55) int local55 = this.aClass37_Sub1_27.anInt638 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass31_1.aBoolean45) {
			@Pc(91) float local91 = (float) (this.aClass37_Sub1_27.anInt638 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt1815 = this.aClass37_Sub1_27.anInt638;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	@Override
	public void method4164(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	@Override
	public void method4167(@OriginalArg(0) int arg0) {
		if (this.aClass45_1 == null) {
			return;
		}
		this.aClass37_Sub1_27.method759(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass37_Sub1_27.method767(null);
		} else if (this.aClass31_1.aBoolean45) {
			this.aClass37_Sub1_27.method767(this.aClass31_1.aClass81_Sub3_2);
		} else {
			@Pc(25) int local25 = this.aClass37_Sub1_27.anInt638 % 4000 * 16 / 4000;
			this.aClass37_Sub1_27.method767(this.aClass31_1.aClass81_Sub4Array2[local25]);
		}
		this.aClass37_Sub1_27.method759(0);
		@Pc(53) opengl local53 = this.aClass37_Sub1_27.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static93.aFloatArray12, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static93.aFloatArray12, 0);
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

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	@Override
	public void method4166() {
		if (this.aClass45_1 != null) {
			this.aClass45_1.method948('\u0001');
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method767(null);
			this.aClass37_Sub1_27.method759(0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4165(@OriginalArg(0) Class81 arg0) {
		this.aClass37_Sub1_27.method767(arg0);
	}
}
