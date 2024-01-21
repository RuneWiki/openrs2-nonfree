import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class8 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!hc;")
	private final Class1_Sub6 aClass1_Sub6_1 = new Class1_Sub6(null);

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class8() {
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V")
	public Class8(@OriginalArg(0) byte[] arg0) {
		this.method333(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V")
	public void method330(@OriginalArg(0) long arg0) {
		this.aLong18 = arg0;
		@Pc(6) int local6 = this.anIntArray38.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray41[local8] = 0;
			this.anIntArray39[local8] = 0;
			this.aClass1_Sub6_1.anInt839 = this.anIntArray40[local8];
			this.method342(local8);
			this.anIntArray38[local8] = this.aClass1_Sub6_1.anInt839;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)J")
	public long method331(@OriginalArg(0) int arg0) {
		return this.aLong18 + (long) arg0 * (long) this.anInt561;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	public int method332(@OriginalArg(0) int arg0) {
		return this.method341(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([B)V")
	public void method333(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub6_1.aByteArray3 = arg0;
		this.aClass1_Sub6_1.anInt839 = 10;
		@Pc(12) int local12 = this.aClass1_Sub6_1.method546();
		this.anInt560 = this.aClass1_Sub6_1.method546();
		this.anInt561 = 500000;
		this.anIntArray40 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub6_1.method499();
			@Pc(38) int local38 = this.aClass1_Sub6_1.method499();
			if (local33 == 1297379947) {
				this.anIntArray40[local27] = this.aClass1_Sub6_1.anInt839;
				local27++;
			}
			this.aClass1_Sub6_1.anInt839 += local38;
		}
		this.aLong18 = 0L;
		this.anIntArray38 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray38[local33] = this.anIntArray40[local33];
		}
		this.anIntArray41 = new int[local12];
		this.anIntArray39 = new int[local12];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
	private int method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static18.aByteArray1[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub6_1.method544() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub6_1.method544() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub6_1.method544();
		local12 = this.aClass1_Sub6_1.method540();
		if (local7 == 47) {
			this.aClass1_Sub6_1.anInt839 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub6_1.method501();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray41[arg0];
			this.aLong18 += (long) local38 * (long) (this.anInt561 - local32);
			this.anInt561 = local32;
			this.aClass1_Sub6_1.anInt839 += local12;
			return 2;
		} else {
			this.aClass1_Sub6_1.anInt839 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	public void method335() {
		this.aClass1_Sub6_1.aByteArray3 = null;
		this.anIntArray40 = null;
		this.anIntArray38 = null;
		this.anIntArray41 = null;
		this.anIntArray39 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z")
	public boolean method336() {
		@Pc(3) int local3 = this.anIntArray38.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray38[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public void method337(@OriginalArg(0) int arg0) {
		this.anIntArray38[arg0] = this.aClass1_Sub6_1.anInt839;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	public void method339(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_1.anInt839 = this.anIntArray38[arg0];
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()I")
	public int method340() {
		return this.anIntArray38.length;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)I")
	private int method341(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub6_1.aByteArray3[this.aClass1_Sub6_1.anInt839];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray39[arg0] = local13;
			this.aClass1_Sub6_1.anInt839++;
		} else {
			local13 = this.anIntArray39[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method334(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub6_1.method540();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub6_1.aByteArray3[this.aClass1_Sub6_1.anInt839] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub6_1.anInt839++;
				this.anIntArray39[arg0] = local57;
				return this.method334(arg0, local57);
			}
		}
		this.aClass1_Sub6_1.anInt839 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
	public void method342(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub6_1.method540();
		this.anIntArray41[arg0] += local4;
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
	public void method343() {
		this.aClass1_Sub6_1.anInt839 = -1;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()Z")
	public boolean method344() {
		return this.aClass1_Sub6_1.aByteArray3 != null;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "()I")
	public int method345() {
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
}
