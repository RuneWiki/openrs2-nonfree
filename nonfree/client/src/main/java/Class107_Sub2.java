import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "F")
	private float aFloat125;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "Lclient!eha;")
	private Class91 aClass91_2;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
	private int anInt5185;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "Lclient!qr;")
	private final Class282 aClass282_2;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Lclient!pp;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[F")
	private float[] aFloatArray43;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!oea;Lclient!qr;)V")
	public Class107_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class282 arg1) {
		super(arg0);
		this.aClass282_2 = arg1;
		if (super.aClass87_Sub2_37.aBoolean555 && super.aClass87_Sub2_37.anInt7389 >= 2) {
			this.aClass264_1 = Static149.method7703(super.aClass87_Sub2_37, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass264_1 != null) {
				@Pc(39) int[][] local39 = Static169.method8415(0.4F);
				@Pc(50) int[][] local50 = Static169.method8415(0.4F);
				@Pc(52) int local52 = 0;
				this.aFloatArray43 = new float[32768];
				for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
					@Pc(63) int[] local63 = local39[local58];
					@Pc(67) int[] local67 = local50[local58];
					for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
						this.aFloatArray43[local52++] = (float) local63[local69] / 4096.0F;
						this.aFloatArray43[local52++] = (float) local67[local69] / 4096.0F;
					}
				}
				this.method4336();
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		if (this.aClass91_2 != null) {
			this.aClass91_2.method2497('\u0001');
			super.aClass87_Sub2_37.method6155(1);
			super.aClass87_Sub2_37.method6167(null);
			super.aClass87_Sub2_37.method6155(0);
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	private void method4336() {
		this.aClass91_2 = new Class91(super.aClass87_Sub2_37, 2);
		this.aClass91_2.method2499(0);
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6203(-16777216);
		super.aClass87_Sub2_37.method6227(260, 7681);
		super.aClass87_Sub2_37.method6195(34166, 0);
		super.aClass87_Sub2_37.method6155(0);
		OpenGL.glBindProgramARB(34336, this.aClass264_1.anInt7803);
		OpenGL.glEnable(34336);
		this.aClass91_2.method2495();
		this.aClass91_2.method2499(1);
		super.aClass87_Sub2_37.method6155(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass87_Sub2_37.method6159(0);
		super.aClass87_Sub2_37.method6195(5890, 0);
		super.aClass87_Sub2_37.method6155(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass91_2.method2495();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub2_37.method6167(arg0);
		super.aClass87_Sub2_37.method6159(arg1);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass91_2 == null) {
			return;
		}
		super.aClass87_Sub2_37.method6155(1);
		@Pc(77) int local77;
		if ((arg1 & 0x80) != 0) {
			super.aClass87_Sub2_37.method6167(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass282_2.aBoolean608) {
				super.aClass87_Sub2_37.method6167(this.aClass282_2.aClass88_Sub1_3);
			} else {
				super.aClass87_Sub2_37.method6167(this.aClass282_2.aClass88_Sub2Array1[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass282_2.aBoolean608) {
			super.aClass87_Sub2_37.method6167(this.aClass282_2.aClass88_Sub1_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat125, 0.0F, 0.0F, 1.0F);
		} else {
			local77 = super.aClass87_Sub2_37.anInt7366 % 4000 * 16 / 4000;
			super.aClass87_Sub2_37.method6167(this.aClass282_2.aClass88_Sub2Array1[local77]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass87_Sub2_37.method6155(0);
		if ((arg1 & 0x40) == 0) {
			Static244.aFloatArray41[2] = super.aClass87_Sub2_37.aFloat179 * super.aClass87_Sub2_37.aFloat174;
			Static244.aFloatArray41[0] = super.aClass87_Sub2_37.aFloat174 * super.aClass87_Sub2_37.aFloat176;
			Static244.aFloatArray41[1] = super.aClass87_Sub2_37.aFloat174 * super.aClass87_Sub2_37.aFloat180;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static244.aFloatArray41, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local77 = arg1 & 0x3;
		if (local77 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local77 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		if (this.aClass91_2 == null) {
			return;
		}
		this.aClass91_2.method2497('\u0000');
		super.aClass87_Sub2_37.method6155(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass87_Sub2_37.aClass6_Sub1_5.method107(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass87_Sub2_37.method6155(0);
		if (super.aClass87_Sub2_37.anInt7366 == this.anInt5185) {
			return;
		}
		@Pc(61) int local61 = super.aClass87_Sub2_37.anInt7366 % 5000 * 128 / 5000;
		for (@Pc(63) int local63 = 0; local63 < 64; local63++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local63, this.aFloatArray43, local61);
			local61 += 2;
		}
		if (this.aClass282_2.aBoolean608) {
			this.aFloat125 = (float) (super.aClass87_Sub2_37.anInt7366 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5185 = super.aClass87_Sub2_37.anInt7366;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return true;
	}
}
