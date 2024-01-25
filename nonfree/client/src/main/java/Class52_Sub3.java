import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class52_Sub3 extends Class52 {

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "[I")
	public static final int[] anIntArray383 = new int[32];

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	private int anInt3258;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!hea;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "Lclient!pba;")
	private final Class240 aClass240_2;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "Lclient!vl;")
	private Class335 aClass335_1;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "[F")
	private float[] aFloatArray13;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray383[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!pea;Lclient!pba;)V")
	public Class52_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class240 arg1) {
		super(arg0);
		this.aClass240_2 = arg1;
		if (super.aClass121_Sub3_43.aBoolean462 && super.aClass121_Sub3_43.anInt6813 >= 2) {
			this.aClass335_1 = Static334.method5101("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass121_Sub3_43);
			if (this.aClass335_1 != null) {
				@Pc(41) int[][] local41 = Static153.method2252(0.4F);
				@Pc(52) int[][] local52 = Static153.method2252(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray13 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray13[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray13[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method2782();
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		super.aClass121_Sub3_43.method5713(arg0);
		super.aClass121_Sub3_43.method5684(arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass131_2 == null) {
			return;
		}
		super.aClass121_Sub3_43.method5648(1);
		@Pc(71) int local71;
		if ((arg0 & 0x80) != 0) {
			super.aClass121_Sub3_43.method5713(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass240_2.aBoolean444) {
				super.aClass121_Sub3_43.method5713(this.aClass240_2.aClass35_Sub1_2);
			} else {
				super.aClass121_Sub3_43.method5713(this.aClass240_2.aClass35_Sub3Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass240_2.aBoolean444) {
			super.aClass121_Sub3_43.method5713(this.aClass240_2.aClass35_Sub1_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat45, 0.0F, 0.0F, 1.0F);
		} else {
			local71 = super.aClass121_Sub3_43.anInt6800 % 4000 * 16 / 4000;
			super.aClass121_Sub3_43.method5713(this.aClass240_2.aClass35_Sub3Array3[local71]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass121_Sub3_43.method5648(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static508.aFloatArray53, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static508.aFloatArray53, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local71 = arg0 & 0x3;
		if (local71 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local71 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	private void method2782() {
		this.aClass131_2 = new Class131(super.aClass121_Sub3_43, 2);
		this.aClass131_2.method2755(0);
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5679(-16777216);
		super.aClass121_Sub3_43.method5659(7681, 260);
		super.aClass121_Sub3_43.method5717(0, 34166);
		super.aClass121_Sub3_43.method5648(0);
		OpenGL.glBindProgramARB(34336, this.aClass335_1.anInt9209);
		OpenGL.glEnable(34336);
		this.aClass131_2.method2754();
		this.aClass131_2.method2755(1);
		super.aClass121_Sub3_43.method5648(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub3_43.method5684(0);
		super.aClass121_Sub3_43.method5717(0, 5890);
		super.aClass121_Sub3_43.method5648(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass131_2.method2754();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		if (this.aClass131_2 == null) {
			return;
		}
		this.aClass131_2.method2752('\u0000');
		super.aClass121_Sub3_43.method5648(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass121_Sub3_43.aClass34_Sub2_3.method2285(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub3_43.method5648(0);
		if (this.anInt3258 == super.aClass121_Sub3_43.anInt6800) {
			return;
		}
		@Pc(65) int local65 = super.aClass121_Sub3_43.anInt6800 % 5120 * 128 / 5120;
		local65 *= 128;
		for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local71, this.aFloatArray13, local65);
			local65 += 2;
		}
		if (this.aClass240_2.aBoolean444) {
			this.aFloat45 = (float) (super.aClass121_Sub3_43.anInt6800 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3258 = super.aClass121_Sub3_43.anInt6800;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		if (this.aClass131_2 != null) {
			this.aClass131_2.method2752('\u0001');
			super.aClass121_Sub3_43.method5648(1);
			super.aClass121_Sub3_43.method5713(null);
			super.aClass121_Sub3_43.method5648(0);
		}
	}
}
