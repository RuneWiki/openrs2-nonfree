import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class54 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	private int anInt1902;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "J")
	private long aLong97;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public int anInt1903;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!s;")
	private final Class4_Sub16 aClass4_Sub16_5 = new Class4_Sub16(null);

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Class54(@OriginalArg(0) byte[] arg0) {
		this.method1341(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public void method1331() {
		this.aClass4_Sub16_5.anInt2019 = -1;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()Z")
	public boolean method1332() {
		@Pc(3) int local3 = this.anIntArray218.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray218[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	private int method1333(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub16_5.aByteArray22[this.aClass4_Sub16_5.anInt2019];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray217[arg0] = local13;
			this.aClass4_Sub16_5.anInt2019++;
		} else {
			local13 = this.anIntArray217[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1338(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub16_5.method1455();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub16_5.aByteArray22[this.aClass4_Sub16_5.anInt2019] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub16_5.anInt2019++;
				this.anIntArray217[arg0] = local57;
				return this.method1338(arg0, local57);
			}
		}
		this.aClass4_Sub16_5.anInt2019 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
	public void method1334() {
		this.aClass4_Sub16_5.aByteArray22 = null;
		this.anIntArray216 = null;
		this.anIntArray218 = null;
		this.anIntArray215 = null;
		this.anIntArray217 = null;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()I")
	public int method1335() {
		@Pc(3) int local3 = this.anIntArray218.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray218[local9] >= 0 && this.anIntArray215[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray215[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public void method1336(@OriginalArg(0) int arg0) {
		this.aClass4_Sub16_5.anInt2019 = this.anIntArray218[arg0];
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)J")
	public long method1337(@OriginalArg(0) int arg0) {
		return this.aLong97 + (long) arg0 * (long) this.anInt1902;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	private int method1338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static81.aByteArray20[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub16_5.method1474() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub16_5.method1474() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub16_5.method1474();
		local12 = this.aClass4_Sub16_5.method1455();
		if (local7 == 47) {
			this.aClass4_Sub16_5.anInt2019 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub16_5.method1475();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray215[arg0];
			this.aLong97 += (long) local38 * (long) (this.anInt1902 - local32);
			this.anInt1902 = local32;
			this.aClass4_Sub16_5.anInt2019 += local12;
			return 2;
		} else {
			this.aClass4_Sub16_5.anInt2019 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public void method1339(@OriginalArg(0) int arg0) {
		this.anIntArray218[arg0] = this.aClass4_Sub16_5.anInt2019;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
	public void method1341(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub16_5.aByteArray22 = arg0;
		this.aClass4_Sub16_5.anInt2019 = 10;
		@Pc(12) int local12 = this.aClass4_Sub16_5.method1490();
		this.anInt1903 = this.aClass4_Sub16_5.method1490();
		this.anInt1902 = 500000;
		this.anIntArray216 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub16_5.method1486();
			@Pc(38) int local38 = this.aClass4_Sub16_5.method1486();
			if (local33 == 1297379947) {
				this.anIntArray216[local27] = this.aClass4_Sub16_5.anInt2019;
				local27++;
			}
			this.aClass4_Sub16_5.anInt2019 += local38;
		}
		this.aLong97 = 0L;
		this.anIntArray218 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray218[local33] = this.anIntArray216[local33];
		}
		this.anIntArray215 = new int[local12];
		this.anIntArray217 = new int[local12];
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()Z")
	public boolean method1342() {
		return this.aClass4_Sub16_5.aByteArray22 != null;
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()I")
	public int method1343() {
		return this.anIntArray218.length;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public void method1344(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub16_5.method1455();
		this.anIntArray215[arg0] += local4;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)I")
	public int method1345(@OriginalArg(0) int arg0) {
		return this.method1333(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V")
	public void method1346(@OriginalArg(0) long arg0) {
		this.aLong97 = arg0;
		@Pc(6) int local6 = this.anIntArray218.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray215[local8] = 0;
			this.anIntArray217[local8] = 0;
			this.aClass4_Sub16_5.anInt2019 = this.anIntArray216[local8];
			this.method1344(local8);
			this.anIntArray218[local8] = this.aClass4_Sub16_5.anInt2019;
		}
	}
}
