import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!tc;")
	private final Class10_Sub10 aClass10_Sub10_1 = new Class10_Sub10(null);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public void method6(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass10_Sub10_1.method1122();
		this.anIntArray7[arg0] += local4;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()Z")
	public boolean method7() {
		return this.aClass10_Sub10_1.anInt1957 < 0;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method8(@OriginalArg(0) int arg0) {
		this.anIntArray6[arg0] = this.aClass10_Sub10_1.anInt1957;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
	public void method9() {
		this.aClass10_Sub10_1.aByteArray9 = null;
		this.anIntArray8 = null;
		this.anIntArray6 = null;
		this.anIntArray7 = null;
		this.anIntArray5 = null;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
	private int method10(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass10_Sub10_1.aByteArray9[this.aClass10_Sub10_1.anInt1957];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray5[arg0] = local13;
			this.aClass10_Sub10_1.anInt1957++;
		} else {
			local13 = this.anIntArray5[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method21(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass10_Sub10_1.method1122();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass10_Sub10_1.aByteArray9[this.aClass10_Sub10_1.anInt1957] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass10_Sub10_1.anInt1957++;
				this.anIntArray5[arg0] = local57;
				return this.method21(arg0, local57);
			}
		}
		this.aClass10_Sub10_1.anInt1957 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V")
	public void method11(@OriginalArg(0) byte[] arg0) {
		this.aClass10_Sub10_1.aByteArray9 = arg0;
		this.aClass10_Sub10_1.anInt1957 = 10;
		@Pc(12) int local12 = this.aClass10_Sub10_1.method1160();
		this.anInt10 = this.aClass10_Sub10_1.method1160();
		this.anInt11 = 500000;
		this.anIntArray8 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass10_Sub10_1.method1112();
			@Pc(38) int local38 = this.aClass10_Sub10_1.method1112();
			if (local33 == 1297379947) {
				this.anIntArray8[local27] = this.aClass10_Sub10_1.anInt1957;
				local27++;
			}
			this.aClass10_Sub10_1.anInt1957 += local38;
		}
		this.anIntArray6 = (int[]) this.anIntArray8.clone();
		this.anIntArray7 = new int[local12];
		this.anIntArray5 = new int[local12];
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public void method12(@OriginalArg(0) int arg0) {
		this.aClass10_Sub10_1.anInt1957 = this.anIntArray6[arg0];
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "()Z")
	public boolean method13() {
		return this.aClass10_Sub10_1.aByteArray9 != null;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "()V")
	public void method14() {
		this.aClass10_Sub10_1.anInt1957 = -1;
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
	public int method15(@OriginalArg(0) int arg0) {
		return this.method10(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "()Z")
	public boolean method17() {
		@Pc(3) int local3 = this.anIntArray6.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray6[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)J")
	public long method18(@OriginalArg(0) int arg0) {
		return this.aLong1 + (long) arg0 * (long) this.anInt11;
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "()I")
	public int method19() {
		return this.anIntArray6.length;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(J)V")
	public void method20(@OriginalArg(0) long arg0) {
		this.aLong1 = arg0;
		@Pc(6) int local6 = this.anIntArray6.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray7[local8] = 0;
			this.anIntArray5[local8] = 0;
			this.aClass10_Sub10_1.anInt1957 = this.anIntArray8[local8];
			this.method6(local8);
			this.anIntArray6[local8] = this.aClass10_Sub10_1.anInt1957;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	private int method21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static2.aByteArray1[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass10_Sub10_1.method1111() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass10_Sub10_1.method1111() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass10_Sub10_1.method1111();
		local12 = this.aClass10_Sub10_1.method1122();
		if (local7 == 47) {
			this.aClass10_Sub10_1.anInt1957 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass10_Sub10_1.method1138();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray7[arg0];
			this.aLong1 += (long) local38 * (long) (this.anInt11 - local32);
			this.anInt11 = local32;
			this.aClass10_Sub10_1.anInt1957 += local12;
			return 2;
		} else {
			this.aClass10_Sub10_1.anInt1957 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "()I")
	public int method22() {
		@Pc(3) int local3 = this.anIntArray6.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray6[local9] >= 0 && this.anIntArray7[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray7[local9];
			}
		}
		return local5;
	}
}
