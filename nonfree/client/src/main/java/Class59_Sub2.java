import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	private int anInt2922;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "Lclient!vh;")
	private Class365 aClass365_2;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "Lclient!lha;")
	private final Class213 aClass213_2;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Lclient!jq;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!bi;Lclient!lha;)V")
	public Class59_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_2 = arg1;
		if (super.aClass13_Sub2_43.aBoolean85 && super.aClass13_Sub2_43.anInt1113 >= 2) {
			this.aClass187_1 = Static476.method6758("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass13_Sub2_43);
			if (this.aClass187_1 != null) {
				@Pc(37) int[][] local37 = Static269.method4434(0.4F);
				@Pc(48) int[][] local48 = Static269.method4434(0.4F);
				this.aFloatArray19 = new float[32768];
				@Pc(54) int local54 = 0;
				for (@Pc(56) int local56 = 0; local56 < 256; local56++) {
					@Pc(61) int[] local61 = local37[local56];
					@Pc(65) int[] local65 = local48[local56];
					for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
						this.aFloatArray19[local54++] = (float) local61[local67] / 4096.0F;
						this.aFloatArray19[local54++] = (float) local65[local67] / 4096.0F;
					}
				}
				this.method2522();
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		if (this.aClass365_2 != null) {
			this.aClass365_2.method8548('\u0001');
			super.aClass13_Sub2_43.method1093(1);
			super.aClass13_Sub2_43.method1096((Class10) null);
			super.aClass13_Sub2_43.method1093(0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		if (this.aClass365_2 == null) {
			return;
		}
		this.aClass365_2.method8548('\u0000');
		super.aClass13_Sub2_43.method1093(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass13_Sub2_43.aClass51_Sub3_5.method6725(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass13_Sub2_43.method1093(0);
		if (super.aClass13_Sub2_43.anInt1076 == this.anInt2922) {
			return;
		}
		@Pc(57) int local57 = super.aClass13_Sub2_43.anInt1076 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray19, local57);
			local57 += 2;
		}
		if (this.aClass213_2.aBoolean413) {
			this.aFloat59 = (float) (super.aClass13_Sub2_43.anInt1076 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2922 = super.aClass13_Sub2_43.anInt1076;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	private void method2522() {
		this.aClass365_2 = new Class365(super.aClass13_Sub2_43, 2);
		this.aClass365_2.method8546(0);
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1068(-16777216);
		super.aClass13_Sub2_43.method1045(260, 7681);
		super.aClass13_Sub2_43.method1034(34166, 0);
		super.aClass13_Sub2_43.method1093(0);
		OpenGL.glBindProgramARB(34336, this.aClass187_1.anInt5092);
		OpenGL.glEnable(34336);
		this.aClass365_2.method8549();
		this.aClass365_2.method8546(1);
		super.aClass13_Sub2_43.method1093(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass13_Sub2_43.method1046(0);
		super.aClass13_Sub2_43.method1034(5890, 0);
		super.aClass13_Sub2_43.method1093(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass365_2.method8549();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass365_2 == null) {
			return;
		}
		super.aClass13_Sub2_43.method1093(1);
		@Pc(46) int local46;
		if ((arg1 & 0x80) != 0) {
			super.aClass13_Sub2_43.method1096((Class10) null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass213_2.aBoolean413) {
				super.aClass13_Sub2_43.method1096(this.aClass213_2.aClass10_Sub4_2);
			} else {
				super.aClass13_Sub2_43.method1096(this.aClass213_2.aClass10_Sub2Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass213_2.aBoolean413) {
			super.aClass13_Sub2_43.method1096(this.aClass213_2.aClass10_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat59, 0.0F, 0.0F, 1.0F);
		} else {
			local46 = super.aClass13_Sub2_43.anInt1076 % 4000 * 16 / 4000;
			super.aClass13_Sub2_43.method1096(this.aClass213_2.aClass10_Sub2Array3[local46]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass13_Sub2_43.method1093(0);
		if ((arg1 & 0x40) == 0) {
			Static563.aFloatArray88[1] = super.aClass13_Sub2_43.aFloat23 * super.aClass13_Sub2_43.aFloat13;
			Static563.aFloatArray88[2] = super.aClass13_Sub2_43.aFloat10 * super.aClass13_Sub2_43.aFloat13;
			Static563.aFloatArray88[0] = super.aClass13_Sub2_43.aFloat22 * super.aClass13_Sub2_43.aFloat13;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static563.aFloatArray88, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local46 = arg1 & 0x3;
		if (local46 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local46 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		super.aClass13_Sub2_43.method1096(arg1);
		super.aClass13_Sub2_43.method1046(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return true;
	}
}
