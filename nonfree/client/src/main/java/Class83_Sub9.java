import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class83_Sub9 extends Class83 {

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!am;")
	private Class11 aClass11_6;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	private int anInt9173;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "F")
	private float aFloat188;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "Lclient!pda;")
	private final Class224 aClass224_6;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!nb;")
	private Class194 aClass194_5;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "[F")
	private float[] aFloatArray77;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!mh;Lclient!pda;)V")
	public Class83_Sub9(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class224 arg1) {
		super(arg0);
		this.aClass224_6 = arg1;
		if (super.aClass4_Sub3_41.aBoolean432 && super.aClass4_Sub3_41.anInt5803 >= 2) {
			this.aClass194_5 = Static326.method7612(super.aClass4_Sub3_41, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass194_5 != null) {
				@Pc(39) int[][] local39 = Static415.method6534(0.4F);
				@Pc(50) int[][] local50 = Static415.method6534(0.4F);
				this.aFloatArray77 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray77[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray77[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method7934();
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass11_6 == null) {
			return;
		}
		super.aClass4_Sub3_41.method5245(1);
		@Pc(88) int local88;
		if ((arg0 & 0x80) != 0) {
			super.aClass4_Sub3_41.method5250(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass224_6.aBoolean492) {
				super.aClass4_Sub3_41.method5250(this.aClass224_6.aClass164_Sub2_1);
			} else {
				super.aClass4_Sub3_41.method5250(this.aClass224_6.aClass164_Sub3Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass224_6.aBoolean492) {
			super.aClass4_Sub3_41.method5250(this.aClass224_6.aClass164_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat188, 0.0F, 0.0F, 1.0F);
		} else {
			local88 = super.aClass4_Sub3_41.anInt5794 % 4000 * 16 / 4000;
			super.aClass4_Sub3_41.method5250(this.aClass224_6.aClass164_Sub3Array4[local88]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass4_Sub3_41.method5245(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static281.aFloatArray47, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static281.aFloatArray47, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local88 = arg0 & 0x3;
		if (local88 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local88 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	private void method7934() {
		this.aClass11_6 = new Class11(super.aClass4_Sub3_41, 2);
		this.aClass11_6.method532(0);
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5226(-16777216);
		super.aClass4_Sub3_41.method5266(7681, 260);
		super.aClass4_Sub3_41.method5265(0, 34166);
		super.aClass4_Sub3_41.method5245(0);
		OpenGL.glBindProgramARB(34336, this.aClass194_5.anInt5999);
		OpenGL.glEnable(34336);
		this.aClass11_6.method537();
		this.aClass11_6.method532(1);
		super.aClass4_Sub3_41.method5245(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass4_Sub3_41.method5230(0);
		super.aClass4_Sub3_41.method5265(0, 5890);
		super.aClass4_Sub3_41.method5245(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass11_6.method537();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		if (this.aClass11_6 == null) {
			return;
		}
		this.aClass11_6.method534('\u0000');
		super.aClass4_Sub3_41.method5245(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass4_Sub3_41.aClass128_Sub2_4.method4329(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass4_Sub3_41.method5245(0);
		if (super.aClass4_Sub3_41.anInt5794 == this.anInt9173) {
			return;
		}
		@Pc(66) int local66 = super.aClass4_Sub3_41.anInt5794 % 5120 * 128 / 5120;
		local66 *= 128;
		for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local72, this.aFloatArray77, local66);
			local66 += 2;
		}
		if (this.aClass224_6.aBoolean492) {
			this.aFloat188 = (float) (super.aClass4_Sub3_41.anInt5794 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt9173 = super.aClass4_Sub3_41.anInt5794;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		if (this.aClass11_6 != null) {
			this.aClass11_6.method534('\u0001');
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5250(null);
			super.aClass4_Sub3_41.method5245(0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
		super.aClass4_Sub3_41.method5250(arg1);
		super.aClass4_Sub3_41.method5230(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return true;
	}
}
