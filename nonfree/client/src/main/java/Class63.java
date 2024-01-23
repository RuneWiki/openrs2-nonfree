import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class63 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public int anInt2798;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	private int anInt2799;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "J")
	private long aLong94;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!ql;")
	private Class1_Sub13 aClass1_Sub13_5 = new Class1_Sub13(null);

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([B)V")
	public Class63(@OriginalArg(0) byte[] arg0) {
		this.method2138(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([B)V")
	public void method2138(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub13_5.aByteArray29 = arg0;
		this.aClass1_Sub13_5.anInt2395 = 10;
		@Pc(12) int local12 = this.aClass1_Sub13_5.method1764();
		this.anInt2798 = this.aClass1_Sub13_5.method1764();
		this.anInt2799 = 500000;
		this.anIntArray207 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub13_5.method1802();
			@Pc(38) int local38 = this.aClass1_Sub13_5.method1802();
			if (local33 == 1297379947) {
				this.anIntArray207[local27] = this.aClass1_Sub13_5.anInt2395;
				local27++;
			}
			this.aClass1_Sub13_5.anInt2395 += local38;
		}
		this.aLong94 = 0L;
		this.anIntArray209 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray209[local33] = this.anIntArray207[local33];
		}
		this.anIntArray206 = new int[local12];
		this.anIntArray208 = new int[local12];
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)J")
	public long method2139(@OriginalArg(0) int arg0) {
		return this.aLong94 + (long) arg0 * (long) this.anInt2799;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	public void method2140() {
		this.aClass1_Sub13_5.anInt2395 = -1;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)I")
	public int method2141(@OriginalArg(0) int arg0) {
		return this.method2142(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I")
	private int method2142(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub13_5.aByteArray29[this.aClass1_Sub13_5.anInt2395];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray208[arg0] = local13;
			this.aClass1_Sub13_5.anInt2395++;
		} else {
			local13 = this.anIntArray208[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2144(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub13_5.method1768();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub13_5.aByteArray29[this.aClass1_Sub13_5.anInt2395] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub13_5.anInt2395++;
				this.anIntArray208[arg0] = local57;
				return this.method2144(arg0, local57);
			}
		}
		this.aClass1_Sub13_5.anInt2395 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
	public void method2143(@OriginalArg(0) int arg0) {
		this.anIntArray209[arg0] = this.aClass1_Sub13_5.anInt2395;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	private int method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static104.aByteArray34[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub13_5.method1772() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub13_5.method1772() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub13_5.method1772();
		local12 = this.aClass1_Sub13_5.method1768();
		if (local7 == 47) {
			this.aClass1_Sub13_5.anInt2395 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub13_5.method1773();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray206[arg0];
			this.aLong94 += (long) local38 * (long) (this.anInt2799 - local32);
			this.anInt2799 = local32;
			this.aClass1_Sub13_5.anInt2395 += local12;
			return 2;
		} else {
			this.aClass1_Sub13_5.anInt2395 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z")
	public boolean method2145() {
		return this.aClass1_Sub13_5.aByteArray29 != null;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
	public void method2146(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub13_5.method1768();
		this.anIntArray206[arg0] += local4;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
	public int method2147() {
		@Pc(3) int local3 = this.anIntArray209.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray209[local9] >= 0 && this.anIntArray206[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray206[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
	public int method2148() {
		return this.anIntArray209.length;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "()Z")
	public boolean method2149() {
		@Pc(3) int local3 = this.anIntArray209.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray209[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "()V")
	public void method2150() {
		this.aClass1_Sub13_5.aByteArray29 = null;
		this.anIntArray207 = null;
		this.anIntArray209 = null;
		this.anIntArray206 = null;
		this.anIntArray208 = null;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
	public void method2152(@OriginalArg(0) int arg0) {
		this.aClass1_Sub13_5.anInt2395 = this.anIntArray209[arg0];
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(J)V")
	public void method2153(@OriginalArg(0) long arg0) {
		this.aLong94 = arg0;
		@Pc(6) int local6 = this.anIntArray209.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray206[local8] = 0;
			this.anIntArray208[local8] = 0;
			this.aClass1_Sub13_5.anInt2395 = this.anIntArray207[local8];
			this.method2146(local8);
			this.anIntArray209[local8] = this.aClass1_Sub13_5.anInt2395;
		}
	}
}
