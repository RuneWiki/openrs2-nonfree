import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class180 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	private int anInt5550;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	public int anInt5551;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
	public int[] anIntArray540;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!rg;")
	private final Class5_Sub12 aClass5_Sub12_7 = new Class5_Sub12(null);

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class180() {
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "([B)V")
	public Class180(@OriginalArg(0) byte[] arg0) {
		this.method4899(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([B)V")
	public void method4899(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub12_7.aByteArray90 = arg0;
		this.aClass5_Sub12_7.anInt5731 = 10;
		@Pc(12) int local12 = this.aClass5_Sub12_7.method5106();
		this.anInt5551 = this.aClass5_Sub12_7.method5106();
		this.anInt5550 = 500000;
		this.anIntArray538 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub12_7.method5067();
			@Pc(38) int local38 = this.aClass5_Sub12_7.method5067();
			if (local33 == 1297379947) {
				this.anIntArray538[local27] = this.aClass5_Sub12_7.anInt5731;
				local27++;
			}
			this.aClass5_Sub12_7.anInt5731 += local38;
		}
		this.aLong186 = 0L;
		this.anIntArray539 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray539[local33] = this.anIntArray538[local33];
		}
		this.anIntArray540 = new int[local12];
		this.anIntArray537 = new int[local12];
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "()V")
	public void method4900() {
		this.aClass5_Sub12_7.anInt5731 = -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I")
	private int method4901(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub12_7.aByteArray90[this.aClass5_Sub12_7.anInt5731];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray537[arg0] = local13;
			this.aClass5_Sub12_7.anInt5731++;
		} else {
			local13 = this.anIntArray537[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4904(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub12_7.method5062();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub12_7.aByteArray90[this.aClass5_Sub12_7.anInt5731] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub12_7.anInt5731++;
				this.anIntArray537[arg0] = local57;
				return this.method4904(arg0, local57);
			}
		}
		this.aClass5_Sub12_7.anInt5731 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "()Z")
	public boolean method4902() {
		@Pc(3) int local3 = this.anIntArray539.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray539[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I")
	public int method4903(@OriginalArg(0) int arg0) {
		return this.method4901(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I")
	private int method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static282.aByteArray87[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub12_7.method5115() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub12_7.method5115() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub12_7.method5115();
		local12 = this.aClass5_Sub12_7.method5062();
		if (local7 == 47) {
			this.aClass5_Sub12_7.anInt5731 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub12_7.method5072();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray540[arg0];
			this.aLong186 += (long) local38 * (long) (this.anInt5550 - local32);
			this.anInt5550 = local32;
			this.aClass5_Sub12_7.anInt5731 += local12;
			return 2;
		} else {
			this.aClass5_Sub12_7.anInt5731 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "()I")
	public int method4905() {
		return this.anIntArray539.length;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(J)V")
	public void method4906(@OriginalArg(0) long arg0) {
		this.aLong186 = arg0;
		@Pc(6) int local6 = this.anIntArray539.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray540[local8] = 0;
			this.anIntArray537[local8] = 0;
			this.aClass5_Sub12_7.anInt5731 = this.anIntArray538[local8];
			this.method4909(local8);
			this.anIntArray539[local8] = this.aClass5_Sub12_7.anInt5731;
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
	public void method4907(@OriginalArg(0) int arg0) {
		this.aClass5_Sub12_7.anInt5731 = this.anIntArray539[arg0];
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
	public void method4908(@OriginalArg(0) int arg0) {
		this.anIntArray539[arg0] = this.aClass5_Sub12_7.anInt5731;
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
	public void method4909(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub12_7.method5062();
		this.anIntArray540[arg0] += local4;
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()I")
	public int method4910() {
		@Pc(3) int local3 = this.anIntArray539.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray539[local9] >= 0 && this.anIntArray540[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray540[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)J")
	public long method4911(@OriginalArg(0) int arg0) {
		return this.aLong186 + (long) arg0 * (long) this.anInt5550;
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "()V")
	public void method4912() {
		this.aClass5_Sub12_7.aByteArray90 = null;
		this.anIntArray538 = null;
		this.anIntArray539 = null;
		this.anIntArray540 = null;
		this.anIntArray537 = null;
	}

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "()Z")
	public boolean method4914() {
		return this.aClass5_Sub12_7.aByteArray90 != null;
	}
}
