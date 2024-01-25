import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class105_Sub7 extends Class105 {

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	private int anInt6997;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Lclient!uq;")
	private Class334 aClass334_4;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "Lclient!ul;")
	private final Class330 aClass330_4;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!ru;")
	private Class296 aClass296_5;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "[F")
	private float[] aFloatArray47;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!kfa;Lclient!ul;)V")
	public Class105_Sub7(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		this.aClass330_4 = arg1;
		if (super.aClass7_Sub2_41.aBoolean378 && super.aClass7_Sub2_41.anInt5625 >= 2) {
			this.aClass296_5 = Static244.method7174("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass7_Sub2_41);
			if (this.aClass296_5 != null) {
				@Pc(39) int[][] local39 = Static338.method5151(0.4F);
				@Pc(50) int[][] local50 = Static338.method5151(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray47 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray47[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray47[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5475();
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass334_4 == null) {
			return;
		}
		super.aClass7_Sub2_41.method4326(1);
		@Pc(63) int local63;
		if ((arg1 & 0x80) != 0) {
			super.aClass7_Sub2_41.method4313(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass330_4.aBoolean660) {
				super.aClass7_Sub2_41.method4313(this.aClass330_4.aClass3_Sub3_1);
			} else {
				super.aClass7_Sub2_41.method4313(this.aClass330_4.aClass3_Sub2Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass330_4.aBoolean660) {
			super.aClass7_Sub2_41.method4313(this.aClass330_4.aClass3_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat163, 0.0F, 0.0F, 1.0F);
		} else {
			local63 = super.aClass7_Sub2_41.anInt5597 % 4000 * 16 / 4000;
			super.aClass7_Sub2_41.method4313(this.aClass330_4.aClass3_Sub2Array4[local63]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass7_Sub2_41.method4326(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static114.aFloatArray26, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static114.aFloatArray26, 0);
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

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass7_Sub2_41.method4313(arg1);
		super.aClass7_Sub2_41.method4288(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return true;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	private void method5475() {
		this.aClass334_4 = new Class334(super.aClass7_Sub2_41, 2);
		this.aClass334_4.method7573(0);
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4315(-16777216);
		super.aClass7_Sub2_41.method4346(260, 7681);
		super.aClass7_Sub2_41.method4276(34166, 0);
		super.aClass7_Sub2_41.method4326(0);
		OpenGL.glBindProgramARB(34336, this.aClass296_5.anInt8883);
		OpenGL.glEnable(34336);
		this.aClass334_4.method7574();
		this.aClass334_4.method7573(1);
		super.aClass7_Sub2_41.method4326(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass7_Sub2_41.method4288(0);
		super.aClass7_Sub2_41.method4276(5890, 0);
		super.aClass7_Sub2_41.method4326(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass334_4.method7574();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		if (this.aClass334_4 != null) {
			this.aClass334_4.method7575('\u0001');
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4313(null);
			super.aClass7_Sub2_41.method4326(0);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		if (this.aClass334_4 == null) {
			return;
		}
		this.aClass334_4.method7575('\u0000');
		super.aClass7_Sub2_41.method4326(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass7_Sub2_41.aClass81_Sub2_4.method3240(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass7_Sub2_41.method4326(0);
		if (this.anInt6997 == super.aClass7_Sub2_41.anInt5597) {
			return;
		}
		@Pc(51) int local51 = super.aClass7_Sub2_41.anInt5597 % 5000 * 128 / 5000;
		for (@Pc(53) int local53 = 0; local53 < 64; local53++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local53, this.aFloatArray47, local51);
			local51 += 2;
		}
		if (this.aClass330_4.aBoolean660) {
			this.aFloat163 = (float) (super.aClass7_Sub2_41.anInt5597 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6997 = super.aClass7_Sub2_41.anInt5597;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
	}
}
