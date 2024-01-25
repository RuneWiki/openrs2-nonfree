import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class19_Sub9 extends Class19 {

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
	private int anInt9419;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "F")
	private float aFloat171;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Lclient!ee;")
	private Class93 aClass93_6;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!b;")
	private final Class25 aClass25_6;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Lclient!iu;")
	private Class173 aClass173_5;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "[F")
	private float[] aFloatArray67;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!kv;Lclient!b;)V")
	public Class19_Sub9(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class25 arg1) {
		super(arg0);
		this.aClass25_6 = arg1;
		if (super.aClass143_Sub2_39.aBoolean425 && super.aClass143_Sub2_39.anInt5834 >= 2) {
			this.aClass173_5 = Static128.method1999("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass143_Sub2_39);
			if (this.aClass173_5 != null) {
				@Pc(39) int[][] local39 = Static533.method7425(0.4F);
				@Pc(50) int[][] local50 = Static533.method7425(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray67 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(63) int[] local63 = local39[local58];
					@Pc(67) int[] local67 = local50[local58];
					for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
						this.aFloatArray67[local52++] = (float) local63[local69] / 4096.0F;
						this.aFloatArray67[local52++] = (float) local67[local69] / 4096.0F;
					}
				}
				this.method7879();
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		if (this.aClass93_6 != null) {
			this.aClass93_6.method1952('\u0001');
			super.aClass143_Sub2_39.method4930(1);
			super.aClass143_Sub2_39.method4945((Class44) null);
			super.aClass143_Sub2_39.method4930(0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass93_6 == null) {
			return;
		}
		super.aClass143_Sub2_39.method4930(1);
		@Pc(107) int local107;
		if ((arg0 & 0x80) != 0) {
			super.aClass143_Sub2_39.method4945((Class44) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass25_6.aBoolean17) {
				super.aClass143_Sub2_39.method4945(this.aClass25_6.aClass44_Sub2_1);
			} else {
				super.aClass143_Sub2_39.method4945(this.aClass25_6.aClass44_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass25_6.aBoolean17) {
			super.aClass143_Sub2_39.method4945(this.aClass25_6.aClass44_Sub2_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat171, 0.0F, 0.0F, 1.0F);
		} else {
			local107 = super.aClass143_Sub2_39.anInt5822 % 4000 * 16 / 4000;
			super.aClass143_Sub2_39.method4945(this.aClass25_6.aClass44_Sub1Array2[local107]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass143_Sub2_39.method4930(0);
		if ((arg0 & 0x40) == 0) {
			Static220.aFloatArray14[2] = super.aClass143_Sub2_39.aFloat96 * super.aClass143_Sub2_39.aFloat105;
			Static220.aFloatArray14[1] = super.aClass143_Sub2_39.aFloat98 * super.aClass143_Sub2_39.aFloat105;
			Static220.aFloatArray14[0] = super.aClass143_Sub2_39.aFloat105 * super.aClass143_Sub2_39.aFloat100;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static220.aFloatArray14, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local107 = arg0 & 0x3;
		if (local107 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local107 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		if (this.aClass93_6 == null) {
			return;
		}
		this.aClass93_6.method1952('\u0000');
		super.aClass143_Sub2_39.method4930(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass143_Sub2_39.aClass56_Sub3_5.method8409(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass143_Sub2_39.method4930(0);
		if (this.anInt9419 == super.aClass143_Sub2_39.anInt5822) {
			return;
		}
		@Pc(63) int local63 = super.aClass143_Sub2_39.anInt5822 % 5000 * 128 / 5000;
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local65, this.aFloatArray67, local63);
			local63 += 2;
		}
		if (this.aClass25_6.aBoolean17) {
			this.aFloat171 = (float) (super.aClass143_Sub2_39.anInt5822 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt9419 = super.aClass143_Sub2_39.anInt5822;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
	private void method7879() {
		this.aClass93_6 = new Class93(super.aClass143_Sub2_39, 2);
		this.aClass93_6.method1950(0);
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4982(-16777216);
		super.aClass143_Sub2_39.method4940(260, 7681);
		super.aClass143_Sub2_39.method4933(34166, 0);
		super.aClass143_Sub2_39.method4930(0);
		OpenGL.glBindProgramARB(34336, this.aClass173_5.anInt4121);
		OpenGL.glEnable(34336);
		this.aClass93_6.method1948();
		this.aClass93_6.method1950(1);
		super.aClass143_Sub2_39.method4930(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass143_Sub2_39.method4994(0);
		super.aClass143_Sub2_39.method4933(5890, 0);
		super.aClass143_Sub2_39.method4930(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass93_6.method1948();
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		super.aClass143_Sub2_39.method4945(arg0);
		super.aClass143_Sub2_39.method4994(arg1);
	}
}
