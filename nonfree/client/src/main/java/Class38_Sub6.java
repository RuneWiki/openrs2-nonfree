import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nka")
public final class Class38_Sub6 extends Class38 {

	@OriginalMember(owner = "client!nka", name = "f", descriptor = "Lclient!vb;")
	private Class371 aClass371_3;

	@OriginalMember(owner = "client!nka", name = "i", descriptor = "I")
	private int anInt7107;

	@OriginalMember(owner = "client!nka", name = "m", descriptor = "F")
	private float aFloat121;

	@OriginalMember(owner = "client!nka", name = "s", descriptor = "Lclient!sn;")
	private final Class336 aClass336_4;

	@OriginalMember(owner = "client!nka", name = "p", descriptor = "Lclient!ko;")
	private Class208 aClass208_5;

	@OriginalMember(owner = "client!nka", name = "r", descriptor = "[F")
	private float[] aFloatArray56;

	@OriginalMember(owner = "client!nka", name = "<init>", descriptor = "(Lclient!pi;Lclient!sn;)V")
	public Class38_Sub6(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_4 = arg1;
		if (super.aClass144_Sub3_43.aBoolean565 && super.aClass144_Sub3_43.anInt8080 >= 2) {
			this.aClass208_5 = Static335.method5158(super.aClass144_Sub3_43, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass208_5 != null) {
				@Pc(42) int[][] local42 = Static239.method4005(0.4F);
				@Pc(53) int[][] local53 = Static239.method4005(0.4F);
				this.aFloatArray56 = new float[32768];
				@Pc(59) int local59 = 0;
				for (@Pc(61) int local61 = 0; local61 < 256; local61++) {
					@Pc(66) int[] local66 = local42[local61];
					@Pc(70) int[] local70 = local53[local61];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray56[local59++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray56[local59++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method6210();
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.method8907('\u0001');
			super.aClass144_Sub3_43.method7028(1);
			super.aClass144_Sub3_43.method6982((Class161) null);
			super.aClass144_Sub3_43.method7028(0);
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return true;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		if (this.aClass371_3 == null) {
			return;
		}
		this.aClass371_3.method8907('\u0000');
		super.aClass144_Sub3_43.method7028(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass144_Sub3_43.aClass263_Sub1_5.method6419(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass144_Sub3_43.method7028(0);
		if (super.aClass144_Sub3_43.anInt8054 == this.anInt7107) {
			return;
		}
		@Pc(60) int local60 = super.aClass144_Sub3_43.anInt8054 % 5000 * 128 / 5000;
		for (@Pc(62) int local62 = 0; local62 < 64; local62++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local62, this.aFloatArray56, local60);
			local60 += 2;
		}
		if (this.aClass336_4.aBoolean650) {
			this.aFloat121 = (float) (super.aClass144_Sub3_43.anInt8054 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt7107 = super.aClass144_Sub3_43.anInt8054;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass371_3 == null) {
			return;
		}
		super.aClass144_Sub3_43.method7028(1);
		@Pc(98) int local98;
		if ((arg0 & 0x80) != 0) {
			super.aClass144_Sub3_43.method6982((Class161) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass336_4.aBoolean650) {
				super.aClass144_Sub3_43.method6982(this.aClass336_4.aClass161_Sub3_2);
			} else {
				super.aClass144_Sub3_43.method6982(this.aClass336_4.aClass161_Sub1Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass336_4.aBoolean650) {
			super.aClass144_Sub3_43.method6982(this.aClass336_4.aClass161_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat121, 0.0F, 0.0F, 1.0F);
		} else {
			local98 = super.aClass144_Sub3_43.anInt8054 % 4000 * 16 / 4000;
			super.aClass144_Sub3_43.method6982(this.aClass336_4.aClass161_Sub1Array3[local98]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass144_Sub3_43.method7028(0);
		if ((arg0 & 0x40) == 0) {
			Static196.aFloatArray17[2] = super.aClass144_Sub3_43.aFloat145 * super.aClass144_Sub3_43.lb;
			Static196.aFloatArray17[0] = super.aClass144_Sub3_43.lb * super.aClass144_Sub3_43.aFloat144;
			Static196.aFloatArray17[1] = super.aClass144_Sub3_43.lb * super.aClass144_Sub3_43.aFloat161;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static196.aFloatArray17, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local98 = arg0 & 0x3;
		if (local98 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local98 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Z)V")
	private void method6210() {
		this.aClass371_3 = new Class371(super.aClass144_Sub3_43, 2);
		this.aClass371_3.method8902(0);
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method7043(-16777216);
		super.aClass144_Sub3_43.method7025(260, 7681);
		super.aClass144_Sub3_43.method7021(34166, 0);
		super.aClass144_Sub3_43.method7028(0);
		OpenGL.glBindProgramARB(34336, this.aClass208_5.anInt5618);
		OpenGL.glEnable(34336);
		this.aClass371_3.method8904();
		this.aClass371_3.method8902(1);
		super.aClass144_Sub3_43.method7028(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass144_Sub3_43.method6988(0);
		super.aClass144_Sub3_43.method7021(5890, 0);
		super.aClass144_Sub3_43.method7028(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass371_3.method8904();
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		super.aClass144_Sub3_43.method6982(arg0);
		super.aClass144_Sub3_43.method6988(arg1);
	}
}
