import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class42_Sub3 extends Class42 {

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!bq;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "F")
	private float aFloat147;

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
	private int anInt4734;

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "Lclient!al;")
	private final Class14 aClass14_3;

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "Lclient!lk;")
	private Class210 aClass210_1;

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!uca;Lclient!al;)V")
	public Class42_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class14 arg1) {
		super(arg0);
		this.aClass14_3 = arg1;
		if (super.aClass162_Sub3_44.aBoolean738 && super.aClass162_Sub3_44.anInt8729 >= 2) {
			this.aClass210_1 = Static89.method1337(super.aClass162_Sub3_44, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass210_1 != null) {
				@Pc(41) int[][] local41 = Static525.method6785(0.4F);
				@Pc(52) int[][] local52 = Static525.method6785(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray44 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray44[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray44[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3985();
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass41_2 == null) {
			return;
		}
		super.aClass162_Sub3_44.method6947(1);
		@Pc(63) int local63;
		if ((arg1 & 0x80) != 0) {
			super.aClass162_Sub3_44.method6911(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass14_3.aBoolean25) {
				super.aClass162_Sub3_44.method6911(this.aClass14_3.aClass3_Sub4_3);
			} else {
				super.aClass162_Sub3_44.method6911(this.aClass14_3.aClass3_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass14_3.aBoolean25) {
			super.aClass162_Sub3_44.method6911(this.aClass14_3.aClass3_Sub4_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat147, 0.0F, 0.0F, 1.0F);
		} else {
			local63 = super.aClass162_Sub3_44.anInt8686 % 4000 * 16 / 4000;
			super.aClass162_Sub3_44.method6911(this.aClass14_3.aClass3_Sub1Array2[local63]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass162_Sub3_44.method6947(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static135.aFloatArray66, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static135.aFloatArray66, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local63 = arg1 & 0x3;
		if (local63 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local63 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		if (this.aClass41_2 != null) {
			this.aClass41_2.method821('\u0001');
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6911(null);
			super.aClass162_Sub3_44.method6947(0);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		if (this.aClass41_2 == null) {
			return;
		}
		this.aClass41_2.method821('\u0000');
		super.aClass162_Sub3_44.method6947(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass162_Sub3_44.aClass25_Sub1_5.method383(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass162_Sub3_44.method6947(0);
		if (this.anInt4734 == super.aClass162_Sub3_44.anInt8686) {
			return;
		}
		@Pc(53) int local53 = super.aClass162_Sub3_44.anInt8686 % 5000 * 128 / 5000;
		for (@Pc(55) int local55 = 0; local55 < 64; local55++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local55, this.aFloatArray44, local53);
			local53 += 2;
		}
		if (this.aClass14_3.aBoolean25) {
			this.aFloat147 = (float) (super.aClass162_Sub3_44.anInt8686 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt4734 = super.aClass162_Sub3_44.anInt8686;
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
	private void method3985() {
		this.aClass41_2 = new Class41(super.aClass162_Sub3_44, 2);
		this.aClass41_2.method823(0);
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6961(-16777216);
		super.aClass162_Sub3_44.method6903(260, 7681);
		super.aClass162_Sub3_44.method6926(34166, 0);
		super.aClass162_Sub3_44.method6947(0);
		OpenGL.glBindProgramARB(34336, this.aClass210_1.anInt5074);
		OpenGL.glEnable(34336);
		this.aClass41_2.method822();
		this.aClass41_2.method823(1);
		super.aClass162_Sub3_44.method6947(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass162_Sub3_44.method6953(0);
		super.aClass162_Sub3_44.method6926(5890, 0);
		super.aClass162_Sub3_44.method6947(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass41_2.method822();
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass162_Sub3_44.method6911(arg1);
		super.aClass162_Sub3_44.method6953(arg0);
	}
}
