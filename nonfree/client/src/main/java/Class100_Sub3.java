import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!il", name = "h", descriptor = "Lclient!cs;")
	private Class49 aClass49_4;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "I")
	private int anInt3849;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!jq;")
	private final Class135 aClass135_3;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Lclient!bh;")
	private Class26 aClass26_1;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ih;Lclient!jq;)V")
	public Class100_Sub3(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class135 arg1) {
		super(arg0);
		this.aClass135_3 = arg1;
		if (super.aClass106_Sub2_43.aBoolean219 && super.aClass106_Sub2_43.anInt3771 >= 2) {
			this.aClass26_1 = Static275.method4076(super.aClass106_Sub2_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass26_1 != null) {
				@Pc(37) int[][] local37 = Static36.method5465(0.4F);
				@Pc(48) int[][] local48 = Static36.method5465(0.4F);
				this.aFloatArray20 = new float[32768];
				@Pc(54) int local54 = 0;
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray20[local54++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray20[local54++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method2980();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6155(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
	private void method2980() {
		this.aClass49_4 = new Class49(super.aClass106_Sub2_43, 2);
		this.aClass49_4.method1154(0);
		super.aClass106_Sub2_43.method2881(1);
		super.aClass106_Sub2_43.method2868(-16777216);
		super.aClass106_Sub2_43.method2923(260, 7681);
		super.aClass106_Sub2_43.method2925(34166, 0);
		super.aClass106_Sub2_43.method2881(0);
		OpenGL.glBindProgramARB(34336, this.aClass26_1.anInt663);
		OpenGL.glEnable(34336);
		this.aClass49_4.method1151();
		this.aClass49_4.method1154(1);
		super.aClass106_Sub2_43.method2881(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass106_Sub2_43.method2851(0);
		super.aClass106_Sub2_43.method2925(5890, 0);
		super.aClass106_Sub2_43.method2881(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass49_4.method1151();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!kk;)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1) {
		super.aClass106_Sub2_43.method2912(arg1);
		super.aClass106_Sub2_43.method2851(arg0);
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	@Override
	public void method6160() {
		if (this.aClass49_4 != null) {
			this.aClass49_4.method1153('\u0001');
			super.aClass106_Sub2_43.method2881(1);
			super.aClass106_Sub2_43.method2912(null);
			super.aClass106_Sub2_43.method2881(0);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6154(@OriginalArg(0) boolean arg0) {
		if (this.aClass49_4 == null) {
			return;
		}
		this.aClass49_4.method1153('\u0000');
		super.aClass106_Sub2_43.method2881(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass106_Sub2_43.aClass40_Sub2_3.method3908(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass106_Sub2_43.method2881(0);
		if (super.aClass106_Sub2_43.anInt3735 == this.anInt3849) {
			return;
		}
		@Pc(60) int local60 = super.aClass106_Sub2_43.anInt3735 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray20, local60);
			local60 += 2;
		}
		if (this.aClass135_3.aBoolean251) {
			this.aFloat60 = (float) (super.aClass106_Sub2_43.anInt3735 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3849 = super.aClass106_Sub2_43.anInt3735;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6157() {
		return true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	@Override
	public void method6153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass49_4 == null) {
			return;
		}
		super.aClass106_Sub2_43.method2881(1);
		@Pc(100) int local100;
		if ((arg1 & 0x80) != 0) {
			super.aClass106_Sub2_43.method2912(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass135_3.aBoolean251) {
				super.aClass106_Sub2_43.method2912(this.aClass135_3.aClass8_Sub4_2);
			} else {
				super.aClass106_Sub2_43.method2912(this.aClass135_3.aClass8_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass135_3.aBoolean251) {
			super.aClass106_Sub2_43.method2912(this.aClass135_3.aClass8_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat60, 0.0F, 0.0F, 1.0F);
		} else {
			local100 = super.aClass106_Sub2_43.anInt3735 % 4000 * 16 / 4000;
			super.aClass106_Sub2_43.method2912(this.aClass135_3.aClass8_Sub1Array2[local100]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass106_Sub2_43.method2881(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static43.aFloatArray12, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static43.aFloatArray12, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local100 = arg1 & 0x3;
		if (local100 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local100 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
