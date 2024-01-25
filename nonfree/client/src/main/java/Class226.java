import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class226 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	private int anInt5707;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
	private int[] anIntArray526;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	private int[] anIntArray527;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public int anInt5708;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!gk;")
	private final Class7_Sub14 aClass7_Sub14_8 = new Class7_Sub14(null);

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class226() {
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class226(@OriginalArg(0) byte[] arg0) {
		this.method4604(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	private int method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static358.aByteArray83[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass7_Sub14_8.method3981() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass7_Sub14_8.method3981() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass7_Sub14_8.method3981();
		local12 = this.aClass7_Sub14_8.method3963();
		if (local7 == 47) {
			this.aClass7_Sub14_8.anInt4989 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass7_Sub14_8.method3975();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray528[arg0];
			this.aLong181 += (long) local38 * (long) (this.anInt5707 - local32);
			this.anInt5707 = local32;
			this.aClass7_Sub14_8.anInt4989 += local12;
			return 2;
		} else {
			this.aClass7_Sub14_8.anInt4989 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
	public void method4593() {
		this.aClass7_Sub14_8.aByteArray75 = null;
		this.anIntArray525 = null;
		this.anIntArray526 = null;
		this.anIntArray528 = null;
		this.anIntArray527 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(J)V")
	public void method4594(@OriginalArg(0) long arg0) {
		this.aLong181 = arg0;
		@Pc(6) int local6 = this.anIntArray526.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray528[local8] = 0;
			this.anIntArray527[local8] = 0;
			this.aClass7_Sub14_8.anInt4989 = this.anIntArray525[local8];
			this.method4601(local8);
			this.anIntArray526[local8] = this.aClass7_Sub14_8.anInt4989;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	public int method4595(@OriginalArg(0) int arg0) {
		return this.method4598(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()Z")
	public boolean method4596() {
		return this.aClass7_Sub14_8.aByteArray75 != null;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()Z")
	public boolean method4597() {
		@Pc(3) int local3 = this.anIntArray526.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray526[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	private int method4598(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass7_Sub14_8.aByteArray75[this.aClass7_Sub14_8.anInt4989];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray527[arg0] = local13;
			this.aClass7_Sub14_8.anInt4989++;
		} else {
			local13 = this.anIntArray527[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4592(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass7_Sub14_8.method3963();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass7_Sub14_8.aByteArray75[this.aClass7_Sub14_8.anInt4989] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass7_Sub14_8.anInt4989++;
				this.anIntArray527[arg0] = local57;
				return this.method4592(arg0, local57);
			}
		}
		this.aClass7_Sub14_8.anInt4989 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "()I")
	public int method4599() {
		return this.anIntArray526.length;
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "()I")
	public int method4600() {
		@Pc(3) int local3 = this.anIntArray526.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray526[local9] >= 0 && this.anIntArray528[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray528[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public void method4601(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass7_Sub14_8.method3963();
		this.anIntArray528[arg0] += local4;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "()V")
	public void method4602() {
		this.aClass7_Sub14_8.anInt4989 = -1;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	public void method4603(@OriginalArg(0) int arg0) {
		this.anIntArray526[arg0] = this.aClass7_Sub14_8.anInt4989;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([B)V")
	public void method4604(@OriginalArg(0) byte[] arg0) {
		this.aClass7_Sub14_8.aByteArray75 = arg0;
		this.aClass7_Sub14_8.anInt4989 = 10;
		@Pc(12) int local12 = this.aClass7_Sub14_8.method3943();
		this.anInt5708 = this.aClass7_Sub14_8.method3943();
		this.anInt5707 = 500000;
		this.anIntArray525 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass7_Sub14_8.method3938();
			@Pc(38) int local38 = this.aClass7_Sub14_8.method3938();
			if (local33 == 1297379947) {
				this.anIntArray525[local27] = this.aClass7_Sub14_8.anInt4989;
				local27++;
			}
			this.aClass7_Sub14_8.anInt4989 += local38;
		}
		this.aLong181 = 0L;
		this.anIntArray526 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray526[local33] = this.anIntArray525[local33];
		}
		this.anIntArray528 = new int[local12];
		this.anIntArray527 = new int[local12];
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public void method4605(@OriginalArg(0) int arg0) {
		this.aClass7_Sub14_8.anInt4989 = this.anIntArray526[arg0];
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)J")
	public long method4606(@OriginalArg(0) int arg0) {
		return this.aLong181 + (long) arg0 * (long) this.anInt5707;
	}
}
