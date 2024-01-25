import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class29 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Lclient!lh;")
	private final Class1_Sub1 aClass1_Sub1_1 = new Class1_Sub1(null);

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([B)V")
	public Class29(@OriginalArg(0) byte[] arg0) {
		this.method589(arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public void method575(@OriginalArg(0) int arg0) {
		this.aClass1_Sub1_1.anInt5056 = this.anIntArray39[arg0];
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	public void method577() {
		this.aClass1_Sub1_1.anInt5056 = -1;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	public void method578(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub1_1.method4108();
		this.anIntArray37[arg0] += local4;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(J)V")
	public void method579(@OriginalArg(0) long arg0) {
		this.aLong22 = arg0;
		@Pc(6) int local6 = this.anIntArray39.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray37[local8] = 0;
			this.anIntArray40[local8] = 0;
			this.aClass1_Sub1_1.anInt5056 = this.anIntArray38[local8];
			this.method578(local8);
			this.anIntArray39[local8] = this.aClass1_Sub1_1.anInt5056;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()Z")
	public boolean method580() {
		@Pc(3) int local3 = this.anIntArray39.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray39[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()Z")
	public boolean method581() {
		return this.aClass1_Sub1_1.aByteArray66 != null;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
	public void method582() {
		this.aClass1_Sub1_1.aByteArray66 = null;
		this.anIntArray38 = null;
		this.anIntArray39 = null;
		this.anIntArray37 = null;
		this.anIntArray40 = null;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	public int method583(@OriginalArg(0) int arg0) {
		return this.method585(arg0);
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "()I")
	public int method584() {
		@Pc(3) int local3 = this.anIntArray39.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray39[local9] >= 0 && this.anIntArray37[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray37[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)I")
	private int method585(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub1_1.aByteArray66[this.aClass1_Sub1_1.anInt5056];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray40[arg0] = local13;
			this.aClass1_Sub1_1.anInt5056++;
		} else {
			local13 = this.anIntArray40[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method587(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub1_1.method4108();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub1_1.aByteArray66[this.aClass1_Sub1_1.anInt5056] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub1_1.anInt5056++;
				this.anIntArray40[arg0] = local57;
				return this.method587(arg0, local57);
			}
		}
		this.aClass1_Sub1_1.anInt5056 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)J")
	public long method586(@OriginalArg(0) int arg0) {
		return this.aLong22 + (long) arg0 * (long) this.anInt633;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
	private int method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static34.aByteArray12[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub1_1.method4130() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub1_1.method4130() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub1_1.method4130();
		local12 = this.aClass1_Sub1_1.method4108();
		if (local7 == 47) {
			this.aClass1_Sub1_1.anInt5056 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub1_1.method4142();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray37[arg0];
			this.aLong22 += (long) local38 * (long) (this.anInt633 - local32);
			this.anInt633 = local32;
			this.aClass1_Sub1_1.anInt5056 += local12;
			return 2;
		} else {
			this.aClass1_Sub1_1.anInt5056 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "()I")
	public int method588() {
		return this.anIntArray39.length;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([B)V")
	public void method589(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub1_1.aByteArray66 = arg0;
		this.aClass1_Sub1_1.anInt5056 = 10;
		@Pc(12) int local12 = this.aClass1_Sub1_1.method4093();
		this.anInt634 = this.aClass1_Sub1_1.method4093();
		this.anInt633 = 500000;
		this.anIntArray38 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub1_1.method4087();
			@Pc(38) int local38 = this.aClass1_Sub1_1.method4087();
			if (local33 == 1297379947) {
				this.anIntArray38[local27] = this.aClass1_Sub1_1.anInt5056;
				local27++;
			}
			this.aClass1_Sub1_1.anInt5056 += local38;
		}
		this.aLong22 = 0L;
		this.anIntArray39 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray39[local33] = this.anIntArray38[local33];
		}
		this.anIntArray37 = new int[local12];
		this.anIntArray40 = new int[local12];
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
	public void method590(@OriginalArg(0) int arg0) {
		this.anIntArray39[arg0] = this.aClass1_Sub1_1.anInt5056;
	}
}
