import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Lclient!bu;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	private int anInt1557;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!pl;")
	private final Class198 aClass198_2;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!ti;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[F")
	private float[] aFloatArray5;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ug;Lclient!pl;)V")
	public Class10_Sub3(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_2 = arg1;
		if (super.aClass135_Sub2_41.aBoolean477 && super.aClass135_Sub2_41.anInt6801 >= 2) {
			this.aClass238_1 = Static347.method4604("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass135_Sub2_41);
			if (this.aClass238_1 != null) {
				@Pc(41) int[][] local41 = Static52.method687(0.4F);
				@Pc(52) int[][] local52 = Static52.method687(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray5 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray5[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray5[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method1266();
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
	private void method1266() {
		this.aClass32_2 = new Class32(super.aClass135_Sub2_41, 2);
		this.aClass32_2.method550(0);
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5435(-16777216);
		super.aClass135_Sub2_41.method5407(260, 7681);
		super.aClass135_Sub2_41.method5425(0, 34166);
		super.aClass135_Sub2_41.method5457(0);
		OpenGL.glBindProgramARB(34336, this.aClass238_1.anInt6300);
		OpenGL.glEnable(34336);
		this.aClass32_2.method548();
		this.aClass32_2.method550(1);
		super.aClass135_Sub2_41.method5457(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass135_Sub2_41.method5441(0);
		super.aClass135_Sub2_41.method5425(0, 5890);
		super.aClass135_Sub2_41.method5457(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass32_2.method548();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		if (this.aClass32_2 != null) {
			this.aClass32_2.method547('\u0001');
			super.aClass135_Sub2_41.method5457(1);
			super.aClass135_Sub2_41.method5458(null);
			super.aClass135_Sub2_41.method5457(0);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return true;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		if (this.aClass32_2 == null) {
			return;
		}
		this.aClass32_2.method547('\u0000');
		super.aClass135_Sub2_41.method5457(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass135_Sub2_41.aClass35_Sub2_3.method2905(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass135_Sub2_41.method5457(0);
		if (this.anInt1557 == super.aClass135_Sub2_41.anInt6779) {
			return;
		}
		@Pc(56) int local56 = super.aClass135_Sub2_41.anInt6779 % 5120 * 128 / 5120;
		local56 *= 128;
		for (@Pc(62) int local62 = 0; local62 < 64; local62++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local62, this.aFloatArray5, local56);
			local56 += 2;
		}
		if (this.aClass198_2.aBoolean363) {
			@Pc(99) float local99 = (float) (super.aClass135_Sub2_41.anInt6779 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local99, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt1557 = super.aClass135_Sub2_41.anInt6779;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		super.aClass135_Sub2_41.method5458(arg0);
		super.aClass135_Sub2_41.method5441(arg1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass32_2 == null) {
			return;
		}
		super.aClass135_Sub2_41.method5457(1);
		@Pc(45) int local45;
		if ((arg0 & 0x80) != 0) {
			super.aClass135_Sub2_41.method5458(null);
		} else if (this.aClass198_2.aBoolean363) {
			super.aClass135_Sub2_41.method5458(this.aClass198_2.aClass65_Sub1_3);
		} else {
			local45 = super.aClass135_Sub2_41.anInt6779 % 4000 * 16 / 4000;
			super.aClass135_Sub2_41.method5458(this.aClass198_2.aClass65_Sub2Array1[local45]);
		}
		super.aClass135_Sub2_41.method5457(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static178.aFloatArray10, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static178.aFloatArray10, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local45 = arg0 & 0x3;
		if (local45 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local45 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
