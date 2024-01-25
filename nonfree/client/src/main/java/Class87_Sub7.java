import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class87_Sub7 extends Class87 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	private int anInt6783;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Lclient!fa;")
	private Class72 aClass72_6;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!ja;")
	private final Class114 aClass114_3;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!vc;")
	private Class237 aClass237_5;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!ic;Lclient!ja;)V")
	public Class87_Sub7(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class114 arg1) {
		super(arg0);
		this.aClass114_3 = arg1;
		if (this.aClass48_Sub2_39.aBoolean225 && this.aClass48_Sub2_39.anInt3075 >= 2) {
			this.aClass237_5 = Static362.method5705(this.aClass48_Sub2_39, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass237_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static276.method6129(0.4F);
			@Pc(47) int[][] local47 = Static276.method6129(0.4F);
			@Pc(52) Class2_Sub24_Sub1 local52 = new Class2_Sub24_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass48_Sub2_39.aBoolean218) {
						local52.method3242((float) local61[local67] / 4096.0F);
						local52.method3242((float) local65[local67] / 4096.0F);
						local52.method3242(1.0F);
						local52.method3242(1.0F);
					} else {
						local52.method3241((float) local61[local67] / 4096.0F);
						local52.method3241((float) local65[local67] / 4096.0F);
						local52.method3241(1.0F);
						local52.method3241(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt6669).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray100, 0, local52.anInt6669);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method5876();
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()V")
	@Override
	public void method5874() {
		if (this.aClass72_6 != null) {
			this.aClass72_6.method1604('\u0001');
			this.aClass48_Sub2_39.method2566(1);
			this.aClass48_Sub2_39.method2573(null);
			this.aClass48_Sub2_39.method2566(0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5870(@OriginalArg(0) Class81 arg0) {
		this.aClass48_Sub2_39.method2573(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()V")
	private void method5876() {
		@Pc(3) opengl local3 = this.aClass48_Sub2_39.anOpengl2;
		this.aClass72_6 = new Class72(this.aClass48_Sub2_39, 2);
		this.aClass72_6.method1605(0);
		this.aClass48_Sub2_39.method2566(1);
		this.aClass48_Sub2_39.method2563(260, 7681);
		this.aClass48_Sub2_39.method2575(0, 34168);
		this.aClass48_Sub2_39.method2566(0);
		local3.glBindProgramARB(34336, this.aClass237_5.anInt6612);
		local3.glEnable(34336);
		this.aClass72_6.method1606();
		this.aClass72_6.method1605(1);
		this.aClass48_Sub2_39.method2566(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass48_Sub2_39.method2609(1);
		this.aClass48_Sub2_39.method2575(0, 5890);
		this.aClass48_Sub2_39.method2566(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass72_6.method1606();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5872(@OriginalArg(0) boolean arg0) {
		if (this.aClass72_6 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass48_Sub2_39.anOpengl2;
		this.aClass72_6.method1604('\u0000');
		this.aClass48_Sub2_39.method2566(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass48_Sub2_39.aClass21_Sub1_2.method2683(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass48_Sub2_39.method2566(0);
		if (this.anInt6783 == this.aClass48_Sub2_39.anInt3050) {
			return;
		}
		@Pc(55) int local55 = this.aClass48_Sub2_39.anInt3050 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass114_3.aBoolean250) {
			@Pc(91) float local91 = (float) (this.aClass48_Sub2_39.anInt3050 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6783 = this.aClass48_Sub2_39.anInt3050;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	@Override
	public void method5871(@OriginalArg(0) int arg0) {
		if (this.aClass72_6 == null) {
			return;
		}
		this.aClass48_Sub2_39.method2566(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass48_Sub2_39.method2573(null);
		} else if (this.aClass114_3.aBoolean250) {
			this.aClass48_Sub2_39.method2573(this.aClass114_3.aClass81_Sub1_2);
		} else {
			@Pc(25) int local25 = this.aClass48_Sub2_39.anInt3050 % 4000 * 16 / 4000;
			this.aClass48_Sub2_39.method2573(this.aClass114_3.aClass81_Sub2Array2[local25]);
		}
		this.aClass48_Sub2_39.method2566(0);
		@Pc(53) opengl local53 = this.aClass48_Sub2_39.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static368.aFloatArray29, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static368.aFloatArray29, 0);
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

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5875(@OriginalArg(0) boolean arg0) {
	}
}
