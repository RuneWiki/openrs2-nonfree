import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!m;")
	private final Class3_Sub6 aClass3_Sub6_1 = new Class3_Sub6(null);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public int method178() {
		return this.anIntArray38.length;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	private int method179(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub6_1.aByteArray17[this.aClass3_Sub6_1.anInt2416];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray40[arg0] = local13;
			this.aClass3_Sub6_1.anInt2416++;
		} else {
			local13 = this.anIntArray40[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method190(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub6_1.method1601();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub6_1.aByteArray17[this.aClass3_Sub6_1.anInt2416] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub6_1.anInt2416++;
				this.anIntArray40[arg0] = local57;
				return this.method190(arg0, local57);
			}
		}
		this.aClass3_Sub6_1.anInt2416 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
	public int method180(@OriginalArg(0) int arg0) {
		return this.method179(arg0);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	public void method181() {
		this.aClass3_Sub6_1.aByteArray17 = null;
		this.anIntArray39 = null;
		this.anIntArray38 = null;
		this.anIntArray41 = null;
		this.anIntArray40 = null;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()Z")
	public boolean method182() {
		return this.aClass3_Sub6_1.anInt2416 < 0;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()I")
	public int method183() {
		@Pc(3) int local3 = this.anIntArray38.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray38[local9] >= 0 && this.anIntArray41[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray41[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()Z")
	public boolean method184() {
		@Pc(3) int local3 = this.anIntArray38.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray38[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public void method186(@OriginalArg(0) int arg0) {
		this.anIntArray38[arg0] = this.aClass3_Sub6_1.anInt2416;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([B)V")
	public void method187(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub6_1.aByteArray17 = arg0;
		this.aClass3_Sub6_1.anInt2416 = 10;
		@Pc(12) int local12 = this.aClass3_Sub6_1.method1603();
		this.anInt355 = this.aClass3_Sub6_1.method1603();
		this.anInt354 = 500000;
		this.anIntArray39 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub6_1.method1614();
			@Pc(38) int local38 = this.aClass3_Sub6_1.method1614();
			if (local33 == 1297379947) {
				this.anIntArray39[local27] = this.aClass3_Sub6_1.anInt2416;
				local27++;
			}
			this.aClass3_Sub6_1.anInt2416 += local38;
		}
		this.anIntArray38 = new int[this.anIntArray39.length];
		for (local33 = 0; local33 < this.anIntArray38.length; local33++) {
			this.anIntArray38[local33] = this.anIntArray39[local33];
		}
		this.anIntArray41 = new int[local12];
		this.anIntArray40 = new int[local12];
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public void method188(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub6_1.method1601();
		this.anIntArray41[arg0] += local4;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public void method189(@OriginalArg(0) int arg0) {
		this.aClass3_Sub6_1.anInt2416 = this.anIntArray38[arg0];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
	private int method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static6.aByteArray2[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub6_1.method1587() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub6_1.method1587() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub6_1.method1587();
		local12 = this.aClass3_Sub6_1.method1601();
		if (local7 == 47) {
			this.aClass3_Sub6_1.anInt2416 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub6_1.method1596();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray41[arg0];
			this.aLong8 += (long) local38 * (long) (this.anInt354 - local32);
			this.anInt354 = local32;
			this.aClass3_Sub6_1.anInt2416 += local12;
			return 2;
		} else {
			this.aClass3_Sub6_1.anInt2416 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "()V")
	public void method191() {
		this.aClass3_Sub6_1.anInt2416 = -1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(J)V")
	public void method192(@OriginalArg(0) long arg0) {
		this.aLong8 = arg0;
		@Pc(6) int local6 = this.anIntArray38.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray41[local8] = 0;
			this.anIntArray40[local8] = 0;
			this.aClass3_Sub6_1.anInt2416 = this.anIntArray39[local8];
			this.method188(local8);
			this.anIntArray38[local8] = this.aClass3_Sub6_1.anInt2416;
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)J")
	public long method193(@OriginalArg(0) int arg0) {
		return this.aLong8 + (long) arg0 * (long) this.anInt354;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "()Z")
	public boolean method194() {
		return this.aClass3_Sub6_1.aByteArray17 != null;
	}
}
