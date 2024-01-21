import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class71 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public int anInt2928;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	private int anInt2929;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!ja;")
	private final Class2_Sub13 aClass2_Sub13_5 = new Class2_Sub13(null);

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class71() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class71(@OriginalArg(0) byte[] arg0) {
		this.method2281(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
	public void method2268() {
		this.aClass2_Sub13_5.aByteArray49 = null;
		this.anIntArray277 = null;
		this.anIntArray276 = null;
		this.anIntArray275 = null;
		this.anIntArray274 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
	public int method2269(@OriginalArg(0) int arg0) {
		return this.method2278(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(J)V")
	public void method2270(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		@Pc(6) int local6 = this.anIntArray276.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray275[local8] = 0;
			this.anIntArray274[local8] = 0;
			this.aClass2_Sub13_5.anInt3940 = this.anIntArray277[local8];
			this.method2272(local8);
			this.anIntArray276[local8] = this.aClass2_Sub13_5.anInt3940;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	private int method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static137.aByteArray46[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub13_5.method2962() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub13_5.method2962() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub13_5.method2962();
		local12 = this.aClass2_Sub13_5.method2919();
		if (local7 == 47) {
			this.aClass2_Sub13_5.anInt3940 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub13_5.method2942();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray275[arg0];
			this.aLong120 += (long) local38 * (long) (this.anInt2929 - local32);
			this.anInt2929 = local32;
			this.aClass2_Sub13_5.anInt3940 += local12;
			return 2;
		} else {
			this.aClass2_Sub13_5.anInt3940 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method2272(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub13_5.method2919();
		this.anIntArray275[arg0] += local4;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
	public int method2274() {
		@Pc(3) int local3 = this.anIntArray276.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray276[local9] >= 0 && this.anIntArray275[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray275[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	public int method2275() {
		return this.anIntArray276.length;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	public void method2276(@OriginalArg(0) int arg0) {
		this.aClass2_Sub13_5.anInt3940 = this.anIntArray276[arg0];
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public void method2277(@OriginalArg(0) int arg0) {
		this.anIntArray276[arg0] = this.aClass2_Sub13_5.anInt3940;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)I")
	private int method2278(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub13_5.aByteArray49[this.aClass2_Sub13_5.anInt3940];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray274[arg0] = local13;
			this.aClass2_Sub13_5.anInt3940++;
		} else {
			local13 = this.anIntArray274[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2271(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub13_5.method2919();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub13_5.aByteArray49[this.aClass2_Sub13_5.anInt3940] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub13_5.anInt3940++;
				this.anIntArray274[arg0] = local57;
				return this.method2271(arg0, local57);
			}
		}
		this.aClass2_Sub13_5.anInt3940 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
	public void method2279() {
		this.aClass2_Sub13_5.anInt3940 = -1;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)J")
	public long method2280(@OriginalArg(0) int arg0) {
		return this.aLong120 + (long) arg0 * (long) this.anInt2929;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
	public void method2281(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub13_5.aByteArray49 = arg0;
		this.aClass2_Sub13_5.anInt3940 = 10;
		@Pc(12) int local12 = this.aClass2_Sub13_5.method2933();
		this.anInt2928 = this.aClass2_Sub13_5.method2933();
		this.anInt2929 = 500000;
		this.anIntArray277 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub13_5.method2946();
			@Pc(38) int local38 = this.aClass2_Sub13_5.method2946();
			if (local33 == 1297379947) {
				this.anIntArray277[local27] = this.aClass2_Sub13_5.anInt3940;
				local27++;
			}
			this.aClass2_Sub13_5.anInt3940 += local38;
		}
		this.aLong120 = 0L;
		this.anIntArray276 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray276[local33] = this.anIntArray277[local33];
		}
		this.anIntArray275 = new int[local12];
		this.anIntArray274 = new int[local12];
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z")
	public boolean method2282() {
		return this.aClass2_Sub13_5.aByteArray49 != null;
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "()Z")
	public boolean method2283() {
		@Pc(3) int local3 = this.anIntArray276.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray276[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
