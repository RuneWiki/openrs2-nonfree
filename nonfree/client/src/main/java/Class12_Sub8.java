import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class12_Sub8 extends Class12 {

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Lclient!hu;")
	private Class110 aClass110_5;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	private int anInt6669;

	@OriginalMember(owner = "client!st", name = "r", descriptor = "Lclient!ha;")
	private final Class98 aClass98_6;

	@OriginalMember(owner = "client!st", name = "y", descriptor = "Lclient!th;")
	private Class233 aClass233_5;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!rl;Lclient!ha;)V")
	public Class12_Sub8(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class98 arg1) {
		super(arg0);
		this.aClass98_6 = arg1;
		if (super.aClass66_Sub2_41.aBoolean391 && super.aClass66_Sub2_41.anInt6164 >= 2) {
			this.aClass233_5 = Static16.method473("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass66_Sub2_41);
			if (this.aClass233_5 != null) {
				@Pc(39) int[][] local39 = Static387.method5712(0.4F);
				@Pc(50) int[][] local50 = Static387.method5712(0.4F);
				this.aFloatArray26 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray26[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray26[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5560();
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		if (this.aClass110_5 != null) {
			this.aClass110_5.method2677('\u0001');
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5109(null);
			super.aClass66_Sub2_41.method5075(0);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
	private void method5560() {
		this.aClass110_5 = new Class110(super.aClass66_Sub2_41, 2);
		this.aClass110_5.method2674(0);
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5091(-16777216);
		super.aClass66_Sub2_41.method5145(7681, 260);
		super.aClass66_Sub2_41.method5102(0, 34166);
		super.aClass66_Sub2_41.method5075(0);
		OpenGL.glBindProgramARB(34336, this.aClass233_5.anInt6787);
		OpenGL.glEnable(34336);
		this.aClass110_5.method2676();
		this.aClass110_5.method2674(1);
		super.aClass66_Sub2_41.method5075(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass66_Sub2_41.method5140(0);
		super.aClass66_Sub2_41.method5102(0, 5890);
		super.aClass66_Sub2_41.method5075(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass110_5.method2676();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		if (this.aClass110_5 == null) {
			return;
		}
		this.aClass110_5.method2677('\u0000');
		super.aClass66_Sub2_41.method5075(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass66_Sub2_41.aClass5_Sub2_4.method3852(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass66_Sub2_41.method5075(0);
		if (super.aClass66_Sub2_41.anInt6140 == this.anInt6669) {
			return;
		}
		@Pc(60) int local60 = super.aClass66_Sub2_41.anInt6140 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray26, local60);
			local60 += 2;
		}
		if (this.aClass98_6.aBoolean187) {
			@Pc(92) float local92 = (float) (super.aClass66_Sub2_41.anInt6140 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local92, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6669 = super.aClass66_Sub2_41.anInt6140;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		super.aClass66_Sub2_41.method5109(arg1);
		super.aClass66_Sub2_41.method5140(arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass110_5 == null) {
			return;
		}
		super.aClass66_Sub2_41.method5075(1);
		@Pc(48) int local48;
		if ((arg1 & 0x80) != 0) {
			super.aClass66_Sub2_41.method5109(null);
		} else if (this.aClass98_6.aBoolean187) {
			super.aClass66_Sub2_41.method5109(this.aClass98_6.aClass19_Sub1_3);
		} else {
			local48 = super.aClass66_Sub2_41.anInt6140 % 4000 * 16 / 4000;
			super.aClass66_Sub2_41.method5109(this.aClass98_6.aClass19_Sub4Array1[local48]);
		}
		super.aClass66_Sub2_41.method5075(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static330.aFloatArray19, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static330.aFloatArray19, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local48 = arg1 & 0x3;
		if (local48 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local48 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
