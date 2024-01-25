import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "Lclient!eaa;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
	private int anInt1310;

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "F")
	private float aFloat29;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "Lclient!ud;")
	private final Class335 aClass335_1;

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "Lclient!vk;")
	private Class351 aClass351_1;

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "[F")
	private float[] aFloatArray9;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!vj;Lclient!ud;)V")
	public Class46_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class335 arg1) {
		super(arg0);
		this.aClass335_1 = arg1;
		if (super.aClass45_Sub3_40.aBoolean702 && super.aClass45_Sub3_40.anInt9072 >= 2) {
			this.aClass351_1 = Static138.method2696(super.aClass45_Sub3_40, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass351_1 != null) {
				@Pc(41) int[][] local41 = Static39.method649(0.4F);
				@Pc(52) int[][] local52 = Static39.method649(0.4F);
				this.aFloatArray9 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray9[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray9[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method1239();
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return true;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass45_Sub3_40.method7475(arg1);
		super.aClass45_Sub3_40.method7500(arg0);
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		if (this.aClass79_1 != null) {
			this.aClass79_1.method1924('\u0001');
			super.aClass45_Sub3_40.method7510(1);
			super.aClass45_Sub3_40.method7475(null);
			super.aClass45_Sub3_40.method7510(0);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		if (this.aClass79_1 == null) {
			return;
		}
		this.aClass79_1.method1924('\u0000');
		super.aClass45_Sub3_40.method7510(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass45_Sub3_40.aClass11_Sub2_5.method4276(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass45_Sub3_40.method7510(0);
		if (super.aClass45_Sub3_40.anInt9042 == this.anInt1310) {
			return;
		}
		@Pc(55) int local55 = super.aClass45_Sub3_40.anInt9042 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray9, local55);
			local55 += 2;
		}
		if (this.aClass335_1.aBoolean649) {
			this.aFloat29 = (float) (super.aClass45_Sub3_40.anInt9042 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt1310 = super.aClass45_Sub3_40.anInt9042;
	}

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)V")
	private void method1239() {
		this.aClass79_1 = new Class79(super.aClass45_Sub3_40, 2);
		this.aClass79_1.method1921(0);
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7458(-16777216);
		super.aClass45_Sub3_40.method7491(260, 7681);
		super.aClass45_Sub3_40.method7450(0, 34166);
		super.aClass45_Sub3_40.method7510(0);
		OpenGL.glBindProgramARB(34336, this.aClass351_1.anInt9092);
		OpenGL.glEnable(34336);
		this.aClass79_1.method1925();
		this.aClass79_1.method1921(1);
		super.aClass45_Sub3_40.method7510(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass45_Sub3_40.method7500(0);
		super.aClass45_Sub3_40.method7450(0, 5890);
		super.aClass45_Sub3_40.method7510(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass79_1.method1925();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass79_1 == null) {
			return;
		}
		super.aClass45_Sub3_40.method7510(1);
		@Pc(65) int local65;
		if ((arg1 & 0x80) != 0) {
			super.aClass45_Sub3_40.method7475(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass335_1.aBoolean649) {
				super.aClass45_Sub3_40.method7475(this.aClass335_1.aClass24_Sub2_2);
			} else {
				super.aClass45_Sub3_40.method7475(this.aClass335_1.aClass24_Sub1Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass335_1.aBoolean649) {
			super.aClass45_Sub3_40.method7475(this.aClass335_1.aClass24_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat29, 0.0F, 0.0F, 1.0F);
		} else {
			local65 = super.aClass45_Sub3_40.anInt9042 % 4000 * 16 / 4000;
			super.aClass45_Sub3_40.method7475(this.aClass335_1.aClass24_Sub1Array3[local65]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass45_Sub3_40.method7510(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static77.aFloatArray13, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static77.aFloatArray13, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local65 = arg1 & 0x3;
		if (local65 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local65 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
