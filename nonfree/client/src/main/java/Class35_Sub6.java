import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class35_Sub6 extends Class35 {

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
	private int anInt6285;

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "F")
	private float aFloat122;

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "Lclient!wl;")
	private Class318 aClass318_4;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "Lclient!wq;")
	private final Class319 aClass319_5;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "Lclient!kh;")
	private Class162 aClass162_5;

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "[F")
	private float[] aFloatArray52;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!te;Lclient!wq;)V")
	public Class35_Sub6(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_5 = arg1;
		if (super.aClass9_Sub3_41.aBoolean528 && super.aClass9_Sub3_41.anInt7894 >= 2) {
			this.aClass162_5 = Static326.method5320("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass9_Sub3_41);
			if (this.aClass162_5 != null) {
				@Pc(39) int[][] local39 = Static111.method2440(0.4F);
				@Pc(50) int[][] local50 = Static111.method2440(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray52 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(63) int[] local63 = local39[local58];
					@Pc(67) int[] local67 = local50[local58];
					for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
						this.aFloatArray52[local52++] = (float) local63[local69] / 4096.0F;
						this.aFloatArray52[local52++] = (float) local67[local69] / 4096.0F;
					}
				}
				this.method5449();
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return true;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		if (this.aClass318_4 == null) {
			return;
		}
		this.aClass318_4.method7877('\u0000');
		super.aClass9_Sub3_41.method6660(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass9_Sub3_41.aClass22_Sub2_3.method1960(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass9_Sub3_41.method6660(0);
		if (super.aClass9_Sub3_41.anInt7876 == this.anInt6285) {
			return;
		}
		@Pc(64) int local64 = super.aClass9_Sub3_41.anInt7876 % 5120 * 128 / 5120;
		local64 *= 128;
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local70, this.aFloatArray52, local64);
			local64 += 2;
		}
		if (this.aClass319_5.aBoolean653) {
			this.aFloat122 = (float) (super.aClass9_Sub3_41.anInt7876 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6285 = super.aClass9_Sub3_41.anInt7876;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		super.aClass9_Sub3_41.method6701(arg1);
		super.aClass9_Sub3_41.method6670(arg0);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass318_4 == null) {
			return;
		}
		super.aClass9_Sub3_41.method6660(1);
		@Pc(75) int local75;
		if ((arg1 & 0x80) != 0) {
			super.aClass9_Sub3_41.method6701(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass319_5.aBoolean653) {
				super.aClass9_Sub3_41.method6701(this.aClass319_5.aClass20_Sub1_3);
			} else {
				super.aClass9_Sub3_41.method6701(this.aClass319_5.aClass20_Sub3Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass319_5.aBoolean653) {
			super.aClass9_Sub3_41.method6701(this.aClass319_5.aClass20_Sub1_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat122, 0.0F, 0.0F, 1.0F);
		} else {
			local75 = super.aClass9_Sub3_41.anInt7876 % 4000 * 16 / 4000;
			super.aClass9_Sub3_41.method6701(this.aClass319_5.aClass20_Sub3Array4[local75]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass9_Sub3_41.method6660(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static231.aFloatArray62, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static231.aFloatArray62, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local75 = arg1 & 0x3;
		if (local75 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local75 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		if (this.aClass318_4 != null) {
			this.aClass318_4.method7877('\u0001');
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6701(null);
			super.aClass9_Sub3_41.method6660(0);
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V")
	private void method5449() {
		this.aClass318_4 = new Class318(super.aClass9_Sub3_41, 2);
		this.aClass318_4.method7880(0);
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6664(-16777216);
		super.aClass9_Sub3_41.method6732(260, 7681);
		super.aClass9_Sub3_41.method6656(34166, 0);
		super.aClass9_Sub3_41.method6660(0);
		OpenGL.glBindProgramARB(34336, this.aClass162_5.anInt4931);
		OpenGL.glEnable(34336);
		this.aClass318_4.method7881();
		this.aClass318_4.method7880(1);
		super.aClass9_Sub3_41.method6660(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass9_Sub3_41.method6670(0);
		super.aClass9_Sub3_41.method6656(5890, 0);
		super.aClass9_Sub3_41.method6660(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass318_4.method7881();
	}
}
