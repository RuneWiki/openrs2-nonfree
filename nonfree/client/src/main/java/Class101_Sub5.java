import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class101_Sub5 extends Class101 {

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!fb;")
	private Class106 aClass106_3;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
	private int anInt5945;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Lclient!pea;")
	private final Class252 aClass252_5;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "Lclient!bj;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "[F")
	private float[] aFloatArray53;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!qj;Lclient!pea;)V")
	public Class101_Sub5(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class252 arg1) {
		super(arg0);
		this.aClass252_5 = arg1;
		if (super.aClass100_Sub3_43.aBoolean583 && super.aClass100_Sub3_43.anInt7690 >= 2) {
			this.aClass35_1 = Static547.method5856("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass100_Sub3_43);
			if (this.aClass35_1 != null) {
				@Pc(39) int[][] local39 = Static67.method1091(0.4F);
				@Pc(50) int[][] local50 = Static67.method1091(0.4F);
				this.aFloatArray53 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray53[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray53[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method4943();
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	private void method4943() {
		this.aClass106_3 = new Class106(super.aClass100_Sub3_43, 2);
		this.aClass106_3.method2292(0);
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6289(-16777216);
		super.aClass100_Sub3_43.method6300(260, 7681);
		super.aClass100_Sub3_43.method6332(34166, 0);
		super.aClass100_Sub3_43.method6344(0);
		OpenGL.glBindProgramARB(34336, this.aClass35_1.anInt1013);
		OpenGL.glEnable(34336);
		this.aClass106_3.method2293();
		this.aClass106_3.method2292(1);
		super.aClass100_Sub3_43.method6344(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_43.method6322(0);
		super.aClass100_Sub3_43.method6332(5890, 0);
		super.aClass100_Sub3_43.method6344(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass106_3.method2293();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		if (this.aClass106_3 != null) {
			this.aClass106_3.method2294('\u0001');
			super.aClass100_Sub3_43.method6344(1);
			super.aClass100_Sub3_43.method6277(null);
			super.aClass100_Sub3_43.method6344(0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		super.aClass100_Sub3_43.method6277(arg1);
		super.aClass100_Sub3_43.method6322(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		if (this.aClass106_3 == null) {
			return;
		}
		this.aClass106_3.method2294('\u0000');
		super.aClass100_Sub3_43.method6344(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass100_Sub3_43.aClass68_Sub1_5.method1265(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_43.method6344(0);
		if (super.aClass100_Sub3_43.anInt7664 == this.anInt5945) {
			return;
		}
		@Pc(59) int local59 = super.aClass100_Sub3_43.anInt7664 % 5000 * 128 / 5000;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local61, this.aFloatArray53, local59);
			local59 += 2;
		}
		if (this.aClass252_5.aBoolean546) {
			this.aFloat170 = (float) (super.aClass100_Sub3_43.anInt7664 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5945 = super.aClass100_Sub3_43.anInt7664;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass106_3 == null) {
			return;
		}
		super.aClass100_Sub3_43.method6344(1);
		@Pc(70) int local70;
		if ((arg0 & 0x80) != 0) {
			super.aClass100_Sub3_43.method6277(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass252_5.aBoolean546) {
				super.aClass100_Sub3_43.method6277(this.aClass252_5.aClass23_Sub2_3);
			} else {
				super.aClass100_Sub3_43.method6277(this.aClass252_5.aClass23_Sub1Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass252_5.aBoolean546) {
			super.aClass100_Sub3_43.method6277(this.aClass252_5.aClass23_Sub2_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat170, 0.0F, 0.0F, 1.0F);
		} else {
			local70 = super.aClass100_Sub3_43.anInt7664 % 4000 * 16 / 4000;
			super.aClass100_Sub3_43.method6277(this.aClass252_5.aClass23_Sub1Array4[local70]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass100_Sub3_43.method6344(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static328.aFloatArray54, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static328.aFloatArray54, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local70 = arg0 & 0x3;
		if (local70 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local70 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
