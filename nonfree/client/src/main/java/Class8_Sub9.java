import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class8_Sub9 extends Class8 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
	private int anInt8703;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!ml;")
	private Class204 aClass204_6;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "F")
	private float aFloat181;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Lclient!h;")
	private final Class122 aClass122_6;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "Lclient!afa;")
	private Class10 aClass10_5;

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "[F")
	private float[] aFloatArray75;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!en;Lclient!h;)V")
	public Class8_Sub9(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class122 arg1) {
		super(arg0);
		this.aClass122_6 = arg1;
		if (super.aClass90_Sub1_38.aBoolean151 && super.aClass90_Sub1_38.anInt2468 >= 2) {
			this.aClass10_5 = Static47.method748(super.aClass90_Sub1_38, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass10_5 != null) {
				@Pc(41) int[][] local41 = Static316.method4925(0.4F);
				@Pc(52) int[][] local52 = Static316.method4925(0.4F);
				@Pc(54) int local54 = 0;
				this.aFloatArray75 = new float[32768];
				for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
					@Pc(66) int[] local66 = local41[local60];
					@Pc(70) int[] local70 = local52[local60];
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						this.aFloatArray75[local54++] = (float) local66[local72] / 4096.0F;
						this.aFloatArray75[local54++] = (float) local70[local72] / 4096.0F;
					}
				}
				this.method6931();
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		if (this.aClass204_6 != null) {
			this.aClass204_6.method4982('\u0001');
			super.aClass90_Sub1_38.method2069(1);
			super.aClass90_Sub1_38.method2126(null);
			super.aClass90_Sub1_38.method2069(0);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		if (this.aClass204_6 == null) {
			return;
		}
		this.aClass204_6.method4982('\u0000');
		super.aClass90_Sub1_38.method2069(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass90_Sub1_38.aClass93_Sub2_3.method3568(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass90_Sub1_38.method2069(0);
		if (super.aClass90_Sub1_38.anInt2434 == this.anInt8703) {
			return;
		}
		@Pc(60) int local60 = super.aClass90_Sub1_38.anInt2434 % 5120 * 128 / 5120;
		local60 *= 128;
		for (@Pc(66) int local66 = 0; local66 < 64; local66++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local66, this.aFloatArray75, local60);
			local60 += 2;
		}
		if (this.aClass122_6.aBoolean288) {
			this.aFloat181 = (float) (super.aClass90_Sub1_38.anInt2434 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt8703 = super.aClass90_Sub1_38.anInt2434;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass204_6 == null) {
			return;
		}
		super.aClass90_Sub1_38.method2069(1);
		@Pc(44) int local44;
		if ((arg1 & 0x80) != 0) {
			super.aClass90_Sub1_38.method2126(null);
		} else if ((arg0 & 0x1) != 1) {
			if (this.aClass122_6.aBoolean288) {
				super.aClass90_Sub1_38.method2126(this.aClass122_6.aClass16_Sub2_3);
			} else {
				super.aClass90_Sub1_38.method2126(this.aClass122_6.aClass16_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass122_6.aBoolean288) {
			super.aClass90_Sub1_38.method2126(this.aClass122_6.aClass16_Sub2_3);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat181, 0.0F, 0.0F, 1.0F);
		} else {
			local44 = super.aClass90_Sub1_38.anInt2434 % 4000 * 16 / 4000;
			super.aClass90_Sub1_38.method2126(this.aClass122_6.aClass16_Sub1Array2[local44]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		super.aClass90_Sub1_38.method2069(0);
		if ((arg1 & 0x40) == 0) {
			OpenGL.glGetFloatv(2899, Static209.aFloatArray28, 0);
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, Static209.aFloatArray28, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local44 = arg1 & 0x3;
		if (local44 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local44 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	private void method6931() {
		this.aClass204_6 = new Class204(super.aClass90_Sub1_38, 2);
		this.aClass204_6.method4985(0);
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2083(-16777216);
		super.aClass90_Sub1_38.method2120(7681, 260);
		super.aClass90_Sub1_38.method2133(0, 34166);
		super.aClass90_Sub1_38.method2069(0);
		OpenGL.glBindProgramARB(34336, this.aClass10_5.anInt142);
		OpenGL.glEnable(34336);
		this.aClass204_6.method4987();
		this.aClass204_6.method4985(1);
		super.aClass90_Sub1_38.method2069(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		super.aClass90_Sub1_38.method2123(0);
		super.aClass90_Sub1_38.method2133(0, 5890);
		super.aClass90_Sub1_38.method2069(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass204_6.method4987();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		super.aClass90_Sub1_38.method2126(arg1);
		super.aClass90_Sub1_38.method2123(arg0);
	}
}
