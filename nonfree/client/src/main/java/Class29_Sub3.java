import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Lclient!tp;")
	private Class199 aClass199_3;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!sh;")
	private final Class189 aClass189_3;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!me;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!h;Lclient!sh;)V")
	public Class29_Sub3(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_3 = arg1;
		if (this.aClass32_Sub2_39.aBoolean239 && this.aClass32_Sub2_39.anInt2497 >= 2) {
			this.aClass133_1 = Static186.method3618(this.aClass32_Sub2_39, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass133_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static114.method3918(0.4F);
			@Pc(47) int[][] local47 = Static114.method3918(0.4F);
			@Pc(52) Class1_Sub8_Sub2 local52 = new Class1_Sub8_Sub2(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass32_Sub2_39.aBoolean240) {
						local52.method4567((float) local61[local67] / 4096.0F);
						local52.method4567((float) local65[local67] / 4096.0F);
						local52.method4567(1.0F);
						local52.method4567(1.0F);
					} else {
						local52.method4568((float) local61[local67] / 4096.0F);
						local52.method4568((float) local65[local67] / 4096.0F);
						local52.method4568(1.0F);
						local52.method4568(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt5182).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray81, 0, local52.anInt5182);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method3246();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method5174(@OriginalArg(0) Class20 arg0) {
		this.aClass32_Sub2_39.method2287(arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0) {
		if (this.aClass199_3 == null) {
			return;
		}
		this.aClass32_Sub2_39.method2314(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass32_Sub2_39.method2287(null);
		} else if (this.aClass189_3.aBoolean553) {
			this.aClass32_Sub2_39.method2287(this.aClass189_3.aClass20_Sub4_1);
		} else {
			@Pc(25) int local25 = this.aClass32_Sub2_39.anInt2487 % 4000 * 16 / 4000;
			this.aClass32_Sub2_39.method2287(this.aClass189_3.aClass20_Sub1Array2[local25]);
		}
		this.aClass32_Sub2_39.method2314(0);
		@Pc(53) opengl local53 = this.aClass32_Sub2_39.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static160.aFloatArray17, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static160.aFloatArray17, 0);
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

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()Z")
	@Override
	public boolean method5171() {
		return true;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "()V")
	private void method3246() {
		@Pc(3) opengl local3 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass199_3 = new Class199(this.aClass32_Sub2_39, 2);
		this.aClass199_3.method5169(0);
		this.aClass32_Sub2_39.method2314(1);
		this.aClass32_Sub2_39.method2255(260, 7681);
		this.aClass32_Sub2_39.method2265(0, 34168);
		this.aClass32_Sub2_39.method2314(0);
		local3.glBindProgramARB(34336, this.aClass133_1.anInt3978);
		local3.glEnable(34336);
		this.aClass199_3.method5168();
		this.aClass199_3.method5169(1);
		this.aClass32_Sub2_39.method2314(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass32_Sub2_39.method2282(1);
		this.aClass32_Sub2_39.method2265(0, 5890);
		this.aClass32_Sub2_39.method2314(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass199_3.method5168();
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
	@Override
	public void method5173(@OriginalArg(0) boolean arg0) {
		if (this.aClass199_3 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass199_3.method5170('\u0000');
		this.aClass32_Sub2_39.method2314(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass32_Sub2_39.aClass109_Sub2_2.method3881(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass32_Sub2_39.method2314(0);
		if (this.anInt3528 == this.aClass32_Sub2_39.anInt2487) {
			return;
		}
		@Pc(55) int local55 = this.aClass32_Sub2_39.anInt2487 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass189_3.aBoolean553) {
			@Pc(91) float local91 = (float) (this.aClass32_Sub2_39.anInt2487 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3528 = this.aClass32_Sub2_39.anInt2487;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
	@Override
	public void method5175() {
		if (this.aClass199_3 != null) {
			this.aClass199_3.method5170('\u0001');
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2287(null);
			this.aClass32_Sub2_39.method2314(0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	@Override
	public void method5172(@OriginalArg(0) boolean arg0) {
	}
}
