import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class65 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private int anInt2184;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public int anInt2185;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!id;")
	private final Class1_Sub6 aClass1_Sub6_3 = new Class1_Sub6(null);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)J")
	public long method1570(@OriginalArg(0) int arg0) {
		return this.aLong68 + (long) arg0 * (long) this.anInt2184;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public void method1571() {
		this.aClass1_Sub6_3.aByteArray27 = null;
		this.anIntArray319 = null;
		this.anIntArray321 = null;
		this.anIntArray318 = null;
		this.anIntArray320 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
	public void method1572(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub6_3.aByteArray27 = arg0;
		this.aClass1_Sub6_3.anInt2574 = 10;
		@Pc(12) int local12 = this.aClass1_Sub6_3.method1842();
		this.anInt2185 = this.aClass1_Sub6_3.method1842();
		this.anInt2184 = 500000;
		this.anIntArray319 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub6_3.method1817();
			@Pc(38) int local38 = this.aClass1_Sub6_3.method1817();
			if (local33 == 1297379947) {
				this.anIntArray319[local27] = this.aClass1_Sub6_3.anInt2574;
				local27++;
			}
			this.aClass1_Sub6_3.anInt2574 += local38;
		}
		this.anIntArray321 = new int[this.anIntArray319.length];
		for (local33 = 0; local33 < this.anIntArray321.length; local33++) {
			this.anIntArray321[local33] = this.anIntArray319[local33];
		}
		this.anIntArray318 = new int[local12];
		this.anIntArray320 = new int[local12];
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
	public void method1573() {
		this.aClass1_Sub6_3.anInt2574 = -1;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()Z")
	public boolean method1574() {
		@Pc(3) int local3 = this.anIntArray321.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray321[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method1575(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_3.anInt2574 = this.anIntArray321[arg0];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(J)V")
	public void method1577(@OriginalArg(0) long arg0) {
		this.aLong68 = arg0;
		@Pc(6) int local6 = this.anIntArray321.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray318[local8] = 0;
			this.anIntArray320[local8] = 0;
			this.aClass1_Sub6_3.anInt2574 = this.anIntArray319[local8];
			this.method1578(local8);
			this.anIntArray321[local8] = this.aClass1_Sub6_3.anInt2574;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public void method1578(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub6_3.method1869();
		this.anIntArray318[arg0] += local4;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "()I")
	public int method1579() {
		@Pc(3) int local3 = this.anIntArray321.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray321[local9] >= 0 && this.anIntArray318[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray318[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	public void method1580(@OriginalArg(0) int arg0) {
		this.anIntArray321[arg0] = this.aClass1_Sub6_3.anInt2574;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "()Z")
	public boolean method1581() {
		return this.aClass1_Sub6_3.anInt2574 < 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	private int method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static97.aByteArray25[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub6_3.method1837() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub6_3.method1837() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub6_3.method1837();
		local12 = this.aClass1_Sub6_3.method1869();
		if (local7 == 47) {
			this.aClass1_Sub6_3.anInt2574 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub6_3.method1868();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray318[arg0];
			this.aLong68 += (long) local38 * (long) (this.anInt2184 - local32);
			this.anInt2184 = local32;
			this.aClass1_Sub6_3.anInt2574 += local12;
			return 2;
		} else {
			this.aClass1_Sub6_3.anInt2574 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
	private int method1583(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub6_3.aByteArray27[this.aClass1_Sub6_3.anInt2574];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray320[arg0] = local13;
			this.aClass1_Sub6_3.anInt2574++;
		} else {
			local13 = this.anIntArray320[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1582(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub6_3.method1869();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub6_3.aByteArray27[this.aClass1_Sub6_3.anInt2574] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub6_3.anInt2574++;
				this.anIntArray320[arg0] = local57;
				return this.method1582(arg0, local57);
			}
		}
		this.aClass1_Sub6_3.anInt2574 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "()Z")
	public boolean method1584() {
		return this.aClass1_Sub6_3.aByteArray27 != null;
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "()I")
	public int method1585() {
		return this.anIntArray321.length;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)I")
	public int method1586(@OriginalArg(0) int arg0) {
		return this.method1583(arg0);
	}
}
