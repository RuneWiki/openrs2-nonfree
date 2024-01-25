import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!p;")
	private Class178 aClass178_1;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!vq;")
	private final Class239 aClass239_1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!sb;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!nm;Lclient!vq;)V")
	public Class30_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class239 arg1) {
		super(arg0);
		this.aClass239_1 = arg1;
		if (this.aClass164_Sub1_39.aBoolean408 && this.aClass164_Sub1_39.anInt4093 >= 2) {
			this.aClass207_1 = Static316.method4655(this.aClass164_Sub1_39, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass207_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static246.method3674(0.4F);
			@Pc(47) int[][] local47 = Static246.method3674(0.4F);
			@Pc(52) Class1_Sub33_Sub1 local52 = new Class1_Sub33_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass164_Sub1_39.aBoolean413) {
						local52.method3828((float) local61[local67] / 4096.0F);
						local52.method3828((float) local65[local67] / 4096.0F);
						local52.method3828(1.0F);
						local52.method3828(1.0F);
					} else {
						local52.method3827((float) local61[local67] / 4096.0F);
						local52.method3827((float) local65[local67] / 4096.0F);
						local52.method3827(1.0F);
						local52.method3827(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.lb).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray86, 0, local52.lb);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method517();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	@Override
	public void method4842() {
		if (this.aClass178_1 != null) {
			this.aClass178_1.method4029('\u0001');
			this.aClass164_Sub1_39.method3584(1);
			this.aClass164_Sub1_39.method3603(null);
			this.aClass164_Sub1_39.method3584(0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ap;)V")
	@Override
	public void method4847(@OriginalArg(0) Class15 arg0) {
		this.aClass164_Sub1_39.method3603(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public void method4845(@OriginalArg(0) int arg0) {
		if (this.aClass178_1 == null) {
			return;
		}
		this.aClass164_Sub1_39.method3584(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass164_Sub1_39.method3603(null);
		} else if (this.aClass239_1.aBoolean563) {
			this.aClass164_Sub1_39.method3603(this.aClass239_1.aClass15_Sub3_2);
		} else {
			@Pc(25) int local25 = this.aClass164_Sub1_39.anInt4059 % 4000 * 16 / 4000;
			this.aClass164_Sub1_39.method3603(this.aClass239_1.aClass15_Sub2Array4[local25]);
		}
		this.aClass164_Sub1_39.method3584(0);
		@Pc(53) opengl local53 = this.aClass164_Sub1_39.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static33.aFloatArray3, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static33.aFloatArray3, 0);
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

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	@Override
	public void method4846(@OriginalArg(0) boolean arg0) {
		if (this.aClass178_1 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass164_Sub1_39.anOpengl1;
		this.aClass178_1.method4029('\u0000');
		this.aClass164_Sub1_39.method3584(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass164_Sub1_39.aClass127_Sub2_1.method5280(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass164_Sub1_39.method3584(0);
		if (this.anInt652 == this.aClass164_Sub1_39.anInt4059) {
			return;
		}
		@Pc(55) int local55 = this.aClass164_Sub1_39.anInt4059 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass239_1.aBoolean563) {
			@Pc(91) float local91 = (float) (this.aClass164_Sub1_39.anInt4059 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt652 = this.aClass164_Sub1_39.anInt4059;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "()Z")
	@Override
	public boolean method4843() {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "()V")
	private void method517() {
		@Pc(3) opengl local3 = this.aClass164_Sub1_39.anOpengl1;
		this.aClass178_1 = new Class178(this.aClass164_Sub1_39, 2);
		this.aClass178_1.method4028(0);
		this.aClass164_Sub1_39.method3584(1);
		this.aClass164_Sub1_39.method3629(260, 7681);
		this.aClass164_Sub1_39.method3612(0, 34168);
		this.aClass164_Sub1_39.method3584(0);
		local3.glBindProgramARB(34336, this.aClass207_1.anInt5367);
		local3.glEnable(34336);
		this.aClass178_1.method4030();
		this.aClass178_1.method4028(1);
		this.aClass164_Sub1_39.method3584(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass164_Sub1_39.method3586(1);
		this.aClass164_Sub1_39.method3612(0, 5890);
		this.aClass164_Sub1_39.method3584(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass178_1.method4030();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	@Override
	public void method4844(@OriginalArg(0) boolean arg0) {
	}
}
