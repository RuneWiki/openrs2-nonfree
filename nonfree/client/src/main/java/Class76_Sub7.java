import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class76_Sub7 extends Class76 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!hg;")
	private Class136 aClass136_5;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "F")
	private float aFloat204;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	private int anInt8647;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Lclient!sda;")
	private final Class303 aClass303_4;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "Lclient!jea;")
	private Class169 aClass169_5;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "[F")
	private float[] aFloatArray59;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ok;Lclient!sda;)V")
	public Class76_Sub7(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class303 arg1) {
		super(arg0);
		this.aClass303_4 = arg1;
		if (super.aClass134_Sub2_43.aBoolean511 && super.aClass134_Sub2_43.anInt6571 >= 2) {
			this.aClass169_5 = Static483.method6531(super.aClass134_Sub2_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass169_5 != null) {
				@Pc(39) int[][] local39 = Static562.method7614(0.4F);
				@Pc(50) int[][] local50 = Static562.method7614(0.4F);
				this.aFloatArray59 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray59[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray59[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method7077();
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		super.aClass134_Sub2_43.method5202(arg1);
		super.aClass134_Sub2_43.method5194(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		if (this.aClass136_5 != null) {
			this.aClass136_5.method2915('\u0001');
			super.aClass134_Sub2_43.method5197(1);
			super.aClass134_Sub2_43.method5202(null);
			super.aClass134_Sub2_43.method5197(0);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass136_5 == null) {
			return;
		}
		super.aClass134_Sub2_43.method5197(1);
		@Pc(81) int local81;
		if ((arg0 & 0x80) != 0) {
			super.aClass134_Sub2_43.method5202(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass303_4.aBoolean616) {
				super.aClass134_Sub2_43.method5202(this.aClass303_4.aClass40_Sub2_2);
			} else {
				super.aClass134_Sub2_43.method5202(this.aClass303_4.aClass40_Sub3Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass303_4.aBoolean616) {
			super.aClass134_Sub2_43.method5202(this.aClass303_4.aClass40_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat204, 0.0F, 0.0F, 1.0F);
		} else {
			local81 = super.aClass134_Sub2_43.anInt6551 % 4000 * 16 / 4000;
			super.aClass134_Sub2_43.method5202(this.aClass303_4.aClass40_Sub3Array3[local81]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass134_Sub2_43.method5197(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static294.aFloatArray30, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static294.aFloatArray30, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local81 = arg0 & 0x3;
		if (local81 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local81 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		if (this.aClass136_5 == null) {
			return;
		}
		this.aClass136_5.method2915('\u0000');
		super.aClass134_Sub2_43.method5197(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass134_Sub2_43.bf.method2598(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass134_Sub2_43.method5197(0);
		if (super.aClass134_Sub2_43.anInt6551 == this.anInt8647) {
			return;
		}
		@Pc(59) int local59 = super.aClass134_Sub2_43.anInt6551 % 5000 * 128 / 5000;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local61, this.aFloatArray59, local59);
			local59 += 2;
		}
		if (this.aClass303_4.aBoolean616) {
			this.aFloat204 = (float) (super.aClass134_Sub2_43.anInt6551 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt8647 = super.aClass134_Sub2_43.anInt6551;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	private void method7077() {
		this.aClass136_5 = new Class136(super.aClass134_Sub2_43, 2);
		this.aClass136_5.method2920(0);
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5217(-16777216);
		super.aClass134_Sub2_43.method5224(260, 7681);
		super.aClass134_Sub2_43.method5271(34166, 0);
		super.aClass134_Sub2_43.method5197(0);
		OpenGL.glBindProgramARB(34336, this.aClass169_5.anInt4445);
		OpenGL.glEnable(34336);
		this.aClass136_5.method2918();
		this.aClass136_5.method2920(1);
		super.aClass134_Sub2_43.method5197(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass134_Sub2_43.method5194(0);
		super.aClass134_Sub2_43.method5271(5890, 0);
		super.aClass134_Sub2_43.method5197(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass136_5.method2918();
	}
}
