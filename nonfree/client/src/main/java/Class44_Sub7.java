import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class44_Sub7 extends Class44 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	private int anInt6068;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "F")
	private float aFloat107;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!u;")
	private Class326 aClass326_4;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!hm;")
	private final Class145 aClass145_5;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Lclient!m;")
	private Class216 aClass216_5;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "[F")
	private float[] aFloatArray40;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!no;Lclient!hm;)V")
	public Class44_Sub7(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class145 arg1) {
		super(arg0);
		this.aClass145_5 = arg1;
		if (super.aClass66_Sub3_38.aBoolean471 && super.aClass66_Sub3_38.anInt6458 >= 2) {
			this.aClass216_5 = Static415.method5943(super.aClass66_Sub3_38, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass216_5 != null) {
				@Pc(39) int[][] local39 = Static103.method398(0.4F);
				@Pc(50) int[][] local50 = Static103.method398(0.4F);
				this.aFloatArray40 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray40[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray40[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method5160();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		if (this.aClass326_4 == null) {
			return;
		}
		this.aClass326_4.method7292('\u0000');
		super.aClass66_Sub3_38.method5381(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass66_Sub3_38.aClass134_Sub2_3.method3449(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass66_Sub3_38.method5381(0);
		if (super.aClass66_Sub3_38.anInt6442 == this.anInt6068) {
			return;
		}
		@Pc(68) int local68 = super.aClass66_Sub3_38.anInt6442 % 5120 * 128 / 5120;
		local68 *= 128;
		for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local74, this.aFloatArray40, local68);
			local68 += 2;
		}
		if (this.aClass145_5.aBoolean315) {
			this.aFloat107 = (float) (super.aClass66_Sub3_38.anInt6442 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt6068 = super.aClass66_Sub3_38.anInt6442;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		super.aClass66_Sub3_38.method5382(arg1);
		super.aClass66_Sub3_38.method5355(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		if (this.aClass326_4 != null) {
			this.aClass326_4.method7292('\u0001');
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5382(null);
			super.aClass66_Sub3_38.method5381(0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass326_4 == null) {
			return;
		}
		super.aClass66_Sub3_38.method5381(1);
		@Pc(40) int local40;
		if ((arg1 & 0x80) != 0) {
			super.aClass66_Sub3_38.method5382(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass145_5.aBoolean315) {
				super.aClass66_Sub3_38.method5382(this.aClass145_5.aClass114_Sub2_2);
			} else {
				super.aClass66_Sub3_38.method5382(this.aClass145_5.aClass114_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass145_5.aBoolean315) {
			super.aClass66_Sub3_38.method5382(this.aClass145_5.aClass114_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat107, 0.0F, 0.0F, 1.0F);
		} else {
			local40 = super.aClass66_Sub3_38.anInt6442 % 4000 * 16 / 4000;
			super.aClass66_Sub3_38.method5382(this.aClass145_5.aClass114_Sub1Array2[local40]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass66_Sub3_38.method5381(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static472.aFloatArray50, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static472.aFloatArray50, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local40 = arg1 & 0x3;
		if (local40 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local40 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	private void method5160() {
		this.aClass326_4 = new Class326(super.aClass66_Sub3_38, 2);
		this.aClass326_4.method7293(0);
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5380(-16777216);
		super.aClass66_Sub3_38.method5396(7681, 260);
		super.aClass66_Sub3_38.method5424(0, 34166);
		super.aClass66_Sub3_38.method5381(0);
		OpenGL.glBindProgramARB(34336, this.aClass216_5.anInt5651);
		OpenGL.glEnable(34336);
		this.aClass326_4.method7295();
		this.aClass326_4.method7293(1);
		super.aClass66_Sub3_38.method5381(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass66_Sub3_38.method5355(0);
		super.aClass66_Sub3_38.method5424(0, 5890);
		super.aClass66_Sub3_38.method5381(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass326_4.method7295();
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return true;
	}
}
