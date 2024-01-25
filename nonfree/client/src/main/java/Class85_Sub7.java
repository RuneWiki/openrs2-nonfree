import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class85_Sub7 extends Class85 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	private int anInt6984;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "F")
	private float aFloat185;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!qm;")
	private Class285 aClass285_6;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!ud;")
	private final Class329 aClass329_4;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!nj;")
	private Class236 aClass236_5;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "[F")
	private float[] aFloatArray59;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!lj;Lclient!ud;)V")
	public Class85_Sub7(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_4 = arg1;
		if (super.aClass78_Sub3_37.aBoolean429 && super.aClass78_Sub3_37.anInt5581 >= 2) {
			this.aClass236_5 = Static297.method4407(super.aClass78_Sub3_37, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass236_5 != null) {
				@Pc(41) int[][] local41 = Static376.method1507(0.4F);
				@Pc(52) int[][] local52 = Static376.method1507(0.4F);
				this.aFloatArray59 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray59[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray59[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method5648();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	private void method5648() {
		this.aClass285_6 = new Class285(super.aClass78_Sub3_37, 2);
		this.aClass285_6.method6137(0);
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4491(-16777216);
		super.aClass78_Sub3_37.method4539(260, 7681);
		super.aClass78_Sub3_37.method4527(0, 34166);
		super.aClass78_Sub3_37.method4549(0);
		OpenGL.glBindProgramARB(34336, this.aClass236_5.anInt6426);
		OpenGL.glEnable(34336);
		this.aClass285_6.method6133();
		this.aClass285_6.method6137(1);
		super.aClass78_Sub3_37.method4549(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass78_Sub3_37.method4534(0);
		super.aClass78_Sub3_37.method4527(0, 5890);
		super.aClass78_Sub3_37.method4549(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass285_6.method6133();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		super.aClass78_Sub3_37.method4535(arg1);
		super.aClass78_Sub3_37.method4534(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass285_6 == null) {
			return;
		}
		super.aClass78_Sub3_37.method4549(1);
		@Pc(56) int local56;
		if ((arg0 & 0x80) != 0) {
			super.aClass78_Sub3_37.method4535(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass329_4.aBoolean670) {
				super.aClass78_Sub3_37.method4535(this.aClass329_4.aClass46_Sub3_2);
			} else {
				super.aClass78_Sub3_37.method4535(this.aClass329_4.aClass46_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass329_4.aBoolean670) {
			super.aClass78_Sub3_37.method4535(this.aClass329_4.aClass46_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat185, 0.0F, 0.0F, 1.0F);
		} else {
			local56 = super.aClass78_Sub3_37.anInt5559 % 4000 * 16 / 4000;
			super.aClass78_Sub3_37.method4535(this.aClass329_4.aClass46_Sub2Array3[local56]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass78_Sub3_37.method4549(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static227.aFloatArray36, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static227.aFloatArray36, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local56 = arg0 & 0x3;
		if (local56 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local56 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		if (this.aClass285_6 == null) {
			return;
		}
		this.aClass285_6.method6136('\u0000');
		super.aClass78_Sub3_37.method4549(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass78_Sub3_37.aClass34_Sub2_4.method971(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass78_Sub3_37.method4549(0);
		if (this.anInt6984 == super.aClass78_Sub3_37.anInt5559) {
			return;
		}
		@Pc(55) int local55 = super.aClass78_Sub3_37.anInt5559 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray59, local55);
			local55 += 2;
		}
		if (this.aClass329_4.aBoolean670) {
			this.aFloat185 = (float) (super.aClass78_Sub3_37.anInt5559 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6984 = super.aClass78_Sub3_37.anInt5559;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		if (this.aClass285_6 != null) {
			this.aClass285_6.method6136('\u0001');
			super.aClass78_Sub3_37.method4549(1);
			super.aClass78_Sub3_37.method4535(null);
			super.aClass78_Sub3_37.method4549(0);
		}
	}
}
