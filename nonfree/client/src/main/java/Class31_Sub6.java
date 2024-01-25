import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class31_Sub6 extends Class31 {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	private int anInt9684;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Lclient!bfa;")
	private Class30 aClass30_3;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "F")
	private float aFloat184;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "Lclient!an;")
	private final Class19 aClass19_5;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "Lclient!hu;")
	private Class154 aClass154_5;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "[F")
	private float[] aFloatArray68;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!lea;Lclient!an;)V")
	public Class31_Sub6(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class19 arg1) {
		super(arg0);
		this.aClass19_5 = arg1;
		if (super.aClass101_Sub2_43.aBoolean477 && super.aClass101_Sub2_43.anInt6339 >= 2) {
			this.aClass154_5 = Static611.method9195(super.aClass101_Sub2_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass154_5 != null) {
				@Pc(41) int[][] local41 = Static446.method7246(0.4F);
				@Pc(52) int[][] local52 = Static446.method7246(0.4F);
				this.aFloatArray68 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray68[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray68[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method8486();
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass30_3 == null) {
			return;
		}
		super.aClass101_Sub2_43.method5627(1);
		@Pc(85) int local85;
		if ((arg0 & 0x80) != 0) {
			super.aClass101_Sub2_43.method5690((Class50) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass19_5.aBoolean25) {
				super.aClass101_Sub2_43.method5690(this.aClass19_5.aClass50_Sub1_2);
			} else {
				super.aClass101_Sub2_43.method5690(this.aClass19_5.aClass50_Sub4Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass19_5.aBoolean25) {
			super.aClass101_Sub2_43.method5690(this.aClass19_5.aClass50_Sub1_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat184, 0.0F, 0.0F, 1.0F);
		} else {
			local85 = super.aClass101_Sub2_43.anInt6314 % 4000 * 16 / 4000;
			super.aClass101_Sub2_43.method5690(this.aClass19_5.aClass50_Sub4Array2[local85]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass101_Sub2_43.method5627(0);
		if ((arg0 & 0x40) == 0) {
			Static179.aFloatArray20[0] = super.aClass101_Sub2_43.aFloat133 * super.aClass101_Sub2_43.aFloat141;
			Static179.aFloatArray20[2] = super.aClass101_Sub2_43.aFloat133 * super.aClass101_Sub2_43.aFloat125;
			Static179.aFloatArray20[1] = super.aClass101_Sub2_43.aFloat133 * super.aClass101_Sub2_43.aFloat127;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static179.aFloatArray20, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local85 = arg0 & 0x3;
		if (local85 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local85 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		if (this.aClass30_3 != null) {
			this.aClass30_3.method940('\u0001');
			super.aClass101_Sub2_43.method5627(1);
			super.aClass101_Sub2_43.method5690((Class50) null);
			super.aClass101_Sub2_43.method5627(0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		if (this.aClass30_3 == null) {
			return;
		}
		this.aClass30_3.method940('\u0000');
		super.aClass101_Sub2_43.method5627(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass101_Sub2_43.aClass76_Sub1_5.method4554(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass101_Sub2_43.method5627(0);
		if (this.anInt9684 == super.aClass101_Sub2_43.anInt6314) {
			return;
		}
		@Pc(57) int local57 = super.aClass101_Sub2_43.anInt6314 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray68, local57);
			local57 += 2;
		}
		if (this.aClass19_5.aBoolean25) {
			this.aFloat184 = (float) (super.aClass101_Sub2_43.anInt6314 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt9684 = super.aClass101_Sub2_43.anInt6314;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	private void method8486() {
		this.aClass30_3 = new Class30(super.aClass101_Sub2_43, 2);
		this.aClass30_3.method944(0);
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5649(-16777216);
		super.aClass101_Sub2_43.method5665(260, 7681);
		super.aClass101_Sub2_43.method5680(0, 34166);
		super.aClass101_Sub2_43.method5627(0);
		OpenGL.glBindProgramARB(34336, this.aClass154_5.anInt4716);
		OpenGL.glEnable(34336);
		this.aClass30_3.method941();
		this.aClass30_3.method944(1);
		super.aClass101_Sub2_43.method5627(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass101_Sub2_43.method5681(0);
		super.aClass101_Sub2_43.method5680(0, 5890);
		super.aClass101_Sub2_43.method5627(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass30_3.method941();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub2_43.method5690(arg0);
		super.aClass101_Sub2_43.method5681(arg1);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
	}
}
