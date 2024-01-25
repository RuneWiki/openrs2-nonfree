import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	private int anInt3618;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!ns;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!tk;")
	private final Class192 aClass192_2;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Lclient!ud;")
	private Class199 aClass199_5;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!se;Lclient!tk;)V")
	public Class43_Sub4(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class192 arg1) {
		super(arg0);
		this.aClass192_2 = arg1;
		if (this.aClass122_Sub2_37.aBoolean375 && this.aClass122_Sub2_37.anInt5622 >= 2) {
			this.aClass199_5 = Static315.method5246(this.aClass122_Sub2_37, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass199_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static351.method5705(0.4F);
			@Pc(47) int[][] local47 = Static351.method5705(0.4F);
			@Pc(52) Class3_Sub4_Sub1 local52 = new Class3_Sub4_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass122_Sub2_37.aBoolean363) {
						local52.method382((float) local61[local67] / 4096.0F);
						local52.method382((float) local65[local67] / 4096.0F);
						local52.method382(1.0F);
						local52.method382(1.0F);
					} else {
						local52.method383((float) local61[local67] / 4096.0F);
						local52.method383((float) local65[local67] / 4096.0F);
						local52.method383(1.0F);
						local52.method383(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt4268).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray70, 0, local52.anInt4268);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method2861();
		}
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "()V")
	private void method2861() {
		@Pc(3) opengl local3 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass147_2 = new Class147(this.aClass122_Sub2_37, 2);
		this.aClass147_2.method3752(0);
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4860(260, 7681);
		this.aClass122_Sub2_37.method4816(0, 34168);
		this.aClass122_Sub2_37.method4811(0);
		local3.glBindProgramARB(34336, this.aClass199_5.anInt6192);
		local3.glEnable(34336);
		this.aClass147_2.method3753();
		this.aClass147_2.method3752(1);
		this.aClass122_Sub2_37.method4811(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass122_Sub2_37.method4859(1);
		this.aClass122_Sub2_37.method4816(0, 5890);
		this.aClass122_Sub2_37.method4811(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass147_2.method3753();
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		if (this.aClass147_2 != null) {
			this.aClass147_2.method3754('\u0001');
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4864(null);
			this.aClass122_Sub2_37.method4811(0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		if (this.aClass147_2 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass147_2.method3754('\u0000');
		this.aClass122_Sub2_37.method4811(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass122_Sub2_37.aClass56_Sub2_2.method4699(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass122_Sub2_37.method4811(0);
		if (this.anInt3618 == this.aClass122_Sub2_37.anInt5610) {
			return;
		}
		@Pc(55) int local55 = this.aClass122_Sub2_37.anInt5610 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass192_2.aBoolean411) {
			@Pc(91) float local91 = (float) (this.aClass122_Sub2_37.anInt5610 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3618 = this.aClass122_Sub2_37.anInt5610;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
		if (this.aClass147_2 == null) {
			return;
		}
		this.aClass122_Sub2_37.method4811(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass122_Sub2_37.method4864(null);
		} else if (this.aClass192_2.aBoolean411) {
			this.aClass122_Sub2_37.method4864(this.aClass192_2.aClass66_Sub3_2);
		} else {
			@Pc(25) int local25 = this.aClass122_Sub2_37.anInt5610 % 4000 * 16 / 4000;
			this.aClass122_Sub2_37.method4864(this.aClass192_2.aClass66_Sub1Array3[local25]);
		}
		this.aClass122_Sub2_37.method4811(0);
		@Pc(53) opengl local53 = this.aClass122_Sub2_37.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static173.aFloatArray13, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static173.aFloatArray13, 0);
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

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
		this.aClass122_Sub2_37.method4864(arg0);
	}
}
