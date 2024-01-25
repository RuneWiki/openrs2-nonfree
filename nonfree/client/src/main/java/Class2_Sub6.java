import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	private int anInt3578;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!hd;")
	private Class78 aClass78_4;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!le;")
	private final Class120 aClass120_2;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!dr;")
	private Class39 aClass39_5;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ks;Lclient!le;)V")
	public Class2_Sub6(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class120 arg1) {
		super(arg0);
		this.aClass120_2 = arg1;
		if (this.aClass63_Sub1_30.aBoolean257 && this.aClass63_Sub1_30.anInt3605 >= 2) {
			this.aClass39_5 = Static63.method1479(this.aClass63_Sub1_30, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass39_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static193.method3626(0.4F);
			@Pc(47) int[][] local47 = Static193.method3626(0.4F);
			@Pc(52) Class1_Sub7_Sub1 local52 = new Class1_Sub7_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass63_Sub1_30.lb) {
						local52.method790((float) local61[local67] / 4096.0F);
						local52.method790((float) local65[local67] / 4096.0F);
						local52.method790(1.0F);
						local52.method790(1.0F);
					} else {
						local52.method789((float) local61[local67] / 4096.0F);
						local52.method789((float) local65[local67] / 4096.0F);
						local52.method789(1.0F);
						local52.method789(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt2219).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray41, 0, local52.anInt2219);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method3216();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	@Override
	public void method3766(@OriginalArg(0) int arg0) {
		if (this.aClass78_4 == null) {
			return;
		}
		this.aClass63_Sub1_30.method3345(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass63_Sub1_30.method3355(null);
		} else if (this.aClass120_2.aBoolean276) {
			this.aClass63_Sub1_30.method3355(this.aClass120_2.aClass19_Sub1_1);
		} else {
			@Pc(25) int local25 = this.aClass63_Sub1_30.anInt3603 % 4000 * 16 / 4000;
			this.aClass63_Sub1_30.method3355(this.aClass120_2.aClass19_Sub3Array1[local25]);
		}
		this.aClass63_Sub1_30.method3345(0);
		@Pc(53) opengl local53 = this.aClass63_Sub1_30.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static172.aFloatArray16, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static172.aFloatArray16, 0);
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

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
	@Override
	public void method3767(@OriginalArg(0) boolean arg0) {
		if (this.aClass78_4 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass78_4.method2433('\u0000');
		this.aClass63_Sub1_30.method3345(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass63_Sub1_30.aClass129_Sub2_1.method5792(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass63_Sub1_30.method3345(0);
		if (this.anInt3578 == this.aClass63_Sub1_30.anInt3603) {
			return;
		}
		@Pc(55) int local55 = this.aClass63_Sub1_30.anInt3603 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass120_2.aBoolean276) {
			@Pc(91) float local91 = (float) (this.aClass63_Sub1_30.anInt3603 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3578 = this.aClass63_Sub1_30.anInt3603;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	@Override
	public void method3765(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method3769(@OriginalArg(0) Class19 arg0) {
		this.aClass63_Sub1_30.method3355(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "()V")
	@Override
	public void method3770() {
		if (this.aClass78_4 != null) {
			this.aClass78_4.method2433('\u0001');
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3355(null);
			this.aClass63_Sub1_30.method3345(0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "()Z")
	@Override
	public boolean method3768() {
		return true;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "()V")
	private void method3216() {
		@Pc(3) opengl local3 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass78_4 = new Class78(this.aClass63_Sub1_30, 2);
		this.aClass78_4.method2431(0);
		this.aClass63_Sub1_30.method3345(1);
		this.aClass63_Sub1_30.method3356(260, 7681);
		this.aClass63_Sub1_30.method3371(0, 34168);
		this.aClass63_Sub1_30.method3345(0);
		local3.glBindProgramARB(34336, this.aClass39_5.anInt1512);
		local3.glEnable(34336);
		this.aClass78_4.method2432();
		this.aClass78_4.method2431(1);
		this.aClass63_Sub1_30.method3345(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass63_Sub1_30.method3340(1);
		this.aClass63_Sub1_30.method3371(0, 5890);
		this.aClass63_Sub1_30.method3345(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass78_4.method2432();
	}
}
