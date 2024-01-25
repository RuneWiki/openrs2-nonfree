import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class56_Sub5 extends Class56 {

	@OriginalMember(owner = "client!iba", name = "m", descriptor = "Lclient!ub;")
	private Class291 aClass291_4;

	@OriginalMember(owner = "client!iba", name = "p", descriptor = "I")
	private int anInt4461;

	@OriginalMember(owner = "client!iba", name = "y", descriptor = "F")
	private float aFloat146;

	@OriginalMember(owner = "client!iba", name = "u", descriptor = "Lclient!me;")
	private final Class190 aClass190_3;

	@OriginalMember(owner = "client!iba", name = "k", descriptor = "Lclient!jm;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "[F")
	private float[] aFloatArray35;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!ad;Lclient!me;)V")
	public Class56_Sub5(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class190 arg1) {
		super(arg0);
		this.aClass190_3 = arg1;
		if (super.aClass5_Sub1_39.aBoolean38 && super.aClass5_Sub1_39.anInt396 >= 2) {
			this.aClass150_1 = Static188.method3551(super.aClass5_Sub1_39, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass150_1 != null) {
				@Pc(39) int[][] local39 = Static544.method7770(0.4F);
				@Pc(50) int[][] local50 = Static544.method7770(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray35 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray35[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray35[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method3743();
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return true;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass291_4 == null) {
			return;
		}
		super.aClass5_Sub1_39.method397(1);
		@Pc(72) int local72;
		if ((arg0 & 0x80) != 0) {
			super.aClass5_Sub1_39.method423(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass190_3.aBoolean385) {
				super.aClass5_Sub1_39.method423(this.aClass190_3.aClass11_Sub2_2);
			} else {
				super.aClass5_Sub1_39.method423(this.aClass190_3.aClass11_Sub1Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass190_3.aBoolean385) {
			super.aClass5_Sub1_39.method423(this.aClass190_3.aClass11_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat146, 0.0F, 0.0F, 1.0F);
		} else {
			local72 = super.aClass5_Sub1_39.anInt377 % 4000 * 16 / 4000;
			super.aClass5_Sub1_39.method423(this.aClass190_3.aClass11_Sub1Array4[local72]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass5_Sub1_39.method397(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static383.aFloatArray40, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static383.aFloatArray40, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local72 = arg0 & 0x3;
		if (local72 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local72 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		if (this.aClass291_4 != null) {
			this.aClass291_4.method7122('\u0001');
			super.aClass5_Sub1_39.method397(1);
			super.aClass5_Sub1_39.method423(null);
			super.aClass5_Sub1_39.method397(0);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		if (this.aClass291_4 == null) {
			return;
		}
		this.aClass291_4.method7122('\u0000');
		super.aClass5_Sub1_39.method397(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass5_Sub1_39.aClass205_Sub3_3.method7810(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub1_39.method397(0);
		if (super.aClass5_Sub1_39.anInt377 == this.anInt4461) {
			return;
		}
		@Pc(66) int local66 = super.aClass5_Sub1_39.anInt377 % 5120 * 128 / 5120;
		local66 *= 128;
		for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local72, this.aFloatArray35, local66);
			local66 += 2;
		}
		if (this.aClass190_3.aBoolean385) {
			this.aFloat146 = (float) (super.aClass5_Sub1_39.anInt377 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4461 = super.aClass5_Sub1_39.anInt377;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass5_Sub1_39.method423(arg1);
		super.aClass5_Sub1_39.method416(arg0);
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)V")
	private void method3743() {
		this.aClass291_4 = new Class291(super.aClass5_Sub1_39, 2);
		this.aClass291_4.method7121(0);
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method428(-16777216);
		super.aClass5_Sub1_39.method448(7681, 260);
		super.aClass5_Sub1_39.method461(34166, 0);
		super.aClass5_Sub1_39.method397(0);
		OpenGL.glBindProgramARB(34336, this.aClass150_1.anInt4894);
		OpenGL.glEnable(34336);
		this.aClass291_4.method7124();
		this.aClass291_4.method7121(1);
		super.aClass5_Sub1_39.method397(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass5_Sub1_39.method416(0);
		super.aClass5_Sub1_39.method461(5890, 0);
		super.aClass5_Sub1_39.method397(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass291_4.method7124();
	}
}
