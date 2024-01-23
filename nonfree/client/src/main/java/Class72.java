import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class72 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	private int anInt1942;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!fn;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	private int anInt1943;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	private int anInt1944;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	private int anInt1946;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
	public int anInt1947;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	public int anInt1950;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	public int anInt1952;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
	public int anInt1953;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
	public int anInt1961;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
	public int anInt1964;

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
	public int anInt1965;

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "Z")
	public boolean aBoolean142;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[F")
	public float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class72(@OriginalArg(0) Class1_Sub18 arg0) {
		if (Static264.anIntArray276 == null) {
			Static104.method2544();
		}
		this.anInt1953 = arg0.method3122();
		this.aBoolean142 = (this.anInt1953 & 0x8) != 0;
		this.aBoolean140 = (this.anInt1953 & 0x10) != 0;
		this.anInt1953 &= 0x7;
		this.anInt1961 = arg0.method3107();
		this.anInt1947 = arg0.method3107();
		this.anInt1965 = arg0.method3107();
		this.anInt1952 = arg0.method3122();
		this.method1666();
		this.aShortArray36 = new short[this.anInt1952 * 2 + 1];
		@Pc(85) int local85;
		for (local85 = 0; local85 < this.aShortArray36.length; local85++) {
			this.aShortArray36[local85] = (short) arg0.method3107();
		}
		this.anInt1950 = Static208.anIntArray476[arg0.method3107()];
		local85 = arg0.method3122();
		this.anInt1942 = (local85 & 0xE0) << 3;
		this.anInt1964 = local85 & 0x1F;
		if (this.anInt1964 != 31) {
			this.method1659();
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	private void method1659() {
		@Pc(13) int local13 = this.anInt1964;
		if (local13 == 2) {
			this.anInt1946 = 0;
			this.anInt1962 = 2048;
			this.anInt1944 = 2048;
			this.anInt1943 = 1;
		} else if (local13 == 3) {
			this.anInt1943 = 1;
			this.anInt1944 = 4096;
			this.anInt1962 = 2048;
			this.anInt1946 = 0;
		} else if (local13 == 4) {
			this.anInt1946 = 0;
			this.anInt1962 = 2048;
			this.anInt1943 = 4;
			this.anInt1944 = 2048;
		} else if (local13 == 5) {
			this.anInt1946 = 0;
			this.anInt1944 = 8192;
			this.anInt1962 = 2048;
			this.anInt1943 = 4;
		} else if (local13 == 12) {
			this.anInt1944 = 2048;
			this.anInt1962 = 2048;
			this.anInt1943 = 2;
			this.anInt1946 = 0;
		} else if (local13 == 13) {
			this.anInt1962 = 2048;
			this.anInt1944 = 8192;
			this.anInt1943 = 2;
			this.anInt1946 = 0;
		} else if (local13 == 10) {
			this.anInt1944 = 2048;
			this.anInt1943 = 3;
			this.anInt1946 = 1536;
			this.anInt1962 = 512;
		} else if (local13 == 11) {
			this.anInt1944 = 4096;
			this.anInt1943 = 3;
			this.anInt1946 = 1536;
			this.anInt1962 = 512;
		} else if (local13 == 6) {
			this.anInt1944 = 2048;
			this.anInt1962 = 768;
			this.anInt1943 = 3;
			this.anInt1946 = 1280;
		} else if (local13 == 7) {
			this.anInt1943 = 3;
			this.anInt1944 = 4096;
			this.anInt1946 = 1280;
			this.anInt1962 = 768;
		} else if (local13 == 8) {
			this.anInt1946 = 1024;
			this.anInt1962 = 1024;
			this.anInt1943 = 3;
			this.anInt1944 = 2048;
		} else if (local13 == 9) {
			this.anInt1943 = 3;
			this.anInt1962 = 1024;
			this.anInt1944 = 4096;
			this.anInt1946 = 1024;
		} else if (local13 == 14) {
			this.anInt1944 = 2048;
			this.anInt1946 = 1280;
			this.anInt1943 = 1;
			this.anInt1962 = 768;
		} else if (local13 == 15) {
			this.anInt1962 = 512;
			this.anInt1943 = 1;
			this.anInt1944 = 4096;
			this.anInt1946 = 1536;
		} else if (local13 == 16) {
			this.anInt1943 = 1;
			this.anInt1946 = 1792;
			this.anInt1944 = 8192;
			this.anInt1962 = 256;
		} else {
			this.anInt1944 = 2048;
			this.anInt1946 = 0;
			this.anInt1962 = 2048;
			this.anInt1943 = 0;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZII)V")
	public void method1660(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt1942 + this.anInt1944 * arg1 / 50 & 0x7FF;
		@Pc(21) int local21 = this.anInt1943;
		@Pc(55) int local55;
		if (local21 == 1) {
			local55 = (Class135.anIntArray472[local14] >> 6) + 1024;
		} else if (local21 == 3) {
			local55 = Static264.anIntArray276[local14] >> 1;
		} else if (local21 == 4) {
			local55 = local14 >> 10 << 11;
		} else if (local21 == 2) {
			local55 = local14;
		} else if (local21 == 5) {
			local55 = (local14 >= 1024 ? 2048 - local14 : local14) << 1;
		} else {
			local55 = 2048;
		}
		if (arg0) {
			local55 = 2048;
		}
		this.aFloat58 = (float) ((local55 * this.anInt1962 >> 11) + this.anInt1946) / 2048.0F;
		@Pc(117) float local117 = this.aFloat58 / 255.0F;
		this.aFloatArray18[1] = (float) (this.anInt1950 >> 8 & 0xFF) * local117;
		this.aFloatArray18[2] = (float) (this.anInt1950 & 0xFF) * local117;
		this.aFloatArray18[0] = local117 * (float) (this.anInt1950 >> 16 & 0xFF);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	private void method1666() {
		@Pc(10) int local10 = (this.anInt1952 << 7) + 64;
		this.aFloat57 = 1.0F / (float) (local10 * local10);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	public void method1667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1943 = arg2;
		this.anInt1944 = arg3;
		this.anInt1946 = arg0;
		this.anInt1962 = arg1;
	}
}
