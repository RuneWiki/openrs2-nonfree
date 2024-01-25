import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	private int anInt2563;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!bb;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!rl;")
	private final Class178 aClass178_1;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!sq;")
	private Class185 aClass185_1;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!tb;Lclient!rl;)V")
	public Class22_Sub2(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class178 arg1) {
		super(arg0);
		this.aClass178_1 = arg1;
		if (this.aClass129_Sub2_32.aBoolean379 && this.aClass129_Sub2_32.anInt5901 >= 2) {
			this.aClass185_1 = Static295.method4884(this.aClass129_Sub2_32, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass185_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static175.method2828(0.4F);
			@Pc(47) int[][] local47 = Static175.method2828(0.4F);
			@Pc(52) Class11_Sub25_Sub2 local52 = new Class11_Sub25_Sub2(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass129_Sub2_32.aBoolean377) {
						local52.method5228((float) local61[local67] / 4096.0F);
						local52.method5228((float) local65[local67] / 4096.0F);
						local52.method5228(1.0F);
						local52.method5228(1.0F);
					} else {
						local52.method5229((float) local61[local67] / 4096.0F);
						local52.method5229((float) local65[local67] / 4096.0F);
						local52.method5229(1.0F);
						local52.method5229(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt6076).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray93, 0, local52.anInt6076);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method2153();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	@Override
	public void method4340(@OriginalArg(0) boolean arg0) {
		if (this.aClass20_2 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass20_2.method223('\u0000');
		this.aClass129_Sub2_32.method5091(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass129_Sub2_32.aClass61_Sub2_1.method3671(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass129_Sub2_32.method5091(0);
		if (this.anInt2563 == this.aClass129_Sub2_32.anInt5886) {
			return;
		}
		@Pc(55) int local55 = this.aClass129_Sub2_32.anInt5886 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass178_1.aBoolean357) {
			@Pc(91) float local91 = (float) (this.aClass129_Sub2_32.anInt5886 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2563 = this.aClass129_Sub2_32.anInt5886;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
	@Override
	public void method4342() {
		if (this.aClass20_2 != null) {
			this.aClass20_2.method223('\u0001');
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5084(null);
			this.aClass129_Sub2_32.method5091(0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4343(@OriginalArg(0) Class56 arg0) {
		this.aClass129_Sub2_32.method5084(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
		if (this.aClass20_2 == null) {
			return;
		}
		this.aClass129_Sub2_32.method5091(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass129_Sub2_32.method5084(null);
		} else if (this.aClass178_1.aBoolean357) {
			this.aClass129_Sub2_32.method5084(this.aClass178_1.aClass56_Sub3_1);
		} else {
			@Pc(25) int local25 = this.aClass129_Sub2_32.anInt5886 % 4000 * 16 / 4000;
			this.aClass129_Sub2_32.method5084(this.aClass178_1.aClass56_Sub4Array3[local25]);
		}
		this.aClass129_Sub2_32.method5091(0);
		@Pc(53) opengl local53 = this.aClass129_Sub2_32.anOpengl2;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static139.aFloatArray15, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static139.aFloatArray15, 0);
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()Z")
	@Override
	public boolean method4341() {
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	@Override
	public void method4338(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
	private void method2153() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass20_2 = new Class20(this.aClass129_Sub2_32, 2);
		this.aClass20_2.method222(0);
		this.aClass129_Sub2_32.method5091(1);
		this.aClass129_Sub2_32.method5067(260, 7681);
		this.aClass129_Sub2_32.method5097(0, 34168);
		this.aClass129_Sub2_32.method5091(0);
		local3.glBindProgramARB(34336, this.aClass185_1.anInt5819);
		local3.glEnable(34336);
		this.aClass20_2.method221();
		this.aClass20_2.method222(1);
		this.aClass129_Sub2_32.method5091(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass129_Sub2_32.method5094(1);
		this.aClass129_Sub2_32.method5097(0, 5890);
		this.aClass129_Sub2_32.method5091(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass20_2.method221();
	}
}
