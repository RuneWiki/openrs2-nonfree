import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class23_Sub5 extends Class23 {

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!el;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	private int anInt4562;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!de;")
	private final Class44 aClass44_2;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!m;")
	private Class125 aClass125_5;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!po;Lclient!de;)V")
	public Class23_Sub5(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class44 arg1) {
		super(arg0);
		this.aClass44_2 = arg1;
		if (this.aClass59_Sub1_41.aBoolean353 && this.aClass59_Sub1_41.anInt4788 >= 2) {
			this.aClass125_5 = Static182.method3380(this.aClass59_Sub1_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass125_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static106.method2151(0.4F);
			@Pc(47) int[][] local47 = Static106.method2151(0.4F);
			@Pc(52) Class5_Sub1_Sub2 local52 = new Class5_Sub1_Sub2(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass59_Sub1_41.aBoolean350) {
						local52.method1887((float) local61[local67] / 4096.0F);
						local52.method1887((float) local65[local67] / 4096.0F);
						local52.method1887(1.0F);
						local52.method1887(1.0F);
					} else {
						local52.method1888((float) local61[local67] / 4096.0F);
						local52.method1888((float) local65[local67] / 4096.0F);
						local52.method1888(1.0F);
						local52.method1888(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt2029).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray18, 0, local52.anInt2029);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method4001();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		if (this.aClass57_4 != null) {
			this.aClass57_4.method1598('\u0001');
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4296(null);
			this.aClass59_Sub1_41.method4273(0);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
		if (this.aClass57_4 == null) {
			return;
		}
		this.aClass59_Sub1_41.method4273(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass59_Sub1_41.method4296(null);
		} else if (this.aClass44_2.aBoolean89) {
			this.aClass59_Sub1_41.method4296(this.aClass44_2.aClass11_Sub3_2);
		} else {
			@Pc(25) int local25 = this.aClass59_Sub1_41.anInt4759 % 4000 * 16 / 4000;
			this.aClass59_Sub1_41.method4296(this.aClass44_2.aClass11_Sub1Array2[local25]);
		}
		this.aClass59_Sub1_41.method4273(0);
		@Pc(53) opengl local53 = this.aClass59_Sub1_41.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static234.aFloatArray20, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static234.aFloatArray20, 0);
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

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return true;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		if (this.aClass57_4 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass57_4.method1598('\u0000');
		this.aClass59_Sub1_41.method4273(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass59_Sub1_41.aClass112_Sub2_2.method3601(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass59_Sub1_41.method4273(0);
		if (this.anInt4562 == this.aClass59_Sub1_41.anInt4759) {
			return;
		}
		@Pc(55) int local55 = this.aClass59_Sub1_41.anInt4759 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass44_2.aBoolean89) {
			@Pc(91) float local91 = (float) (this.aClass59_Sub1_41.anInt4759 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4562 = this.aClass59_Sub1_41.anInt4759;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
	private void method4001() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass57_4 = new Class57(this.aClass59_Sub1_41, 2);
		this.aClass57_4.method1600(0);
		this.aClass59_Sub1_41.method4273(1);
		this.aClass59_Sub1_41.method4311(260, 7681);
		this.aClass59_Sub1_41.method4298(0, 34168);
		this.aClass59_Sub1_41.method4273(0);
		local3.glBindProgramARB(34336, this.aClass125_5.anInt3668);
		local3.glEnable(34336);
		this.aClass57_4.method1599();
		this.aClass57_4.method1600(1);
		this.aClass59_Sub1_41.method4273(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass59_Sub1_41.method4327(1);
		this.aClass59_Sub1_41.method4298(0, 5890);
		this.aClass59_Sub1_41.method4273(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass57_4.method1599();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
		this.aClass59_Sub1_41.method4296(arg0);
	}
}
