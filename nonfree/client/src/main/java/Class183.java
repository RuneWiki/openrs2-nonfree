import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class183 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private int anInt5462;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public int anInt5463;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "[I")
	private int[] anIntArray496;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!jg;")
	private final Class14_Sub4 aClass14_Sub4_7 = new Class14_Sub4(null);

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class183() {
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V")
	public Class183(@OriginalArg(0) byte[] arg0) {
		this.method4909(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public void method4899(@OriginalArg(0) int arg0) {
		this.anIntArray495[arg0] = this.aClass14_Sub4_7.anInt2637;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method4900(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass14_Sub4_7.method2497();
		this.anIntArray497[arg0] += local4;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
	private int method4901(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass14_Sub4_7.aByteArray74[this.aClass14_Sub4_7.anInt2637];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray496[arg0] = local13;
			this.aClass14_Sub4_7.anInt2637++;
		} else {
			local13 = this.anIntArray496[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4911(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass14_Sub4_7.method2497();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass14_Sub4_7.aByteArray74[this.aClass14_Sub4_7.anInt2637] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass14_Sub4_7.anInt2637++;
				this.anIntArray496[arg0] = local57;
				return this.method4911(arg0, local57);
			}
		}
		this.aClass14_Sub4_7.anInt2637 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	public void method4902(@OriginalArg(0) int arg0) {
		this.aClass14_Sub4_7.anInt2637 = this.anIntArray495[arg0];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public void method4903() {
		this.aClass14_Sub4_7.aByteArray74 = null;
		this.anIntArray498 = null;
		this.anIntArray495 = null;
		this.anIntArray497 = null;
		this.anIntArray496 = null;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()Z")
	public boolean method4904() {
		return this.aClass14_Sub4_7.aByteArray74 != null;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
	public int method4905(@OriginalArg(0) int arg0) {
		return this.method4901(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(J)V")
	public void method4906(@OriginalArg(0) long arg0) {
		this.aLong178 = arg0;
		@Pc(6) int local6 = this.anIntArray495.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray497[local8] = 0;
			this.anIntArray496[local8] = 0;
			this.aClass14_Sub4_7.anInt2637 = this.anIntArray498[local8];
			this.method4900(local8);
			this.anIntArray495[local8] = this.aClass14_Sub4_7.anInt2637;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()V")
	public void method4907() {
		this.aClass14_Sub4_7.anInt2637 = -1;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
	public int method4908() {
		return this.anIntArray495.length;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
	public void method4909(@OriginalArg(0) byte[] arg0) {
		this.aClass14_Sub4_7.aByteArray74 = arg0;
		this.aClass14_Sub4_7.anInt2637 = 10;
		@Pc(12) int local12 = this.aClass14_Sub4_7.method2498();
		this.anInt5463 = this.aClass14_Sub4_7.method2498();
		this.anInt5462 = 500000;
		this.anIntArray498 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass14_Sub4_7.method2510();
			@Pc(38) int local38 = this.aClass14_Sub4_7.method2510();
			if (local33 == 1297379947) {
				this.anIntArray498[local27] = this.aClass14_Sub4_7.anInt2637;
				local27++;
			}
			this.aClass14_Sub4_7.anInt2637 += local38;
		}
		this.aLong178 = 0L;
		this.anIntArray495 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray495[local33] = this.anIntArray498[local33];
		}
		this.anIntArray497 = new int[local12];
		this.anIntArray496 = new int[local12];
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "()I")
	public int method4910() {
		@Pc(3) int local3 = this.anIntArray495.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray495[local9] >= 0 && this.anIntArray497[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray497[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	private int method4911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static287.aByteArray172[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass14_Sub4_7.method2548() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass14_Sub4_7.method2548() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass14_Sub4_7.method2548();
		local12 = this.aClass14_Sub4_7.method2497();
		if (local7 == 47) {
			this.aClass14_Sub4_7.anInt2637 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass14_Sub4_7.method2501();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray497[arg0];
			this.aLong178 += (long) local38 * (long) (this.anInt5462 - local32);
			this.anInt5462 = local32;
			this.aClass14_Sub4_7.anInt2637 += local12;
			return 2;
		} else {
			this.aClass14_Sub4_7.anInt2637 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)J")
	public long method4912(@OriginalArg(0) int arg0) {
		return this.aLong178 + (long) arg0 * (long) this.anInt5462;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "()Z")
	public boolean method4913() {
		@Pc(3) int local3 = this.anIntArray495.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray495[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
