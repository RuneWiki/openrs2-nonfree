import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class63_Sub5 extends Class63 {

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	private int anInt3817;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "F")
	private float aFloat40;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Lclient!lo;")
	private Class147 aClass147_3;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "Lclient!rk;")
	private final Class215 aClass215_3;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "Lclient!ud;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "[F")
	private float[] aFloatArray15;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!pg;Lclient!rk;)V")
	public Class63_Sub5(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class215 arg1) {
		super(arg0);
		this.aClass215_3 = arg1;
		if (super.aClass163_Sub2_43.aBoolean366 && super.aClass163_Sub2_43.anInt5250 >= 2) {
			this.aClass242_1 = Static74.method1096("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass163_Sub2_43);
			if (this.aClass242_1 != null) {
				@Pc(41) int[][] local41 = Static155.method2194(0.4F);
				@Pc(52) int[][] local52 = Static155.method2194(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray15 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray15[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray15[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method3063();
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		super.aClass163_Sub2_43.method4118(arg0);
		super.aClass163_Sub2_43.method4107(arg1);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	private void method3063() {
		this.aClass147_3 = new Class147(super.aClass163_Sub2_43, 2);
		this.aClass147_3.method3028(0);
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4129(-16777216);
		super.aClass163_Sub2_43.method4164(260, 7681);
		super.aClass163_Sub2_43.method4135(0, 34166);
		super.aClass163_Sub2_43.method4131(0);
		OpenGL.glBindProgramARB(34336, this.aClass242_1.anInt6561);
		OpenGL.glEnable(34336);
		this.aClass147_3.method3029();
		this.aClass147_3.method3028(1);
		super.aClass163_Sub2_43.method4131(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass163_Sub2_43.method4107(0);
		super.aClass163_Sub2_43.method4135(0, 5890);
		super.aClass163_Sub2_43.method4131(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass147_3.method3029();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass147_3 == null) {
			return;
		}
		super.aClass163_Sub2_43.method4131(1);
		@Pc(75) int local75;
		if ((arg0 & 0x80) != 0) {
			super.aClass163_Sub2_43.method4118(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass215_3.aBoolean431) {
				super.aClass163_Sub2_43.method4118(this.aClass215_3.aClass20_Sub2_3);
			} else {
				super.aClass163_Sub2_43.method4118(this.aClass215_3.aClass20_Sub1Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass215_3.aBoolean431) {
			super.aClass163_Sub2_43.method4118(this.aClass215_3.aClass20_Sub2_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat40, 0.0F, 0.0F, 1.0F);
		} else {
			local75 = super.aClass163_Sub2_43.anInt5219 % 4000 * 16 / 4000;
			super.aClass163_Sub2_43.method4118(this.aClass215_3.aClass20_Sub1Array4[local75]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass163_Sub2_43.method4131(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static407.aFloatArray32, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static407.aFloatArray32, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local75 = arg0 & 0x3;
		if (local75 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local75 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		if (this.aClass147_3 == null) {
			return;
		}
		this.aClass147_3.method3026('\u0000');
		super.aClass163_Sub2_43.method4131(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass163_Sub2_43.aClass31_Sub2_3.method4801(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass163_Sub2_43.method4131(0);
		if (super.aClass163_Sub2_43.anInt5219 == this.anInt3817) {
			return;
		}
		@Pc(60) int local60 = super.aClass163_Sub2_43.anInt5219 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray15, local60);
			local60 += 2;
		}
		if (this.aClass215_3.aBoolean431) {
			this.aFloat40 = (float) (super.aClass163_Sub2_43.anInt5219 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt3817 = super.aClass163_Sub2_43.anInt5219;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		if (this.aClass147_3 != null) {
			this.aClass147_3.method3026('\u0001');
			super.aClass163_Sub2_43.method4131(1);
			super.aClass163_Sub2_43.method4118(null);
			super.aClass163_Sub2_43.method4131(0);
		}
	}
}
