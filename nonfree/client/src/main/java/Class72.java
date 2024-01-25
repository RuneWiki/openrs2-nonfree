import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class72 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	private int anInt2416;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	public int anInt2417;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!at;")
	private final Class1_Sub7 aClass1_Sub7_3 = new Class1_Sub7(null);

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class72() {
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V")
	public Class72(@OriginalArg(0) byte[] arg0) {
		this.method2302(arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()I")
	public int method2288() {
		return this.anIntArray184.length;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public void method2289(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub7_3.method2129();
		this.anIntArray182[arg0] += local4;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
	public void method2290() {
		this.aClass1_Sub7_3.aByteArray41 = null;
		this.anIntArray185 = null;
		this.anIntArray184 = null;
		this.anIntArray182 = null;
		this.anIntArray183 = null;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public void method2291(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_3.anInt2219 = this.anIntArray184[arg0];
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public void method2293(@OriginalArg(0) int arg0) {
		this.anIntArray184[arg0] = this.aClass1_Sub7_3.anInt2219;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	private int method2294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static106.aByteArray44[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub7_3.method2132() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub7_3.method2132() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub7_3.method2132();
		local12 = this.aClass1_Sub7_3.method2129();
		if (local7 == 47) {
			this.aClass1_Sub7_3.anInt2219 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub7_3.method2119();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray182[arg0];
			this.aLong87 += (long) local38 * (long) (this.anInt2416 - local32);
			this.anInt2416 = local32;
			this.aClass1_Sub7_3.anInt2219 += local12;
			return 2;
		} else {
			this.aClass1_Sub7_3.anInt2219 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "()Z")
	public boolean method2295() {
		return this.aClass1_Sub7_3.aByteArray41 != null;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I")
	private int method2296(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub7_3.aByteArray41[this.aClass1_Sub7_3.anInt2219];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray183[arg0] = local13;
			this.aClass1_Sub7_3.anInt2219++;
		} else {
			local13 = this.anIntArray183[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2294(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub7_3.method2129();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub7_3.aByteArray41[this.aClass1_Sub7_3.anInt2219] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub7_3.anInt2219++;
				this.anIntArray183[arg0] = local57;
				return this.method2294(arg0, local57);
			}
		}
		this.aClass1_Sub7_3.anInt2219 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "()Z")
	public boolean method2297() {
		@Pc(3) int local3 = this.anIntArray184.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray184[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)I")
	public int method2298(@OriginalArg(0) int arg0) {
		return this.method2296(arg0);
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)J")
	public long method2299(@OriginalArg(0) int arg0) {
		return this.aLong87 + (long) arg0 * (long) this.anInt2416;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "()V")
	public void method2300() {
		this.aClass1_Sub7_3.anInt2219 = -1;
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "()I")
	public int method2301() {
		@Pc(3) int local3 = this.anIntArray184.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray184[local9] >= 0 && this.anIntArray182[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray182[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V")
	public void method2302(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub7_3.aByteArray41 = arg0;
		this.aClass1_Sub7_3.anInt2219 = 10;
		@Pc(12) int local12 = this.aClass1_Sub7_3.method2161();
		this.anInt2417 = this.aClass1_Sub7_3.method2161();
		this.anInt2416 = 500000;
		this.anIntArray185 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub7_3.method2140();
			@Pc(38) int local38 = this.aClass1_Sub7_3.method2140();
			if (local33 == 1297379947) {
				this.anIntArray185[local27] = this.aClass1_Sub7_3.anInt2219;
				local27++;
			}
			this.aClass1_Sub7_3.anInt2219 += local38;
		}
		this.aLong87 = 0L;
		this.anIntArray184 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray184[local33] = this.anIntArray185[local33];
		}
		this.anIntArray182 = new int[local12];
		this.anIntArray183 = new int[local12];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(J)V")
	public void method2303(@OriginalArg(0) long arg0) {
		this.aLong87 = arg0;
		@Pc(6) int local6 = this.anIntArray184.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray182[local8] = 0;
			this.anIntArray183[local8] = 0;
			this.aClass1_Sub7_3.anInt2219 = this.anIntArray185[local8];
			this.method2289(local8);
			this.anIntArray184[local8] = this.aClass1_Sub7_3.anInt2219;
		}
	}
}
