import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class104_Sub5 extends Class104 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	private int anInt7263;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!gq;")
	private Class121 aClass121_1;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!um;")
	private final Class319 aClass319_4;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!ph;")
	private Class248 aClass248_5;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[F")
	private float[] aFloatArray56;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ap;Lclient!um;)V")
	public Class104_Sub5(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_4 = arg1;
		if (super.aClass9_Sub2_40.aBoolean44 && super.aClass9_Sub2_40.anInt825 >= 2) {
			this.aClass248_5 = Static468.method7218("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass9_Sub2_40);
			if (this.aClass248_5 != null) {
				@Pc(41) int[][] local41 = Static455.method7059(0.4F);
				@Pc(52) int[][] local52 = Static455.method7059(0.4F);
				this.aFloatArray56 = new float[32768];
				@Pc(58) int local58 = 0;
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray56[local58++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray56[local58++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method6101();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		if (this.aClass121_1 != null) {
			this.aClass121_1.method3522('\u0001');
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method814(null);
			super.aClass9_Sub2_40.method806(0);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		super.aClass9_Sub2_40.method814(arg1);
		super.aClass9_Sub2_40.method822(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		if (this.aClass121_1 == null) {
			return;
		}
		this.aClass121_1.method3522('\u0000');
		super.aClass9_Sub2_40.method806(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass9_Sub2_40.aClass8_Sub2_4.method6053(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass9_Sub2_40.method806(0);
		if (super.aClass9_Sub2_40.anInt810 == this.anInt7263) {
			return;
		}
		@Pc(60) int local60 = super.aClass9_Sub2_40.anInt810 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray56, local60);
			local60 += 2;
		}
		if (this.aClass319_4.aBoolean683) {
			this.aFloat170 = (float) (super.aClass9_Sub2_40.anInt810 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7263 = super.aClass9_Sub2_40.anInt810;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	private void method6101() {
		this.aClass121_1 = new Class121(super.aClass9_Sub2_40, 2);
		this.aClass121_1.method3523(0);
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method753(-16777216);
		super.aClass9_Sub2_40.method797(260, 7681);
		super.aClass9_Sub2_40.method816(34166, 0);
		super.aClass9_Sub2_40.method806(0);
		OpenGL.glBindProgramARB(34336, this.aClass248_5.anInt7338);
		OpenGL.glEnable(34336);
		this.aClass121_1.method3524();
		this.aClass121_1.method3523(1);
		super.aClass9_Sub2_40.method806(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass9_Sub2_40.method822(0);
		super.aClass9_Sub2_40.method816(5890, 0);
		super.aClass9_Sub2_40.method806(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass121_1.method3524();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass121_1 == null) {
			return;
		}
		super.aClass9_Sub2_40.method806(1);
		@Pc(75) int local75;
		if ((arg0 & 0x80) != 0) {
			super.aClass9_Sub2_40.method814(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass319_4.aBoolean683) {
				super.aClass9_Sub2_40.method814(this.aClass319_4.aClass132_Sub2_2);
			} else {
				super.aClass9_Sub2_40.method814(this.aClass319_4.aClass132_Sub1Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass319_4.aBoolean683) {
			super.aClass9_Sub2_40.method814(this.aClass319_4.aClass132_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat170, 0.0F, 0.0F, 1.0F);
		} else {
			local75 = super.aClass9_Sub2_40.anInt810 % 4000 * 16 / 4000;
			super.aClass9_Sub2_40.method814(this.aClass319_4.aClass132_Sub1Array3[local75]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass9_Sub2_40.method806(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static333.aFloatArray36, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static333.aFloatArray36, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local75 = arg0 & 0x3;
		if (local75 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local75 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
