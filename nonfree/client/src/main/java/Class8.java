import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class8 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[B")
	public static byte[] aByteArray2 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!eb;")
	private final Class2_Sub3 aClass2_Sub3_1 = new Class2_Sub3(null);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(J)V", line = 3)
	public void method210(@OriginalArg(0) long arg0) {
		this.aLong20 = arg0;
		@Pc(6) int local6 = this.anIntArray64.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray66[local8] = 0;
			this.anIntArray67[local8] = 0;
			this.aClass2_Sub3_1.anInt2546 = this.anIntArray65[local8];
			this.method221(local8);
			this.anIntArray64[local8] = this.aClass2_Sub3_1.anInt2546;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I", line = 23)
	public int method211() {
		@Pc(3) int local3 = this.anIntArray64.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray64[local9] >= 0 && this.anIntArray66[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray66[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I", line = 49)
	public int method212(@OriginalArg(0) int arg0) {
		return this.method222(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V", line = 56)
	public void method213() {
		this.aClass2_Sub3_1.anInt2546 = -1;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()Z", line = 60)
	public boolean method214() {
		@Pc(3) int local3 = this.anIntArray64.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray64[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()Z", line = 73)
	public boolean method215() {
		return this.aClass2_Sub3_1.anInt2546 < 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)J", line = 76)
	public long method216(@OriginalArg(0) int arg0) {
		return this.aLong20 + (long) arg0 * (long) this.anInt251;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 80)
	public void method217(@OriginalArg(0) int arg0) {
		this.anIntArray64[arg0] = this.aClass2_Sub3_1.anInt2546;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "()I", line = 85)
	public int method218() {
		return this.anIntArray64.length;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I", line = 88)
	private int method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = aByteArray2[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub3_1.method1708() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub3_1.method1708() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub3_1.method1708();
		local12 = this.aClass2_Sub3_1.method1724();
		if (local7 == 47) {
			this.aClass2_Sub3_1.anInt2546 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub3_1.method1718();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray66[arg0];
			this.aLong20 += (long) local38 * (long) (this.anInt251 - local32);
			this.anInt251 = local32;
			this.aClass2_Sub3_1.anInt2546 += local12;
			return 2;
		} else {
			this.aClass2_Sub3_1.anInt2546 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "()V", line = 130)
	public void method220() {
		this.aClass2_Sub3_1.aByteArray24 = null;
		this.anIntArray65 = null;
		this.anIntArray64 = null;
		this.anIntArray66 = null;
		this.anIntArray67 = null;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 140)
	public void method221(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub3_1.method1724();
		this.anIntArray66[arg0] += local4;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)I", line = 148)
	private int method222(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub3_1.aByteArray24[this.aClass2_Sub3_1.anInt2546];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray67[arg0] = local13;
			this.aClass2_Sub3_1.anInt2546++;
		} else {
			local13 = this.anIntArray67[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method219(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub3_1.method1724();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub3_1.aByteArray24[this.aClass2_Sub3_1.anInt2546] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub3_1.anInt2546++;
				this.anIntArray67[arg0] = local57;
				return this.method219(arg0, local57);
			}
		}
		this.aClass2_Sub3_1.anInt2546 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([B)V", line = 186)
	public void method223(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub3_1.aByteArray24 = arg0;
		this.aClass2_Sub3_1.anInt2546 = 10;
		@Pc(12) int local12 = this.aClass2_Sub3_1.method1704();
		this.anInt250 = this.aClass2_Sub3_1.method1704();
		this.anInt251 = 500000;
		this.anIntArray65 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass2_Sub3_1.method1728();
			@Pc(38) int local38 = this.aClass2_Sub3_1.method1728();
			if (local33 == 1297379947) {
				this.anIntArray65[local27] = this.aClass2_Sub3_1.anInt2546;
				local27++;
			}
			this.aClass2_Sub3_1.anInt2546 += local38;
		}
		this.anIntArray64 = (int[]) this.anIntArray65.clone();
		this.anIntArray66 = new int[local12];
		this.anIntArray67 = new int[local12];
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "()Z", line = 236)
	public boolean method225() {
		return this.aClass2_Sub3_1.aByteArray24 != null;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 246)
	public void method226(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_1.anInt2546 = this.anIntArray64[arg0];
	}
}
