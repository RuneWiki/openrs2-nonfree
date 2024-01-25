import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class40_Sub4 extends Class40 {

	@OriginalMember(owner = "client!it", name = "l", descriptor = "F")
	private float aFloat23;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "Lclient!kp;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	private int anInt3285;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!wc;")
	private final Class266 aClass266_4;

	@OriginalMember(owner = "client!it", name = "C", descriptor = "Lclient!aw;")
	private Class18 aClass18_5;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "[F")
	private float[] aFloatArray5;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!na;Lclient!wc;)V")
	public Class40_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class266 arg1) {
		super(arg0);
		this.aClass266_4 = arg1;
		if (super.aClass75_Sub2_41.aBoolean335 && super.aClass75_Sub2_41.anInt4883 >= 2) {
			this.aClass18_5 = Static340.method4839(super.aClass75_Sub2_41, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass18_5 != null) {
				@Pc(41) int[][] local41 = Static210.method2976(0.4F);
				@Pc(52) int[][] local52 = Static210.method2976(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray5 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray5[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray5[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method2709();
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
	private void method2709() {
		this.aClass150_1 = new Class150(super.aClass75_Sub2_41, 2);
		this.aClass150_1.method3069(0);
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3854(-16777216);
		super.aClass75_Sub2_41.method3872(7681, 260);
		super.aClass75_Sub2_41.method3843(0, 34166);
		super.aClass75_Sub2_41.method3811(0);
		OpenGL.glBindProgramARB(34336, this.aClass18_5.anInt411);
		OpenGL.glEnable(34336);
		this.aClass150_1.method3066();
		this.aClass150_1.method3069(1);
		super.aClass75_Sub2_41.method3811(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub2_41.method3798(0);
		super.aClass75_Sub2_41.method3843(0, 5890);
		super.aClass75_Sub2_41.method3811(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass150_1.method3066();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass150_1 == null) {
			return;
		}
		super.aClass75_Sub2_41.method3811(1);
		@Pc(72) int local72;
		if ((arg1 & 0x80) != 0) {
			super.aClass75_Sub2_41.method3844(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass266_4.aBoolean507) {
				super.aClass75_Sub2_41.method3844(this.aClass266_4.aClass64_Sub2_2);
			} else {
				super.aClass75_Sub2_41.method3844(this.aClass266_4.aClass64_Sub4Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass266_4.aBoolean507) {
			super.aClass75_Sub2_41.method3844(this.aClass266_4.aClass64_Sub2_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat23, 0.0F, 0.0F, 1.0F);
		} else {
			local72 = super.aClass75_Sub2_41.anInt4860 % 4000 * 16 / 4000;
			super.aClass75_Sub2_41.method3844(this.aClass266_4.aClass64_Sub4Array3[local72]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass75_Sub2_41.method3811(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static249.aFloatArray7, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static249.aFloatArray7, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local72 = arg1 & 0x3;
		if (local72 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local72 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		if (this.aClass150_1 != null) {
			this.aClass150_1.method3067('\u0001');
			super.aClass75_Sub2_41.method3811(1);
			super.aClass75_Sub2_41.method3844(null);
			super.aClass75_Sub2_41.method3811(0);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return true;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		super.aClass75_Sub2_41.method3844(arg1);
		super.aClass75_Sub2_41.method3798(arg0);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		if (this.aClass150_1 == null) {
			return;
		}
		this.aClass150_1.method3067('\u0000');
		super.aClass75_Sub2_41.method3811(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass75_Sub2_41.aClass6_Sub2_3.method3922(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass75_Sub2_41.method3811(0);
		if (super.aClass75_Sub2_41.anInt4860 == this.anInt3285) {
			return;
		}
		@Pc(69) int local69 = super.aClass75_Sub2_41.anInt4860 % 5120 * 128 / 5120;
		local69 *= 128;
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local75, this.aFloatArray5, local69);
			local69 += 2;
		}
		if (this.aClass266_4.aBoolean507) {
			this.aFloat23 = (float) (super.aClass75_Sub2_41.anInt4860 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3285 = super.aClass75_Sub2_41.anInt4860;
	}
}
