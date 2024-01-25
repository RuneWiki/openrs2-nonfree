import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class271 {

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "[I")
	private int[] anIntArray597;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "J")
	private long aLong192;

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
	public int anInt7604;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "[I")
	private int[] anIntArray598;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
	private int[] anIntArray600;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
	private int anInt7605;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "Lclient!dga;")
	private final Class6_Sub14 aClass6_Sub14_7 = new Class6_Sub14(null);

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
	public Class271() {
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "([B)V")
	public Class271(@OriginalArg(0) byte[] arg0) {
		this.method6295(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
	private int method6283(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub14_7.aByteArray88[this.aClass6_Sub14_7.anInt7244];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray597[arg0] = local13;
			this.aClass6_Sub14_7.anInt7244++;
		} else {
			local13 = this.anIntArray597[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6298(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub14_7.method5984();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub14_7.aByteArray88[this.aClass6_Sub14_7.anInt7244] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub14_7.anInt7244++;
				this.anIntArray597[arg0] = local57;
				return this.method6298(arg0, local57);
			}
		}
		this.aClass6_Sub14_7.anInt7244 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(J)V")
	public void method6284(@OriginalArg(0) long arg0) {
		this.aLong192 = arg0;
		@Pc(6) int local6 = this.anIntArray600.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray599[local8] = 0;
			this.anIntArray597[local8] = 0;
			this.aClass6_Sub14_7.anInt7244 = this.anIntArray598[local8];
			this.method6291(local8);
			this.anIntArray600[local8] = this.aClass6_Sub14_7.anInt7244;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "()I")
	public int method6285() {
		return this.anIntArray600.length;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "()Z")
	public boolean method6287() {
		@Pc(3) int local3 = this.anIntArray600.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray600[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "()Z")
	public boolean method6288() {
		return this.aClass6_Sub14_7.aByteArray88 != null;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)J")
	public long method6289(@OriginalArg(0) int arg0) {
		return this.aLong192 + (long) arg0 * (long) this.anInt7605;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)I")
	public int method6290(@OriginalArg(0) int arg0) {
		return this.method6283(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V")
	public void method6291(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub14_7.method5984();
		this.anIntArray599[arg0] += local4;
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)V")
	public void method6292(@OriginalArg(0) int arg0) {
		this.anIntArray600[arg0] = this.aClass6_Sub14_7.anInt7244;
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "()V")
	public void method6293() {
		this.aClass6_Sub14_7.aByteArray88 = null;
		this.anIntArray598 = null;
		this.anIntArray600 = null;
		this.anIntArray599 = null;
		this.anIntArray597 = null;
	}

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "()V")
	public void method6294() {
		this.aClass6_Sub14_7.anInt7244 = -1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([B)V")
	public void method6295(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub14_7.aByteArray88 = arg0;
		this.aClass6_Sub14_7.anInt7244 = 10;
		@Pc(12) int local12 = this.aClass6_Sub14_7.method6006();
		this.anInt7604 = this.aClass6_Sub14_7.method6006();
		this.anInt7605 = 500000;
		this.anIntArray598 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub14_7.method6027();
			@Pc(38) int local38 = this.aClass6_Sub14_7.method6027();
			if (local33 == 1297379947) {
				this.anIntArray598[local27] = this.aClass6_Sub14_7.anInt7244;
				local27++;
			}
			this.aClass6_Sub14_7.anInt7244 += local38;
		}
		this.aLong192 = 0L;
		this.anIntArray600 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray600[local33] = this.anIntArray598[local33];
		}
		this.anIntArray599 = new int[local12];
		this.anIntArray597 = new int[local12];
	}

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "(I)V")
	public void method6296(@OriginalArg(0) int arg0) {
		this.aClass6_Sub14_7.anInt7244 = this.anIntArray600[arg0];
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "()I")
	public int method6297() {
		@Pc(3) int local3 = this.anIntArray600.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray600[local9] >= 0 && this.anIntArray599[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray599[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)I")
	private int method6298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static437.aByteArray96[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub14_7.method6041() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub14_7.method6041() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub14_7.method6041();
		local12 = this.aClass6_Sub14_7.method5984();
		if (local7 == 47) {
			this.aClass6_Sub14_7.anInt7244 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub14_7.method5988();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray599[arg0];
			this.aLong192 += (long) local38 * (long) (this.anInt7605 - local32);
			this.anInt7605 = local32;
			this.aClass6_Sub14_7.anInt7244 += local12;
			return 2;
		} else {
			this.aClass6_Sub14_7.anInt7244 += local12;
			return 3;
		}
	}
}
