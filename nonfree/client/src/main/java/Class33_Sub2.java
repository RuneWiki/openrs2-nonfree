import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	private int anInt3514;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Lclient!oi;")
	private Class261 aClass261_2;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "F")
	private float aFloat75;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!go;")
	private final Class130 aClass130_2;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "Lclient!nk;")
	private Class248 aClass248_1;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!qfa;Lclient!go;)V")
	public Class33_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class130 arg1) {
		super(arg0);
		this.aClass130_2 = arg1;
		if (super.aClass137_Sub3_42.aBoolean606 && super.aClass137_Sub3_42.anInt8575 >= 2) {
			this.aClass248_1 = Static512.method7462(super.aClass137_Sub3_42, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass248_1 != null) {
				@Pc(39) int[][] local39 = Static263.method3851(0.4F);
				@Pc(50) int[][] local50 = Static263.method3851(0.4F);
				this.aFloatArray22 = new float[32768];
				@Pc(56) int local56 = 0;
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray22[local56++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray22[local56++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method2921();
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		super.aClass137_Sub3_42.method7090(arg1);
		super.aClass137_Sub3_42.method7077(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	private void method2921() {
		this.aClass261_2 = new Class261(super.aClass137_Sub3_42, 2);
		this.aClass261_2.method6286(0);
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7070(-16777216);
		super.aClass137_Sub3_42.method7084(7681, 260);
		super.aClass137_Sub3_42.method7027(34166, 0);
		super.aClass137_Sub3_42.method7095(0);
		OpenGL.glBindProgramARB(34336, this.aClass248_1.anInt7377);
		OpenGL.glEnable(34336);
		this.aClass261_2.method6287();
		this.aClass261_2.method6286(1);
		super.aClass137_Sub3_42.method7095(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass137_Sub3_42.method7077(0);
		super.aClass137_Sub3_42.method7027(5890, 0);
		super.aClass137_Sub3_42.method7095(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass261_2.method6287();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		if (this.aClass261_2 == null) {
			return;
		}
		this.aClass261_2.method6285('\u0000');
		super.aClass137_Sub3_42.method7095(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass137_Sub3_42.aClass26_Sub3_5.method6462(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass137_Sub3_42.method7095(0);
		if (this.anInt3514 == super.aClass137_Sub3_42.anInt8544) {
			return;
		}
		@Pc(57) int local57 = super.aClass137_Sub3_42.anInt8544 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray22, local57);
			local57 += 2;
		}
		if (this.aClass130_2.aBoolean273) {
			this.aFloat75 = (float) (super.aClass137_Sub3_42.anInt8544 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3514 = super.aClass137_Sub3_42.anInt8544;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		if (this.aClass261_2 != null) {
			this.aClass261_2.method6285('\u0001');
			super.aClass137_Sub3_42.method7095(1);
			super.aClass137_Sub3_42.method7090((Class66) null);
			super.aClass137_Sub3_42.method7095(0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass261_2 == null) {
			return;
		}
		super.aClass137_Sub3_42.method7095(1);
		@Pc(37) int local37;
		if ((arg0 & 0x80) != 0) {
			super.aClass137_Sub3_42.method7090((Class66) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass130_2.aBoolean273) {
				super.aClass137_Sub3_42.method7090(this.aClass130_2.aClass66_Sub2_1);
			} else {
				super.aClass137_Sub3_42.method7090(this.aClass130_2.aClass66_Sub1Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass130_2.aBoolean273) {
			super.aClass137_Sub3_42.method7090(this.aClass130_2.aClass66_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat75, 0.0F, 0.0F, 1.0F);
		} else {
			local37 = super.aClass137_Sub3_42.anInt8544 % 4000 * 16 / 4000;
			super.aClass137_Sub3_42.method7090(this.aClass130_2.aClass66_Sub1Array3[local37]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass137_Sub3_42.method7095(0);
		if ((arg0 & 0x40) == 0) {
			Static230.aFloatArray27[0] = super.aClass137_Sub3_42.aFloat205 * super.aClass137_Sub3_42.aFloat206;
			Static230.aFloatArray27[2] = super.aClass137_Sub3_42.aFloat206 * super.aClass137_Sub3_42.aFloat191;
			Static230.aFloatArray27[1] = super.aClass137_Sub3_42.aFloat210 * super.aClass137_Sub3_42.aFloat206;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static230.aFloatArray27, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local37 = arg0 & 0x3;
		if (local37 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local37 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return true;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
	}
}
