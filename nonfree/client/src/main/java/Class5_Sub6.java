import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Lclient!kq;")
	private Class144 aClass144_5;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
	private int anInt4958;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Lclient!mt;")
	private final Class171 aClass171_4;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "Lclient!an;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!bl;Lclient!mt;)V")
	public Class5_Sub6(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		this.aClass171_4 = arg1;
		if (super.aClass28_Sub1_42.aBoolean41 && super.aClass28_Sub1_42.anInt760 >= 2) {
			this.aClass13_1 = Static444.method5636(super.aClass28_Sub1_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass13_1 != null) {
				@Pc(41) int[][] local41 = Static279.method4220(0.4F);
				@Pc(52) int[][] local52 = Static279.method4220(0.4F);
				this.aFloatArray25 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray25[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray25[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method4384();
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass144_5 == null) {
			return;
		}
		super.aClass28_Sub1_42.method650(1);
		@Pc(50) int local50;
		if ((arg0 & 0x80) != 0) {
			super.aClass28_Sub1_42.method654(null);
		} else if (this.aClass171_4.aBoolean281) {
			super.aClass28_Sub1_42.method654(this.aClass171_4.aClass40_Sub2_3);
		} else {
			local50 = super.aClass28_Sub1_42.anInt737 % 4000 * 16 / 4000;
			super.aClass28_Sub1_42.method654(this.aClass171_4.aClass40_Sub3Array2[local50]);
		}
		super.aClass28_Sub1_42.method650(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static348.aFloatArray29, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static348.aFloatArray29, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local50 = arg0 & 0x3;
		if (local50 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local50 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		if (this.aClass144_5 == null) {
			return;
		}
		this.aClass144_5.method3285('\u0000');
		super.aClass28_Sub1_42.method650(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass28_Sub1_42.aClass132_Sub2_4.method3994(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass28_Sub1_42.method650(0);
		if (super.aClass28_Sub1_42.anInt737 == this.anInt4958) {
			return;
		}
		@Pc(64) int local64 = super.aClass28_Sub1_42.anInt737 % 5120 * 128 / 5120;
		local64 *= 128;
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local70, this.aFloatArray25, local64);
			local64 += 2;
		}
		if (this.aClass171_4.aBoolean281) {
			@Pc(98) float local98 = (float) (super.aClass28_Sub1_42.anInt737 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local98, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4958 = super.aClass28_Sub1_42.anInt737;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		super.aClass28_Sub1_42.method654(arg0);
		super.aClass28_Sub1_42.method678(arg1);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	private void method4384() {
		this.aClass144_5 = new Class144(super.aClass28_Sub1_42, 2);
		this.aClass144_5.method3283(0);
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method673(-16777216);
		super.aClass28_Sub1_42.method692(7681, 260);
		super.aClass28_Sub1_42.method643(34166, 0);
		super.aClass28_Sub1_42.method650(0);
		OpenGL.glBindProgramARB(34336, this.aClass13_1.anInt232);
		OpenGL.glEnable(34336);
		this.aClass144_5.method3284();
		this.aClass144_5.method3283(1);
		super.aClass28_Sub1_42.method650(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass28_Sub1_42.method678(0);
		super.aClass28_Sub1_42.method643(5890, 0);
		super.aClass28_Sub1_42.method650(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass144_5.method3284();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return true;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		if (this.aClass144_5 != null) {
			this.aClass144_5.method3285('\u0001');
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method654(null);
			super.aClass28_Sub1_42.method650(0);
		}
	}
}
