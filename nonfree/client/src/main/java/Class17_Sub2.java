import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!km;")
	private Class119 aClass119_2;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!bk;")
	private final Class23 aClass23_2;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!nh;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!sq;Lclient!bk;)V")
	public Class17_Sub2(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class23 arg1) {
		super(arg0);
		this.aClass23_2 = arg1;
		if (this.aClass46_Sub2_37.aBoolean382 && this.aClass46_Sub2_37.anInt5750 >= 2) {
			this.aClass149_1 = Static211.method3813(this.aClass46_Sub2_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass149_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static37.method903(0.4F);
			@Pc(47) int[][] local47 = Static37.method903(0.4F);
			@Pc(52) Class14_Sub4_Sub1 local52 = new Class14_Sub4_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass46_Sub2_37.aBoolean397) {
						local52.method646((float) local61[local67] / 4096.0F);
						local52.method646((float) local65[local67] / 4096.0F);
						local52.method646(1.0F);
						local52.method646(1.0F);
					} else {
						local52.method647((float) local61[local67] / 4096.0F);
						local52.method647((float) local65[local67] / 4096.0F);
						local52.method647(1.0F);
						local52.method647(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt2637).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray74, 0, local52.anInt2637);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method880();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "()V")
	@Override
	public void method5299() {
		if (this.aClass119_2 != null) {
			this.aClass119_2.method3301('\u0001');
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5251(null);
			this.aClass46_Sub2_37.method5225(0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	private void method880() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass119_2 = new Class119(this.aClass46_Sub2_37, 2);
		this.aClass119_2.method3303(0);
		this.aClass46_Sub2_37.method5225(1);
		this.aClass46_Sub2_37.method5248(260, 7681);
		this.aClass46_Sub2_37.method5236(0, 34168);
		this.aClass46_Sub2_37.method5225(0);
		local3.glBindProgramARB(34336, this.aClass149_1.anInt4221);
		local3.glEnable(34336);
		this.aClass119_2.method3302();
		this.aClass119_2.method3303(1);
		this.aClass46_Sub2_37.method5225(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass46_Sub2_37.method5252(1);
		this.aClass46_Sub2_37.method5236(0, 5890);
		this.aClass46_Sub2_37.method5225(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass119_2.method3302();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		if (this.aClass119_2 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass119_2.method3301('\u0000');
		this.aClass46_Sub2_37.method5225(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass46_Sub2_37.aClass51_Sub2_2.method3564(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass46_Sub2_37.method5225(0);
		if (this.anInt858 == this.aClass46_Sub2_37.anInt5738) {
			return;
		}
		@Pc(55) int local55 = this.aClass46_Sub2_37.anInt5738 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass23_2.aBoolean28) {
			@Pc(91) float local91 = (float) (this.aClass46_Sub2_37.anInt5738 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt858 = this.aClass46_Sub2_37.anInt5738;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		if (this.aClass119_2 == null) {
			return;
		}
		this.aClass46_Sub2_37.method5225(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass46_Sub2_37.method5251(null);
		} else if (this.aClass23_2.aBoolean28) {
			this.aClass46_Sub2_37.method5251(this.aClass23_2.aClass8_Sub2_2);
		} else {
			@Pc(25) int local25 = this.aClass46_Sub2_37.anInt5738 % 4000 * 16 / 4000;
			this.aClass46_Sub2_37.method5251(this.aClass23_2.aClass8_Sub1Array3[local25]);
		}
		this.aClass46_Sub2_37.method5225(0);
		@Pc(53) opengl local53 = this.aClass46_Sub2_37.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static35.aFloatArray2, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static35.aFloatArray2, 0);
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

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	@Override
	public void method5301(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!od;)V")
	@Override
	public void method5302(@OriginalArg(0) Class8 arg0) {
		this.aClass46_Sub2_37.method5251(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()Z")
	@Override
	public boolean method5298() {
		return true;
	}
}
