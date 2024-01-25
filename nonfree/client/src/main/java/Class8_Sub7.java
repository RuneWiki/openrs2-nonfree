import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	private int anInt5586;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!t;")
	private Class217 aClass217_6;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!co;")
	private final Class37 aClass37_3;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!ut;")
	private Class233 aClass233_5;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!qi;Lclient!co;)V")
	public Class8_Sub7(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class37 arg1) {
		super(arg0);
		this.aClass37_3 = arg1;
		if (this.aClass82_Sub2_34.aBoolean407 && this.aClass82_Sub2_34.anInt5235 >= 2) {
			this.aClass233_5 = Static361.method5474(this.aClass82_Sub2_34, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass233_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static336.method5151(0.4F);
			@Pc(47) int[][] local47 = Static336.method5151(0.4F);
			@Pc(52) Class2_Sub13_Sub1 local52 = new Class2_Sub13_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass82_Sub2_34.aBoolean403) {
						local52.method1757((float) local61[local67] / 4096.0F);
						local52.method1757((float) local65[local67] / 4096.0F);
						local52.method1757(1.0F);
						local52.method1757(1.0F);
					} else {
						local52.method1756((float) local61[local67] / 4096.0F);
						local52.method1756((float) local65[local67] / 4096.0F);
						local52.method1756(1.0F);
						local52.method1756(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt4788).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray77, 0, local52.anInt4788);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method4897();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) {
		if (this.aClass217_6 == null) {
			return;
		}
		this.aClass82_Sub2_34.method4582(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass82_Sub2_34.method4614(null);
		} else if (this.aClass37_3.aBoolean82) {
			this.aClass82_Sub2_34.method4614(this.aClass37_3.aClass7_Sub3_1);
		} else {
			@Pc(25) int local25 = this.aClass82_Sub2_34.anInt5197 % 4000 * 16 / 4000;
			this.aClass82_Sub2_34.method4614(this.aClass37_3.aClass7_Sub1Array2[local25]);
		}
		this.aClass82_Sub2_34.method4582(0);
		@Pc(53) opengl local53 = this.aClass82_Sub2_34.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static316.aFloatArray27, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static316.aFloatArray27, 0);
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

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
	@Override
	public void method4891(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "()V")
	@Override
	public void method4893() {
		if (this.aClass217_6 != null) {
			this.aClass217_6.method5089('\u0001');
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4614(null);
			this.aClass82_Sub2_34.method4582(0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()Z")
	@Override
	public boolean method4892() {
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!et;)V")
	@Override
	public void method4894(@OriginalArg(0) Class7 arg0) {
		this.aClass82_Sub2_34.method4614(arg0);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V")
	@Override
	public void method4896(@OriginalArg(0) boolean arg0) {
		if (this.aClass217_6 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass217_6.method5089('\u0000');
		this.aClass82_Sub2_34.method4582(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass82_Sub2_34.aClass54_Sub2_1.method4797(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass82_Sub2_34.method4582(0);
		if (this.anInt5586 == this.aClass82_Sub2_34.anInt5197) {
			return;
		}
		@Pc(55) int local55 = this.aClass82_Sub2_34.anInt5197 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass37_3.aBoolean82) {
			@Pc(91) float local91 = (float) (this.aClass82_Sub2_34.anInt5197 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5586 = this.aClass82_Sub2_34.anInt5197;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "()V")
	private void method4897() {
		@Pc(3) opengl local3 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass217_6 = new Class217(this.aClass82_Sub2_34, 2);
		this.aClass217_6.method5088(0);
		this.aClass82_Sub2_34.method4582(1);
		this.aClass82_Sub2_34.method4624(260, 7681);
		this.aClass82_Sub2_34.method4631(0, 34168);
		this.aClass82_Sub2_34.method4582(0);
		local3.glBindProgramARB(34336, this.aClass233_5.anInt6351);
		local3.glEnable(34336);
		this.aClass217_6.method5090();
		this.aClass217_6.method5088(1);
		this.aClass82_Sub2_34.method4582(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass82_Sub2_34.method4618(1);
		this.aClass82_Sub2_34.method4631(0, 5890);
		this.aClass82_Sub2_34.method4582(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass217_6.method5090();
	}
}
