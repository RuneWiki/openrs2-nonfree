import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class226 {

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
	private int anInt6490;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "[I")
	private int[] anIntArray358;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!ek;")
	private final Class4_Sub13 aClass4_Sub13_7 = new Class4_Sub13(null);

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
	public Class226() {
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "([B)V")
	public Class226(@OriginalArg(0) byte[] arg0) {
		this.method5132(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "()I")
	public int method5123() {
		@Pc(3) int local3 = this.anIntArray358.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray358[local9] >= 0 && this.anIntArray355[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray355[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
	private int method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static336.aByteArray56[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub13_7.method7004() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub13_7.method7004() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub13_7.method7004();
		local12 = this.aClass4_Sub13_7.method7012();
		if (local7 == 47) {
			this.aClass4_Sub13_7.anInt9170 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub13_7.method7013();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray355[arg0];
			this.aLong175 += (long) local38 * (long) (this.anInt6490 - local32);
			this.anInt6490 = local32;
			this.aClass4_Sub13_7.anInt9170 += local12;
			return 2;
		} else {
			this.aClass4_Sub13_7.anInt9170 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	public int method5125(@OriginalArg(0) int arg0) {
		return this.method5133(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(J)V")
	public void method5127(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
		@Pc(6) int local6 = this.anIntArray358.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray355[local8] = 0;
			this.anIntArray357[local8] = 0;
			this.aClass4_Sub13_7.anInt9170 = this.anIntArray356[local8];
			this.method5131(local8);
			this.anIntArray358[local8] = this.aClass4_Sub13_7.anInt9170;
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "()I")
	public int method5128() {
		return this.anIntArray358.length;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)J")
	public long method5129(@OriginalArg(0) int arg0) {
		return this.aLong175 + (long) arg0 * (long) this.anInt6490;
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "()Z")
	public boolean method5130() {
		@Pc(3) int local3 = this.anIntArray358.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray358[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	public void method5131(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub13_7.method7012();
		this.anIntArray355[arg0] += local4;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([B)V")
	public void method5132(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub13_7.aByteArray88 = arg0;
		this.aClass4_Sub13_7.anInt9170 = 10;
		@Pc(12) int local12 = this.aClass4_Sub13_7.method7054();
		this.anInt6489 = this.aClass4_Sub13_7.method7054();
		this.anInt6490 = 500000;
		this.anIntArray356 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub13_7.method6990();
			@Pc(38) int local38 = this.aClass4_Sub13_7.method6990();
			if (local33 == 1297379947) {
				this.anIntArray356[local27] = this.aClass4_Sub13_7.anInt9170;
				local27++;
			}
			this.aClass4_Sub13_7.anInt9170 += local38;
		}
		this.aLong175 = 0L;
		this.anIntArray358 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray358[local33] = this.anIntArray356[local33];
		}
		this.anIntArray355 = new int[local12];
		this.anIntArray357 = new int[local12];
	}

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)I")
	private int method5133(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub13_7.aByteArray88[this.aClass4_Sub13_7.anInt9170];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray357[arg0] = local13;
			this.aClass4_Sub13_7.anInt9170++;
		} else {
			local13 = this.anIntArray357[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5124(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub13_7.method7012();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub13_7.aByteArray88[this.aClass4_Sub13_7.anInt9170] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub13_7.anInt9170++;
				this.anIntArray357[arg0] = local57;
				return this.method5124(arg0, local57);
			}
		}
		this.aClass4_Sub13_7.anInt9170 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V")
	public void method5134(@OriginalArg(0) int arg0) {
		this.aClass4_Sub13_7.anInt9170 = this.anIntArray358[arg0];
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "()Z")
	public boolean method5135() {
		return this.aClass4_Sub13_7.aByteArray88 != null;
	}

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)V")
	public void method5136(@OriginalArg(0) int arg0) {
		this.anIntArray358[arg0] = this.aClass4_Sub13_7.anInt9170;
	}

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "()V")
	public void method5137() {
		this.aClass4_Sub13_7.anInt9170 = -1;
	}

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "()V")
	public void method5138() {
		this.aClass4_Sub13_7.aByteArray88 = null;
		this.anIntArray356 = null;
		this.anIntArray358 = null;
		this.anIntArray355 = null;
		this.anIntArray357 = null;
	}
}
