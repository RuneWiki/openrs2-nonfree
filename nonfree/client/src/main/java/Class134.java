import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class134 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	private int anInt4007;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!nn;")
	private final Class10_Sub8 aClass10_Sub8_8 = new Class10_Sub8(null);

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class134() {
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "([B)V")
	public Class134(@OriginalArg(0) byte[] arg0) {
		this.method3183(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()Z")
	public boolean method3172() {
		return this.aClass10_Sub8_8.aByteArray44 != null;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "()V")
	public void method3173() {
		this.aClass10_Sub8_8.anInt2989 = -1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(J)V")
	public void method3174(@OriginalArg(0) long arg0) {
		this.aLong130 = arg0;
		@Pc(6) int local6 = this.anIntArray400.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray398[local8] = 0;
			this.anIntArray399[local8] = 0;
			this.aClass10_Sub8_8.anInt2989 = this.anIntArray397[local8];
			this.method3182(local8);
			this.anIntArray400[local8] = this.aClass10_Sub8_8.anInt2989;
		}
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "()V")
	public void method3175() {
		this.aClass10_Sub8_8.aByteArray44 = null;
		this.anIntArray397 = null;
		this.anIntArray400 = null;
		this.anIntArray398 = null;
		this.anIntArray399 = null;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "()I")
	public int method3176() {
		return this.anIntArray400.length;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public void method3177(@OriginalArg(0) int arg0) {
		this.aClass10_Sub8_8.anInt2989 = this.anIntArray400[arg0];
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "()I")
	public int method3178() {
		@Pc(3) int local3 = this.anIntArray400.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray400[local9] >= 0 && this.anIntArray398[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray398[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I")
	private int method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static202.aByteArray51[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass10_Sub8_8.method2502() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass10_Sub8_8.method2502() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass10_Sub8_8.method2502();
		local12 = this.aClass10_Sub8_8.method2480();
		if (local7 == 47) {
			this.aClass10_Sub8_8.anInt2989 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass10_Sub8_8.method2507();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray398[arg0];
			this.aLong130 += (long) local38 * (long) (this.anInt4007 - local32);
			this.anInt4007 = local32;
			this.aClass10_Sub8_8.anInt2989 += local12;
			return 2;
		} else {
			this.aClass10_Sub8_8.anInt2989 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public void method3181(@OriginalArg(0) int arg0) {
		this.anIntArray400[arg0] = this.aClass10_Sub8_8.anInt2989;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	public void method3182(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass10_Sub8_8.method2480();
		this.anIntArray398[arg0] += local4;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([B)V")
	public void method3183(@OriginalArg(0) byte[] arg0) {
		this.aClass10_Sub8_8.aByteArray44 = arg0;
		this.aClass10_Sub8_8.anInt2989 = 10;
		@Pc(12) int local12 = this.aClass10_Sub8_8.method2485();
		this.anInt4006 = this.aClass10_Sub8_8.method2485();
		this.anInt4007 = 500000;
		this.anIntArray397 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass10_Sub8_8.method2459();
			@Pc(38) int local38 = this.aClass10_Sub8_8.method2459();
			if (local33 == 1297379947) {
				this.anIntArray397[local27] = this.aClass10_Sub8_8.anInt2989;
				local27++;
			}
			this.aClass10_Sub8_8.anInt2989 += local38;
		}
		this.aLong130 = 0L;
		this.anIntArray400 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray400[local33] = this.anIntArray397[local33];
		}
		this.anIntArray398 = new int[local12];
		this.anIntArray399 = new int[local12];
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
	public int method3184(@OriginalArg(0) int arg0) {
		return this.method3185(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
	private int method3185(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass10_Sub8_8.aByteArray44[this.aClass10_Sub8_8.anInt2989];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray399[arg0] = local13;
			this.aClass10_Sub8_8.anInt2989++;
		} else {
			local13 = this.anIntArray399[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3180(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass10_Sub8_8.method2480();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass10_Sub8_8.aByteArray44[this.aClass10_Sub8_8.anInt2989] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass10_Sub8_8.anInt2989++;
				this.anIntArray399[arg0] = local57;
				return this.method3180(arg0, local57);
			}
		}
		this.aClass10_Sub8_8.anInt2989 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)J")
	public long method3186(@OriginalArg(0) int arg0) {
		return this.aLong130 + (long) arg0 * (long) this.anInt4007;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "()Z")
	public boolean method3187() {
		@Pc(3) int local3 = this.anIntArray400.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray400[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
