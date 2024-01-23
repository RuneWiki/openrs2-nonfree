import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class76 {

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	private int anInt2574;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public int anInt2575;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Lclient!oe;")
	private Class2_Sub16 aClass2_Sub16_7 = new Class2_Sub16(null);

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "([B)V")
	public Class76(@OriginalArg(0) byte[] arg0) {
		this.method1921(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)J")
	public long method1909(@OriginalArg(0) int arg0) {
		return this.aLong83 + (long) arg0 * (long) this.anInt2574;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(J)V")
	public void method1910(@OriginalArg(0) long arg0) {
		this.aLong83 = arg0;
		@Pc(6) int local6 = this.anIntArray229.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray227[local8] = 0;
			this.anIntArray230[local8] = 0;
			this.aClass2_Sub16_7.anInt2789 = this.anIntArray228[local8];
			this.method1911(local8);
			this.anIntArray229[local8] = this.aClass2_Sub16_7.anInt2789;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public void method1911(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub16_7.method2138();
		this.anIntArray227[arg0] += local4;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I")
	public int method1912(@OriginalArg(0) int arg0) {
		return this.method1918(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)I")
	private int method1913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static114.aByteArray15[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub16_7.method2146() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub16_7.method2146() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub16_7.method2146();
		local12 = this.aClass2_Sub16_7.method2138();
		if (local7 == 47) {
			this.aClass2_Sub16_7.anInt2789 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub16_7.method2166();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray227[arg0];
			this.aLong83 += (long) local38 * (long) (this.anInt2574 - local32);
			this.anInt2574 = local32;
			this.aClass2_Sub16_7.anInt2789 += local12;
			return 2;
		} else {
			this.aClass2_Sub16_7.anInt2789 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()V")
	public void method1915() {
		this.aClass2_Sub16_7.aByteArray17 = null;
		this.anIntArray228 = null;
		this.anIntArray229 = null;
		this.anIntArray227 = null;
		this.anIntArray230 = null;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()Z")
	public boolean method1916() {
		@Pc(3) int local3 = this.anIntArray229.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray229[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "()V")
	public void method1917() {
		this.aClass2_Sub16_7.anInt2789 = -1;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)I")
	private int method1918(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub16_7.aByteArray17[this.aClass2_Sub16_7.anInt2789];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray230[arg0] = local13;
			this.aClass2_Sub16_7.anInt2789++;
		} else {
			local13 = this.anIntArray230[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1913(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub16_7.method2138();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub16_7.aByteArray17[this.aClass2_Sub16_7.anInt2789] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub16_7.anInt2789++;
				this.anIntArray230[arg0] = local57;
				return this.method1913(arg0, local57);
			}
		}
		this.aClass2_Sub16_7.anInt2789 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "()Z")
	public boolean method1919() {
		return this.aClass2_Sub16_7.aByteArray17 != null;
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
	public void method1920(@OriginalArg(0) int arg0) {
		this.anIntArray229[arg0] = this.aClass2_Sub16_7.anInt2789;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([B)V")
	public void method1921(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub16_7.aByteArray17 = arg0;
		this.aClass2_Sub16_7.anInt2789 = 10;
		@Pc(12) int local12 = this.aClass2_Sub16_7.method2130();
		this.anInt2575 = this.aClass2_Sub16_7.method2130();
		this.anInt2574 = 500000;
		this.anIntArray228 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass2_Sub16_7.method2145();
			@Pc(40) int local40 = this.aClass2_Sub16_7.method2145();
			if (local35 == 1297379947) {
				this.anIntArray228[local27] = this.aClass2_Sub16_7.anInt2789;
				local27++;
			}
			this.aClass2_Sub16_7.anInt2789 += local40;
		}
		this.aLong83 = 0L;
		this.anIntArray229 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray229[local27] = this.anIntArray228[local27];
		}
		this.anIntArray227 = new int[local12];
		this.anIntArray230 = new int[local12];
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "()I")
	public int method1922() {
		@Pc(3) int local3 = this.anIntArray229.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray229[local9] >= 0 && this.anIntArray227[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray227[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V")
	public void method1923(@OriginalArg(0) int arg0) {
		this.aClass2_Sub16_7.anInt2789 = this.anIntArray229[arg0];
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "()I")
	public int method1924() {
		return this.anIntArray229.length;
	}
}
