import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class146 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	private int anInt4482;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
	public int[] anIntArray402;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public int anInt4483;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!p;")
	private Class4_Sub17 aClass4_Sub17_8 = new Class4_Sub17(null);

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class146() {
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class146(@OriginalArg(0) byte[] arg0) {
		this.method3605(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
	public int method3590() {
		@Pc(3) int local3 = this.anIntArray403.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray403[local9] >= 0 && this.anIntArray402[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray402[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()Z")
	public boolean method3591() {
		@Pc(3) int local3 = this.anIntArray403.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray403[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J")
	public long method3592(@OriginalArg(0) int arg0) {
		return this.aLong163 + (long) arg0 * (long) this.anInt4482;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method3593(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub17_8.method1885();
		this.anIntArray402[arg0] += local4;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
	public int method3594(@OriginalArg(0) int arg0) {
		return this.method3595(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
	private int method3595(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub17_8.aByteArray30[this.aClass4_Sub17_8.anInt2400];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray401[arg0] = local13;
			this.aClass4_Sub17_8.anInt2400++;
		} else {
			local13 = this.anIntArray401[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3597(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub17_8.method1885();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub17_8.aByteArray30[this.aClass4_Sub17_8.anInt2400] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub17_8.anInt2400++;
				this.anIntArray401[arg0] = local57;
				return this.method3597(arg0, local57);
			}
		}
		this.aClass4_Sub17_8.anInt2400 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	private int method3597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static226.aByteArray62[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub17_8.method1874() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub17_8.method1874() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub17_8.method1874();
		local12 = this.aClass4_Sub17_8.method1885();
		if (local7 == 47) {
			this.aClass4_Sub17_8.anInt2400 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub17_8.method1835();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray402[arg0];
			this.aLong163 += (long) local38 * (long) (this.anInt4482 - local32);
			this.anInt4482 = local32;
			this.aClass4_Sub17_8.anInt2400 += local12;
			return 2;
		} else {
			this.aClass4_Sub17_8.anInt2400 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	public void method3598(@OriginalArg(0) int arg0) {
		this.anIntArray403[arg0] = this.aClass4_Sub17_8.anInt2400;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(J)V")
	public void method3599(@OriginalArg(0) long arg0) {
		this.aLong163 = arg0;
		@Pc(6) int local6 = this.anIntArray403.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray402[local8] = 0;
			this.anIntArray401[local8] = 0;
			this.aClass4_Sub17_8.anInt2400 = this.anIntArray400[local8];
			this.method3593(local8);
			this.anIntArray403[local8] = this.aClass4_Sub17_8.anInt2400;
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	public void method3600() {
		this.aClass4_Sub17_8.anInt2400 = -1;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	public void method3601(@OriginalArg(0) int arg0) {
		this.aClass4_Sub17_8.anInt2400 = this.anIntArray403[arg0];
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "()I")
	public int method3602() {
		return this.anIntArray403.length;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z")
	public boolean method3603() {
		return this.aClass4_Sub17_8.aByteArray30 != null;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "()V")
	public void method3604() {
		this.aClass4_Sub17_8.aByteArray30 = null;
		this.anIntArray400 = null;
		this.anIntArray403 = null;
		this.anIntArray402 = null;
		this.anIntArray401 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([B)V")
	public void method3605(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub17_8.aByteArray30 = arg0;
		this.aClass4_Sub17_8.anInt2400 = 10;
		@Pc(12) int local12 = this.aClass4_Sub17_8.method1837();
		this.anInt4483 = this.aClass4_Sub17_8.method1837();
		this.anInt4482 = 500000;
		this.anIntArray400 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass4_Sub17_8.method1889();
			@Pc(40) int local40 = this.aClass4_Sub17_8.method1889();
			if (local35 == 1297379947) {
				this.anIntArray400[local27] = this.aClass4_Sub17_8.anInt2400;
				local27++;
			}
			this.aClass4_Sub17_8.anInt2400 += local40;
		}
		this.aLong163 = 0L;
		this.anIntArray403 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray403[local27] = this.anIntArray400[local27];
		}
		this.anIntArray402 = new int[local12];
		this.anIntArray401 = new int[local12];
	}
}
