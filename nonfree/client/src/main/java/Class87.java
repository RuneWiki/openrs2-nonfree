import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class87 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private int anInt4505;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public int anInt4506;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!fa;")
	private final Class1_Sub9 aClass1_Sub9_5 = new Class1_Sub9(null);

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class87() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
	public Class87(@OriginalArg(0) byte[] arg0) {
		this.method3468(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(J)V")
	public void method3456(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
		@Pc(6) int local6 = this.anIntArray429.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray430[local8] = 0;
			this.anIntArray428[local8] = 0;
			this.aClass1_Sub9_5.anInt1592 = this.anIntArray427[local8];
			this.method3467(local8);
			this.anIntArray429[local8] = this.aClass1_Sub9_5.anInt1592;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method3457(@OriginalArg(0) int arg0) {
		this.aClass1_Sub9_5.anInt1592 = this.anIntArray429[arg0];
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()Z")
	public boolean method3458() {
		return this.aClass1_Sub9_5.aByteArray25 != null;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	public void method3459() {
		this.aClass1_Sub9_5.anInt1592 = -1;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	public int method3460() {
		@Pc(3) int local3 = this.anIntArray429.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray429[local9] >= 0 && this.anIntArray430[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray430[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)J")
	public long method3461(@OriginalArg(0) int arg0) {
		return this.aLong145 + (long) arg0 * (long) this.anInt4505;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
	public int method3462(@OriginalArg(0) int arg0) {
		return this.method3465(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public void method3463(@OriginalArg(0) int arg0) {
		this.anIntArray429[arg0] = this.aClass1_Sub9_5.anInt1592;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()I")
	public int method3464() {
		return this.anIntArray429.length;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	private int method3465(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub9_5.aByteArray25[this.aClass1_Sub9_5.anInt1592];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray428[arg0] = local13;
			this.aClass1_Sub9_5.anInt1592++;
		} else {
			local13 = this.anIntArray428[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3470(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub9_5.method1250();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub9_5.aByteArray25[this.aClass1_Sub9_5.anInt1592] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub9_5.anInt1592++;
				this.anIntArray428[arg0] = local57;
				return this.method3470(arg0, local57);
			}
		}
		this.aClass1_Sub9_5.anInt1592 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()Z")
	public boolean method3466() {
		@Pc(3) int local3 = this.anIntArray429.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray429[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public void method3467(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub9_5.method1250();
		this.anIntArray430[arg0] += local4;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([B)V")
	public void method3468(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub9_5.aByteArray25 = arg0;
		this.aClass1_Sub9_5.anInt1592 = 10;
		@Pc(12) int local12 = this.aClass1_Sub9_5.method1280();
		this.anInt4506 = this.aClass1_Sub9_5.method1280();
		this.anInt4505 = 500000;
		this.anIntArray427 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub9_5.method1273();
			@Pc(38) int local38 = this.aClass1_Sub9_5.method1273();
			if (local33 == 1297379947) {
				this.anIntArray427[local27] = this.aClass1_Sub9_5.anInt1592;
				local27++;
			}
			this.aClass1_Sub9_5.anInt1592 += local38;
		}
		this.aLong145 = 0L;
		this.anIntArray429 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray429[local33] = this.anIntArray427[local33];
		}
		this.anIntArray430 = new int[local12];
		this.anIntArray428 = new int[local12];
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
	public void method3469() {
		this.aClass1_Sub9_5.aByteArray25 = null;
		this.anIntArray427 = null;
		this.anIntArray429 = null;
		this.anIntArray430 = null;
		this.anIntArray428 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	private int method3470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static180.aByteArray48[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub9_5.method1234() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub9_5.method1234() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub9_5.method1234();
		local12 = this.aClass1_Sub9_5.method1250();
		if (local7 == 47) {
			this.aClass1_Sub9_5.anInt1592 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub9_5.method1230();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray430[arg0];
			this.aLong145 += (long) local38 * (long) (this.anInt4505 - local32);
			this.anInt4505 = local32;
			this.aClass1_Sub9_5.anInt1592 += local12;
			return 2;
		} else {
			this.aClass1_Sub9_5.anInt1592 += local12;
			return 3;
		}
	}
}
