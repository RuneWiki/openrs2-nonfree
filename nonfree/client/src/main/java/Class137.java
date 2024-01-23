import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class137 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt4199;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	private int anInt4201;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Z")
	public boolean aBoolean259;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Z")
	public boolean aBoolean260;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public int anInt4203;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	private int anInt4204;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public int anInt4206;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	private int anInt4207;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public int anInt4210;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public int anInt4211;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	private int anInt4213;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!ik;")
	public Class76 aClass76_1;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public int anInt4214;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
	public int anInt4215;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
	public int anInt4217;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "[F")
	public float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class137(@OriginalArg(0) Class4_Sub24 arg0) {
		if (Static23.anIntArray65 == null) {
			Static282.method4407();
		}
		this.anInt4211 = arg0.method3110();
		this.aBoolean259 = (this.anInt4211 & 0x10) != 0;
		this.aBoolean260 = (this.anInt4211 & 0x8) != 0;
		this.anInt4211 &= 0x7;
		this.anInt4206 = arg0.method3085();
		this.anInt4215 = arg0.method3085();
		this.anInt4217 = arg0.method3085();
		this.anInt4210 = arg0.method3110();
		this.method3401();
		this.aShortArray74 = new short[this.anInt4210 * 2 + 1];
		@Pc(84) int local84;
		for (local84 = 0; local84 < this.aShortArray74.length; local84++) {
			this.aShortArray74[local84] = (short) arg0.method3085();
		}
		this.anInt4203 = Static283.anIntArray441[arg0.method3085()];
		local84 = arg0.method3110();
		this.anInt4214 = local84 & 0x1F;
		this.anInt4207 = (local84 & 0xE0) << 3;
		if (this.anInt4214 != 31) {
			this.method3399();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	private void method3399() {
		@Pc(13) int local13 = this.anInt4214;
		if (local13 == 2) {
			this.anInt4199 = 2048;
			this.anInt4204 = 2048;
			this.anInt4201 = 1;
			this.anInt4213 = 0;
		} else if (local13 == 3) {
			this.anInt4204 = 2048;
			this.anInt4201 = 1;
			this.anInt4199 = 4096;
			this.anInt4213 = 0;
		} else if (local13 == 4) {
			this.anInt4213 = 0;
			this.anInt4199 = 2048;
			this.anInt4201 = 4;
			this.anInt4204 = 2048;
		} else if (local13 == 5) {
			this.anInt4199 = 8192;
			this.anInt4204 = 2048;
			this.anInt4201 = 4;
			this.anInt4213 = 0;
		} else if (local13 == 12) {
			this.anInt4201 = 2;
			this.anInt4204 = 2048;
			this.anInt4199 = 2048;
			this.anInt4213 = 0;
		} else if (local13 == 13) {
			this.anInt4199 = 8192;
			this.anInt4204 = 2048;
			this.anInt4201 = 2;
			this.anInt4213 = 0;
		} else if (local13 == 10) {
			this.anInt4204 = 512;
			this.anInt4213 = 1536;
			this.anInt4201 = 3;
			this.anInt4199 = 2048;
		} else if (local13 == 11) {
			this.anInt4204 = 512;
			this.anInt4199 = 4096;
			this.anInt4201 = 3;
			this.anInt4213 = 1536;
		} else if (local13 == 6) {
			this.anInt4199 = 2048;
			this.anInt4213 = 1280;
			this.anInt4201 = 3;
			this.anInt4204 = 768;
		} else if (local13 == 7) {
			this.anInt4204 = 768;
			this.anInt4213 = 1280;
			this.anInt4201 = 3;
			this.anInt4199 = 4096;
		} else if (local13 == 8) {
			this.anInt4204 = 1024;
			this.anInt4199 = 2048;
			this.anInt4201 = 3;
			this.anInt4213 = 1024;
		} else if (local13 == 9) {
			this.anInt4213 = 1024;
			this.anInt4199 = 4096;
			this.anInt4201 = 3;
			this.anInt4204 = 1024;
		} else if (local13 == 14) {
			this.anInt4201 = 1;
			this.anInt4204 = 768;
			this.anInt4199 = 2048;
			this.anInt4213 = 1280;
		} else if (local13 == 15) {
			this.anInt4213 = 1536;
			this.anInt4199 = 4096;
			this.anInt4204 = 512;
			this.anInt4201 = 1;
		} else if (local13 == 16) {
			this.anInt4199 = 8192;
			this.anInt4204 = 256;
			this.anInt4201 = 1;
			this.anInt4213 = 1792;
		} else {
			this.anInt4204 = 2048;
			this.anInt4213 = 0;
			this.anInt4201 = 0;
			this.anInt4199 = 2048;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public void method3400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4201 = arg0;
		this.anInt4213 = arg1;
		this.anInt4204 = arg2;
		this.anInt4199 = arg3;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	private void method3401() {
		@Pc(21) int local21 = (this.anInt4210 << 7) + 64;
		this.aFloat123 = 1.0F / (float) (local21 * local21);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ)V")
	public void method3403(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = this.anInt4199 * arg0 / 50 + this.anInt4207 & 0x7FF;
		@Pc(20) int local20 = this.anInt4201;
		@Pc(58) int local58;
		if (local20 == 1) {
			local58 = (Class174.anIntArray444[local17] >> 6) + 1024;
		} else if (local20 == 3) {
			local58 = Static23.anIntArray65[local17] >> 1;
		} else if (local20 == 4) {
			local58 = local17 >> 10 << 11;
		} else if (local20 == 2) {
			local58 = local17;
		} else if (local20 == 5) {
			local58 = (local17 >= 1024 ? 2048 - local17 : local17) << 1;
		} else {
			local58 = 2048;
		}
		if (arg1) {
			local58 = 2048;
		}
		this.aFloat124 = (float) ((this.anInt4204 * local58 >> 11) + this.anInt4213) / 2048.0F;
		@Pc(127) float local127 = this.aFloat124 / 255.0F;
		this.aFloatArray22[2] = local127 * (float) (this.anInt4203 & 0xFF);
		this.aFloatArray22[1] = local127 * (float) (this.anInt4203 >> 8 & 0xFF);
		this.aFloatArray22[0] = (float) (this.anInt4203 >> 16 & 0xFF) * local127;
	}
}
