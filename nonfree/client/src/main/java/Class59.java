import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class59 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	private int anInt2756;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!me;")
	private final Class2_Sub13 aClass2_Sub13_5 = new Class2_Sub13(null);

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class59() {
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
	public Class59(@OriginalArg(0) byte[] arg0) {
		this.method1847(arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public void method1834(@OriginalArg(0) int arg0) {
		this.anIntArray231[arg0] = this.aClass2_Sub13_5.anInt2154;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
	private int method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static114.aByteArray29[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub13_5.method1402() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub13_5.method1402() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub13_5.method1402();
		local12 = this.aClass2_Sub13_5.method1427();
		if (local7 == 47) {
			this.aClass2_Sub13_5.anInt2154 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub13_5.method1406();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray229[arg0];
			this.aLong154 += (long) local38 * (long) (this.anInt2756 - local32);
			this.anInt2756 = local32;
			this.aClass2_Sub13_5.anInt2154 += local12;
			return 2;
		} else {
			this.aClass2_Sub13_5.anInt2154 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public void method1837(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub13_5.method1427();
		this.anIntArray229[arg0] += local4;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(J)V")
	public void method1838(@OriginalArg(0) long arg0) {
		this.aLong154 = arg0;
		@Pc(6) int local6 = this.anIntArray231.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray229[local8] = 0;
			this.anIntArray230[local8] = 0;
			this.aClass2_Sub13_5.anInt2154 = this.anIntArray232[local8];
			this.method1837(local8);
			this.anIntArray231[local8] = this.aClass2_Sub13_5.anInt2154;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
	public void method1839() {
		this.aClass2_Sub13_5.aByteArray14 = null;
		this.anIntArray232 = null;
		this.anIntArray231 = null;
		this.anIntArray229 = null;
		this.anIntArray230 = null;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
	public int method1840(@OriginalArg(0) int arg0) {
		return this.method1845(arg0);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "()I")
	public int method1841() {
		return this.anIntArray231.length;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
	public void method1842() {
		this.aClass2_Sub13_5.anInt2154 = -1;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "()Z")
	public boolean method1843() {
		@Pc(3) int local3 = this.anIntArray231.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray231[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "()Z")
	public boolean method1844() {
		return this.aClass2_Sub13_5.aByteArray14 != null;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I")
	private int method1845(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub13_5.aByteArray14[this.aClass2_Sub13_5.anInt2154];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray230[arg0] = local13;
			this.aClass2_Sub13_5.anInt2154++;
		} else {
			local13 = this.anIntArray230[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1835(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub13_5.method1427();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub13_5.aByteArray14[this.aClass2_Sub13_5.anInt2154] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub13_5.anInt2154++;
				this.anIntArray230[arg0] = local57;
				return this.method1835(arg0, local57);
			}
		}
		this.aClass2_Sub13_5.anInt2154 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)J")
	public long method1846(@OriginalArg(0) int arg0) {
		return this.aLong154 + (long) arg0 * (long) this.anInt2756;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([B)V")
	public void method1847(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub13_5.aByteArray14 = arg0;
		this.aClass2_Sub13_5.anInt2154 = 10;
		@Pc(12) int local12 = this.aClass2_Sub13_5.method1397();
		this.anInt2755 = this.aClass2_Sub13_5.method1397();
		this.anInt2756 = 500000;
		this.anIntArray232 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub13_5.method1396();
			@Pc(38) int local38 = this.aClass2_Sub13_5.method1396();
			if (local33 == 1297379947) {
				this.anIntArray232[local27] = this.aClass2_Sub13_5.anInt2154;
				local27++;
			}
			this.aClass2_Sub13_5.anInt2154 += local38;
		}
		this.aLong154 = 0L;
		this.anIntArray231 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray231[local33] = this.anIntArray232[local33];
		}
		this.anIntArray229 = new int[local12];
		this.anIntArray230 = new int[local12];
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "()I")
	public int method1848() {
		@Pc(3) int local3 = this.anIntArray231.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray231[local9] >= 0 && this.anIntArray229[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray229[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
	public void method1849(@OriginalArg(0) int arg0) {
		this.aClass2_Sub13_5.anInt2154 = this.anIntArray231[arg0];
	}
}
