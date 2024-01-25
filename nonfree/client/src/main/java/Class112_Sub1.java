import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!ud;")
	private Class294 aClass294_1;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "F")
	private float aFloat81;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!de;")
	private final Class67 aClass67_1;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!mv;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!gi;Lclient!de;)V")
	public Class112_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_1 = arg1;
		if (super.aClass42_Sub3_39.aBoolean304 && super.aClass42_Sub3_39.anInt3695 >= 2) {
			this.aClass209_1 = Static292.method4743("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass42_Sub3_39);
			if (this.aClass209_1 != null) {
				@Pc(39) int[][] local39 = Static515.method7623(0.4F);
				@Pc(50) int[][] local50 = Static515.method7623(0.4F);
				this.aFloatArray28 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray28[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray28[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method3045();
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub3_39.method3219(arg0);
		super.aClass42_Sub3_39.method3257(arg1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		if (this.aClass294_1 == null) {
			return;
		}
		this.aClass294_1.method7284('\u0000');
		super.aClass42_Sub3_39.method3259(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass42_Sub3_39.aClass91_Sub1_3.method2465(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass42_Sub3_39.method3259(0);
		if (super.aClass42_Sub3_39.anInt3674 == this.anInt3350) {
			return;
		}
		@Pc(69) int local69 = super.aClass42_Sub3_39.anInt3674 % 5120 * 128 / 5120;
		local69 *= 128;
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local75, this.aFloatArray28, local69);
			local69 += 2;
		}
		if (this.aClass67_1.aBoolean145) {
			this.aFloat81 = (float) (super.aClass42_Sub3_39.anInt3674 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3350 = super.aClass42_Sub3_39.anInt3674;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass294_1 == null) {
			return;
		}
		super.aClass42_Sub3_39.method3259(1);
		@Pc(92) int local92;
		if ((arg1 & 0x80) != 0) {
			super.aClass42_Sub3_39.method3219(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass67_1.aBoolean145) {
				super.aClass42_Sub3_39.method3219(this.aClass67_1.aClass79_Sub3_2);
			} else {
				super.aClass42_Sub3_39.method3219(this.aClass67_1.aClass79_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass67_1.aBoolean145) {
			super.aClass42_Sub3_39.method3219(this.aClass67_1.aClass79_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat81, 0.0F, 0.0F, 1.0F);
		} else {
			local92 = super.aClass42_Sub3_39.anInt3674 % 4000 * 16 / 4000;
			super.aClass42_Sub3_39.method3219(this.aClass67_1.aClass79_Sub2Array3[local92]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass42_Sub3_39.method3259(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static353.aFloatArray52, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static353.aFloatArray52, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local92 = arg1 & 0x3;
		if (local92 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local92 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	private void method3045() {
		this.aClass294_1 = new Class294(super.aClass42_Sub3_39, 2);
		this.aClass294_1.method7287(0);
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3223(-16777216);
		super.aClass42_Sub3_39.method3250(260, 7681);
		super.aClass42_Sub3_39.method3201(0, 34166);
		super.aClass42_Sub3_39.method3259(0);
		OpenGL.glBindProgramARB(34336, this.aClass209_1.anInt6038);
		OpenGL.glEnable(34336);
		this.aClass294_1.method7288();
		this.aClass294_1.method7287(1);
		super.aClass42_Sub3_39.method3259(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass42_Sub3_39.method3257(0);
		super.aClass42_Sub3_39.method3201(0, 5890);
		super.aClass42_Sub3_39.method3259(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass294_1.method7288();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (this.aClass294_1 != null) {
			this.aClass294_1.method7284('\u0001');
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3219(null);
			super.aClass42_Sub3_39.method3259(0);
		}
	}
}
