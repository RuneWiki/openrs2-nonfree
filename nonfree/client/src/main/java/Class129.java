import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class129 {

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt3457;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
	private int anInt3458;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Lclient!gga;")
	private final Class6_Sub23 aClass6_Sub23_3 = new Class6_Sub23((byte[]) null);

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class129() {
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "([B)V")
	public Class129(@OriginalArg(0) byte[] arg0) {
		this.method2904(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)I")
	public int method2895(@OriginalArg(0) int arg0) {
		return this.method2896(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	private int method2896(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub23_3.aByteArray101[this.aClass6_Sub23_3.anInt9901];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray191[arg0] = local13;
			this.aClass6_Sub23_3.anInt9901++;
		} else {
			local13 = this.anIntArray191[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2898(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub23_3.method8399();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub23_3.aByteArray101[this.aClass6_Sub23_3.anInt9901] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub23_3.anInt9901++;
				this.anIntArray191[arg0] = local57;
				return this.method2898(arg0, local57);
			}
		}
		this.aClass6_Sub23_3.anInt9901 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()V")
	public void method2897() {
		this.aClass6_Sub23_3.aByteArray101 = null;
		this.anIntArray189 = null;
		this.anIntArray190 = null;
		this.anIntArray188 = null;
		this.anIntArray191 = null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
	private int method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static198.aByteArray36[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub23_3.method8374() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub23_3.method8374() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub23_3.method8374();
		local12 = this.aClass6_Sub23_3.method8399();
		if (local7 == 47) {
			this.aClass6_Sub23_3.anInt9901 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub23_3.method8344();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray188[arg0];
			this.aLong109 += (long) local38 * (long) (this.anInt3458 - local32);
			this.anInt3458 = local32;
			this.aClass6_Sub23_3.anInt9901 += local12;
			return 2;
		} else {
			this.aClass6_Sub23_3.anInt9901 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "()Z")
	public boolean method2899() {
		@Pc(3) int local3 = this.anIntArray190.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray190[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "()V")
	public void method2900() {
		this.aClass6_Sub23_3.anInt9901 = -1;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)J")
	public long method2901(@OriginalArg(0) int arg0) {
		return this.aLong109 + (long) arg0 * (long) this.anInt3458;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(J)V")
	public void method2902(@OriginalArg(0) long arg0) {
		this.aLong109 = arg0;
		@Pc(6) int local6 = this.anIntArray190.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray188[local8] = 0;
			this.anIntArray191[local8] = 0;
			this.aClass6_Sub23_3.anInt9901 = this.anIntArray189[local8];
			this.method2910(local8);
			this.anIntArray190[local8] = this.aClass6_Sub23_3.anInt9901;
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "()I")
	public int method2903() {
		@Pc(3) int local3 = this.anIntArray190.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray190[local9] >= 0 && this.anIntArray188[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray188[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "([B)V")
	public void method2904(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub23_3.aByteArray101 = arg0;
		this.aClass6_Sub23_3.anInt9901 = 10;
		@Pc(12) int local12 = this.aClass6_Sub23_3.method8363();
		this.anInt3457 = this.aClass6_Sub23_3.method8363();
		this.anInt3458 = 500000;
		this.anIntArray189 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub23_3.method8369();
			@Pc(38) int local38 = this.aClass6_Sub23_3.method8369();
			if (local33 == 1297379947) {
				this.anIntArray189[local27] = this.aClass6_Sub23_3.anInt9901;
				local27++;
			}
			this.aClass6_Sub23_3.anInt9901 += local38;
		}
		this.aLong109 = 0L;
		this.anIntArray190 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray190[local33] = this.anIntArray189[local33];
		}
		this.anIntArray188 = new int[local12];
		this.anIntArray191 = new int[local12];
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
	public void method2905(@OriginalArg(0) int arg0) {
		this.aClass6_Sub23_3.anInt9901 = this.anIntArray190[arg0];
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "()I")
	public int method2906() {
		return this.anIntArray190.length;
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
	public void method2908(@OriginalArg(0) int arg0) {
		this.anIntArray190[arg0] = this.aClass6_Sub23_3.anInt9901;
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "()Z")
	public boolean method2909() {
		return this.aClass6_Sub23_3.aByteArray101 != null;
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	public void method2910(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub23_3.method8399();
		this.anIntArray188[arg0] += local4;
	}
}
