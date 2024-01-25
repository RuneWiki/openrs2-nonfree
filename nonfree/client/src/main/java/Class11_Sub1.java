import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!oc;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Lclient!fg;")
	private final Class67 aClass67_1;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!lc;")
	private Class119 aClass119_1;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!ig;Lclient!fg;)V")
	public Class11_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_1 = arg1;
		if (this.aClass47_Sub2_33.aBoolean242 && this.aClass47_Sub2_33.anInt3075 >= 2) {
			this.aClass119_1 = Static175.method3464(this.aClass47_Sub2_33, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass119_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static247.method4391(0.4F);
			@Pc(47) int[][] local47 = Static247.method4391(0.4F);
			@Pc(52) Class4_Sub11_Sub2 local52 = new Class4_Sub11_Sub2(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass47_Sub2_33.aBoolean235) {
						local52.method3463((float) local61[local67] / 4096.0F);
						local52.method3463((float) local65[local67] / 4096.0F);
						local52.method3463(1.0F);
						local52.method3463(1.0F);
					} else {
						local52.method3462((float) local61[local67] / 4096.0F);
						local52.method3462((float) local65[local67] / 4096.0F);
						local52.method3462(1.0F);
						local52.method3462(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt3768).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray55, 0, local52.anInt3768);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method257();
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
	@Override
	public void method4749(@OriginalArg(0) boolean arg0) {
		if (this.aClass147_1 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass147_1.method4034('\u0000');
		this.aClass47_Sub2_33.method2828(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass47_Sub2_33.aClass57_Sub2_1.method4206(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass47_Sub2_33.method2828(0);
		if (this.anInt276 == this.aClass47_Sub2_33.anInt3057) {
			return;
		}
		@Pc(55) int local55 = this.aClass47_Sub2_33.anInt3057 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass67_1.aBoolean172) {
			@Pc(91) float local91 = (float) (this.aClass47_Sub2_33.anInt3057 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt276 = this.aClass47_Sub2_33.anInt3057;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ee;)V")
	@Override
	public void method4746(@OriginalArg(0) Class52 arg0) {
		this.aClass47_Sub2_33.method2772(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	@Override
	public void method4748(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()V")
	@Override
	public void method4751() {
		if (this.aClass147_1 != null) {
			this.aClass147_1.method4034('\u0001');
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2772(null);
			this.aClass47_Sub2_33.method2828(0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	@Override
	public void method4750(@OriginalArg(0) int arg0) {
		if (this.aClass147_1 == null) {
			return;
		}
		this.aClass47_Sub2_33.method2828(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass47_Sub2_33.method2772(null);
		} else if (this.aClass67_1.aBoolean172) {
			this.aClass47_Sub2_33.method2772(this.aClass67_1.aClass52_Sub2_1);
		} else {
			@Pc(25) int local25 = this.aClass47_Sub2_33.anInt3057 % 4000 * 16 / 4000;
			this.aClass47_Sub2_33.method2772(this.aClass67_1.aClass52_Sub1Array2[local25]);
		}
		this.aClass47_Sub2_33.method2828(0);
		@Pc(53) opengl local53 = this.aClass47_Sub2_33.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static13.aFloatArray1, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static13.aFloatArray1, 0);
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

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "()V")
	private void method257() {
		@Pc(3) opengl local3 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass147_1 = new Class147(this.aClass47_Sub2_33, 2);
		this.aClass147_1.method4035(0);
		this.aClass47_Sub2_33.method2828(1);
		this.aClass47_Sub2_33.method2790(260, 7681);
		this.aClass47_Sub2_33.method2804(0, 34168);
		this.aClass47_Sub2_33.method2828(0);
		local3.glBindProgramARB(34336, this.aClass119_1.anInt3793);
		local3.glEnable(34336);
		this.aClass147_1.method4036();
		this.aClass147_1.method4035(1);
		this.aClass47_Sub2_33.method2828(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass47_Sub2_33.method2782(1);
		this.aClass47_Sub2_33.method2804(0, 5890);
		this.aClass47_Sub2_33.method2828(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass147_1.method4036();
	}
}
