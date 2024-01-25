import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	private int anInt5959;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!jb;")
	private Class115 aClass115_5;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!s;")
	private final Class213 aClass213_3;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Lclient!hg;")
	private Class93 aClass93_5;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!fu;Lclient!s;)V")
	public Class7_Sub6(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_3 = arg1;
		if (this.aClass63_Sub2_41.aBoolean152 && this.aClass63_Sub2_41.anInt2117 >= 2) {
			this.aClass93_5 = Static124.method2501(this.aClass63_Sub2_41, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass93_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static222.method3651(0.4F);
			@Pc(47) int[][] local47 = Static222.method3651(0.4F);
			@Pc(52) Class2_Sub16_Sub1 local52 = new Class2_Sub16_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass63_Sub2_41.aBoolean153) {
						local52.method1835((float) local61[local67] / 4096.0F);
						local52.method1835((float) local65[local67] / 4096.0F);
						local52.method1835(1.0F);
						local52.method1835(1.0F);
					} else {
						local52.method1836((float) local61[local67] / 4096.0F);
						local52.method1836((float) local65[local67] / 4096.0F);
						local52.method1836(1.0F);
						local52.method1836(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt6145).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray112, 0, local52.anInt6145);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method5202();
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)V")
	@Override
	public void method5476(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_5 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass115_5.method2847('\u0000');
		this.aClass63_Sub2_41.method2115(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass63_Sub2_41.aClass44_Sub2_2.method3544(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass63_Sub2_41.method2115(0);
		if (this.anInt5959 == this.aClass63_Sub2_41.anInt2088) {
			return;
		}
		@Pc(55) int local55 = this.aClass63_Sub2_41.anInt2088 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass213_3.aBoolean387) {
			@Pc(91) float local91 = (float) (this.aClass63_Sub2_41.anInt2088 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5959 = this.aClass63_Sub2_41.anInt2088;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method5474(@OriginalArg(0) int arg0) {
		if (this.aClass115_5 == null) {
			return;
		}
		this.aClass63_Sub2_41.method2115(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass63_Sub2_41.method2068(null);
		} else if (this.aClass213_3.aBoolean387) {
			this.aClass63_Sub2_41.method2068(this.aClass213_3.aClass20_Sub3_1);
		} else {
			@Pc(25) int local25 = this.aClass63_Sub2_41.anInt2088 % 4000 * 16 / 4000;
			this.aClass63_Sub2_41.method2068(this.aClass213_3.aClass20_Sub4Array4[local25]);
		}
		this.aClass63_Sub2_41.method2115(0);
		@Pc(53) opengl local53 = this.aClass63_Sub2_41.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static354.aFloatArray29, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static354.aFloatArray29, 0);
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

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "()V")
	private void method5202() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass115_5 = new Class115(this.aClass63_Sub2_41, 2);
		this.aClass115_5.method2846(0);
		this.aClass63_Sub2_41.method2115(1);
		this.aClass63_Sub2_41.method2091(260, 7681);
		this.aClass63_Sub2_41.method2064(0, 34168);
		this.aClass63_Sub2_41.method2115(0);
		local3.glBindProgramARB(34336, this.aClass93_5.anInt2614);
		local3.glEnable(34336);
		this.aClass115_5.method2848();
		this.aClass115_5.method2846(1);
		this.aClass63_Sub2_41.method2115(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass63_Sub2_41.method2122(1);
		this.aClass63_Sub2_41.method2064(0, 5890);
		this.aClass63_Sub2_41.method2115(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass115_5.method2848();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
	@Override
	public void method5471(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "()V")
	@Override
	public void method5472() {
		if (this.aClass115_5 != null) {
			this.aClass115_5.method2847('\u0001');
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2068(null);
			this.aClass63_Sub2_41.method2115(0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method5475(@OriginalArg(0) Class20 arg0) {
		this.aClass63_Sub2_41.method2068(arg0);
	}
}
