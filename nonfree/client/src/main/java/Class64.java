import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class64 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public int anInt2677;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	private int anInt2678;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!wd;")
	private final Class2_Sub12 aClass2_Sub12_5 = new Class2_Sub12(null);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()I")
	public int method1882() {
		return this.anIntArray327.length;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()Z")
	public boolean method1883() {
		@Pc(3) int local3 = this.anIntArray327.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray327[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "()V")
	public void method1884() {
		this.aClass2_Sub12_5.aByteArray20 = null;
		this.anIntArray326 = null;
		this.anIntArray327 = null;
		this.anIntArray324 = null;
		this.anIntArray325 = null;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "()Z")
	public boolean method1886() {
		return this.aClass2_Sub12_5.aByteArray20 != null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public void method1887(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub12_5.method1416();
		this.anIntArray324[arg0] += local4;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public void method1888(@OriginalArg(0) int arg0) {
		this.anIntArray327[arg0] = this.aClass2_Sub12_5.anInt1939;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([B)V")
	public void method1889(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub12_5.aByteArray20 = arg0;
		this.aClass2_Sub12_5.anInt1939 = 10;
		@Pc(12) int local12 = this.aClass2_Sub12_5.method1366();
		this.anInt2677 = this.aClass2_Sub12_5.method1366();
		this.anInt2678 = 500000;
		this.anIntArray326 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub12_5.method1412();
			@Pc(38) int local38 = this.aClass2_Sub12_5.method1412();
			if (local33 == 1297379947) {
				this.anIntArray326[local27] = this.aClass2_Sub12_5.anInt1939;
				local27++;
			}
			this.aClass2_Sub12_5.anInt1939 += local38;
		}
		this.anIntArray327 = new int[this.anIntArray326.length];
		for (local33 = 0; local33 < this.anIntArray327.length; local33++) {
			this.anIntArray327[local33] = this.anIntArray326[local33];
		}
		this.anIntArray324 = new int[local12];
		this.anIntArray325 = new int[local12];
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "()V")
	public void method1890() {
		this.aClass2_Sub12_5.anInt1939 = -1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(J)V")
	public void method1891(@OriginalArg(0) long arg0) {
		this.aLong79 = arg0;
		@Pc(6) int local6 = this.anIntArray327.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray324[local8] = 0;
			this.anIntArray325[local8] = 0;
			this.aClass2_Sub12_5.anInt1939 = this.anIntArray326[local8];
			this.method1887(local8);
			this.anIntArray327[local8] = this.aClass2_Sub12_5.anInt1939;
		}
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "()I")
	public int method1892() {
		@Pc(3) int local3 = this.anIntArray327.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray327[local9] >= 0 && this.anIntArray324[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray324[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)J")
	public long method1893(@OriginalArg(0) int arg0) {
		return this.aLong79 + (long) arg0 * (long) this.anInt2678;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	public void method1894(@OriginalArg(0) int arg0) {
		this.aClass2_Sub12_5.anInt1939 = this.anIntArray327[arg0];
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
	private int method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static102.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub12_5.method1399() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub12_5.method1399() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub12_5.method1399();
		local12 = this.aClass2_Sub12_5.method1416();
		if (local7 == 47) {
			this.aClass2_Sub12_5.anInt1939 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub12_5.method1408();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray324[arg0];
			this.aLong79 += (long) local38 * (long) (this.anInt2678 - local32);
			this.anInt2678 = local32;
			this.aClass2_Sub12_5.anInt1939 += local12;
			return 2;
		} else {
			this.aClass2_Sub12_5.anInt1939 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "()Z")
	public boolean method1896() {
		return this.aClass2_Sub12_5.anInt1939 < 0;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)I")
	private int method1897(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub12_5.aByteArray20[this.aClass2_Sub12_5.anInt1939];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray325[arg0] = local13;
			this.aClass2_Sub12_5.anInt1939++;
		} else {
			local13 = this.anIntArray325[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1895(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub12_5.method1416();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub12_5.aByteArray20[this.aClass2_Sub12_5.anInt1939] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub12_5.anInt1939++;
				this.anIntArray325[arg0] = local57;
				return this.method1895(arg0, local57);
			}
		}
		this.aClass2_Sub12_5.anInt1939 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I")
	public int method1898(@OriginalArg(0) int arg0) {
		return this.method1897(arg0);
	}
}
