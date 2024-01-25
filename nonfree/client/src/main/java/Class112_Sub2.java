import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class112_Sub2 extends Class112 {

	@OriginalMember(owner = "client!ija", name = "x", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
	private int anInt4233;

	@OriginalMember(owner = "client!ija", name = "i", descriptor = "Lclient!pha;")
	private Class290 aClass290_2;

	@OriginalMember(owner = "client!ija", name = "q", descriptor = "Lclient!qf;")
	private final Class308 aClass308_1;

	@OriginalMember(owner = "client!ija", name = "k", descriptor = "Lclient!cd;")
	private Class56 aClass56_1;

	@OriginalMember(owner = "client!ija", name = "B", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(Lclient!uja;Lclient!qf;)V")
	public Class112_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class308 arg1) {
		super(arg0);
		this.aClass308_1 = arg1;
		if (super.aClass145_Sub3_43.aBoolean863 && super.aClass145_Sub3_43.anInt10161 >= 2) {
			this.aClass56_1 = Static560.method7801("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass145_Sub3_43);
			if (this.aClass56_1 != null) {
				@Pc(46) int[][] local46 = Static45.method594(0.4F);
				@Pc(57) int[][] local57 = Static45.method594(0.4F);
				@Pc(59) int local59 = 0;
				this.aFloatArray24 = new float[32768];
				for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
					@Pc(71) int[] local71 = local46[local65];
					@Pc(75) int[] local75 = local57[local65];
					for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
						this.aFloatArray24[local59++] = (float) local71[local77] / 4096.0F;
						this.aFloatArray24[local59++] = (float) local75[local77] / 4096.0F;
					}
				}
				this.method3836();
			}
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		super.aClass145_Sub3_43.method8872(arg0);
		super.aClass145_Sub3_43.method8900(arg1);
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		if (this.aClass290_2 == null) {
			return;
		}
		this.aClass290_2.method6987('\u0000');
		super.aClass145_Sub3_43.method8859(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass145_Sub3_43.aClass86_Sub1_5.method1810(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass145_Sub3_43.method8859(0);
		if (super.aClass145_Sub3_43.anInt10142 == this.anInt4233) {
			return;
		}
		@Pc(64) int local64 = super.aClass145_Sub3_43.anInt10142 % 5000 * 128 / 5000;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray24, local64);
			local64 += 2;
		}
		if (this.aClass308_1.aBoolean703) {
			this.aFloat51 = (float) (super.aClass145_Sub3_43.anInt10142 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4233 = super.aClass145_Sub3_43.anInt10142;
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass290_2 == null) {
			return;
		}
		super.aClass145_Sub3_43.method8859(1);
		@Pc(63) int local63;
		if ((arg1 & 0x80) != 0) {
			super.aClass145_Sub3_43.method8872((Class64) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass308_1.aBoolean703) {
				super.aClass145_Sub3_43.method8872(this.aClass308_1.aClass64_Sub1_1);
			} else {
				super.aClass145_Sub3_43.method8872(this.aClass308_1.aClass64_Sub4Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass308_1.aBoolean703) {
			super.aClass145_Sub3_43.method8872(this.aClass308_1.aClass64_Sub1_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat51, 0.0F, 0.0F, 1.0F);
		} else {
			local63 = super.aClass145_Sub3_43.anInt10142 % 4000 * 16 / 4000;
			super.aClass145_Sub3_43.method8872(this.aClass308_1.aClass64_Sub4Array3[local63]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass145_Sub3_43.method8859(0);
		if ((arg1 & 0x40) == 0) {
			Static498.aFloatArray57[1] = super.aClass145_Sub3_43.aFloat158 * super.aClass145_Sub3_43.aFloat168;
			Static498.aFloatArray57[2] = super.aClass145_Sub3_43.aFloat173 * super.aClass145_Sub3_43.aFloat158;
			Static498.aFloatArray57[0] = super.aClass145_Sub3_43.aFloat157 * super.aClass145_Sub3_43.aFloat158;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static498.aFloatArray57, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local63 = arg1 & 0x3;
		if (local63 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local63 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "(I)V")
	private void method3836() {
		this.aClass290_2 = new Class290(super.aClass145_Sub3_43, 2);
		this.aClass290_2.method6989(0);
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8912(-16777216);
		super.aClass145_Sub3_43.method8897(7681, 260);
		super.aClass145_Sub3_43.method8857(34166, 0);
		super.aClass145_Sub3_43.method8859(0);
		OpenGL.glBindProgramARB(34336, this.aClass56_1.anInt1316);
		OpenGL.glEnable(34336);
		this.aClass290_2.method6988();
		this.aClass290_2.method6989(1);
		super.aClass145_Sub3_43.method8859(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass145_Sub3_43.method8900(0);
		super.aClass145_Sub3_43.method8857(5890, 0);
		super.aClass145_Sub3_43.method8859(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass290_2.method6988();
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return true;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		if (this.aClass290_2 != null) {
			this.aClass290_2.method6987('\u0001');
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8872((Class64) null);
			super.aClass145_Sub3_43.method8859(0);
		}
	}
}
