import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class13 implements Interface2 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	private int anInt189 = -1;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	private int anInt190 = -1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class13() {
		if (this.anInt190 < 0 && (Static291.aBoolean407 && Static291.anInt5516 >= 2)) {
			@Pc(19) int[] local19 = new int[1];
			@Pc(21) GL local21 = Static291.aGL1;
			local21.glGenProgramsARB(1, local19, 0);
			this.anInt188 = local19[0];
			@Pc(42) int[][] local42 = Static64.method2448(0.4F);
			@Pc(53) int[][] local53 = Static64.method2448(0.4F);
			@Pc(58) Class1_Sub14 local58 = new Class1_Sub14(262144);
			for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
				@Pc(67) int[] local67 = local42[local60];
				@Pc(71) int[] local71 = local53[local60];
				for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
					if (Static291.aBoolean413) {
						local58.method2604((float) local67[local73] / 4096.0F);
						local58.method2604((float) local71[local73] / 4096.0F);
						local58.method2604(1.0F);
						local58.method2604(1.0F);
					} else {
						local58.method2594((float) local67[local73] / 4096.0F);
						local58.method2594((float) local71[local73] / 4096.0F);
						local58.method2594(1.0F);
						local58.method2594(1.0F);
					}
				}
			}
			@Pc(141) ByteBuffer local141 = ByteBuffer.allocateDirect(local58.anInt3290).order(ByteOrder.nativeOrder());
			local141.put(local58.aByteArray34, 0, local58.anInt3290);
			local141.flip();
			this.aFloatBuffer1 = local141.asFloatBuffer().asReadOnlyBuffer();
			this.method158();
			this.method156();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	@Override
	public void method3763(@OriginalArg(0) int arg0) {
		if (this.anInt190 < 0) {
			return;
		}
		@Pc(5) GL local5 = Static291.aGL1;
		local5.glActiveTexture(33985);
		if ((arg0 & 0x80) == 0) {
			local5.glEnable(Static153.aBoolean229 ? 32879 : 3553);
		} else {
			local5.glDisable(Static153.aBoolean229 ? 32879 : 3553);
		}
		local5.glActiveTexture(33984);
		if ((arg0 & 0x40) == 0) {
			local5.glGetFloatv(2899, Static11.aFloatArray2, 0);
			local5.glProgramLocalParameter4fvARB(34336, 66, Static11.aFloatArray2, 0);
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

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()V")
	@Override
	public void method3761() {
		if (this.anInt190 >= 0) {
			@Pc(5) GL local5 = Static291.aGL1;
			local5.glCallList(this.anInt190 + 1);
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "()V")
	private void method156() {
		if (this.anInt190 < 0) {
			return;
		}
		@Pc(4) GL local4 = Static291.aGL1;
		@Pc(7) int[] local7 = new int[1];
		local4.glBindProgramARB(34336, this.anInt188);
		local4.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
		local4.glGetIntegerv(34379, local7, 0);
		if (local7[0] != -1) {
			return;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()V")
	@Override
	public void method3762() {
		if (this.anInt190 < 0) {
			return;
		}
		@Pc(5) GL local5 = Static291.aGL1;
		local5.glCallList(this.anInt190);
		local5.glActiveTexture(33985);
		local5.glMatrixMode(5890);
		local5.glTranslatef((float) Static216.anInt4237, (float) Static134.anInt2683, (float) Static225.anInt4441);
		local5.glRotatef(-((float) Static245.anInt2367 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
		local5.glRotatef(-((float) Static115.anInt2284 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
		local5.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local5.glMatrixMode(5888);
		if (!Static153.aBoolean229) {
			local5.glBindTexture(3553, Static153.anIntArray251[(int) ((float) (Static291.anInt5513 * 64) * 0.005F) % 64]);
		}
		local5.glActiveTexture(33984);
		if (this.anInt189 == Static291.anInt5513) {
			return;
		}
		@Pc(85) int local85 = (Static291.anInt5513 & 0xFF) * 256;
		for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
			this.aFloatBuffer1.position(local85);
			local5.glProgramLocalParameter4fvARB(34336, local87, this.aFloatBuffer1);
			local85 += 4;
		}
		if (Static153.aBoolean229) {
			local5.glProgramLocalParameter4fARB(34336, 65, (float) Static291.anInt5513 * 0.005F, 0.0F, 0.0F, 1.0F);
		} else {
			local5.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt189 = Static291.anInt5513;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()I")
	@Override
	public int method3760() {
		return 0;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "()V")
	private void method158() {
		@Pc(1) GL local1 = Static291.aGL1;
		this.anInt190 = local1.glGenLists(2);
		local1.glNewList(this.anInt190, 4864);
		local1.glActiveTexture(33985);
		if (Static153.aBoolean229) {
			local1.glBindTexture(32879, Static153.anInt3140);
		}
		local1.glTexEnvi(8960, 34161, 260);
		local1.glTexEnvi(8960, 34162, 7681);
		local1.glTexEnvi(8960, 34184, 34168);
		local1.glActiveTexture(33984);
		local1.glBindProgramARB(34336, this.anInt188);
		local1.glEnable(34336);
		local1.glEndList();
		local1.glNewList(this.anInt190 + 1, 4864);
		local1.glActiveTexture(33985);
		local1.glMatrixMode(5890);
		local1.glLoadIdentity();
		local1.glMatrixMode(5888);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glTexEnvi(8960, 34184, 5890);
		local1.glDisable(Static153.aBoolean229 ? 32879 : 3553);
		local1.glActiveTexture(33984);
		local1.glBindProgramARB(34336, 0);
		local1.glDisable(34336);
		local1.glDisable(34820);
		local1.glEndList();
	}
}
