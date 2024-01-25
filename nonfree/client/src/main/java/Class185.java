import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class185 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public int anInt5247;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	private int anInt5248;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!ug;")
	private final Class1_Sub28 aClass1_Sub28_6 = new Class1_Sub28(null);

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class185() {
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
	public Class185(@OriginalArg(0) byte[] arg0) {
		this.method4130(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method4123(@OriginalArg(0) int arg0) {
		this.anIntArray344[arg0] = this.aClass1_Sub28_6.anInt6812;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()Z")
	public boolean method4124() {
		return this.aClass1_Sub28_6.aByteArray86 != null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public void method4125(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub28_6.method5394();
		this.anIntArray346[arg0] += local4;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)J")
	public long method4126(@OriginalArg(0) int arg0) {
		return this.aLong160 + (long) arg0 * (long) this.anInt5248;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	public void method4127() {
		this.aClass1_Sub28_6.anInt6812 = -1;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public void method4128(@OriginalArg(0) int arg0) {
		this.aClass1_Sub28_6.anInt6812 = this.anIntArray344[arg0];
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()Z")
	public boolean method4129() {
		@Pc(3) int local3 = this.anIntArray344.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray344[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([B)V")
	public void method4130(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub28_6.aByteArray86 = arg0;
		this.aClass1_Sub28_6.anInt6812 = 10;
		@Pc(12) int local12 = this.aClass1_Sub28_6.method5335();
		this.anInt5247 = this.aClass1_Sub28_6.method5335();
		this.anInt5248 = 500000;
		this.anIntArray343 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub28_6.method5355();
			@Pc(38) int local38 = this.aClass1_Sub28_6.method5355();
			if (local33 == 1297379947) {
				this.anIntArray343[local27] = this.aClass1_Sub28_6.anInt6812;
				local27++;
			}
			this.aClass1_Sub28_6.anInt6812 += local38;
		}
		this.aLong160 = 0L;
		this.anIntArray344 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray344[local33] = this.anIntArray343[local33];
		}
		this.anIntArray346 = new int[local12];
		this.anIntArray345 = new int[local12];
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I")
	public int method4131(@OriginalArg(0) int arg0) {
		return this.method4135(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()V")
	public void method4132() {
		this.aClass1_Sub28_6.aByteArray86 = null;
		this.anIntArray343 = null;
		this.anIntArray344 = null;
		this.anIntArray346 = null;
		this.anIntArray345 = null;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "()I")
	public int method4133() {
		@Pc(3) int local3 = this.anIntArray344.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray344[local9] >= 0 && this.anIntArray346[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray346[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	private int method4135(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub28_6.aByteArray86[this.aClass1_Sub28_6.anInt6812];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray345[arg0] = local13;
			this.aClass1_Sub28_6.anInt6812++;
		} else {
			local13 = this.anIntArray345[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4136(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub28_6.method5394();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub28_6.aByteArray86[this.aClass1_Sub28_6.anInt6812] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub28_6.anInt6812++;
				this.anIntArray345[arg0] = local57;
				return this.method4136(arg0, local57);
			}
		}
		this.aClass1_Sub28_6.anInt6812 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	private int method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static302.aByteArray59[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub28_6.method5337() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub28_6.method5337() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub28_6.method5337();
		local12 = this.aClass1_Sub28_6.method5394();
		if (local7 == 47) {
			this.aClass1_Sub28_6.anInt6812 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub28_6.method5345();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray346[arg0];
			this.aLong160 += (long) local38 * (long) (this.anInt5248 - local32);
			this.anInt5248 = local32;
			this.aClass1_Sub28_6.anInt6812 += local12;
			return 2;
		} else {
			this.aClass1_Sub28_6.anInt6812 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "()I")
	public int method4137() {
		return this.anIntArray344.length;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(J)V")
	public void method4138(@OriginalArg(0) long arg0) {
		this.aLong160 = arg0;
		@Pc(6) int local6 = this.anIntArray344.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray346[local8] = 0;
			this.anIntArray345[local8] = 0;
			this.aClass1_Sub28_6.anInt6812 = this.anIntArray343[local8];
			this.method4125(local8);
			this.anIntArray344[local8] = this.aClass1_Sub28_6.anInt6812;
		}
	}
}
