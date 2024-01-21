import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	private int[] anIntArray1;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!b;")
	private final Class6_Sub1 aClass6_Sub1_1 = new Class6_Sub1(null);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
	public int method4() {
		return this.anIntArray2.length;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	private int method6(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub1_1.aByteArray11[this.aClass6_Sub1_1.anInt2209];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray1[arg0] = local13;
			this.aClass6_Sub1_1.anInt2209++;
		} else {
			local13 = this.anIntArray1[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method16(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub1_1.method1504();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub1_1.aByteArray11[this.aClass6_Sub1_1.anInt2209] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub1_1.anInt2209++;
				this.anIntArray1[arg0] = local57;
				return this.method16(arg0, local57);
			}
		}
		this.aClass6_Sub1_1.anInt2209 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
	public void method7() {
		this.aClass6_Sub1_1.anInt2209 = -1;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
	public void method8() {
		this.aClass6_Sub1_1.aByteArray11 = null;
		this.anIntArray4 = null;
		this.anIntArray2 = null;
		this.anIntArray3 = null;
		this.anIntArray1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)J")
	public long method9(@OriginalArg(0) int arg0) {
		return this.aLong1 + (long) arg0 * (long) this.anInt7;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
	public int method10(@OriginalArg(0) int arg0) {
		return this.method6(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(J)V")
	public void method11(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0;
		@Pc(6) int local6 = this.anIntArray2.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray3[local8] = 0;
			this.anIntArray1[local8] = 0;
			this.aClass6_Sub1_1.anInt2209 = this.anIntArray4[local8];
			this.method13(local8);
			this.anIntArray2[local8] = this.aClass6_Sub1_1.anInt2209;
		}
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "()Z")
	public boolean method12() {
		return this.aClass6_Sub1_1.aByteArray11 != null;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public void method13(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub1_1.method1504();
		this.anIntArray3[arg0] += local4;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public void method14(@OriginalArg(0) int arg0) {
		this.anIntArray2[arg0] = this.aClass6_Sub1_1.anInt2209;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "()Z")
	public boolean method15() {
		return this.aClass6_Sub1_1.anInt2209 < 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	private int method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static2.aByteArray1[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub1_1.method1495() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub1_1.method1495() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub1_1.method1495();
		local12 = this.aClass6_Sub1_1.method1504();
		if (local7 == 47) {
			this.aClass6_Sub1_1.anInt2209 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub1_1.method1483();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray3[arg0];
			this.aLong1 += (long) local38 * (long) (this.anInt7 - local32);
			this.anInt7 = local32;
			this.aClass6_Sub1_1.anInt2209 += local12;
			return 2;
		} else {
			this.aClass6_Sub1_1.anInt2209 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "()Z")
	public boolean method17() {
		@Pc(3) int local3 = this.anIntArray2.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray2[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V")
	public void method18(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub1_1.aByteArray11 = arg0;
		this.aClass6_Sub1_1.anInt2209 = 10;
		@Pc(12) int local12 = this.aClass6_Sub1_1.method1500();
		this.anInt8 = this.aClass6_Sub1_1.method1500();
		this.anInt7 = 500000;
		this.anIntArray4 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub1_1.method1503();
			@Pc(38) int local38 = this.aClass6_Sub1_1.method1503();
			if (local33 == 1297379947) {
				this.anIntArray4[local27] = this.aClass6_Sub1_1.anInt2209;
				local27++;
			}
			this.aClass6_Sub1_1.anInt2209 += local38;
		}
		this.anIntArray2 = new int[this.anIntArray4.length];
		for (local33 = 0; local33 < this.anIntArray2.length; local33++) {
			this.anIntArray2[local33] = this.anIntArray4[local33];
		}
		this.anIntArray3 = new int[local12];
		this.anIntArray1 = new int[local12];
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "()I")
	public int method19() {
		@Pc(3) int local3 = this.anIntArray2.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray2[local9] >= 0 && this.anIntArray3[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray3[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
	public void method20(@OriginalArg(0) int arg0) {
		this.aClass6_Sub1_1.anInt2209 = this.anIntArray2[arg0];
	}
}
