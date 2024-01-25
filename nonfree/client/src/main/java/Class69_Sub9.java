import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class69_Sub9 extends Class69 {

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "F")
	private float aFloat198;

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "Lclient!kca;")
	private Class203 aClass203_6;

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private int anInt9953;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "Lclient!au;")
	private final Class27 aClass27_6;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "Lclient!v;")
	private Class371 aClass371_5;

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "[F")
	private float[] aFloatArray77;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!ml;Lclient!au;)V")
	public Class69_Sub9(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class27 arg1) {
		super(arg0);
		this.aClass27_6 = arg1;
		if (super.aClass75_Sub3_41.aBoolean486 && super.aClass75_Sub3_41.anInt6574 >= 2) {
			this.aClass371_5 = Static135.method2588("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass75_Sub3_41);
			if (this.aClass371_5 != null) {
				@Pc(46) int[][] local46 = Static49.method593(0.4F);
				@Pc(57) int[][] local57 = Static49.method593(0.4F);
				@Pc(59) int local59 = 0;
				this.aFloatArray77 = new float[32768];
				for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
					@Pc(71) int[] local71 = local46[local65];
					@Pc(75) int[] local75 = local57[local65];
					for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
						this.aFloatArray77[local59++] = (float) local71[local77] / 4096.0F;
						this.aFloatArray77[local59++] = (float) local75[local77] / 4096.0F;
					}
				}
				this.method8640();
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		if (this.aClass203_6 != null) {
			this.aClass203_6.method4855('\u0001');
			super.aClass75_Sub3_41.method5775(1);
			super.aClass75_Sub3_41.method5774((Class44) null);
			super.aClass75_Sub3_41.method5775(0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return true;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		if (this.aClass203_6 == null) {
			return;
		}
		this.aClass203_6.method4855('\u0000');
		super.aClass75_Sub3_41.method5775(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass75_Sub3_41.aClass109_Sub2_5.method3695(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub3_41.method5775(0);
		if (this.anInt9953 == super.aClass75_Sub3_41.anInt6532) {
			return;
		}
		@Pc(64) int local64 = super.aClass75_Sub3_41.anInt6532 % 5000 * 128 / 5000;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray77, local64);
			local64 += 2;
		}
		if (this.aClass27_6.aBoolean31) {
			this.aFloat198 = (float) (super.aClass75_Sub3_41.anInt6532 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt9953 = super.aClass75_Sub3_41.anInt6532;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		super.aClass75_Sub3_41.method5774(arg1);
		super.aClass75_Sub3_41.method5787(arg0);
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	private void method8640() {
		this.aClass203_6 = new Class203(super.aClass75_Sub3_41, 2);
		this.aClass203_6.method4857(0);
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5794(-16777216);
		super.aClass75_Sub3_41.method5784(7681, 260);
		super.aClass75_Sub3_41.method5806(0, 34166);
		super.aClass75_Sub3_41.method5775(0);
		OpenGL.glBindProgramARB(34336, this.aClass371_5.anInt9907);
		OpenGL.glEnable(34336);
		this.aClass203_6.method4854();
		this.aClass203_6.method4857(1);
		super.aClass75_Sub3_41.method5775(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub3_41.method5787(0);
		super.aClass75_Sub3_41.method5806(0, 5890);
		super.aClass75_Sub3_41.method5775(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass203_6.method4854();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass203_6 == null) {
			return;
		}
		super.aClass75_Sub3_41.method5775(1);
		@Pc(103) int local103;
		if ((arg0 & 0x80) != 0) {
			super.aClass75_Sub3_41.method5774((Class44) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass27_6.aBoolean31) {
				super.aClass75_Sub3_41.method5774(this.aClass27_6.aClass44_Sub3_1);
			} else {
				super.aClass75_Sub3_41.method5774(this.aClass27_6.aClass44_Sub1Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass27_6.aBoolean31) {
			super.aClass75_Sub3_41.method5774(this.aClass27_6.aClass44_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat198, 0.0F, 0.0F, 1.0F);
		} else {
			local103 = super.aClass75_Sub3_41.anInt6532 % 4000 * 16 / 4000;
			super.aClass75_Sub3_41.method5774(this.aClass27_6.aClass44_Sub1Array1[local103]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass75_Sub3_41.method5775(0);
		if ((arg0 & 0x40) == 0) {
			Static97.aFloatArray6[0] = super.aClass75_Sub3_41.aFloat123 * super.aClass75_Sub3_41.aFloat132;
			Static97.aFloatArray6[1] = super.aClass75_Sub3_41.aFloat128 * super.aClass75_Sub3_41.aFloat132;
			Static97.aFloatArray6[2] = super.aClass75_Sub3_41.aFloat114 * super.aClass75_Sub3_41.aFloat132;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static97.aFloatArray6, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local103 = arg0 & 0x3;
		if (local103 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local103 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
