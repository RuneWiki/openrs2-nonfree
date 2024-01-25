import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3 {

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "Lclient!iaa;")
	private final Class6_Sub26 aClass6_Sub26_1 = new Class6_Sub26(null);

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	public Class3() {
	}

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "([B)V")
	public Class3(@OriginalArg(0) byte[] arg0) {
		this.method113(arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(J)V")
	public void method109(@OriginalArg(0) long arg0) {
		this.aLong4 = arg0;
		@Pc(6) int local6 = this.anIntArray9.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray10[local8] = 0;
			this.anIntArray11[local8] = 0;
			this.aClass6_Sub26_1.anInt5769 = this.anIntArray12[local8];
			this.method124(local8);
			this.anIntArray9[local8] = this.aClass6_Sub26_1.anInt5769;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
	public void method110() {
		this.aClass6_Sub26_1.anInt5769 = -1;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	public void method111(@OriginalArg(0) int arg0) {
		this.aClass6_Sub26_1.anInt5769 = this.anIntArray9[arg0];
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([B)V")
	public void method113(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub26_1.aByteArray65 = arg0;
		this.aClass6_Sub26_1.anInt5769 = 10;
		@Pc(12) int local12 = this.aClass6_Sub26_1.method4999();
		this.anInt63 = this.aClass6_Sub26_1.method4999();
		this.anInt64 = 500000;
		this.anIntArray12 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub26_1.method5000();
			@Pc(38) int local38 = this.aClass6_Sub26_1.method5000();
			if (local33 == 1297379947) {
				this.anIntArray12[local27] = this.aClass6_Sub26_1.anInt5769;
				local27++;
			}
			this.aClass6_Sub26_1.anInt5769 += local38;
		}
		this.aLong4 = 0L;
		this.anIntArray9 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray9[local33] = this.anIntArray12[local33];
		}
		this.anIntArray10 = new int[local12];
		this.anIntArray11 = new int[local12];
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "()V")
	public void method114() {
		this.aClass6_Sub26_1.aByteArray65 = null;
		this.anIntArray12 = null;
		this.anIntArray9 = null;
		this.anIntArray10 = null;
		this.anIntArray11 = null;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)J")
	public long method115(@OriginalArg(0) int arg0) {
		return this.aLong4 + (long) arg0 * (long) this.anInt64;
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)I")
	public int method116(@OriginalArg(0) int arg0) {
		return this.method120(arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
	private int method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static2.aByteArray15[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub26_1.method4966() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub26_1.method4966() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub26_1.method4966();
		local12 = this.aClass6_Sub26_1.method4981();
		if (local7 == 47) {
			this.aClass6_Sub26_1.anInt5769 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub26_1.method4949();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray10[arg0];
			this.aLong4 += (long) local38 * (long) (this.anInt64 - local32);
			this.anInt64 = local32;
			this.aClass6_Sub26_1.anInt5769 += local12;
			return 2;
		} else {
			this.aClass6_Sub26_1.anInt5769 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "()I")
	public int method118() {
		@Pc(3) int local3 = this.anIntArray9.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray9[local9] >= 0 && this.anIntArray10[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray10[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "()Z")
	public boolean method119() {
		return this.aClass6_Sub26_1.aByteArray65 != null;
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)I")
	private int method120(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub26_1.aByteArray65[this.aClass6_Sub26_1.anInt5769];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray11[arg0] = local13;
			this.aClass6_Sub26_1.anInt5769++;
		} else {
			local13 = this.anIntArray11[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method117(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub26_1.method4981();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub26_1.aByteArray65[this.aClass6_Sub26_1.anInt5769] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub26_1.anInt5769++;
				this.anIntArray11[arg0] = local57;
				return this.method117(arg0, local57);
			}
		}
		this.aClass6_Sub26_1.anInt5769 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)V")
	public void method121(@OriginalArg(0) int arg0) {
		this.anIntArray9[arg0] = this.aClass6_Sub26_1.anInt5769;
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "()I")
	public int method122() {
		return this.anIntArray9.length;
	}

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "()Z")
	public boolean method123() {
		@Pc(3) int local3 = this.anIntArray9.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray9[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "(I)V")
	public void method124(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub26_1.method4981();
		this.anIntArray10[arg0] += local4;
	}
}
