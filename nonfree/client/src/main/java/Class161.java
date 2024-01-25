import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class161 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	private int anInt5209;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
	public int anInt5210;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "J")
	private long aLong194;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!tq;")
	private final Class4_Sub7 aClass4_Sub7_6 = new Class4_Sub7(null);

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class161() {
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([B)V")
	public Class161(@OriginalArg(0) byte[] arg0) {
		this.method4321(arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([B)V")
	public void method4321(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub7_6.aByteArray42 = arg0;
		this.aClass4_Sub7_6.anInt2667 = 10;
		@Pc(12) int local12 = this.aClass4_Sub7_6.method2404();
		this.anInt5210 = this.aClass4_Sub7_6.method2404();
		this.anInt5209 = 500000;
		this.anIntArray429 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub7_6.method2389();
			@Pc(38) int local38 = this.aClass4_Sub7_6.method2389();
			if (local33 == 1297379947) {
				this.anIntArray429[local27] = this.aClass4_Sub7_6.anInt2667;
				local27++;
			}
			this.aClass4_Sub7_6.anInt2667 += local38;
		}
		this.aLong194 = 0L;
		this.anIntArray428 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray428[local33] = this.anIntArray429[local33];
		}
		this.anIntArray426 = new int[local12];
		this.anIntArray427 = new int[local12];
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I")
	private int method4322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static250.aByteArray78[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub7_6.method2380() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub7_6.method2380() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub7_6.method2380();
		local12 = this.aClass4_Sub7_6.method2359();
		if (local7 == 47) {
			this.aClass4_Sub7_6.anInt2667 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub7_6.method2402();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray426[arg0];
			this.aLong194 += (long) local38 * (long) (this.anInt5209 - local32);
			this.anInt5209 = local32;
			this.aClass4_Sub7_6.anInt2667 += local12;
			return 2;
		} else {
			this.aClass4_Sub7_6.anInt2667 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "()Z")
	public boolean method4323() {
		@Pc(3) int local3 = this.anIntArray428.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray428[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "()V")
	public void method4324() {
		this.aClass4_Sub7_6.anInt2667 = -1;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "()V")
	public void method4325() {
		this.aClass4_Sub7_6.aByteArray42 = null;
		this.anIntArray429 = null;
		this.anIntArray428 = null;
		this.anIntArray426 = null;
		this.anIntArray427 = null;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "()Z")
	public boolean method4326() {
		return this.aClass4_Sub7_6.aByteArray42 != null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(J)V")
	public void method4327(@OriginalArg(0) long arg0) {
		this.aLong194 = arg0;
		@Pc(6) int local6 = this.anIntArray428.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray426[local8] = 0;
			this.anIntArray427[local8] = 0;
			this.aClass4_Sub7_6.anInt2667 = this.anIntArray429[local8];
			this.method4329(local8);
			this.anIntArray428[local8] = this.aClass4_Sub7_6.anInt2667;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method4328(@OriginalArg(0) int arg0) {
		this.anIntArray428[arg0] = this.aClass4_Sub7_6.anInt2667;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
	public void method4329(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub7_6.method2359();
		this.anIntArray426[arg0] += local4;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "()I")
	public int method4330() {
		@Pc(3) int local3 = this.anIntArray428.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray428[local9] >= 0 && this.anIntArray426[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray426[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
	public void method4332(@OriginalArg(0) int arg0) {
		this.aClass4_Sub7_6.anInt2667 = this.anIntArray428[arg0];
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)I")
	private int method4333(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub7_6.aByteArray42[this.aClass4_Sub7_6.anInt2667];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray427[arg0] = local13;
			this.aClass4_Sub7_6.anInt2667++;
		} else {
			local13 = this.anIntArray427[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4322(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub7_6.method2359();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub7_6.aByteArray42[this.aClass4_Sub7_6.anInt2667] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub7_6.anInt2667++;
				this.anIntArray427[arg0] = local57;
				return this.method4322(arg0, local57);
			}
		}
		this.aClass4_Sub7_6.anInt2667 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "()I")
	public int method4334() {
		return this.anIntArray428.length;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)J")
	public long method4335(@OriginalArg(0) int arg0) {
		return this.aLong194 + (long) arg0 * (long) this.anInt5209;
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)I")
	public int method4336(@OriginalArg(0) int arg0) {
		return this.method4333(arg0);
	}
}
