import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class73 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "[I")
	private int[] anIntArray299;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public int anInt2618;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	private int anInt2619;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!na;")
	private final Class2_Sub9 aClass2_Sub9_5 = new Class2_Sub9(null);

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class73() {
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class73(@OriginalArg(0) byte[] arg0) {
		this.method1875(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([B)V")
	public void method1875(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub9_5.aByteArray16 = arg0;
		this.aClass2_Sub9_5.anInt976 = 10;
		@Pc(12) int local12 = this.aClass2_Sub9_5.method632();
		this.anInt2618 = this.aClass2_Sub9_5.method632();
		this.anInt2619 = 500000;
		this.anIntArray298 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub9_5.method622();
			@Pc(38) int local38 = this.aClass2_Sub9_5.method622();
			if (local33 == 1297379947) {
				this.anIntArray298[local27] = this.aClass2_Sub9_5.anInt976;
				local27++;
			}
			this.aClass2_Sub9_5.anInt976 += local38;
		}
		this.aLong73 = 0L;
		this.anIntArray300 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray300[local33] = this.anIntArray298[local33];
		}
		this.anIntArray301 = new int[local12];
		this.anIntArray299 = new int[local12];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public void method1876(@OriginalArg(0) int arg0) {
		this.anIntArray300[arg0] = this.aClass2_Sub9_5.anInt976;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)J")
	public long method1877(@OriginalArg(0) int arg0) {
		return this.aLong73 + (long) arg0 * (long) this.anInt2619;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I")
	private int method1878(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub9_5.aByteArray16[this.aClass2_Sub9_5.anInt976];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray299[arg0] = local13;
			this.aClass2_Sub9_5.anInt976++;
		} else {
			local13 = this.anIntArray299[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1883(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub9_5.method611();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub9_5.aByteArray16[this.aClass2_Sub9_5.anInt976] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub9_5.anInt976++;
				this.anIntArray299[arg0] = local57;
				return this.method1883(arg0, local57);
			}
		}
		this.aClass2_Sub9_5.anInt976 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
	public void method1879() {
		this.aClass2_Sub9_5.anInt976 = -1;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
	public int method1880() {
		return this.anIntArray300.length;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()Z")
	public boolean method1881() {
		@Pc(3) int local3 = this.anIntArray300.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray300[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public void method1882(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub9_5.method611();
		this.anIntArray301[arg0] += local4;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
	private int method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static113.aByteArray36[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub9_5.method640() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub9_5.method640() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub9_5.method640();
		local12 = this.aClass2_Sub9_5.method611();
		if (local7 == 47) {
			this.aClass2_Sub9_5.anInt976 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub9_5.method628();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray301[arg0];
			this.aLong73 += (long) local38 * (long) (this.anInt2619 - local32);
			this.anInt2619 = local32;
			this.aClass2_Sub9_5.anInt976 += local12;
			return 2;
		} else {
			this.aClass2_Sub9_5.anInt976 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	public void method1884() {
		this.aClass2_Sub9_5.aByteArray16 = null;
		this.anIntArray298 = null;
		this.anIntArray300 = null;
		this.anIntArray301 = null;
		this.anIntArray299 = null;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()Z")
	public boolean method1885() {
		return this.aClass2_Sub9_5.aByteArray16 != null;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public void method1886(@OriginalArg(0) int arg0) {
		this.aClass2_Sub9_5.anInt976 = this.anIntArray300[arg0];
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
	public int method1888(@OriginalArg(0) int arg0) {
		return this.method1878(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(J)V")
	public void method1889(@OriginalArg(0) long arg0) {
		this.aLong73 = arg0;
		@Pc(6) int local6 = this.anIntArray300.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray301[local8] = 0;
			this.anIntArray299[local8] = 0;
			this.aClass2_Sub9_5.anInt976 = this.anIntArray298[local8];
			this.method1882(local8);
			this.anIntArray300[local8] = this.aClass2_Sub9_5.anInt976;
		}
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()I")
	public int method1890() {
		@Pc(3) int local3 = this.anIntArray300.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray300[local9] >= 0 && this.anIntArray301[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray301[local9];
			}
		}
		return local5;
	}
}
