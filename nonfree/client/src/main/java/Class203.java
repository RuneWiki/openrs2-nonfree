import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class203 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	private int anInt5012;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public int anInt5013;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!gk;")
	private final Class2_Sub7 aClass2_Sub7_3 = new Class2_Sub7(null);

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class203() {
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V")
	public Class203(@OriginalArg(0) byte[] arg0) {
		this.method4341(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method4332(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub7_3.method4463();
		this.anIntArray343[arg0] += local4;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
	private int method4333(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub7_3.aByteArray52[this.aClass2_Sub7_3.anInt5186];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray345[arg0] = local13;
			this.aClass2_Sub7_3.anInt5186++;
		} else {
			local13 = this.anIntArray345[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4339(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub7_3.method4463();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub7_3.aByteArray52[this.aClass2_Sub7_3.anInt5186] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub7_3.anInt5186++;
				this.anIntArray345[arg0] = local57;
				return this.method4339(arg0, local57);
			}
		}
		this.aClass2_Sub7_3.anInt5186 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
	public void method4334() {
		this.aClass2_Sub7_3.aByteArray52 = null;
		this.anIntArray344 = null;
		this.anIntArray346 = null;
		this.anIntArray343 = null;
		this.anIntArray345 = null;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()V")
	public void method4335() {
		this.aClass2_Sub7_3.anInt5186 = -1;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()Z")
	public boolean method4336() {
		@Pc(3) int local3 = this.anIntArray346.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray346[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()I")
	public int method4337() {
		return this.anIntArray346.length;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public void method4338(@OriginalArg(0) int arg0) {
		this.anIntArray346[arg0] = this.aClass2_Sub7_3.anInt5186;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
	private int method4339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static298.aByteArray50[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub7_3.method4464() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub7_3.method4464() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub7_3.method4464();
		local12 = this.aClass2_Sub7_3.method4463();
		if (local7 == 47) {
			this.aClass2_Sub7_3.anInt5186 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub7_3.method4503();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray343[arg0];
			this.aLong137 += (long) local38 * (long) (this.anInt5012 - local32);
			this.anInt5012 = local32;
			this.aClass2_Sub7_3.anInt5186 += local12;
			return 2;
		} else {
			this.aClass2_Sub7_3.anInt5186 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "()Z")
	public boolean method4340() {
		return this.aClass2_Sub7_3.aByteArray52 != null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([B)V")
	public void method4341(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub7_3.aByteArray52 = arg0;
		this.aClass2_Sub7_3.anInt5186 = 10;
		@Pc(12) int local12 = this.aClass2_Sub7_3.method4518();
		this.anInt5013 = this.aClass2_Sub7_3.method4518();
		this.anInt5012 = 500000;
		this.anIntArray344 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub7_3.method4509();
			@Pc(38) int local38 = this.aClass2_Sub7_3.method4509();
			if (local33 == 1297379947) {
				this.anIntArray344[local27] = this.aClass2_Sub7_3.anInt5186;
				local27++;
			}
			this.aClass2_Sub7_3.anInt5186 += local38;
		}
		this.aLong137 = 0L;
		this.anIntArray346 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray346[local33] = this.anIntArray344[local33];
		}
		this.anIntArray343 = new int[local12];
		this.anIntArray345 = new int[local12];
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	public void method4342(@OriginalArg(0) int arg0) {
		this.aClass2_Sub7_3.anInt5186 = this.anIntArray346[arg0];
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)I")
	public int method4343(@OriginalArg(0) int arg0) {
		return this.method4333(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)J")
	public long method4344(@OriginalArg(0) int arg0) {
		return this.aLong137 + (long) arg0 * (long) this.anInt5012;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "()I")
	public int method4345() {
		@Pc(3) int local3 = this.anIntArray346.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray346[local9] >= 0 && this.anIntArray343[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray343[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(J)V")
	public void method4347(@OriginalArg(0) long arg0) {
		this.aLong137 = arg0;
		@Pc(6) int local6 = this.anIntArray346.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray343[local8] = 0;
			this.anIntArray345[local8] = 0;
			this.aClass2_Sub7_3.anInt5186 = this.anIntArray344[local8];
			this.method4332(local8);
			this.anIntArray346[local8] = this.aClass2_Sub7_3.anInt5186;
		}
	}
}
