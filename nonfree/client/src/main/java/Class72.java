import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class72 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public int anInt2129;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int anInt2130;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!fd;")
	private Class4_Sub10 aClass4_Sub10_3 = new Class4_Sub10(null);

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class72() {
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V")
	public Class72(@OriginalArg(0) byte[] arg0) {
		this.method1661(arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J")
	public long method1657(@OriginalArg(0) int arg0) {
		return this.aLong69 + (long) arg0 * (long) this.anInt2130;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public void method1658() {
		this.aClass4_Sub10_3.aByteArray71 = null;
		this.anIntArray176 = null;
		this.anIntArray174 = null;
		this.anIntArray173 = null;
		this.anIntArray175 = null;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public void method1659(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub10_3.method4646();
		this.anIntArray173[arg0] += local4;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
	public void method1660() {
		this.aClass4_Sub10_3.anInt5713 = -1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V")
	public void method1661(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub10_3.aByteArray71 = arg0;
		this.aClass4_Sub10_3.anInt5713 = 10;
		@Pc(12) int local12 = this.aClass4_Sub10_3.method4653();
		this.anInt2129 = this.aClass4_Sub10_3.method4653();
		this.anInt2130 = 500000;
		this.anIntArray176 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass4_Sub10_3.method4632();
			@Pc(40) int local40 = this.aClass4_Sub10_3.method4632();
			if (local35 == 1297379947) {
				this.anIntArray176[local27] = this.aClass4_Sub10_3.anInt5713;
				local27++;
			}
			this.aClass4_Sub10_3.anInt5713 += local40;
		}
		this.aLong69 = 0L;
		this.anIntArray174 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray174[local27] = this.anIntArray176[local27];
		}
		this.anIntArray173 = new int[local12];
		this.anIntArray175 = new int[local12];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(J)V")
	public void method1662(@OriginalArg(0) long arg0) {
		this.aLong69 = arg0;
		@Pc(6) int local6 = this.anIntArray174.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray173[local8] = 0;
			this.anIntArray175[local8] = 0;
			this.aClass4_Sub10_3.anInt5713 = this.anIntArray176[local8];
			this.method1659(local8);
			this.anIntArray174[local8] = this.aClass4_Sub10_3.anInt5713;
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public void method1663(@OriginalArg(0) int arg0) {
		this.aClass4_Sub10_3.anInt5713 = this.anIntArray174[arg0];
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "()Z")
	public boolean method1664() {
		return this.aClass4_Sub10_3.aByteArray71 != null;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "()Z")
	public boolean method1665() {
		@Pc(3) int local3 = this.anIntArray174.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray174[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "()I")
	public int method1666() {
		@Pc(3) int local3 = this.anIntArray174.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray174[local9] >= 0 && this.anIntArray173[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray173[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "()I")
	public int method1668() {
		return this.anIntArray174.length;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I")
	private int method1669(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub10_3.aByteArray71[this.aClass4_Sub10_3.anInt5713];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray175[arg0] = local13;
			this.aClass4_Sub10_3.anInt5713++;
		} else {
			local13 = this.anIntArray175[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1672(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub10_3.method4646();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub10_3.aByteArray71[this.aClass4_Sub10_3.anInt5713] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub10_3.anInt5713++;
				this.anIntArray175[arg0] = local57;
				return this.method1672(arg0, local57);
			}
		}
		this.aClass4_Sub10_3.anInt5713 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public void method1670(@OriginalArg(0) int arg0) {
		this.anIntArray174[arg0] = this.aClass4_Sub10_3.anInt5713;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I")
	public int method1671(@OriginalArg(0) int arg0) {
		return this.method1669(arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	private int method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static100.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub10_3.method4666() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub10_3.method4666() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub10_3.method4666();
		local12 = this.aClass4_Sub10_3.method4646();
		if (local7 == 47) {
			this.aClass4_Sub10_3.anInt5713 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub10_3.method4655();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray173[arg0];
			this.aLong69 += (long) local38 * (long) (this.anInt2130 - local32);
			this.anInt2130 = local32;
			this.aClass4_Sub10_3.anInt5713 += local12;
			return 2;
		} else {
			this.aClass4_Sub10_3.anInt5713 += local12;
			return 3;
		}
	}
}
