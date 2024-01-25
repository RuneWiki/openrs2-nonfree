import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class72_Sub9 extends Class72 {

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Lclient!sc;")
	private Class223 aClass223_6;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	private int anInt7639;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "Lclient!po;")
	private final Class194 aClass194_6;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "Lclient!tq;")
	private Class237 aClass237_5;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "[F")
	private float[] aFloatArray34;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!vj;Lclient!po;)V")
	public Class72_Sub9(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class194 arg1) {
		super(arg0);
		this.aClass194_6 = arg1;
		if (super.aClass172_Sub2_43.aBoolean609 && super.aClass172_Sub2_43.anInt7195 >= 2) {
			this.aClass237_5 = Static63.method1285(super.aClass172_Sub2_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass237_5 != null) {
				@Pc(37) int[][] local37 = Static411.method5287(0.4F);
				@Pc(48) int[][] local48 = Static411.method5287(0.4F);
				this.aFloatArray34 = new float[32768];
				@Pc(54) int local54 = 0;
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray34[local54++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray34[local54++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method5972();
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		if (this.aClass223_6 == null) {
			return;
		}
		this.aClass223_6.method4785('\u0000');
		super.aClass172_Sub2_43.method5569(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass172_Sub2_43.aClass107_Sub1_3.method3750(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass172_Sub2_43.method5569(0);
		if (this.anInt7639 == super.aClass172_Sub2_43.anInt7161) {
			return;
		}
		@Pc(60) int local60 = super.aClass172_Sub2_43.anInt7161 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray34, local60);
			local60 += 2;
		}
		if (this.aClass194_6.aBoolean474) {
			@Pc(92) float local92 = (float) (super.aClass172_Sub2_43.anInt7161 % 4000) / 4000.0F;
			OpenGL.glProgramLocalParameter4fARB(34336, 65, local92, 0.0F, 0.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7639 = super.aClass172_Sub2_43.anInt7161;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		super.aClass172_Sub2_43.method5630(arg1);
		super.aClass172_Sub2_43.method5629(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		if (this.aClass223_6 != null) {
			this.aClass223_6.method4785('\u0001');
			super.aClass172_Sub2_43.method5569(1);
			super.aClass172_Sub2_43.method5630(null);
			super.aClass172_Sub2_43.method5569(0);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	private void method5972() {
		this.aClass223_6 = new Class223(super.aClass172_Sub2_43, 2);
		this.aClass223_6.method4786(0);
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5593(-16777216);
		super.aClass172_Sub2_43.method5591(260, 7681);
		super.aClass172_Sub2_43.method5592(34166, 0);
		super.aClass172_Sub2_43.method5569(0);
		OpenGL.glBindProgramARB(34336, this.aClass237_5.anInt6534);
		OpenGL.glEnable(34336);
		this.aClass223_6.method4784();
		this.aClass223_6.method4786(1);
		super.aClass172_Sub2_43.method5569(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass172_Sub2_43.method5629(0);
		super.aClass172_Sub2_43.method5592(5890, 0);
		super.aClass172_Sub2_43.method5569(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass223_6.method4784();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass223_6 == null) {
			return;
		}
		super.aClass172_Sub2_43.method5569(1);
		@Pc(32) int local32;
		if ((arg0 & 0x80) != 0) {
			super.aClass172_Sub2_43.method5630(null);
		} else if (this.aClass194_6.aBoolean474) {
			super.aClass172_Sub2_43.method5630(this.aClass194_6.aClass112_Sub1_2);
		} else {
			local32 = super.aClass172_Sub2_43.anInt7161 % 4000 * 16 / 4000;
			super.aClass172_Sub2_43.method5630(this.aClass194_6.aClass112_Sub2Array1[local32]);
		}
		super.aClass172_Sub2_43.method5569(0);
		if ((arg0 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static421.aFloatArray17, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static421.aFloatArray17, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local32 = arg0 & 0x3;
		if (local32 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local32 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}
}
