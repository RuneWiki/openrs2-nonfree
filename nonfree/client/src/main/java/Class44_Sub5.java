import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class44_Sub5 extends Class44 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "F")
	private float aFloat116;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
	private int anInt5240;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Lclient!pia;")
	private Class283 aClass283_4;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!od;")
	private final Class262 aClass262_3;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!vea;")
	private Class372 aClass372_1;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!pc;Lclient!od;)V")
	public Class44_Sub5(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class262 arg1) {
		super(arg0);
		this.aClass262_3 = arg1;
		if (super.aClass33_Sub3_34.aBoolean565 && super.aClass33_Sub3_34.anInt7289 >= 2) {
			this.aClass372_1 = Static355.method4754("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass33_Sub3_34);
			if (this.aClass372_1 != null) {
				@Pc(41) int[][] local41 = Static293.method4167(0.4F);
				@Pc(52) int[][] local52 = Static293.method4167(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray26 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray26[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray26[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method4637();
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		super.aClass33_Sub3_34.method6340(arg1);
		super.aClass33_Sub3_34.method6336(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		if (this.aClass283_4 == null) {
			return;
		}
		this.aClass283_4.method6453('\u0000');
		super.aClass33_Sub3_34.method6329(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass33_Sub3_34.aClass92_Sub2_5.method3225(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass33_Sub3_34.method6329(0);
		if (this.anInt5240 == super.aClass33_Sub3_34.anInt7264) {
			return;
		}
		@Pc(57) int local57 = super.aClass33_Sub3_34.anInt7264 % 5000 * 128 / 5000;
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local59, this.aFloatArray26, local57);
			local57 += 2;
		}
		if (this.aClass262_3.aBoolean519) {
			this.aFloat116 = (float) (super.aClass33_Sub3_34.anInt7264 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt5240 = super.aClass33_Sub3_34.anInt7264;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		if (this.aClass283_4 != null) {
			this.aClass283_4.method6453('\u0001');
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6340((Class116) null);
			super.aClass33_Sub3_34.method6329(0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass283_4 == null) {
			return;
		}
		super.aClass33_Sub3_34.method6329(1);
		@Pc(75) int local75;
		if ((arg0 & 0x80) != 0) {
			super.aClass33_Sub3_34.method6340((Class116) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass262_3.aBoolean519) {
				super.aClass33_Sub3_34.method6340(this.aClass262_3.aClass116_Sub3_3);
			} else {
				super.aClass33_Sub3_34.method6340(this.aClass262_3.aClass116_Sub2Array4[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass262_3.aBoolean519) {
			super.aClass33_Sub3_34.method6340(this.aClass262_3.aClass116_Sub3_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat116, 0.0F, 0.0F, 1.0F);
		} else {
			local75 = super.aClass33_Sub3_34.anInt7264 % 4000 * 16 / 4000;
			super.aClass33_Sub3_34.method6340(this.aClass262_3.aClass116_Sub2Array4[local75]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass33_Sub3_34.method6329(0);
		if ((arg0 & 0x40) == 0) {
			Static67.aFloatArray3[1] = super.aClass33_Sub3_34.aFloat176 * super.aClass33_Sub3_34.aFloat179;
			Static67.aFloatArray3[0] = super.aClass33_Sub3_34.aFloat176 * super.aClass33_Sub3_34.aFloat164;
			Static67.aFloatArray3[2] = super.aClass33_Sub3_34.aFloat171 * super.aClass33_Sub3_34.aFloat176;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static67.aFloatArray3, 0);
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

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	private void method4637() {
		this.aClass283_4 = new Class283(super.aClass33_Sub3_34, 2);
		this.aClass283_4.method6455(0);
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6357(-16777216);
		super.aClass33_Sub3_34.method6365(7681, 260);
		super.aClass33_Sub3_34.method6335(0, 34166);
		super.aClass33_Sub3_34.method6329(0);
		OpenGL.glBindProgramARB(34336, this.aClass372_1.anInt9862);
		OpenGL.glEnable(34336);
		this.aClass283_4.method6454();
		this.aClass283_4.method6455(1);
		super.aClass33_Sub3_34.method6329(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass33_Sub3_34.method6336(0);
		super.aClass33_Sub3_34.method6335(0, 5890);
		super.aClass33_Sub3_34.method6329(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass283_4.method6454();
	}
}
