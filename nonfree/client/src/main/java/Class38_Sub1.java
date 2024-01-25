import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "Lclient!pb;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!qf;")
	private final Class198 aClass198_1;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "Lclient!ik;")
	private Class112 aClass112_1;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "[F")
	private float[] aFloatArray2;

	static {
		new Class119("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ur;Lclient!qf;)V")
	public Class38_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_1 = arg1;
		if (super.aClass34_Sub2_41.aBoolean773 && super.aClass34_Sub2_41.anInt7104 >= 2) {
			this.aClass112_1 = Static66.method1082("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass34_Sub2_41);
			if (this.aClass112_1 != null) {
				@Pc(41) int[][] local41 = Static103.method1585(0.4F);
				@Pc(52) int[][] local52 = Static103.method1585(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray2 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray2[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray2[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method865();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	private void method865() {
		this.aClass184_1 = new Class184(super.aClass34_Sub2_41, 2);
		this.aClass184_1.method4094(0);
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5533(-16777216);
		super.aClass34_Sub2_41.method5526(260, 7681);
		super.aClass34_Sub2_41.method5534(0, 34166);
		super.aClass34_Sub2_41.method5507(0);
		OpenGL.glBindProgramARB(34336, this.aClass112_1.anInt2818);
		OpenGL.glEnable(34336);
		this.aClass184_1.method4095();
		this.aClass184_1.method4094(1);
		super.aClass34_Sub2_41.method5507(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass34_Sub2_41.method5517(0);
		super.aClass34_Sub2_41.method5534(0, 5890);
		super.aClass34_Sub2_41.method5507(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass184_1.method4095();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		super.aClass34_Sub2_41.method5493(arg0);
		super.aClass34_Sub2_41.method5517(arg1);
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		if (this.aClass184_1 == null) {
			return;
		}
		this.aClass184_1.method4096('\u0000');
		super.aClass34_Sub2_41.method5507(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass34_Sub2_41.aClass32_Sub2_3.method3239(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, (float) 0, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass34_Sub2_41.method5507(0);
		if (this.anInt897 == super.aClass34_Sub2_41.anInt7073) {
			return;
		}
		@Pc(59) int local59 = super.aClass34_Sub2_41.anInt7073 % 5120 * 128 / 5120;
		local59 *= 128;
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local65, this.aFloatArray2, local59);
			local59 += 2;
		}
		if (this.aClass198_1.aBoolean630) {
			this.aFloat12 = (float) (super.aClass34_Sub2_41.anInt7073 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt897 = super.aClass34_Sub2_41.anInt7073;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass184_1 == null) {
			return;
		}
		super.aClass34_Sub2_41.method5507(1);
		@Pc(70) int local70;
		if ((arg1 & 0x80) != 0) {
			super.aClass34_Sub2_41.method5493(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass198_1.aBoolean630) {
				super.aClass34_Sub2_41.method5493(this.aClass198_1.aClass10_Sub4_2);
			} else {
				super.aClass34_Sub2_41.method5493(this.aClass198_1.aClass10_Sub1Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass198_1.aBoolean630) {
			super.aClass34_Sub2_41.method5493(this.aClass198_1.aClass10_Sub4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat12, 0.0F, 0.0F, 1.0F);
		} else {
			local70 = super.aClass34_Sub2_41.anInt7073 % 4000 * 16 / 4000;
			super.aClass34_Sub2_41.method5493(this.aClass198_1.aClass10_Sub1Array4[local70]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass34_Sub2_41.method5507(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static28.aFloatArray1, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static28.aFloatArray1, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local70 = arg1 & 0x3;
		if (local70 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local70 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		if (this.aClass184_1 != null) {
			this.aClass184_1.method4096('\u0001');
			super.aClass34_Sub2_41.method5507(1);
			super.aClass34_Sub2_41.method5493(null);
			super.aClass34_Sub2_41.method5507(0);
		}
	}
}
