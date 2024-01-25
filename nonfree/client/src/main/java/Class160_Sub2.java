import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class160_Sub2 extends Class160 {

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "Lclient!fga;")
	private Class113 aClass113_2;

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "F")
	private float aFloat122;

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
	private int anInt4946;

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "Lclient!pia;")
	private final Class288 aClass288_2;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "Lclient!nl;")
	private Class255 aClass255_1;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "[F")
	private float[] aFloatArray43;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!vf;Lclient!pia;)V")
	public Class160_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class288 arg1) {
		super(arg0);
		this.aClass288_2 = arg1;
		if (super.aClass100_Sub3_40.aBoolean725 && super.aClass100_Sub3_40.anInt10285 >= 2) {
			this.aClass255_1 = Static524.method7141(super.aClass100_Sub3_40, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass255_1 != null) {
				@Pc(46) int[][] local46 = Static673.method9142(0.4F);
				@Pc(57) int[][] local57 = Static673.method9142(0.4F);
				this.aFloatArray43 = new float[32768];
				@Pc(63) int local63 = 0;
				for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
					@Pc(71) int[] local71 = local46[local65];
					@Pc(75) int[] local75 = local57[local65];
					for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
						this.aFloatArray43[local63++] = (float) local71[local77] / 4096.0F;
						this.aFloatArray43[local63++] = (float) local75[local77] / 4096.0F;
					}
				}
				this.method4479();
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		if (this.aClass113_2 == null) {
			return;
		}
		this.aClass113_2.method2793('\u0000');
		super.aClass100_Sub3_40.method8678(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass100_Sub3_40.aClass10_Sub3_5.method2819(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_40.method8678(0);
		if (this.anInt4946 == super.aClass100_Sub3_40.anInt10257) {
			return;
		}
		@Pc(52) int local52 = super.aClass100_Sub3_40.anInt10257 % 5000 * 128 / 5000;
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local54, this.aFloatArray43, local52);
			local52 += 2;
		}
		if (this.aClass288_2.aBoolean504) {
			this.aFloat122 = (float) (super.aClass100_Sub3_40.anInt10257 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4946 = super.aClass100_Sub3_40.anInt10257;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.aClass113_2 != null) {
			this.aClass113_2.method2793('\u0001');
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8743((Class29) null);
			super.aClass100_Sub3_40.method8678(0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		super.aClass100_Sub3_40.method8743(arg0);
		super.aClass100_Sub3_40.method8671(arg1);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
	private void method4479() {
		this.aClass113_2 = new Class113(super.aClass100_Sub3_40, 2);
		this.aClass113_2.method2789(0);
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8704(-16777216);
		super.aClass100_Sub3_40.method8738(7681, 260);
		super.aClass100_Sub3_40.method8673(34166, 0);
		super.aClass100_Sub3_40.method8678(0);
		OpenGL.glBindProgramARB(34336, this.aClass255_1.anInt6730);
		OpenGL.glEnable(34336);
		this.aClass113_2.method2790();
		this.aClass113_2.method2789(1);
		super.aClass100_Sub3_40.method8678(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_40.method8671(0);
		super.aClass100_Sub3_40.method8673(5890, 0);
		super.aClass100_Sub3_40.method8678(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass113_2.method2790();
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass113_2 == null) {
			return;
		}
		super.aClass100_Sub3_40.method8678(1);
		@Pc(73) int local73;
		if ((arg0 & 0x80) != 0) {
			super.aClass100_Sub3_40.method8743((Class29) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass288_2.aBoolean504) {
				super.aClass100_Sub3_40.method8743(this.aClass288_2.aClass29_Sub1_3);
			} else {
				super.aClass100_Sub3_40.method8743(this.aClass288_2.aClass29_Sub3Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass288_2.aBoolean504) {
			super.aClass100_Sub3_40.method8743(this.aClass288_2.aClass29_Sub1_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat122, 0.0F, 0.0F, 1.0F);
		} else {
			local73 = super.aClass100_Sub3_40.anInt10257 % 4000 * 16 / 4000;
			super.aClass100_Sub3_40.method8743(this.aClass288_2.aClass29_Sub3Array3[local73]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass100_Sub3_40.method8678(0);
		if ((arg0 & 0x40) == 0) {
			Static147.aFloatArray26[1] = super.aClass100_Sub3_40.aFloat196 * super.aClass100_Sub3_40.aFloat199;
			Static147.aFloatArray26[0] = super.aClass100_Sub3_40.aFloat201 * super.aClass100_Sub3_40.aFloat196;
			Static147.aFloatArray26[2] = super.aClass100_Sub3_40.aFloat192 * super.aClass100_Sub3_40.aFloat196;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static147.aFloatArray26, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local73 = arg0 & 0x3;
		if (local73 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local73 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return true;
	}
}
