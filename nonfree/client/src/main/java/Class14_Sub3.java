import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!bp;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	private int anInt2974;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "F")
	private float aFloat98;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!faa;")
	private final Class91 aClass91_2;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!kn;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "[F")
	private float[] aFloatArray39;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!eq;Lclient!faa;)V")
	public Class14_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_2 = arg1;
		if (super.aClass33_Sub3_43.aBoolean274 && super.aClass33_Sub3_43.anInt3429 >= 2) {
			this.aClass186_1 = Static67.method1488("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass33_Sub3_43);
			if (this.aClass186_1 != null) {
				@Pc(39) int[][] local39 = Static539.method7668(0.4F);
				@Pc(50) int[][] local50 = Static539.method7668(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray39 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(64) int[] local64 = local39[local58];
					@Pc(68) int[] local68 = local50[local58];
					for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
						this.aFloatArray39[local52++] = (float) local64[local70] / 4096.0F;
						this.aFloatArray39[local52++] = (float) local68[local70] / 4096.0F;
					}
				}
				this.method2750();
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub3_43.method3012(arg0);
		super.aClass33_Sub3_43.method3045(arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		if (this.aClass36_3 != null) {
			this.aClass36_3.method1112('\u0001');
			super.aClass33_Sub3_43.method3027(1);
			super.aClass33_Sub3_43.method3012(null);
			super.aClass33_Sub3_43.method3027(0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	private void method2750() {
		this.aClass36_3 = new Class36(super.aClass33_Sub3_43, 2);
		this.aClass36_3.method1116(0);
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3010(-16777216);
		super.aClass33_Sub3_43.method3057(7681, 260);
		super.aClass33_Sub3_43.method3081(34166, 0);
		super.aClass33_Sub3_43.method3027(0);
		OpenGL.glBindProgramARB(34336, this.aClass186_1.anInt6029);
		OpenGL.glEnable(34336);
		this.aClass36_3.method1115();
		this.aClass36_3.method1116(1);
		super.aClass33_Sub3_43.method3027(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass33_Sub3_43.method3045(0);
		super.aClass33_Sub3_43.method3081(5890, 0);
		super.aClass33_Sub3_43.method3027(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass36_3.method1115();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass36_3 == null) {
			return;
		}
		super.aClass33_Sub3_43.method3027(1);
		@Pc(68) int local68;
		if ((arg1 & 0x80) != 0) {
			super.aClass33_Sub3_43.method3012(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass91_2.aBoolean294) {
				super.aClass33_Sub3_43.method3012(this.aClass91_2.aClass121_Sub4_3);
			} else {
				super.aClass33_Sub3_43.method3012(this.aClass91_2.aClass121_Sub2Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass91_2.aBoolean294) {
			super.aClass33_Sub3_43.method3012(this.aClass91_2.aClass121_Sub4_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat98, 0.0F, 0.0F, 1.0F);
		} else {
			local68 = super.aClass33_Sub3_43.anInt3418 % 4000 * 16 / 4000;
			super.aClass33_Sub3_43.method3012(this.aClass91_2.aClass121_Sub2Array1[local68]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass33_Sub3_43.method3027(0);
		if ((arg1 & 0x40) == 0) {
			Static87.aFloatArray36[1] = super.aClass33_Sub3_43.aFloat110 * super.aClass33_Sub3_43.aFloat114;
			Static87.aFloatArray36[2] = super.aClass33_Sub3_43.aFloat109 * super.aClass33_Sub3_43.aFloat114;
			Static87.aFloatArray36[0] = super.aClass33_Sub3_43.aFloat123 * super.aClass33_Sub3_43.aFloat114;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static87.aFloatArray36, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local68 = arg1 & 0x3;
		if (local68 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local68 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		if (this.aClass36_3 == null) {
			return;
		}
		this.aClass36_3.method1112('\u0000');
		super.aClass33_Sub3_43.method3027(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass33_Sub3_43.aClass47_Sub2_5.method3500(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass33_Sub3_43.method3027(0);
		if (this.anInt2974 == super.aClass33_Sub3_43.anInt3418) {
			return;
		}
		@Pc(59) int local59 = super.aClass33_Sub3_43.anInt3418 % 5000 * 128 / 5000;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local61, this.aFloatArray39, local59);
			local59 += 2;
		}
		if (this.aClass91_2.aBoolean294) {
			this.aFloat98 = (float) (super.aClass33_Sub3_43.anInt3418 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2974 = super.aClass33_Sub3_43.anInt3418;
	}
}
