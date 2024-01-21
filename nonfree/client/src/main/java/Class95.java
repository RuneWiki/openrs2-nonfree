import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class95 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
	private int[] anIntArray501;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt4300;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!wa;")
	private final Class1_Sub14 aClass1_Sub14_5 = new Class1_Sub14(null);

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class95() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
	public Class95(@OriginalArg(0) byte[] arg0) {
		this.method3250(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	public int method3242() {
		@Pc(3) int local3 = this.anIntArray502.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray502[local9] >= 0 && this.anIntArray500[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray500[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(J)V")
	public void method3243(@OriginalArg(0) long arg0) {
		this.aLong146 = arg0;
		@Pc(6) int local6 = this.anIntArray502.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray500[local8] = 0;
			this.anIntArray503[local8] = 0;
			this.aClass1_Sub14_5.anInt2306 = this.anIntArray501[local8];
			this.method3256(local8);
			this.anIntArray502[local8] = this.aClass1_Sub14_5.anInt2306;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	private int method3244(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub14_5.aByteArray29[this.aClass1_Sub14_5.anInt2306];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray503[arg0] = local13;
			this.aClass1_Sub14_5.anInt2306++;
		} else {
			local13 = this.anIntArray503[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3255(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub14_5.method1701();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub14_5.aByteArray29[this.aClass1_Sub14_5.anInt2306] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub14_5.anInt2306++;
				this.anIntArray503[arg0] = local57;
				return this.method3255(arg0, local57);
			}
		}
		this.aClass1_Sub14_5.anInt2306 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method3245(@OriginalArg(0) int arg0) {
		this.aClass1_Sub14_5.anInt2306 = this.anIntArray502[arg0];
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
	public int method3246() {
		return this.anIntArray502.length;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	public void method3247() {
		this.aClass1_Sub14_5.aByteArray29 = null;
		this.anIntArray501 = null;
		this.anIntArray502 = null;
		this.anIntArray500 = null;
		this.anIntArray503 = null;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()Z")
	public boolean method3249() {
		return this.aClass1_Sub14_5.aByteArray29 != null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([B)V")
	public void method3250(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub14_5.aByteArray29 = arg0;
		this.aClass1_Sub14_5.anInt2306 = 10;
		@Pc(12) int local12 = this.aClass1_Sub14_5.method1753();
		this.anInt4301 = this.aClass1_Sub14_5.method1753();
		this.anInt4300 = 500000;
		this.anIntArray501 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub14_5.method1700();
			@Pc(38) int local38 = this.aClass1_Sub14_5.method1700();
			if (local33 == 1297379947) {
				this.anIntArray501[local27] = this.aClass1_Sub14_5.anInt2306;
				local27++;
			}
			this.aClass1_Sub14_5.anInt2306 += local38;
		}
		this.aLong146 = 0L;
		this.anIntArray502 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray502[local33] = this.anIntArray501[local33];
		}
		this.anIntArray500 = new int[local12];
		this.anIntArray503 = new int[local12];
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
	public void method3251() {
		this.aClass1_Sub14_5.anInt2306 = -1;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)J")
	public long method3252(@OriginalArg(0) int arg0) {
		return this.aLong146 + (long) arg0 * (long) this.anInt4300;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()Z")
	public boolean method3253() {
		@Pc(3) int local3 = this.anIntArray502.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray502[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public void method3254(@OriginalArg(0) int arg0) {
		this.anIntArray502[arg0] = this.aClass1_Sub14_5.anInt2306;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	private int method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static203.aByteArray51[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub14_5.method1738() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub14_5.method1738() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub14_5.method1738();
		local12 = this.aClass1_Sub14_5.method1701();
		if (local7 == 47) {
			this.aClass1_Sub14_5.anInt2306 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub14_5.method1713();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray500[arg0];
			this.aLong146 += (long) local38 * (long) (this.anInt4300 - local32);
			this.anInt4300 = local32;
			this.aClass1_Sub14_5.anInt2306 += local12;
			return 2;
		} else {
			this.aClass1_Sub14_5.anInt2306 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public void method3256(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub14_5.method1701();
		this.anIntArray500[arg0] += local4;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)I")
	public int method3257(@OriginalArg(0) int arg0) {
		return this.method3244(arg0);
	}
}
