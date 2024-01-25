import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class95 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt2822;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public int anInt2823;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "J")
	private long aLong108;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!bk;")
	private final Class5_Sub1 aClass5_Sub1_6 = new Class5_Sub1(null);

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class95() {
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public Class95(@OriginalArg(0) byte[] arg0) {
		this.method2649(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
	public void method2641() {
		this.aClass5_Sub1_6.anInt2029 = -1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(J)V")
	public void method2642(@OriginalArg(0) long arg0) {
		this.aLong108 = arg0;
		@Pc(6) int local6 = this.anIntArray172.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray174[local8] = 0;
			this.anIntArray173[local8] = 0;
			this.aClass5_Sub1_6.anInt2029 = this.anIntArray175[local8];
			this.method2644(local8);
			this.anIntArray172[local8] = this.aClass5_Sub1_6.anInt2029;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)J")
	public long method2643(@OriginalArg(0) int arg0) {
		return this.aLong108 + (long) arg0 * (long) this.anInt2822;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public void method2644(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub1_6.method1881();
		this.anIntArray174[arg0] += local4;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	private int method2645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static142.aByteArray25[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub1_6.method1832() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub1_6.method1832() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub1_6.method1832();
		local12 = this.aClass5_Sub1_6.method1881();
		if (local7 == 47) {
			this.aClass5_Sub1_6.anInt2029 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub1_6.method1843();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray174[arg0];
			this.aLong108 += (long) local38 * (long) (this.anInt2822 - local32);
			this.anInt2822 = local32;
			this.aClass5_Sub1_6.anInt2029 += local12;
			return 2;
		} else {
			this.aClass5_Sub1_6.anInt2029 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	public int method2646(@OriginalArg(0) int arg0) {
		return this.method2656(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public void method2647(@OriginalArg(0) int arg0) {
		this.anIntArray172[arg0] = this.aClass5_Sub1_6.anInt2029;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public void method2648(@OriginalArg(0) int arg0) {
		this.aClass5_Sub1_6.anInt2029 = this.anIntArray172[arg0];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V")
	public void method2649(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub1_6.aByteArray18 = arg0;
		this.aClass5_Sub1_6.anInt2029 = 10;
		@Pc(12) int local12 = this.aClass5_Sub1_6.method1845();
		this.anInt2823 = this.aClass5_Sub1_6.method1845();
		this.anInt2822 = 500000;
		this.anIntArray175 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub1_6.method1826();
			@Pc(38) int local38 = this.aClass5_Sub1_6.method1826();
			if (local33 == 1297379947) {
				this.anIntArray175[local27] = this.aClass5_Sub1_6.anInt2029;
				local27++;
			}
			this.aClass5_Sub1_6.anInt2029 += local38;
		}
		this.aLong108 = 0L;
		this.anIntArray172 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray172[local33] = this.anIntArray175[local33];
		}
		this.anIntArray174 = new int[local12];
		this.anIntArray173 = new int[local12];
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()Z")
	public boolean method2650() {
		@Pc(3) int local3 = this.anIntArray172.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray172[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()V")
	public void method2652() {
		this.aClass5_Sub1_6.aByteArray18 = null;
		this.anIntArray175 = null;
		this.anIntArray172 = null;
		this.anIntArray174 = null;
		this.anIntArray173 = null;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "()I")
	public int method2653() {
		@Pc(3) int local3 = this.anIntArray172.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray172[local9] >= 0 && this.anIntArray174[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray174[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "()Z")
	public boolean method2654() {
		return this.aClass5_Sub1_6.aByteArray18 != null;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "()I")
	public int method2655() {
		return this.anIntArray172.length;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)I")
	private int method2656(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub1_6.aByteArray18[this.aClass5_Sub1_6.anInt2029];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray173[arg0] = local13;
			this.aClass5_Sub1_6.anInt2029++;
		} else {
			local13 = this.anIntArray173[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2645(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub1_6.method1881();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub1_6.aByteArray18[this.aClass5_Sub1_6.anInt2029] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub1_6.anInt2029++;
				this.anIntArray173[arg0] = local57;
				return this.method2645(arg0, local57);
			}
		}
		this.aClass5_Sub1_6.anInt2029 += local42;
		return 0;
	}
}
