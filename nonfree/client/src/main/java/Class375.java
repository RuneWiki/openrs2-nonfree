import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class375 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
	private int[] anIntArray654;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
	private int[] anIntArray655;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	private int anInt9966;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "J")
	private long aLong327;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "[I")
	private int[] anIntArray656;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public int anInt9967;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
	public int[] anIntArray657;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!jc;")
	private final Class6_Sub15 aClass6_Sub15_166 = new Class6_Sub15((byte[]) null);

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class375() {
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([B)V")
	public Class375(@OriginalArg(0) byte[] arg0) {
		this.method8660(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public void method8646(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub15_166.method3041();
		this.anIntArray657[arg0] += local4;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(J)V")
	public void method8647(@OriginalArg(0) long arg0) {
		this.aLong327 = arg0;
		@Pc(6) int local6 = this.anIntArray654.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray657[local8] = 0;
			this.anIntArray656[local8] = 0;
			this.aClass6_Sub15_166.anInt3174 = this.anIntArray655[local8];
			this.method8646(local8);
			this.anIntArray654[local8] = this.aClass6_Sub15_166.anInt3174;
		}
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)I")
	private int method8648(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub15_166.aByteArray20[this.aClass6_Sub15_166.anInt3174];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray656[arg0] = local13;
			this.aClass6_Sub15_166.anInt3174++;
		} else {
			local13 = this.anIntArray656[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method8650(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub15_166.method3041();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub15_166.aByteArray20[this.aClass6_Sub15_166.anInt3174] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub15_166.anInt3174++;
				this.anIntArray656[arg0] = local57;
				return this.method8650(arg0, local57);
			}
		}
		this.aClass6_Sub15_166.anInt3174 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()I")
	public int method8649() {
		return this.anIntArray654.length;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	private int method8650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static642.aByteArray106[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub15_166.method3030() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub15_166.method3030() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub15_166.method3030();
		local12 = this.aClass6_Sub15_166.method3041();
		if (local7 == 47) {
			this.aClass6_Sub15_166.anInt3174 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub15_166.method2987();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray657[arg0];
			this.aLong327 += (long) local38 * (long) (this.anInt9966 - local32);
			this.anInt9966 = local32;
			this.aClass6_Sub15_166.anInt3174 += local12;
			return 2;
		} else {
			this.aClass6_Sub15_166.anInt3174 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public void method8651(@OriginalArg(0) int arg0) {
		this.aClass6_Sub15_166.anInt3174 = this.anIntArray654[arg0];
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "()I")
	public int method8652() {
		@Pc(3) int local3 = this.anIntArray654.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray654[local9] >= 0 && this.anIntArray657[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray657[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "()Z")
	public boolean method8654() {
		return this.aClass6_Sub15_166.aByteArray20 != null;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	public void method8655(@OriginalArg(0) int arg0) {
		this.anIntArray654[arg0] = this.aClass6_Sub15_166.anInt3174;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
	public void method8656() {
		this.aClass6_Sub15_166.anInt3174 = -1;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()V")
	public void method8657() {
		this.aClass6_Sub15_166.aByteArray20 = null;
		this.anIntArray655 = null;
		this.anIntArray654 = null;
		this.anIntArray657 = null;
		this.anIntArray656 = null;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "()Z")
	public boolean method8658() {
		@Pc(3) int local3 = this.anIntArray654.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray654[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)J")
	public long method8659(@OriginalArg(0) int arg0) {
		return this.aLong327 + (long) arg0 * (long) this.anInt9966;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([B)V")
	public void method8660(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub15_166.aByteArray20 = arg0;
		this.aClass6_Sub15_166.anInt3174 = 10;
		@Pc(12) int local12 = this.aClass6_Sub15_166.method3018();
		this.anInt9967 = this.aClass6_Sub15_166.method3018();
		this.anInt9966 = 500000;
		this.anIntArray655 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub15_166.method3015();
			@Pc(38) int local38 = this.aClass6_Sub15_166.method3015();
			if (local33 == 1297379947) {
				this.anIntArray655[local27] = this.aClass6_Sub15_166.anInt3174;
				local27++;
			}
			this.aClass6_Sub15_166.anInt3174 += local38;
		}
		this.aLong327 = 0L;
		this.anIntArray654 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray654[local33] = this.anIntArray655[local33];
		}
		this.anIntArray657 = new int[local12];
		this.anIntArray656 = new int[local12];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public int method8661(@OriginalArg(0) int arg0) {
		return this.method8648(arg0);
	}
}
