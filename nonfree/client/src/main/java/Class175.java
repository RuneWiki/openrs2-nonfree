import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class175 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	private int anInt5295;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
	public int anInt5296;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!iv;")
	private final Class4_Sub12 aClass4_Sub12_6 = new Class4_Sub12(null);

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class175() {
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([B)V")
	public Class175(@OriginalArg(0) byte[] arg0) {
		this.method4054(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "()V")
	public void method4045() {
		this.aClass4_Sub12_6.anInt2997 = -1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)I")
	private int method4046(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub12_6.aByteArray36[this.aClass4_Sub12_6.anInt2997];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray348[arg0] = local13;
			this.aClass4_Sub12_6.anInt2997++;
		} else {
			local13 = this.anIntArray348[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4051(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub12_6.method2528();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub12_6.aByteArray36[this.aClass4_Sub12_6.anInt2997] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub12_6.anInt2997++;
				this.anIntArray348[arg0] = local57;
				return this.method4051(arg0, local57);
			}
		}
		this.aClass4_Sub12_6.anInt2997 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	public void method4047(@OriginalArg(0) int arg0) {
		this.anIntArray345[arg0] = this.aClass4_Sub12_6.anInt2997;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)J")
	public long method4048(@OriginalArg(0) int arg0) {
		return this.aLong178 + (long) arg0 * (long) this.anInt5295;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "()V")
	public void method4049() {
		this.aClass4_Sub12_6.aByteArray36 = null;
		this.anIntArray346 = null;
		this.anIntArray345 = null;
		this.anIntArray347 = null;
		this.anIntArray348 = null;
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
	public void method4050(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub12_6.method2528();
		this.anIntArray347[arg0] += local4;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
	private int method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static295.aByteArray66[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub12_6.method2490() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub12_6.method2490() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub12_6.method2490();
		local12 = this.aClass4_Sub12_6.method2528();
		if (local7 == 47) {
			this.aClass4_Sub12_6.anInt2997 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub12_6.method2493();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray347[arg0];
			this.aLong178 += (long) local38 * (long) (this.anInt5295 - local32);
			this.anInt5295 = local32;
			this.aClass4_Sub12_6.anInt2997 += local12;
			return 2;
		} else {
			this.aClass4_Sub12_6.anInt2997 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "()Z")
	public boolean method4052() {
		@Pc(3) int local3 = this.anIntArray345.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray345[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(J)V")
	public void method4053(@OriginalArg(0) long arg0) {
		this.aLong178 = arg0;
		@Pc(6) int local6 = this.anIntArray345.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray347[local8] = 0;
			this.anIntArray348[local8] = 0;
			this.aClass4_Sub12_6.anInt2997 = this.anIntArray346[local8];
			this.method4050(local8);
			this.anIntArray345[local8] = this.aClass4_Sub12_6.anInt2997;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([B)V")
	public void method4054(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub12_6.aByteArray36 = arg0;
		this.aClass4_Sub12_6.anInt2997 = 10;
		@Pc(12) int local12 = this.aClass4_Sub12_6.method2536();
		this.anInt5296 = this.aClass4_Sub12_6.method2536();
		this.anInt5295 = 500000;
		this.anIntArray346 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub12_6.method2529();
			@Pc(38) int local38 = this.aClass4_Sub12_6.method2529();
			if (local33 == 1297379947) {
				this.anIntArray346[local27] = this.aClass4_Sub12_6.anInt2997;
				local27++;
			}
			this.aClass4_Sub12_6.anInt2997 += local38;
		}
		this.aLong178 = 0L;
		this.anIntArray345 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray345[local33] = this.anIntArray346[local33];
		}
		this.anIntArray347 = new int[local12];
		this.anIntArray348 = new int[local12];
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "()I")
	public int method4055() {
		@Pc(3) int local3 = this.anIntArray345.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray345[local9] >= 0 && this.anIntArray347[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray347[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(I)V")
	public void method4056(@OriginalArg(0) int arg0) {
		this.aClass4_Sub12_6.anInt2997 = this.anIntArray345[arg0];
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "()Z")
	public boolean method4057() {
		return this.aClass4_Sub12_6.aByteArray36 != null;
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(I)I")
	public int method4058(@OriginalArg(0) int arg0) {
		return this.method4046(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "()I")
	public int method4060() {
		return this.anIntArray345.length;
	}
}
