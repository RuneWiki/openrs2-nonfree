import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class81 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
	public int anInt2229;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	private int anInt2230;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Lclient!sv;")
	private final Class2_Sub13 aClass2_Sub13_1 = new Class2_Sub13(null);

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class81() {
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "([B)V")
	public Class81(@OriginalArg(0) byte[] arg0) {
		this.method1821(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "()Z")
	public boolean method1818() {
		@Pc(3) int local3 = this.anIntArray173.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray173[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
	public int method1819() {
		@Pc(3) int local3 = this.anIntArray173.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray173[local9] >= 0 && this.anIntArray176[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray176[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)J")
	public long method1820(@OriginalArg(0) int arg0) {
		return this.aLong77 + (long) arg0 * (long) this.anInt2230;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([B)V")
	public void method1821(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub13_1.aByteArray52 = arg0;
		this.aClass2_Sub13_1.anInt4347 = 10;
		@Pc(12) int local12 = this.aClass2_Sub13_1.method3555();
		this.anInt2229 = this.aClass2_Sub13_1.method3555();
		this.anInt2230 = 500000;
		this.anIntArray174 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub13_1.method3574();
			@Pc(38) int local38 = this.aClass2_Sub13_1.method3574();
			if (local33 == 1297379947) {
				this.anIntArray174[local27] = this.aClass2_Sub13_1.anInt4347;
				local27++;
			}
			this.aClass2_Sub13_1.anInt4347 += local38;
		}
		this.aLong77 = 0L;
		this.anIntArray173 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray173[local33] = this.anIntArray174[local33];
		}
		this.anIntArray176 = new int[local12];
		this.anIntArray175 = new int[local12];
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public void method1822(@OriginalArg(0) int arg0) {
		this.anIntArray173[arg0] = this.aClass2_Sub13_1.anInt4347;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
	public void method1823() {
		this.aClass2_Sub13_1.anInt4347 = -1;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "()Z")
	public boolean method1824() {
		return this.aClass2_Sub13_1.aByteArray52 != null;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)I")
	public int method1825(@OriginalArg(0) int arg0) {
		return this.method1832(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
	public void method1826(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub13_1.method3571();
		this.anIntArray176[arg0] += local4;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
	private int method1827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static122.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub13_1.method3580() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub13_1.method3580() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub13_1.method3580();
		local12 = this.aClass2_Sub13_1.method3571();
		if (local7 == 47) {
			this.aClass2_Sub13_1.anInt4347 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub13_1.method3563();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray176[arg0];
			this.aLong77 += (long) local38 * (long) (this.anInt2230 - local32);
			this.anInt2230 = local32;
			this.aClass2_Sub13_1.anInt4347 += local12;
			return 2;
		} else {
			this.aClass2_Sub13_1.anInt4347 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V")
	public void method1828(@OriginalArg(0) int arg0) {
		this.aClass2_Sub13_1.anInt4347 = this.anIntArray173[arg0];
	}

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "()I")
	public int method1829() {
		return this.anIntArray173.length;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(J)V")
	public void method1830(@OriginalArg(0) long arg0) {
		this.aLong77 = arg0;
		@Pc(6) int local6 = this.anIntArray173.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray176[local8] = 0;
			this.anIntArray175[local8] = 0;
			this.aClass2_Sub13_1.anInt4347 = this.anIntArray174[local8];
			this.method1826(local8);
			this.anIntArray173[local8] = this.aClass2_Sub13_1.anInt4347;
		}
	}

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "()V")
	public void method1831() {
		this.aClass2_Sub13_1.aByteArray52 = null;
		this.anIntArray174 = null;
		this.anIntArray173 = null;
		this.anIntArray176 = null;
		this.anIntArray175 = null;
	}

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)I")
	private int method1832(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub13_1.aByteArray52[this.aClass2_Sub13_1.anInt4347];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray175[arg0] = local13;
			this.aClass2_Sub13_1.anInt4347++;
		} else {
			local13 = this.anIntArray175[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1827(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub13_1.method3571();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub13_1.aByteArray52[this.aClass2_Sub13_1.anInt4347] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub13_1.anInt4347++;
				this.anIntArray175[arg0] = local57;
				return this.method1827(arg0, local57);
			}
		}
		this.aClass2_Sub13_1.anInt4347 += local42;
		return 0;
	}
}
