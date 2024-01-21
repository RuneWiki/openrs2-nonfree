import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class88 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public int anInt3978;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	private int[] anIntArray481;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	private int[] anIntArray484;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private int anInt3979;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!mb;")
	private final Class3_Sub17 aClass3_Sub17_5 = new Class3_Sub17(null);

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class88() {
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
	public Class88(@OriginalArg(0) byte[] arg0) {
		this.method2841(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method2840(@OriginalArg(0) int arg0) {
		return this.method2852(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([B)V")
	public void method2841(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub17_5.aByteArray40 = arg0;
		this.aClass3_Sub17_5.anInt2923 = 10;
		@Pc(12) int local12 = this.aClass3_Sub17_5.method2111();
		this.anInt3978 = this.aClass3_Sub17_5.method2111();
		this.anInt3979 = 500000;
		this.anIntArray484 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub17_5.method2132();
			@Pc(38) int local38 = this.aClass3_Sub17_5.method2132();
			if (local33 == 1297379947) {
				this.anIntArray484[local27] = this.aClass3_Sub17_5.anInt2923;
				local27++;
			}
			this.aClass3_Sub17_5.anInt2923 += local38;
		}
		this.aLong134 = 0L;
		this.anIntArray483 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray483[local33] = this.anIntArray484[local33];
		}
		this.anIntArray482 = new int[local12];
		this.anIntArray481 = new int[local12];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()Z")
	public boolean method2842() {
		return this.aClass3_Sub17_5.aByteArray40 != null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
	public void method2843() {
		this.aClass3_Sub17_5.anInt2923 = -1;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
	public int method2844() {
		return this.anIntArray483.length;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public void method2845(@OriginalArg(0) int arg0) {
		this.aClass3_Sub17_5.anInt2923 = this.anIntArray483[arg0];
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method2846(@OriginalArg(0) int arg0) {
		this.anIntArray483[arg0] = this.aClass3_Sub17_5.anInt2923;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)J")
	public long method2847(@OriginalArg(0) int arg0) {
		return this.aLong134 + (long) arg0 * (long) this.anInt3979;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public void method2848(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub17_5.method2113();
		this.anIntArray482[arg0] += local4;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()I")
	public int method2849() {
		@Pc(3) int local3 = this.anIntArray483.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray483[local9] >= 0 && this.anIntArray482[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray482[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "()Z")
	public boolean method2850() {
		@Pc(3) int local3 = this.anIntArray483.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray483[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	private int method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static178.aByteArray47[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub17_5.method2107() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub17_5.method2107() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub17_5.method2107();
		local12 = this.aClass3_Sub17_5.method2113();
		if (local7 == 47) {
			this.aClass3_Sub17_5.anInt2923 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub17_5.method2136();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray482[arg0];
			this.aLong134 += (long) local38 * (long) (this.anInt3979 - local32);
			this.anInt3979 = local32;
			this.aClass3_Sub17_5.anInt2923 += local12;
			return 2;
		} else {
			this.aClass3_Sub17_5.anInt2923 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
	private int method2852(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub17_5.aByteArray40[this.aClass3_Sub17_5.anInt2923];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray481[arg0] = local13;
			this.aClass3_Sub17_5.anInt2923++;
		} else {
			local13 = this.anIntArray481[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2851(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub17_5.method2113();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub17_5.aByteArray40[this.aClass3_Sub17_5.anInt2923] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub17_5.anInt2923++;
				this.anIntArray481[arg0] = local57;
				return this.method2851(arg0, local57);
			}
		}
		this.aClass3_Sub17_5.anInt2923 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(J)V")
	public void method2854(@OriginalArg(0) long arg0) {
		this.aLong134 = arg0;
		@Pc(6) int local6 = this.anIntArray483.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray482[local8] = 0;
			this.anIntArray481[local8] = 0;
			this.aClass3_Sub17_5.anInt2923 = this.anIntArray484[local8];
			this.method2848(local8);
			this.anIntArray483[local8] = this.aClass3_Sub17_5.anInt2923;
		}
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "()V")
	public void method2855() {
		this.aClass3_Sub17_5.aByteArray40 = null;
		this.anIntArray484 = null;
		this.anIntArray483 = null;
		this.anIntArray482 = null;
		this.anIntArray481 = null;
	}
}
