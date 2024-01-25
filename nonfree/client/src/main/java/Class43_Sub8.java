import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class43_Sub8 extends Class43 {

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "F")
	private float aFloat109;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!nda;")
	private Class251 aClass251_6;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	private int anInt6380;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!taa;")
	private final Class349 aClass349_4;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Lclient!nca;")
	private Class250 aClass250_5;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "[F")
	private float[] aFloatArray56;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!gia;Lclient!taa;)V")
	public Class43_Sub8(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class349 arg1) {
		super(arg0);
		this.aClass349_4 = arg1;
		if (super.aClass67_Sub2_41.aBoolean304 && super.aClass67_Sub2_41.anInt3887 >= 2) {
			this.aClass250_5 = Static392.method5907(super.aClass67_Sub2_41, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass250_5 != null) {
				@Pc(44) int[][] local44 = Static2.method9132(0.4F);
				@Pc(55) int[][] local55 = Static2.method9132(0.4F);
				@Pc(57) int local57 = 0;
				this.aFloatArray56 = new float[32768];
				for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
					@Pc(69) int[] local69 = local44[local63];
					@Pc(73) int[] local73 = local55[local63];
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.aFloatArray56[local57++] = (float) local69[local75] / 4096.0F;
						this.aFloatArray56[local57++] = (float) local73[local75] / 4096.0F;
					}
				}
				this.method5410();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (this.aClass251_6 == null) {
			return;
		}
		this.aClass251_6.method6186('\u0000');
		super.aClass67_Sub2_41.method3268(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass67_Sub2_41.aClass181_Sub2_5.method6182(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass67_Sub2_41.method3268(0);
		if (this.anInt6380 == super.aClass67_Sub2_41.anInt3876) {
			return;
		}
		@Pc(52) int local52 = super.aClass67_Sub2_41.anInt3876 % 5000 * 128 / 5000;
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local54, this.aFloatArray56, local52);
			local52 += 2;
		}
		if (this.aClass349_4.aBoolean709) {
			this.aFloat109 = (float) (super.aClass67_Sub2_41.anInt3876 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6380 = super.aClass67_Sub2_41.anInt3876;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	private void method5410() {
		this.aClass251_6 = new Class251(super.aClass67_Sub2_41, 2);
		this.aClass251_6.method6187(0);
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3247(-16777216);
		super.aClass67_Sub2_41.method3271(7681, 260);
		super.aClass67_Sub2_41.method3269(34166, 0);
		super.aClass67_Sub2_41.method3268(0);
		OpenGL.glBindProgramARB(34336, this.aClass250_5.anInt7351);
		OpenGL.glEnable(34336);
		this.aClass251_6.method6183();
		this.aClass251_6.method6187(1);
		super.aClass67_Sub2_41.method3268(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass67_Sub2_41.method3255(0);
		super.aClass67_Sub2_41.method3269(5890, 0);
		super.aClass67_Sub2_41.method3268(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass251_6.method6183();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		if (this.aClass251_6 != null) {
			this.aClass251_6.method6186('\u0001');
			super.aClass67_Sub2_41.method3268(1);
			super.aClass67_Sub2_41.method3234((Class245) null);
			super.aClass67_Sub2_41.method3268(0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		super.aClass67_Sub2_41.method3234(arg1);
		super.aClass67_Sub2_41.method3255(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass251_6 == null) {
			return;
		}
		super.aClass67_Sub2_41.method3268(1);
		@Pc(56) int local56;
		if ((arg1 & 0x80) != 0) {
			super.aClass67_Sub2_41.method3234((Class245) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass349_4.aBoolean709) {
				super.aClass67_Sub2_41.method3234(this.aClass349_4.aClass245_Sub3_2);
			} else {
				super.aClass67_Sub2_41.method3234(this.aClass349_4.aClass245_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass349_4.aBoolean709) {
			super.aClass67_Sub2_41.method3234(this.aClass349_4.aClass245_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat109, 0.0F, 0.0F, 1.0F);
		} else {
			local56 = super.aClass67_Sub2_41.anInt3876 % 4000 * 16 / 4000;
			super.aClass67_Sub2_41.method3234(this.aClass349_4.aClass245_Sub2Array3[local56]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass67_Sub2_41.method3268(0);
		if ((arg1 & 0x40) == 0) {
			Static345.aFloatArray53[2] = super.aClass67_Sub2_41.aFloat68 * super.aClass67_Sub2_41.aFloat70;
			Static345.aFloatArray53[0] = super.aClass67_Sub2_41.aFloat77 * super.aClass67_Sub2_41.aFloat70;
			Static345.aFloatArray53[1] = super.aClass67_Sub2_41.aFloat70 * super.aClass67_Sub2_41.aFloat76;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static345.aFloatArray53, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local56 = arg1 & 0x3;
		if (local56 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local56 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
	}
}
