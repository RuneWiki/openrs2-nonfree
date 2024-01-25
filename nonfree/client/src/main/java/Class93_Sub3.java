import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!ni;")
	private Class201 aClass201_3;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "F")
	private float aFloat63;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	private int anInt3365;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Lclient!km;")
	private final Class162 aClass162_1;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Lclient!ku;")
	private Class168 aClass168_5;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "[F")
	private float[] aFloatArray18;

	static {
		new Class202(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!os;Lclient!km;)V")
	public Class93_Sub3(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_1 = arg1;
		if (super.aClass39_Sub3_40.aBoolean505 && super.aClass39_Sub3_40.anInt6744 >= 2) {
			this.aClass168_5 = Static384.method6039("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass39_Sub3_40);
			if (this.aClass168_5 != null) {
				@Pc(41) int[][] local41 = Static291.method4610(0.4F);
				@Pc(52) int[][] local52 = Static291.method4610(0.4F);
				this.aFloatArray18 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray18[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray18[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3016();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		if (this.aClass201_3 == null) {
			return;
		}
		this.aClass201_3.method5132('\u0000');
		super.aClass39_Sub3_40.method5750(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass39_Sub3_40.aClass181_Sub3_4.method5494(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass39_Sub3_40.method5750(0);
		if (this.anInt3365 == super.aClass39_Sub3_40.anInt6717) {
			return;
		}
		@Pc(63) int local63 = super.aClass39_Sub3_40.anInt6717 % 5120 * 128 / 5120;
		local63 *= 128;
		for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local69, this.aFloatArray18, local63);
			local63 += 2;
		}
		if (this.aClass162_1.aBoolean337) {
			this.aFloat63 = (float) (super.aClass39_Sub3_40.anInt6717 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3365 = super.aClass39_Sub3_40.anInt6717;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	private void method3016() {
		this.aClass201_3 = new Class201(super.aClass39_Sub3_40, 2);
		this.aClass201_3.method5135(0);
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5751(-16777216);
		super.aClass39_Sub3_40.method5760(260, 7681);
		super.aClass39_Sub3_40.method5680(34166, 0);
		super.aClass39_Sub3_40.method5750(0);
		OpenGL.glBindProgramARB(34336, this.aClass168_5.anInt4664);
		OpenGL.glEnable(34336);
		this.aClass201_3.method5136();
		this.aClass201_3.method5135(1);
		super.aClass39_Sub3_40.method5750(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass39_Sub3_40.method5699(0);
		super.aClass39_Sub3_40.method5680(5890, 0);
		super.aClass39_Sub3_40.method5750(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass201_3.method5136();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass201_3 == null) {
			return;
		}
		super.aClass39_Sub3_40.method5750(1);
		@Pc(48) int local48;
		if ((arg0 & 0x80) != 0) {
			super.aClass39_Sub3_40.method5719(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass162_1.aBoolean337) {
				super.aClass39_Sub3_40.method5719(this.aClass162_1.aClass19_Sub4_3);
			} else {
				super.aClass39_Sub3_40.method5719(this.aClass162_1.aClass19_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass162_1.aBoolean337) {
			super.aClass39_Sub3_40.method5719(this.aClass162_1.aClass19_Sub4_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat63, 0.0F, 0.0F, 1.0F);
		} else {
			local48 = super.aClass39_Sub3_40.anInt6717 % 4000 * 16 / 4000;
			super.aClass39_Sub3_40.method5719(this.aClass162_1.aClass19_Sub2Array3[local48]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass39_Sub3_40.method5750(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static20.aFloatArray4, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static20.aFloatArray4, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local48 = arg0 & 0x3;
		if (local48 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local48 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		if (this.aClass201_3 != null) {
			this.aClass201_3.method5132('\u0001');
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5719(null);
			super.aClass39_Sub3_40.method5750(0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub3_40.method5719(arg0);
		super.aClass39_Sub3_40.method5699(arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
	}
}
