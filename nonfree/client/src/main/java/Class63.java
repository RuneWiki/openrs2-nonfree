import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class63 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	private int anInt2592;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public int anInt2593;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!jd;")
	private final Class4_Sub11 aClass4_Sub11_4 = new Class4_Sub11(null);

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V")
	public Class63(@OriginalArg(0) byte[] arg0) {
		this.method1687(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
	private int method1674(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub11_4.aByteArray9[this.aClass4_Sub11_4.anInt1099];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray286[arg0] = local13;
			this.aClass4_Sub11_4.anInt1099++;
		} else {
			local13 = this.anIntArray286[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1676(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub11_4.method697();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub11_4.aByteArray9[this.aClass4_Sub11_4.anInt1099] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub11_4.anInt1099++;
				this.anIntArray286[arg0] = local57;
				return this.method1676(arg0, local57);
			}
		}
		this.aClass4_Sub11_4.anInt1099 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method1675(@OriginalArg(0) int arg0) {
		this.anIntArray287[arg0] = this.aClass4_Sub11_4.anInt1099;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
	private int method1676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static100.aByteArray41[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub11_4.method719() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub11_4.method719() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub11_4.method719();
		local12 = this.aClass4_Sub11_4.method697();
		if (local7 == 47) {
			this.aClass4_Sub11_4.anInt1099 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub11_4.method704();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray289[arg0];
			this.aLong79 += (long) local38 * (long) (this.anInt2592 - local32);
			this.anInt2592 = local32;
			this.aClass4_Sub11_4.anInt1099 += local12;
			return 2;
		} else {
			this.aClass4_Sub11_4.anInt1099 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()Z")
	public boolean method1677() {
		return this.aClass4_Sub11_4.aByteArray9 != null;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
	public void method1679() {
		this.aClass4_Sub11_4.aByteArray9 = null;
		this.anIntArray288 = null;
		this.anIntArray287 = null;
		this.anIntArray289 = null;
		this.anIntArray286 = null;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()Z")
	public boolean method1680() {
		@Pc(3) int local3 = this.anIntArray287.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray287[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "()I")
	public int method1681() {
		return this.anIntArray287.length;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)J")
	public long method1682(@OriginalArg(0) int arg0) {
		return this.aLong79 + (long) arg0 * (long) this.anInt2592;
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "()V")
	public void method1683() {
		this.aClass4_Sub11_4.anInt1099 = -1;
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "()I")
	public int method1684() {
		@Pc(3) int local3 = this.anIntArray287.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray287[local9] >= 0 && this.anIntArray289[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray289[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(J)V")
	public void method1685(@OriginalArg(0) long arg0) {
		this.aLong79 = arg0;
		@Pc(6) int local6 = this.anIntArray287.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray289[local8] = 0;
			this.anIntArray286[local8] = 0;
			this.aClass4_Sub11_4.anInt1099 = this.anIntArray288[local8];
			this.method1686(local8);
			this.anIntArray287[local8] = this.aClass4_Sub11_4.anInt1099;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	public void method1686(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub11_4.method697();
		this.anIntArray289[arg0] += local4;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V")
	public void method1687(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub11_4.aByteArray9 = arg0;
		this.aClass4_Sub11_4.anInt1099 = 10;
		@Pc(12) int local12 = this.aClass4_Sub11_4.method718();
		this.anInt2593 = this.aClass4_Sub11_4.method718();
		this.anInt2592 = 500000;
		this.anIntArray288 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub11_4.method725();
			@Pc(38) int local38 = this.aClass4_Sub11_4.method725();
			if (local33 == 1297379947) {
				this.anIntArray288[local27] = this.aClass4_Sub11_4.anInt1099;
				local27++;
			}
			this.aClass4_Sub11_4.anInt1099 += local38;
		}
		this.aLong79 = 0L;
		this.anIntArray287 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray287[local33] = this.anIntArray288[local33];
		}
		this.anIntArray289 = new int[local12];
		this.anIntArray286 = new int[local12];
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public void method1688(@OriginalArg(0) int arg0) {
		this.aClass4_Sub11_4.anInt1099 = this.anIntArray287[arg0];
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)I")
	public int method1689(@OriginalArg(0) int arg0) {
		return this.method1674(arg0);
	}
}
