import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class110 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	private int anInt3604;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!bt;")
	private final Class3_Sub2 aClass3_Sub2_6 = new Class3_Sub2(null);

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class110() {
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([B)V")
	public Class110(@OriginalArg(0) byte[] arg0) {
		this.method2988(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method2977(@OriginalArg(0) int arg0) {
		this.aClass3_Sub2_6.anInt7620 = this.anIntArray277[arg0];
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	public void method2978() {
		this.aClass3_Sub2_6.anInt7620 = -1;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()I")
	public int method2979() {
		return this.anIntArray277.length;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(J)V")
	public void method2980(@OriginalArg(0) long arg0) {
		this.aLong109 = arg0;
		@Pc(6) int local6 = this.anIntArray277.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray276[local8] = 0;
			this.anIntArray278[local8] = 0;
			this.aClass3_Sub2_6.anInt7620 = this.anIntArray275[local8];
			this.method2984(local8);
			this.anIntArray277[local8] = this.aClass3_Sub2_6.anInt7620;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	private int method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static174.aByteArray41[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub2_6.method6053() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub2_6.method6053() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub2_6.method6053();
		local12 = this.aClass3_Sub2_6.method6028();
		if (local7 == 47) {
			this.aClass3_Sub2_6.anInt7620 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub2_6.method6020();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray276[arg0];
			this.aLong109 += (long) local38 * (long) (this.anInt3604 - local32);
			this.anInt3604 = local32;
			this.aClass3_Sub2_6.anInt7620 += local12;
			return 2;
		} else {
			this.aClass3_Sub2_6.anInt7620 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()Z")
	public boolean method2983() {
		@Pc(3) int local3 = this.anIntArray277.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray277[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public void method2984(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub2_6.method6028();
		this.anIntArray276[arg0] += local4;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I")
	public int method2985(@OriginalArg(0) int arg0) {
		return this.method2991(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)J")
	public long method2986(@OriginalArg(0) int arg0) {
		return this.aLong109 + (long) arg0 * (long) this.anInt3604;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "()Z")
	public boolean method2987() {
		return this.aClass3_Sub2_6.aByteArray95 != null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([B)V")
	public void method2988(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub2_6.aByteArray95 = arg0;
		this.aClass3_Sub2_6.anInt7620 = 10;
		@Pc(12) int local12 = this.aClass3_Sub2_6.method6004();
		this.anInt3605 = this.aClass3_Sub2_6.method6004();
		this.anInt3604 = 500000;
		this.anIntArray275 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub2_6.method6014();
			@Pc(38) int local38 = this.aClass3_Sub2_6.method6014();
			if (local33 == 1297379947) {
				this.anIntArray275[local27] = this.aClass3_Sub2_6.anInt7620;
				local27++;
			}
			this.aClass3_Sub2_6.anInt7620 += local38;
		}
		this.aLong109 = 0L;
		this.anIntArray277 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray277[local33] = this.anIntArray275[local33];
		}
		this.anIntArray276 = new int[local12];
		this.anIntArray278 = new int[local12];
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "()V")
	public void method2989() {
		this.aClass3_Sub2_6.aByteArray95 = null;
		this.anIntArray275 = null;
		this.anIntArray277 = null;
		this.anIntArray276 = null;
		this.anIntArray278 = null;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
	public void method2990(@OriginalArg(0) int arg0) {
		this.anIntArray277[arg0] = this.aClass3_Sub2_6.anInt7620;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I")
	private int method2991(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub2_6.aByteArray95[this.aClass3_Sub2_6.anInt7620];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray278[arg0] = local13;
			this.aClass3_Sub2_6.anInt7620++;
		} else {
			local13 = this.anIntArray278[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2982(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub2_6.method6028();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub2_6.aByteArray95[this.aClass3_Sub2_6.anInt7620] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub2_6.anInt7620++;
				this.anIntArray278[arg0] = local57;
				return this.method2982(arg0, local57);
			}
		}
		this.aClass3_Sub2_6.anInt7620 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "()I")
	public int method2992() {
		@Pc(3) int local3 = this.anIntArray277.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray277[local9] >= 0 && this.anIntArray276[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray276[local9];
			}
		}
		return local5;
	}
}
