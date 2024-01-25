import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class341 {

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "[I")
	private int[] anIntArray504;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	public int anInt8875;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	private int anInt8876;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "Lclient!wq;")
	private final Class5_Sub36 aClass5_Sub36_9 = new Class5_Sub36((byte[]) null);

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	public Class341() {
	}

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "([B)V")
	public Class341(@OriginalArg(0) byte[] arg0) {
		this.method7600(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "([B)V")
	public void method7600(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub36_9.aByteArray89 = arg0;
		this.aClass5_Sub36_9.anInt8456 = 10;
		@Pc(12) int local12 = this.aClass5_Sub36_9.method7333();
		this.anInt8875 = this.aClass5_Sub36_9.method7333();
		this.anInt8876 = 500000;
		this.anIntArray504 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub36_9.method7268();
			@Pc(38) int local38 = this.aClass5_Sub36_9.method7268();
			if (local33 == 1297379947) {
				this.anIntArray504[local27] = this.aClass5_Sub36_9.anInt8456;
				local27++;
			}
			this.aClass5_Sub36_9.anInt8456 += local38;
		}
		this.aLong261 = 0L;
		this.anIntArray505 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray505[local33] = this.anIntArray504[local33];
		}
		this.anIntArray507 = new int[local12];
		this.anIntArray506 = new int[local12];
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "()Z")
	public boolean method7601() {
		return this.aClass5_Sub36_9.aByteArray89 != null;
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
	private int method7602(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub36_9.aByteArray89[this.aClass5_Sub36_9.anInt8456];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray506[arg0] = local13;
			this.aClass5_Sub36_9.anInt8456++;
		} else {
			local13 = this.anIntArray506[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7610(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub36_9.method7294();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub36_9.aByteArray89[this.aClass5_Sub36_9.anInt8456] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub36_9.anInt8456++;
				this.anIntArray506[arg0] = local57;
				return this.method7610(arg0, local57);
			}
		}
		this.aClass5_Sub36_9.anInt8456 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "(I)V")
	public void method7603(@OriginalArg(0) int arg0) {
		this.anIntArray505[arg0] = this.aClass5_Sub36_9.anInt8456;
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
	public void method7604(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub36_9.method7294();
		this.anIntArray507[arg0] += local4;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(J)V")
	public void method7605(@OriginalArg(0) long arg0) {
		this.aLong261 = arg0;
		@Pc(6) int local6 = this.anIntArray505.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray507[local8] = 0;
			this.anIntArray506[local8] = 0;
			this.aClass5_Sub36_9.anInt8456 = this.anIntArray504[local8];
			this.method7604(local8);
			this.anIntArray505[local8] = this.aClass5_Sub36_9.anInt8456;
		}
	}

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "()I")
	public int method7607() {
		@Pc(3) int local3 = this.anIntArray505.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray505[local9] >= 0 && this.anIntArray507[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray507[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
	public void method7608(@OriginalArg(0) int arg0) {
		this.aClass5_Sub36_9.anInt8456 = this.anIntArray505[arg0];
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "()I")
	public int method7609() {
		return this.anIntArray505.length;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)I")
	private int method7610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static563.aByteArray92[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub36_9.method7291() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub36_9.method7291() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub36_9.method7291();
		local12 = this.aClass5_Sub36_9.method7294();
		if (local7 == 47) {
			this.aClass5_Sub36_9.anInt8456 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub36_9.method7331();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray507[arg0];
			this.aLong261 += (long) local38 * (long) (this.anInt8876 - local32);
			this.anInt8876 = local32;
			this.aClass5_Sub36_9.anInt8456 += local12;
			return 2;
		} else {
			this.aClass5_Sub36_9.anInt8456 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "()V")
	public void method7611() {
		this.aClass5_Sub36_9.aByteArray89 = null;
		this.anIntArray504 = null;
		this.anIntArray505 = null;
		this.anIntArray507 = null;
		this.anIntArray506 = null;
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "()Z")
	public boolean method7612() {
		@Pc(3) int local3 = this.anIntArray505.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray505[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)I")
	public int method7613(@OriginalArg(0) int arg0) {
		return this.method7602(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "(I)J")
	public long method7614(@OriginalArg(0) int arg0) {
		return this.aLong261 + (long) arg0 * (long) this.anInt8876;
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "()V")
	public void method7615() {
		this.aClass5_Sub36_9.anInt8456 = -1;
	}
}
