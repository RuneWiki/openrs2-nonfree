import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "F")
	private float aFloat196;

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
	private int anInt6892;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "Lclient!qt;")
	private Class279 aClass279_4;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Lclient!wca;")
	private final Class353 aClass353_5;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "Lclient!qb;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "[F")
	private float[] aFloatArray51;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!kga;Lclient!wca;)V")
	public Class20_Sub7(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		this.aClass353_5 = arg1;
		if (super.aClass44_Sub3_42.aBoolean401 && super.aClass44_Sub3_42.anInt5489 >= 2) {
			this.aClass267_1 = Static295.method8182("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass44_Sub3_42);
			if (this.aClass267_1 != null) {
				@Pc(39) int[][] local39 = Static175.method3189(0.4F);
				@Pc(50) int[][] local50 = Static175.method3189(0.4F);
				this.aFloatArray51 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray51[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray51[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5728();
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		if (this.aClass279_4 != null) {
			this.aClass279_4.method6798('\u0001');
			super.aClass44_Sub3_42.method4648(1);
			super.aClass44_Sub3_42.method4605(null);
			super.aClass44_Sub3_42.method4648(0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		super.aClass44_Sub3_42.method4605(arg0);
		super.aClass44_Sub3_42.method4658(arg1);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass279_4 == null) {
			return;
		}
		super.aClass44_Sub3_42.method4648(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass44_Sub3_42.method4605(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass353_5.aBoolean708) {
				super.aClass44_Sub3_42.method4605(this.aClass353_5.aClass77_Sub2_1);
			} else {
				super.aClass44_Sub3_42.method4605(this.aClass353_5.aClass77_Sub1Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass353_5.aBoolean708) {
			super.aClass44_Sub3_42.method4605(this.aClass353_5.aClass77_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat196, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(95) int local95 = super.aClass44_Sub3_42.anInt5471 % 4000 * 16 / 4000;
			super.aClass44_Sub3_42.method4605(this.aClass353_5.aClass77_Sub1Array4[local95]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass44_Sub3_42.method4648(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static511.aFloatArray59, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static511.aFloatArray59, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(153) int local153 = arg0 & 0x3;
		if (local153 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local153 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		if (this.aClass279_4 == null) {
			return;
		}
		this.aClass279_4.method6798('\u0000');
		super.aClass44_Sub3_42.method4648(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass44_Sub3_42.bf.method935(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass44_Sub3_42.method4648(0);
		if (super.aClass44_Sub3_42.anInt5471 == this.anInt6892) {
			return;
		}
		@Pc(57) int local57 = super.aClass44_Sub3_42.anInt5471 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray51, local57);
			local57 += 2;
		}
		if (this.aClass353_5.aBoolean708) {
			this.aFloat196 = (float) (super.aClass44_Sub3_42.anInt5471 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6892 = super.aClass44_Sub3_42.anInt5471;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	private void method5728() {
		this.aClass279_4 = new Class279(super.aClass44_Sub3_42, 2);
		this.aClass279_4.method6794(0);
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4670(-16777216);
		super.aClass44_Sub3_42.method4621(260, 7681);
		super.aClass44_Sub3_42.method4611(34166, 0);
		super.aClass44_Sub3_42.method4648(0);
		OpenGL.glBindProgramARB(34336, this.aClass267_1.anInt7827);
		OpenGL.glEnable(34336);
		this.aClass279_4.method6799();
		this.aClass279_4.method6794(1);
		super.aClass44_Sub3_42.method4648(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass44_Sub3_42.method4658(0);
		super.aClass44_Sub3_42.method4611(5890, 0);
		super.aClass44_Sub3_42.method4648(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass279_4.method6799();
	}
}
