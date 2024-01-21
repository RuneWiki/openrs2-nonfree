import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class27 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!wd;")
	private final Class8_Sub20 aClass8_Sub20_17 = new Class8_Sub20(null);

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class27() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public Class27(@OriginalArg(0) byte[] arg0) {
		this.method655(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	public void method641() {
		this.aClass8_Sub20_17.anInt2853 = -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(J)V")
	public void method642(@OriginalArg(0) long arg0) {
		this.aLong36 = arg0;
		@Pc(6) int local6 = this.anIntArray139.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray140[local8] = 0;
			this.anIntArray141[local8] = 0;
			this.aClass8_Sub20_17.anInt2853 = this.anIntArray138[local8];
			this.method652(local8);
			this.anIntArray139[local8] = this.aClass8_Sub20_17.anInt2853;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
	public void method643() {
		this.aClass8_Sub20_17.aByteArray44 = null;
		this.anIntArray138 = null;
		this.anIntArray139 = null;
		this.anIntArray140 = null;
		this.anIntArray141 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
	private int method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static43.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass8_Sub20_17.method1872() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass8_Sub20_17.method1872() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass8_Sub20_17.method1872();
		local12 = this.aClass8_Sub20_17.method1857();
		if (local7 == 47) {
			this.aClass8_Sub20_17.anInt2853 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass8_Sub20_17.method1885();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray140[arg0];
			this.aLong36 += (long) local38 * (long) (this.anInt1036 - local32);
			this.anInt1036 = local32;
			this.aClass8_Sub20_17.anInt2853 += local12;
			return 2;
		} else {
			this.aClass8_Sub20_17.anInt2853 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()I")
	public int method646() {
		return this.anIntArray139.length;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "()Z")
	public boolean method647() {
		return this.aClass8_Sub20_17.aByteArray44 != null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	private int method648(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass8_Sub20_17.aByteArray44[this.aClass8_Sub20_17.anInt2853];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray141[arg0] = local13;
			this.aClass8_Sub20_17.anInt2853++;
		} else {
			local13 = this.anIntArray141[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method644(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass8_Sub20_17.method1857();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass8_Sub20_17.aByteArray44[this.aClass8_Sub20_17.anInt2853] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass8_Sub20_17.anInt2853++;
				this.anIntArray141[arg0] = local57;
				return this.method644(arg0, local57);
			}
		}
		this.aClass8_Sub20_17.anInt2853 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)J")
	public long method649(@OriginalArg(0) int arg0) {
		return this.aLong36 + (long) arg0 * (long) this.anInt1036;
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "()I")
	public int method650() {
		@Pc(3) int local3 = this.anIntArray139.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray139[local9] >= 0 && this.anIntArray140[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray140[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public void method651(@OriginalArg(0) int arg0) {
		this.aClass8_Sub20_17.anInt2853 = this.anIntArray139[arg0];
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public void method652(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass8_Sub20_17.method1857();
		this.anIntArray140[arg0] += local4;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
	public void method653(@OriginalArg(0) int arg0) {
		this.anIntArray139[arg0] = this.aClass8_Sub20_17.anInt2853;
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "()Z")
	public boolean method654() {
		@Pc(3) int local3 = this.anIntArray139.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray139[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V")
	public void method655(@OriginalArg(0) byte[] arg0) {
		this.aClass8_Sub20_17.aByteArray44 = arg0;
		this.aClass8_Sub20_17.anInt2853 = 10;
		@Pc(12) int local12 = this.aClass8_Sub20_17.method1839();
		this.anInt1037 = this.aClass8_Sub20_17.method1839();
		this.anInt1036 = 500000;
		this.anIntArray138 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass8_Sub20_17.method1853();
			@Pc(38) int local38 = this.aClass8_Sub20_17.method1853();
			if (local33 == 1297379947) {
				this.anIntArray138[local27] = this.aClass8_Sub20_17.anInt2853;
				local27++;
			}
			this.aClass8_Sub20_17.anInt2853 += local38;
		}
		this.aLong36 = 0L;
		this.anIntArray139 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray139[local33] = this.anIntArray138[local33];
		}
		this.anIntArray140 = new int[local12];
		this.anIntArray141 = new int[local12];
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)I")
	public int method656(@OriginalArg(0) int arg0) {
		return this.method648(arg0);
	}
}
