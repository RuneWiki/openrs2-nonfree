import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class96 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	private int anInt3718;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public int anInt3719;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!pg;")
	private Class1_Sub17 aClass1_Sub17_4 = new Class1_Sub17(null);

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class96() {
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
	public Class96(@OriginalArg(0) byte[] arg0) {
		this.method2928(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)J")
	public long method2920(@OriginalArg(0) int arg0) {
		return this.aLong145 + (long) arg0 * (long) this.anInt3718;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public void method2921(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub17_4.method2164();
		this.anIntArray404[arg0] += local4;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
	public int method2922() {
		@Pc(3) int local3 = this.anIntArray405.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray405[local9] >= 0 && this.anIntArray404[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray404[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	private int method2923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static178.aByteArray52[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub17_4.method2142() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub17_4.method2142() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub17_4.method2142();
		local12 = this.aClass1_Sub17_4.method2164();
		if (local7 == 47) {
			this.aClass1_Sub17_4.anInt2656 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub17_4.method2135();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray404[arg0];
			this.aLong145 += (long) local38 * (long) (this.anInt3718 - local32);
			this.anInt3718 = local32;
			this.aClass1_Sub17_4.anInt2656 += local12;
			return 2;
		} else {
			this.aClass1_Sub17_4.anInt2656 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public void method2924(@OriginalArg(0) int arg0) {
		this.anIntArray405[arg0] = this.aClass1_Sub17_4.anInt2656;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public void method2925(@OriginalArg(0) int arg0) {
		this.aClass1_Sub17_4.anInt2656 = this.anIntArray405[arg0];
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public int method2926() {
		return this.anIntArray405.length;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
	public int method2927(@OriginalArg(0) int arg0) {
		return this.method2930(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([B)V")
	public void method2928(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub17_4.aByteArray40 = arg0;
		this.aClass1_Sub17_4.anInt2656 = 10;
		@Pc(12) int local12 = this.aClass1_Sub17_4.method2178();
		this.anInt3719 = this.aClass1_Sub17_4.method2178();
		this.anInt3718 = 500000;
		this.anIntArray402 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub17_4.method2140();
			@Pc(38) int local38 = this.aClass1_Sub17_4.method2140();
			if (local33 == 1297379947) {
				this.anIntArray402[local27] = this.aClass1_Sub17_4.anInt2656;
				local27++;
			}
			this.aClass1_Sub17_4.anInt2656 += local38;
		}
		this.aLong145 = 0L;
		this.anIntArray405 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray405[local33] = this.anIntArray402[local33];
		}
		this.anIntArray404 = new int[local12];
		this.anIntArray403 = new int[local12];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(J)V")
	public void method2929(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
		@Pc(6) int local6 = this.anIntArray405.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray404[local8] = 0;
			this.anIntArray403[local8] = 0;
			this.aClass1_Sub17_4.anInt2656 = this.anIntArray402[local8];
			this.method2921(local8);
			this.anIntArray405[local8] = this.aClass1_Sub17_4.anInt2656;
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)I")
	private int method2930(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub17_4.aByteArray40[this.aClass1_Sub17_4.anInt2656];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray403[arg0] = local13;
			this.aClass1_Sub17_4.anInt2656++;
		} else {
			local13 = this.anIntArray403[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2923(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub17_4.method2164();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub17_4.aByteArray40[this.aClass1_Sub17_4.anInt2656] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub17_4.anInt2656++;
				this.anIntArray403[arg0] = local57;
				return this.method2923(arg0, local57);
			}
		}
		this.aClass1_Sub17_4.anInt2656 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public boolean method2931() {
		@Pc(3) int local3 = this.anIntArray405.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray405[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	public void method2932() {
		this.aClass1_Sub17_4.anInt2656 = -1;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	public void method2933() {
		this.aClass1_Sub17_4.aByteArray40 = null;
		this.anIntArray402 = null;
		this.anIntArray405 = null;
		this.anIntArray404 = null;
		this.anIntArray403 = null;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public boolean method2934() {
		return this.aClass1_Sub17_4.aByteArray40 != null;
	}
}
