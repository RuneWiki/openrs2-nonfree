import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class63_Sub4 extends Class63 {

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
	private int anInt6491;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "F")
	private float aFloat103;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Lclient!gca;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "Lclient!au;")
	private final Class26 aClass26_2;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!jf;")
	private Class191 aClass191_5;

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "[F")
	private float[] aFloatArray48;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!aq;Lclient!au;)V")
	public Class63_Sub4(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class26 arg1) {
		super(arg0);
		this.aClass26_2 = arg1;
		if (super.aClass22_Sub1_43.aBoolean71 && super.aClass22_Sub1_43.anInt1009 >= 2) {
			this.aClass191_5 = Static3.method66(super.aClass22_Sub1_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass191_5 != null) {
				@Pc(44) int[][] local44 = Static279.method3945(0.4F);
				@Pc(55) int[][] local55 = Static279.method3945(0.4F);
				@Pc(57) int local57 = 0;
				this.aFloatArray48 = new float[32768];
				for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
					@Pc(69) int[] local69 = local44[local63];
					@Pc(73) int[] local73 = local55[local63];
					for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
						this.aFloatArray48[local57++] = (float) local69[local75] / 4096.0F;
						this.aFloatArray48[local57++] = (float) local73[local75] / 4096.0F;
					}
				}
				this.method5644();
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		if (this.aClass131_2 == null) {
			return;
		}
		this.aClass131_2.method3047('\u0000');
		super.aClass22_Sub1_43.method931(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass22_Sub1_43.aClass58_Sub3_5.method9533(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass22_Sub1_43.method931(0);
		if (super.aClass22_Sub1_43.anInt995 == this.anInt6491) {
			return;
		}
		@Pc(63) int local63 = super.aClass22_Sub1_43.anInt995 % 5000 * 128 / 5000;
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local65, this.aFloatArray48, local63);
			local63 += 2;
		}
		if (this.aClass26_2.aBoolean83) {
			this.aFloat103 = (float) (super.aClass22_Sub1_43.anInt995 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6491 = super.aClass22_Sub1_43.anInt995;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub1_43.method955(arg0);
		super.aClass22_Sub1_43.method894(arg1);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		if (this.aClass131_2 != null) {
			this.aClass131_2.method3047('\u0001');
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method955((Class125) null);
			super.aClass22_Sub1_43.method931(0);
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
	private void method5644() {
		this.aClass131_2 = new Class131(super.aClass22_Sub1_43, 2);
		this.aClass131_2.method3046(0);
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method934(-16777216);
		super.aClass22_Sub1_43.method900(7681, 260);
		super.aClass22_Sub1_43.method963(0, 34166);
		super.aClass22_Sub1_43.method931(0);
		OpenGL.glBindProgramARB(34336, this.aClass191_5.anInt4877);
		OpenGL.glEnable(34336);
		this.aClass131_2.method3048();
		this.aClass131_2.method3046(1);
		super.aClass22_Sub1_43.method931(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass22_Sub1_43.method894(0);
		super.aClass22_Sub1_43.method963(0, 5890);
		super.aClass22_Sub1_43.method931(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass131_2.method3048();
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass131_2 == null) {
			return;
		}
		super.aClass22_Sub1_43.method931(1);
		@Pc(45) int local45;
		if ((arg1 & 0x80) != 0) {
			super.aClass22_Sub1_43.method955((Class125) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass26_2.aBoolean83) {
				super.aClass22_Sub1_43.method955(this.aClass26_2.aClass125_Sub3_1);
			} else {
				super.aClass22_Sub1_43.method955(this.aClass26_2.aClass125_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass26_2.aBoolean83) {
			super.aClass22_Sub1_43.method955(this.aClass26_2.aClass125_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat103, 0.0F, 0.0F, 1.0F);
		} else {
			local45 = super.aClass22_Sub1_43.anInt995 % 4000 * 16 / 4000;
			super.aClass22_Sub1_43.method955(this.aClass26_2.aClass125_Sub1Array1[local45]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass22_Sub1_43.method931(0);
		if ((arg1 & 0x40) == 0) {
			Static555.aFloatArray53[2] = super.aClass22_Sub1_43.aFloat21 * super.aClass22_Sub1_43.aFloat25;
			Static555.aFloatArray53[1] = super.aClass22_Sub1_43.aFloat21 * super.aClass22_Sub1_43.aFloat28;
			Static555.aFloatArray53[0] = super.aClass22_Sub1_43.aFloat19 * super.aClass22_Sub1_43.aFloat21;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static555.aFloatArray53, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local45 = arg1 & 0x3;
		if (local45 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local45 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
