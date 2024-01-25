import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class60_Sub6 extends Class60 {

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "F")
	private float aFloat158;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!qda;")
	private Class271 aClass271_5;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	private int anInt7846;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!vb;")
	private final Class343 aClass343_5;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!kk;")
	private Class188 aClass188_5;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "[F")
	private float[] aFloatArray62;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!us;Lclient!vb;)V")
	public Class60_Sub6(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		this.aClass343_5 = arg1;
		if (super.aClass43_Sub3_43.aBoolean670 && super.aClass43_Sub3_43.anInt8757 >= 2) {
			this.aClass188_5 = Static411.method5922("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass43_Sub3_43);
			if (this.aClass188_5 != null) {
				@Pc(39) int[][] local39 = Static383.method5646(0.4F);
				@Pc(50) int[][] local50 = Static383.method5646(0.4F);
				this.aFloatArray62 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray62[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray62[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method6620();
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		if (this.aClass271_5 == null) {
			return;
		}
		this.aClass271_5.method6056('\u0000');
		super.aClass43_Sub3_43.method7277(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass43_Sub3_43.aClass109_Sub2_5.method6777(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass43_Sub3_43.method7277(0);
		if (this.anInt7846 == super.aClass43_Sub3_43.anInt8735) {
			return;
		}
		@Pc(55) int local55 = super.aClass43_Sub3_43.anInt8735 % 5000 * 128 / 5000;
		for (@Pc(57) int local57 = 0; local57 < 64; local57++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local57, this.aFloatArray62, local55);
			local55 += 2;
		}
		if (this.aClass343_5.aBoolean698) {
			this.aFloat158 = (float) (super.aClass43_Sub3_43.anInt8735 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7846 = super.aClass43_Sub3_43.anInt8735;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		if (this.aClass271_5 != null) {
			this.aClass271_5.method6056('\u0001');
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7220(null);
			super.aClass43_Sub3_43.method7277(0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	private void method6620() {
		this.aClass271_5 = new Class271(super.aClass43_Sub3_43, 2);
		this.aClass271_5.method6059(0);
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7233(-16777216);
		super.aClass43_Sub3_43.method7287(7681, 260);
		super.aClass43_Sub3_43.method7282(34166, 0);
		super.aClass43_Sub3_43.method7277(0);
		OpenGL.glBindProgramARB(34336, this.aClass188_5.anInt5104);
		OpenGL.glEnable(34336);
		this.aClass271_5.method6054();
		this.aClass271_5.method6059(1);
		super.aClass43_Sub3_43.method7277(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass43_Sub3_43.method7281(0);
		super.aClass43_Sub3_43.method7282(5890, 0);
		super.aClass43_Sub3_43.method7277(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass271_5.method6054();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass271_5 == null) {
			return;
		}
		super.aClass43_Sub3_43.method7277(1);
		@Pc(85) int local85;
		if ((arg1 & 0x80) != 0) {
			super.aClass43_Sub3_43.method7220(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass343_5.aBoolean698) {
				super.aClass43_Sub3_43.method7220(this.aClass343_5.aClass34_Sub3_2);
			} else {
				super.aClass43_Sub3_43.method7220(this.aClass343_5.aClass34_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass343_5.aBoolean698) {
			super.aClass43_Sub3_43.method7220(this.aClass343_5.aClass34_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat158, 0.0F, 0.0F, 1.0F);
		} else {
			local85 = super.aClass43_Sub3_43.anInt8735 % 4000 * 16 / 4000;
			super.aClass43_Sub3_43.method7220(this.aClass343_5.aClass34_Sub2Array3[local85]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass43_Sub3_43.method7277(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static90.aFloatArray13, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static90.aFloatArray13, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local85 = arg1 & 0x3;
		if (local85 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local85 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		super.aClass43_Sub3_43.method7220(arg1);
		super.aClass43_Sub3_43.method7281(arg0);
	}
}
