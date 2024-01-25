import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class86_Sub3 extends Class86 {

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	private int anInt3256;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!ma;")
	private Class151 aClass151_2;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!mb;")
	private final Class152 aClass152_2;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!aj;")
	private Class9 aClass9_5;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!mi;Lclient!mb;)V")
	public Class86_Sub3(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class152 arg1) {
		super(arg0);
		this.aClass152_2 = arg1;
		if (this.aClass155_Sub1_39.aBoolean308 && this.aClass155_Sub1_39.anInt3852 >= 2) {
			this.aClass9_5 = Static10.method143(this.aClass155_Sub1_39, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass9_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static358.method5345(0.4F);
			@Pc(47) int[][] local47 = Static358.method5345(0.4F);
			@Pc(52) Class3_Sub5_Sub2 local52 = new Class3_Sub5_Sub2(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass155_Sub1_39.aBoolean298) {
						local52.method2794((float) local61[local67] / 4096.0F);
						local52.method2794((float) local65[local67] / 4096.0F);
						local52.method2794(1.0F);
						local52.method2794(1.0F);
					} else {
						local52.method2793((float) local61[local67] / 4096.0F);
						local52.method2793((float) local65[local67] / 4096.0F);
						local52.method2793(1.0F);
						local52.method2793(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt3121).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray42, 0, local52.anInt3121);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method2900();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!bl;)V")
	@Override
	public void method5357(@OriginalArg(0) Class30 arg0) {
		this.aClass155_Sub1_39.method3585(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
	@Override
	public void method5361() {
		if (this.aClass151_2 != null) {
			this.aClass151_2.method3279('\u0001');
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3585(null);
			this.aClass155_Sub1_39.method3590(0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()Z")
	@Override
	public boolean method5358() {
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
	private void method2900() {
		@Pc(3) opengl local3 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass151_2 = new Class151(this.aClass155_Sub1_39, 2);
		this.aClass151_2.method3281(0);
		this.aClass155_Sub1_39.method3590(1);
		this.aClass155_Sub1_39.method3610(260, 7681);
		this.aClass155_Sub1_39.method3635(0, 34168);
		this.aClass155_Sub1_39.method3590(0);
		local3.glBindProgramARB(34336, this.aClass9_5.anInt153);
		local3.glEnable(34336);
		this.aClass151_2.method3280();
		this.aClass151_2.method3281(1);
		this.aClass155_Sub1_39.method3590(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass155_Sub1_39.method3580(1);
		this.aClass155_Sub1_39.method3635(0, 5890);
		this.aClass155_Sub1_39.method3590(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass151_2.method3280();
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
	@Override
	public void method5362(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	@Override
	public void method5360(@OriginalArg(0) boolean arg0) {
		if (this.aClass151_2 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass151_2.method3279('\u0000');
		this.aClass155_Sub1_39.method3590(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass155_Sub1_39.aClass118_Sub1_2.method2482(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass155_Sub1_39.method3590(0);
		if (this.anInt3256 == this.aClass155_Sub1_39.anInt3844) {
			return;
		}
		@Pc(55) int local55 = this.aClass155_Sub1_39.anInt3844 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass152_2.aBoolean269) {
			@Pc(91) float local91 = (float) (this.aClass155_Sub1_39.anInt3844 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3256 = this.aClass155_Sub1_39.anInt3844;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0) {
		if (this.aClass151_2 == null) {
			return;
		}
		this.aClass155_Sub1_39.method3590(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass155_Sub1_39.method3585(null);
		} else if (this.aClass152_2.aBoolean269) {
			this.aClass155_Sub1_39.method3585(this.aClass152_2.aClass30_Sub2_1);
		} else {
			@Pc(25) int local25 = this.aClass155_Sub1_39.anInt3844 % 4000 * 16 / 4000;
			this.aClass155_Sub1_39.method3585(this.aClass152_2.aClass30_Sub3Array2[local25]);
		}
		this.aClass155_Sub1_39.method3590(0);
		@Pc(53) opengl local53 = this.aClass155_Sub1_39.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static184.aFloatArray14, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static184.aFloatArray14, 0);
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
