import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class17_Sub4 extends Class17 {

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!rn;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	private int anInt2819;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Lclient!uo;")
	private final Class249 aClass249_3;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Lclient!rm;")
	private Class212 aClass212_1;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[F")
	private float[] aFloatArray6;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!kd;Lclient!uo;)V")
	public Class17_Sub4(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class249 arg1) {
		super(arg0);
		this.aClass249_3 = arg1;
		if (super.aClass39_Sub2_41.aBoolean235 && super.aClass39_Sub2_41.anInt3799 >= 2) {
			this.aClass212_1 = Static75.method1502("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass39_Sub2_41);
			if (this.aClass212_1 != null) {
				@Pc(37) int[][] local37 = Static266.method5706(0.4F);
				@Pc(48) int[][] local48 = Static266.method5706(0.4F);
				@Pc(50) int local50 = 0;
				this.aFloatArray6 = new float[32768];
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray6[local50++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray6[local50++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method2418();
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub2_41.method3203(arg0);
		super.aClass39_Sub2_41.method3162(arg1);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	private void method2418() {
		this.aClass213_2 = new Class213(super.aClass39_Sub2_41, 2);
		this.aClass213_2.method4858(0);
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3206(-16777216);
		super.aClass39_Sub2_41.method3156(7681, 260);
		super.aClass39_Sub2_41.method3210(34166, 0);
		super.aClass39_Sub2_41.method3221(0);
		OpenGL.glBindProgramARB(34336, this.aClass212_1.anInt5831);
		OpenGL.glEnable(34336);
		this.aClass213_2.method4862();
		this.aClass213_2.method4858(1);
		super.aClass39_Sub2_41.method3221(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass39_Sub2_41.method3162(0);
		super.aClass39_Sub2_41.method3210(5890, 0);
		super.aClass39_Sub2_41.method3221(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass213_2.method4862();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		if (this.aClass213_2 == null) {
			return;
		}
		this.aClass213_2.method4857('\u0000');
		super.aClass39_Sub2_41.method3221(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass39_Sub2_41.aClass33_Sub2_3.method4621(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass39_Sub2_41.method3221(0);
		if (super.aClass39_Sub2_41.anInt3776 == this.anInt2819) {
			return;
		}
		@Pc(66) int local66 = super.aClass39_Sub2_41.anInt3776 % 5120 * 128 / 5120;
		local66 *= 128;
		for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local72, this.aFloatArray6, local66);
			local66 += 2;
		}
		if (this.aClass249_3.aBoolean456) {
			@Pc(99) float local99 = (float) (super.aClass39_Sub2_41.anInt3776 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local99, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2819 = super.aClass39_Sub2_41.anInt3776;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass213_2 == null) {
			return;
		}
		super.aClass39_Sub2_41.method3221(1);
		@Pc(39) int local39;
		if ((arg1 & 0x80) != 0) {
			super.aClass39_Sub2_41.method3203(null);
		} else if (this.aClass249_3.aBoolean456) {
			super.aClass39_Sub2_41.method3203(this.aClass249_3.aClass3_Sub4_3);
		} else {
			local39 = super.aClass39_Sub2_41.anInt3776 % 4000 * 16 / 4000;
			super.aClass39_Sub2_41.method3203(this.aClass249_3.aClass3_Sub2Array3[local39]);
		}
		super.aClass39_Sub2_41.method3221(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static388.aFloatArray29, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static388.aFloatArray29, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local39 = arg1 & 0x3;
		if (local39 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local39 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		if (this.aClass213_2 != null) {
			this.aClass213_2.method4857('\u0001');
			super.aClass39_Sub2_41.method3221(1);
			super.aClass39_Sub2_41.method3203(null);
			super.aClass39_Sub2_41.method3221(0);
		}
	}
}
