import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class70 implements Interface2 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	private int anInt2099 = -1;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	private int anInt2101 = -1;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	private int anInt2100;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class70() {
		if (this.anInt2099 < 0 && (Static94.aBoolean143 && Static94.anInt2081 >= 2)) {
			@Pc(19) int[] local19 = new int[1];
			@Pc(21) GL local21 = Static94.aGL1;
			local21.glGenProgramsARB(1, local19, 0);
			this.anInt2100 = local19[0];
			@Pc(42) int[][] local42 = Static201.method3247(0.4F);
			@Pc(53) int[][] local53 = Static201.method3247(0.4F);
			@Pc(58) Class4_Sub10 local58 = new Class4_Sub10(262144);
			for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
				@Pc(67) int[] local67 = local42[local60];
				@Pc(71) int[] local71 = local53[local60];
				for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
					if (Static94.aBoolean126) {
						local58.method4641((float) local67[local73] / 4096.0F);
						local58.method4641((float) local71[local73] / 4096.0F);
						local58.method4641(1.0F);
						local58.method4641(1.0F);
					} else {
						local58.method4669((float) local67[local73] / 4096.0F);
						local58.method4669((float) local71[local73] / 4096.0F);
						local58.method4669(1.0F);
						local58.method4669(1.0F);
					}
				}
			}
			@Pc(141) ByteBuffer local141 = ByteBuffer.allocateDirect(local58.anInt5713).order(ByteOrder.nativeOrder());
			local141.put(local58.aByteArray71, 0, local58.anInt5713);
			local141.flip();
			this.aFloatBuffer1 = local141.asFloatBuffer().asReadOnlyBuffer();
			this.method1642();
			this.method1643();
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "()I")
	@Override
	public int method3522() {
		return 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	@Override
	public void method3520() {
		if (this.anInt2099 >= 0) {
			@Pc(5) GL local5 = Static94.aGL1;
			local5.glCallList(this.anInt2099 + 1);
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "()V")
	private void method1642() {
		@Pc(1) GL local1 = Static94.aGL1;
		this.anInt2099 = local1.glGenLists(2);
		local1.glNewList(this.anInt2099, 4864);
		local1.glActiveTexture(33985);
		if (Static119.aBoolean160) {
			local1.glBindTexture(32879, Static119.anInt2342);
		}
		local1.glTexEnvi(8960, 34161, 260);
		local1.glTexEnvi(8960, 34162, 7681);
		local1.glTexEnvi(8960, 34184, 34168);
		local1.glActiveTexture(33984);
		local1.glBindProgramARB(34336, this.anInt2100);
		local1.glEnable(34336);
		local1.glEndList();
		local1.glNewList(this.anInt2099 + 1, 4864);
		local1.glActiveTexture(33985);
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glMatrixMode(5888);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glTexEnvi(8960, 34184, 5890);
		local1.glDisable(Static119.aBoolean160 ? 32879 : 3553);
		local1.glActiveTexture(33984);
		local1.glBindProgramARB(34336, 0);
		local1.glDisable(34336);
		local1.glDisable(34820);
		local1.glEndList();
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "()V")
	private void method1643() {
		if (this.anInt2099 < 0) {
			return;
		}
		@Pc(4) GL local4 = Static94.aGL1;
		@Pc(7) int[] local7 = new int[1];
		local4.glBindProgramARB(34336, this.anInt2100);
		local4.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
		local4.glGetIntegerv(34379, local7, 0);
		if (local7[0] != -1) {
			return;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method3523(@OriginalArg(0) int arg0) {
		if (this.anInt2099 < 0) {
			return;
		}
		@Pc(5) GL local5 = Static94.aGL1;
		local5.glActiveTexture(33985);
		if ((arg0 & 0x80) == 0) {
			local5.glEnable(Static119.aBoolean160 ? 32879 : 3553);
		} else {
			local5.glDisable(Static119.aBoolean160 ? 32879 : 3553);
		}
		local5.glActiveTexture(33984);
		if ((arg0 & 0x40) == 0) {
			local5.glGetFloatv(2899, Static96.aFloatArray21, 0);
			local5.glProgramLocalParameter4fvARB(34336, 66, Static96.aFloatArray21, 0);
		} else {
			local5.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(58) int local58 = arg0 & 0x3;
		if (local58 == 2) {
			local5.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local58 == 3) {
			local5.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()V")
	@Override
	public void method3521() {
		if (this.anInt2099 < 0) {
			return;
		}
		@Pc(5) GL local5 = Static94.aGL1;
		local5.glCallList(this.anInt2099);
		local5.glActiveTexture(33985);
		local5.glMatrixMode(5890);
		local5.glTranslatef((float) Static195.anInt3731, (float) Static240.anInt4559, (float) Static31.anInt525);
		local5.glRotatef(-((float) Static230.anInt4404 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static164.anInt3258 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local5.glMatrixMode(5888);
		if (!Static119.aBoolean160) {
			local5.glBindTexture(3553, Static119.anIntArray198[(int) ((float) (Static94.anInt2085 * 64) * 0.005F) % 64]);
		}
		local5.glActiveTexture(33984);
		if (this.anInt2101 == Static94.anInt2085) {
			return;
		}
		@Pc(85) int local85 = (Static94.anInt2085 & 0xFF) * 256;
		for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
			this.aFloatBuffer1.position(local85);
			local5.glProgramLocalParameter4fvARB(34336, local87, this.aFloatBuffer1);
			local85 += 4;
		}
		if (Static119.aBoolean160) {
			local5.glProgramLocalParameter4fARB(34336, 65, (float) Static94.anInt2085 * 0.005F, 0.0F, 0.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2101 = Static94.anInt2085;
	}
}
