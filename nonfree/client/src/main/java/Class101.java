import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class101 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
	public int anInt3165;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	private int anInt3166;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Lclient!lf;")
	private Class1_Sub14 aClass1_Sub14_5 = new Class1_Sub14(null);

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class101() {
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V")
	public Class101(@OriginalArg(0) byte[] arg0) {
		this.method2765(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()V")
	public void method2761() {
		this.aClass1_Sub14_5.aByteArray17 = null;
		this.anIntArray271 = null;
		this.anIntArray268 = null;
		this.anIntArray270 = null;
		this.anIntArray269 = null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I")
	private int method2762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static161.aByteArray37[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub14_5.method1378() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub14_5.method1378() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub14_5.method1378();
		local12 = this.aClass1_Sub14_5.method1350();
		if (local7 == 47) {
			this.aClass1_Sub14_5.anInt1480 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub14_5.method1352();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray270[arg0];
			this.aLong115 += (long) local38 * (long) (this.anInt3166 - local32);
			this.anInt3166 = local32;
			this.aClass1_Sub14_5.anInt1480 += local12;
			return 2;
		} else {
			this.aClass1_Sub14_5.anInt1480 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
	public void method2763() {
		this.aClass1_Sub14_5.anInt1480 = -1;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public void method2764(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub14_5.method1350();
		this.anIntArray270[arg0] += local4;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([B)V")
	public void method2765(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub14_5.aByteArray17 = arg0;
		this.aClass1_Sub14_5.anInt1480 = 10;
		@Pc(12) int local12 = this.aClass1_Sub14_5.method1386();
		this.anInt3165 = this.aClass1_Sub14_5.method1386();
		this.anInt3166 = 500000;
		this.anIntArray271 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub14_5.method1392();
			@Pc(40) int local40 = this.aClass1_Sub14_5.method1392();
			if (local35 == 1297379947) {
				this.anIntArray271[local27] = this.aClass1_Sub14_5.anInt1480;
				local27++;
			}
			this.aClass1_Sub14_5.anInt1480 += local40;
		}
		this.aLong115 = 0L;
		this.anIntArray268 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray268[local27] = this.anIntArray271[local27];
		}
		this.anIntArray270 = new int[local12];
		this.anIntArray269 = new int[local12];
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
	public int method2766(@OriginalArg(0) int arg0) {
		return this.method2770(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	public void method2767(@OriginalArg(0) int arg0) {
		this.anIntArray268[arg0] = this.aClass1_Sub14_5.anInt1480;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)J")
	public long method2768(@OriginalArg(0) int arg0) {
		return this.aLong115 + (long) arg0 * (long) this.anInt3166;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "()I")
	public int method2769() {
		return this.anIntArray268.length;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I")
	private int method2770(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub14_5.aByteArray17[this.aClass1_Sub14_5.anInt1480];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray269[arg0] = local13;
			this.aClass1_Sub14_5.anInt1480++;
		} else {
			local13 = this.anIntArray269[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2762(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub14_5.method1350();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub14_5.aByteArray17[this.aClass1_Sub14_5.anInt1480] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub14_5.anInt1480++;
				this.anIntArray269[arg0] = local57;
				return this.method2762(arg0, local57);
			}
		}
		this.aClass1_Sub14_5.anInt1480 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
	public void method2771(@OriginalArg(0) int arg0) {
		this.aClass1_Sub14_5.anInt1480 = this.anIntArray268[arg0];
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "()Z")
	public boolean method2772() {
		@Pc(3) int local3 = this.anIntArray268.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray268[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(J)V")
	public void method2773(@OriginalArg(0) long arg0) {
		this.aLong115 = arg0;
		@Pc(6) int local6 = this.anIntArray268.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray270[local8] = 0;
			this.anIntArray269[local8] = 0;
			this.aClass1_Sub14_5.anInt1480 = this.anIntArray271[local8];
			this.method2764(local8);
			this.anIntArray268[local8] = this.aClass1_Sub14_5.anInt1480;
		}
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "()I")
	public int method2774() {
		@Pc(3) int local3 = this.anIntArray268.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray268[local9] >= 0 && this.anIntArray270[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray270[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "()Z")
	public boolean method2775() {
		return this.aClass1_Sub14_5.aByteArray17 != null;
	}
}
