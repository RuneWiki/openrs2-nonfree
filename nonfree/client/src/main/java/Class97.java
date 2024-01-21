import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class97 {

	@OriginalMember(owner = "client!th", name = "b", descriptor = "J")
	private long aLong128;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public int anInt3893;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	private int anInt3894;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!kd;")
	private final Class2_Sub11 aClass2_Sub11_4 = new Class2_Sub11(null);

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class97() {
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V")
	public Class97(@OriginalArg(0) byte[] arg0) {
		this.method2694(arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method2684(@OriginalArg(0) int arg0) {
		this.aClass2_Sub11_4.anInt2235 = this.anIntArray357[arg0];
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public void method2685(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub11_4.method1551();
		this.anIntArray358[arg0] += local4;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()Z")
	public boolean method2686() {
		@Pc(3) int local3 = this.anIntArray357.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray357[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "()I")
	public int method2687() {
		return this.anIntArray357.length;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I")
	private int method2688(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub11_4.aByteArray26[this.aClass2_Sub11_4.anInt2235];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray356[arg0] = local13;
			this.aClass2_Sub11_4.anInt2235++;
		} else {
			local13 = this.anIntArray356[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2689(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub11_4.method1551();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub11_4.aByteArray26[this.aClass2_Sub11_4.anInt2235] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub11_4.anInt2235++;
				this.anIntArray356[arg0] = local57;
				return this.method2689(arg0, local57);
			}
		}
		this.aClass2_Sub11_4.anInt2235 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
	private int method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static188.aByteArray49[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub11_4.method1534() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub11_4.method1534() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub11_4.method1534();
		local12 = this.aClass2_Sub11_4.method1551();
		if (local7 == 47) {
			this.aClass2_Sub11_4.anInt2235 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub11_4.method1536();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray358[arg0];
			this.aLong128 += (long) local38 * (long) (this.anInt3894 - local32);
			this.anInt3894 = local32;
			this.aClass2_Sub11_4.anInt2235 += local12;
			return 2;
		} else {
			this.aClass2_Sub11_4.anInt2235 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "()V")
	public void method2691() {
		this.aClass2_Sub11_4.anInt2235 = -1;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	public void method2692(@OriginalArg(0) int arg0) {
		this.anIntArray357[arg0] = this.aClass2_Sub11_4.anInt2235;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "()V")
	public void method2693() {
		this.aClass2_Sub11_4.aByteArray26 = null;
		this.anIntArray359 = null;
		this.anIntArray357 = null;
		this.anIntArray358 = null;
		this.anIntArray356 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([B)V")
	public void method2694(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub11_4.aByteArray26 = arg0;
		this.aClass2_Sub11_4.anInt2235 = 10;
		@Pc(12) int local12 = this.aClass2_Sub11_4.method1557();
		this.anInt3893 = this.aClass2_Sub11_4.method1557();
		this.anInt3894 = 500000;
		this.anIntArray359 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub11_4.method1577();
			@Pc(38) int local38 = this.aClass2_Sub11_4.method1577();
			if (local33 == 1297379947) {
				this.anIntArray359[local27] = this.aClass2_Sub11_4.anInt2235;
				local27++;
			}
			this.aClass2_Sub11_4.anInt2235 += local38;
		}
		this.aLong128 = 0L;
		this.anIntArray357 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray357[local33] = this.anIntArray359[local33];
		}
		this.anIntArray358 = new int[local12];
		this.anIntArray356 = new int[local12];
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)J")
	public long method2695(@OriginalArg(0) int arg0) {
		return this.aLong128 + (long) arg0 * (long) this.anInt3894;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "()I")
	public int method2696() {
		@Pc(3) int local3 = this.anIntArray357.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray357[local9] >= 0 && this.anIntArray358[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray358[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)I")
	public int method2697(@OriginalArg(0) int arg0) {
		return this.method2688(arg0);
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "()Z")
	public boolean method2698() {
		return this.aClass2_Sub11_4.aByteArray26 != null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(J)V")
	public void method2699(@OriginalArg(0) long arg0) {
		this.aLong128 = arg0;
		@Pc(6) int local6 = this.anIntArray357.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray358[local8] = 0;
			this.anIntArray356[local8] = 0;
			this.aClass2_Sub11_4.anInt2235 = this.anIntArray359[local8];
			this.method2685(local8);
			this.anIntArray357[local8] = this.aClass2_Sub11_4.anInt2235;
		}
	}
}
