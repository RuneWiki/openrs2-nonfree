import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class21_Sub8 extends Class21 {

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	private int anInt10092;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "F")
	private float aFloat197;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!cga;")
	private Class58 aClass58_5;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!ol;")
	private final Class264 aClass264_6;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!wea;")
	private Class386 aClass386_5;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[F")
	private float[] aFloatArray82;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!hk;Lclient!ol;)V")
	public Class21_Sub8(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_6 = arg1;
		if (super.aClass16_Sub2_43.aBoolean336 && super.aClass16_Sub2_43.anInt4404 >= 2) {
			this.aClass386_5 = Static478.method6830("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.aClass16_Sub2_43);
			if (this.aClass386_5 != null) {
				@Pc(41) int[][] local41 = Static349.method5249(0.4F);
				@Pc(52) int[][] local52 = Static349.method5249(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray82 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray82[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray82[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method8586();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		if (this.aClass58_5 == null) {
			return;
		}
		this.aClass58_5.method1625('\u0000');
		super.aClass16_Sub2_43.method3683(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass16_Sub2_43.aClass25_Sub1_5.method844(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass16_Sub2_43.method3683(0);
		if (super.aClass16_Sub2_43.anInt4365 == this.anInt10092) {
			return;
		}
		@Pc(63) int local63 = super.aClass16_Sub2_43.anInt4365 % 5000 * 128 / 5000;
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local65, this.aFloatArray82, local63);
			local63 += 2;
		}
		if (this.aClass264_6.aBoolean579) {
			this.aFloat197 = (float) (super.aClass16_Sub2_43.anInt4365 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt10092 = super.aClass16_Sub2_43.anInt4365;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass58_5 == null) {
			return;
		}
		super.aClass16_Sub2_43.method3683(1);
		@Pc(99) int local99;
		if ((arg0 & 0x80) != 0) {
			super.aClass16_Sub2_43.method3620((Class39) null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass264_6.aBoolean579) {
				super.aClass16_Sub2_43.method3620(this.aClass264_6.aClass39_Sub3_2);
			} else {
				super.aClass16_Sub2_43.method3620(this.aClass264_6.aClass39_Sub4Array3[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass264_6.aBoolean579) {
			super.aClass16_Sub2_43.method3620(this.aClass264_6.aClass39_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat197, 0.0F, 0.0F, 1.0F);
		} else {
			local99 = super.aClass16_Sub2_43.anInt4365 % 4000 * 16 / 4000;
			super.aClass16_Sub2_43.method3620(this.aClass264_6.aClass39_Sub4Array3[local99]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass16_Sub2_43.method3683(0);
		if ((arg0 & 0x40) == 0) {
			Static388.aFloatArray47[0] = super.aClass16_Sub2_43.aFloat86 * super.aClass16_Sub2_43.aFloat94;
			Static388.aFloatArray47[2] = super.aClass16_Sub2_43.aFloat91 * super.aClass16_Sub2_43.aFloat86;
			Static388.aFloatArray47[1] = super.aClass16_Sub2_43.aFloat88 * super.aClass16_Sub2_43.aFloat86;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static388.aFloatArray47, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local99 = arg0 & 0x3;
		if (local99 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local99 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	private void method8586() {
		this.aClass58_5 = new Class58(super.aClass16_Sub2_43, 2);
		this.aClass58_5.method1621(0);
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3644(-16777216);
		super.aClass16_Sub2_43.method3671(260, 7681);
		super.aClass16_Sub2_43.method3661(0, 34166);
		super.aClass16_Sub2_43.method3683(0);
		OpenGL.glBindProgramARB(34336, this.aClass386_5.anInt10225);
		OpenGL.glEnable(34336);
		this.aClass58_5.method1620();
		this.aClass58_5.method1621(1);
		super.aClass16_Sub2_43.method3683(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass16_Sub2_43.method3680(0);
		super.aClass16_Sub2_43.method3661(0, 5890);
		super.aClass16_Sub2_43.method3683(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass58_5.method1620();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		super.aClass16_Sub2_43.method3620(arg1);
		super.aClass16_Sub2_43.method3680(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		if (this.aClass58_5 != null) {
			this.aClass58_5.method1625('\u0001');
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3620((Class39) null);
			super.aClass16_Sub2_43.method3683(0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return true;
	}
}
