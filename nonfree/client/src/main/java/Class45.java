import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class45 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private int anInt1873;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	public int anInt1874;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!ne;")
	private final Class4_Sub10 aClass4_Sub10_5 = new Class4_Sub10(null);

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	public Class45() {
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class45(@OriginalArg(0) byte[] arg0) {
		this.method1339(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
	public long method1336(@OriginalArg(0) int arg0) {
		return this.aLong62 + (long) arg0 * (long) this.anInt1873;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()I")
	public int method1338() {
		@Pc(3) int local3 = this.anIntArray255.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray255[local9] >= 0 && this.anIntArray257[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray257[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([B)V")
	public void method1339(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub10_5.aByteArray17 = arg0;
		this.aClass4_Sub10_5.anInt931 = 10;
		@Pc(12) int local12 = this.aClass4_Sub10_5.method604();
		this.anInt1874 = this.aClass4_Sub10_5.method604();
		this.anInt1873 = 500000;
		this.anIntArray256 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub10_5.method549();
			@Pc(38) int local38 = this.aClass4_Sub10_5.method549();
			if (local33 == 1297379947) {
				this.anIntArray256[local27] = this.aClass4_Sub10_5.anInt931;
				local27++;
			}
			this.aClass4_Sub10_5.anInt931 += local38;
		}
		this.aLong62 = 0L;
		this.anIntArray255 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray255[local33] = this.anIntArray256[local33];
		}
		this.anIntArray257 = new int[local12];
		this.anIntArray258 = new int[local12];
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public void method1340(@OriginalArg(0) int arg0) {
		this.aClass4_Sub10_5.anInt931 = this.anIntArray255[arg0];
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public void method1341(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub10_5.method550();
		this.anIntArray257[arg0] += local4;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()Z")
	public boolean method1342() {
		@Pc(3) int local3 = this.anIntArray255.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray255[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()I")
	public int method1343() {
		return this.anIntArray255.length;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "()V")
	public void method1344() {
		this.aClass4_Sub10_5.anInt931 = -1;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)I")
	public int method1345(@OriginalArg(0) int arg0) {
		return this.method1348(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
	private int method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static71.aByteArray35[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub10_5.method599() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub10_5.method599() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub10_5.method599();
		local12 = this.aClass4_Sub10_5.method550();
		if (local7 == 47) {
			this.aClass4_Sub10_5.anInt931 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub10_5.method572();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray257[arg0];
			this.aLong62 += (long) local38 * (long) (this.anInt1873 - local32);
			this.anInt1873 = local32;
			this.aClass4_Sub10_5.anInt931 += local12;
			return 2;
		} else {
			this.aClass4_Sub10_5.anInt931 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "()V")
	public void method1347() {
		this.aClass4_Sub10_5.aByteArray17 = null;
		this.anIntArray256 = null;
		this.anIntArray255 = null;
		this.anIntArray257 = null;
		this.anIntArray258 = null;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I")
	private int method1348(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub10_5.aByteArray17[this.aClass4_Sub10_5.anInt931];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray258[arg0] = local13;
			this.aClass4_Sub10_5.anInt931++;
		} else {
			local13 = this.anIntArray258[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1346(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub10_5.method550();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub10_5.aByteArray17[this.aClass4_Sub10_5.anInt931] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub10_5.anInt931++;
				this.anIntArray258[arg0] = local57;
				return this.method1346(arg0, local57);
			}
		}
		this.aClass4_Sub10_5.anInt931 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public void method1349(@OriginalArg(0) int arg0) {
		this.anIntArray255[arg0] = this.aClass4_Sub10_5.anInt931;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "()Z")
	public boolean method1350() {
		return this.aClass4_Sub10_5.aByteArray17 != null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(J)V")
	public void method1351(@OriginalArg(0) long arg0) {
		this.aLong62 = arg0;
		@Pc(6) int local6 = this.anIntArray255.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray257[local8] = 0;
			this.anIntArray258[local8] = 0;
			this.aClass4_Sub10_5.anInt931 = this.anIntArray256[local8];
			this.method1341(local8);
			this.anIntArray255[local8] = this.aClass4_Sub10_5.anInt931;
		}
	}
}
