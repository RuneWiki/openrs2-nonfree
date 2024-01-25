import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class39_Sub7 extends Class39 {

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	private int anInt5913;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!q;")
	private Class168 aClass168_4;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Lclient!cf;")
	private final Class38 aClass38_3;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!bh;")
	private Class25 aClass25_5;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!hd;Lclient!cf;)V")
	public Class39_Sub7(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class38 arg1) {
		super(arg0);
		this.aClass38_3 = arg1;
		if (this.aClass89_Sub1_39.aBoolean189 && this.aClass89_Sub1_39.anInt2615 >= 2) {
			this.aClass25_5 = Static25.method423(this.aClass89_Sub1_39, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass25_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static94.method1900(0.4F);
			@Pc(47) int[][] local47 = Static94.method1900(0.4F);
			@Pc(52) Class7_Sub3_Sub1 local52 = new Class7_Sub3_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass89_Sub1_39.aBoolean195) {
						local52.method1702((float) local61[local67] / 4096.0F);
						local52.method1702((float) local65[local67] / 4096.0F);
						local52.method1702(1.0F);
						local52.method1702(1.0F);
					} else {
						local52.method1703((float) local61[local67] / 4096.0F);
						local52.method1703((float) local65[local67] / 4096.0F);
						local52.method1703(1.0F);
						local52.method1703(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt3005).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray33, 0, local52.anInt3005);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method5017();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
		this.aClass89_Sub1_39.method2445(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		if (this.aClass168_4 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass168_4.method4287('\u0000');
		this.aClass89_Sub1_39.method2433(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass89_Sub1_39.aClass70_Sub2_1.method3724(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass89_Sub1_39.method2433(0);
		if (this.anInt5913 == this.aClass89_Sub1_39.anInt2599) {
			return;
		}
		@Pc(55) int local55 = this.aClass89_Sub1_39.anInt2599 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass38_3.aBoolean80) {
			@Pc(91) float local91 = (float) (this.aClass89_Sub1_39.anInt2599 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5913 = this.aClass89_Sub1_39.anInt2599;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "()V")
	private void method5017() {
		@Pc(3) opengl local3 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass168_4 = new Class168(this.aClass89_Sub1_39, 2);
		this.aClass168_4.method4286(0);
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2419(260, 7681);
		this.aClass89_Sub1_39.method2451(0, 34168);
		this.aClass89_Sub1_39.method2433(0);
		local3.glBindProgramARB(34336, this.aClass25_5.anInt481);
		local3.glEnable(34336);
		this.aClass168_4.method4285();
		this.aClass168_4.method4286(1);
		this.aClass89_Sub1_39.method2433(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass89_Sub1_39.method2425(1);
		this.aClass89_Sub1_39.method2451(0, 5890);
		this.aClass89_Sub1_39.method2433(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass168_4.method4285();
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		if (this.aClass168_4 != null) {
			this.aClass168_4.method4287('\u0001');
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2445(null);
			this.aClass89_Sub1_39.method2433(0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
		if (this.aClass168_4 == null) {
			return;
		}
		this.aClass89_Sub1_39.method2433(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass89_Sub1_39.method2445(null);
		} else if (this.aClass38_3.aBoolean80) {
			this.aClass89_Sub1_39.method2445(this.aClass38_3.aClass92_Sub1_1);
		} else {
			@Pc(25) int local25 = this.aClass89_Sub1_39.anInt2599 % 4000 * 16 / 4000;
			this.aClass89_Sub1_39.method2445(this.aClass38_3.aClass92_Sub4Array2[local25]);
		}
		this.aClass89_Sub1_39.method2433(0);
		@Pc(53) opengl local53 = this.aClass89_Sub1_39.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static311.aFloatArray29, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static311.aFloatArray29, 0);
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
}
