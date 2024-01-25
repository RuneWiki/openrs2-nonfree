import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!gha", name = "q", descriptor = "Lclient!jr;")
	private Class164 aClass164_4;

	@OriginalMember(owner = "client!gha", name = "s", descriptor = "F")
	private float aFloat68;

	@OriginalMember(owner = "client!gha", name = "u", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "Lclient!jga;")
	private final Class161 aClass161_4;

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "Lclient!qi;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "client!gha", name = "v", descriptor = "[F")
	private float[] aFloatArray38;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!wh;Lclient!jga;)V")
	public Class11_Sub5(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class161 arg1) {
		super(arg0);
		this.aClass161_4 = arg1;
		if (super.aClass100_Sub3_41.aBoolean719 && super.aClass100_Sub3_41.anInt10610 >= 2) {
			this.aClass273_1 = Static501.method7467("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass100_Sub3_41);
			if (this.aClass273_1 != null) {
				@Pc(39) int[][] local39 = Static488.method8588(0.4F);
				@Pc(50) int[][] local50 = Static488.method8588(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray38 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray38[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray38[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method3327();
			}
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		if (this.aClass164_4 == null) {
			return;
		}
		this.aClass164_4.method4788('\u0000');
		super.aClass100_Sub3_41.method8861(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass100_Sub3_41.aClass154_Sub3_5.method6578(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_41.method8861(0);
		if (this.anInt3749 == super.aClass100_Sub3_41.anInt10585) {
			return;
		}
		@Pc(55) int local55 = super.aClass100_Sub3_41.anInt10585 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray38, local55);
			local55 += 2;
		}
		if (this.aClass161_4.aBoolean354) {
			this.aFloat68 = (float) (super.aClass100_Sub3_41.anInt10585 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3749 = super.aClass100_Sub3_41.anInt10585;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub3_41.method8925(arg0);
		super.aClass100_Sub3_41.method8903(arg1);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass164_4 == null) {
			return;
		}
		super.aClass100_Sub3_41.method8861(1);
		@Pc(42) int local42;
		if ((arg0 & 0x80) != 0) {
			super.aClass100_Sub3_41.method8925((Class3) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass161_4.aBoolean354) {
				super.aClass100_Sub3_41.method8925(this.aClass161_4.aClass3_Sub3_2);
			} else {
				super.aClass100_Sub3_41.method8925(this.aClass161_4.aClass3_Sub2Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass161_4.aBoolean354) {
			super.aClass100_Sub3_41.method8925(this.aClass161_4.aClass3_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat68, 0.0F, 0.0F, 1.0F);
		} else {
			local42 = super.aClass100_Sub3_41.anInt10585 % 4000 * 16 / 4000;
			super.aClass100_Sub3_41.method8925(this.aClass161_4.aClass3_Sub2Array4[local42]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass100_Sub3_41.method8861(0);
		if ((arg0 & 0x40) == 0) {
			Static334.aFloatArray50[1] = super.aClass100_Sub3_41.aFloat222 * super.aClass100_Sub3_41.aFloat219;
			Static334.aFloatArray50[0] = super.aClass100_Sub3_41.aFloat221 * super.aClass100_Sub3_41.aFloat219;
			Static334.aFloatArray50[2] = super.aClass100_Sub3_41.aFloat217 * super.aClass100_Sub3_41.aFloat219;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static334.aFloatArray50, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local42 = arg0 & 0x3;
		if (local42 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local42 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		if (this.aClass164_4 != null) {
			this.aClass164_4.method4788('\u0001');
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8925((Class3) null);
			super.aClass100_Sub3_41.method8861(0);
		}
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)V")
	private void method3327() {
		this.aClass164_4 = new Class164(super.aClass100_Sub3_41, 2);
		this.aClass164_4.method4791(0);
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8891(-16777216);
		super.aClass100_Sub3_41.method8880(7681, 260);
		super.aClass100_Sub3_41.method8923(34166, 0);
		super.aClass100_Sub3_41.method8861(0);
		OpenGL.glBindProgramARB(34336, this.aClass273_1.anInt8193);
		OpenGL.glEnable(34336);
		this.aClass164_4.method4790();
		this.aClass164_4.method4791(1);
		super.aClass100_Sub3_41.method8861(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_41.method8903(0);
		super.aClass100_Sub3_41.method8923(5890, 0);
		super.aClass100_Sub3_41.method8861(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass164_4.method4790();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return true;
	}
}
