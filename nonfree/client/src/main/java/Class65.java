import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class65 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private int anInt2056;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!tf;")
	private final Class4_Sub9 aClass4_Sub9_4 = new Class4_Sub9(null);

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class65() {
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
	public Class65(@OriginalArg(0) byte[] arg0) {
		this.method1404(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()Z")
	public boolean method1401() {
		return this.aClass4_Sub9_4.aByteArray6 != null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
	public void method1402() {
		this.aClass4_Sub9_4.aByteArray6 = null;
		this.anIntArray234 = null;
		this.anIntArray235 = null;
		this.anIntArray236 = null;
		this.anIntArray233 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	public int method1403(@OriginalArg(0) int arg0) {
		return this.method1412(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([B)V")
	public void method1404(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub9_4.aByteArray6 = arg0;
		this.aClass4_Sub9_4.anInt1312 = 10;
		@Pc(12) int local12 = this.aClass4_Sub9_4.method816();
		this.anInt2055 = this.aClass4_Sub9_4.method816();
		this.anInt2056 = 500000;
		this.anIntArray234 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub9_4.method780();
			@Pc(38) int local38 = this.aClass4_Sub9_4.method780();
			if (local33 == 1297379947) {
				this.anIntArray234[local27] = this.aClass4_Sub9_4.anInt1312;
				local27++;
			}
			this.aClass4_Sub9_4.anInt1312 += local38;
		}
		this.aLong69 = 0L;
		this.anIntArray235 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray235[local33] = this.anIntArray234[local33];
		}
		this.anIntArray236 = new int[local12];
		this.anIntArray233 = new int[local12];
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method1405(@OriginalArg(0) int arg0) {
		this.anIntArray235[arg0] = this.aClass4_Sub9_4.anInt1312;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public void method1406(@OriginalArg(0) int arg0) {
		this.aClass4_Sub9_4.anInt1312 = this.anIntArray235[arg0];
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	public void method1407(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub9_4.method809();
		this.anIntArray236[arg0] += local4;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()Z")
	public boolean method1408() {
		@Pc(3) int local3 = this.anIntArray235.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray235[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(J)V")
	public void method1409(@OriginalArg(0) long arg0) {
		this.aLong69 = arg0;
		@Pc(6) int local6 = this.anIntArray235.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray236[local8] = 0;
			this.anIntArray233[local8] = 0;
			this.aClass4_Sub9_4.anInt1312 = this.anIntArray234[local8];
			this.method1407(local8);
			this.anIntArray235[local8] = this.aClass4_Sub9_4.anInt1312;
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)J")
	public long method1410(@OriginalArg(0) int arg0) {
		return this.aLong69 + (long) arg0 * (long) this.anInt2056;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	private int method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static88.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub9_4.method773() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub9_4.method773() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub9_4.method773();
		local12 = this.aClass4_Sub9_4.method809();
		if (local7 == 47) {
			this.aClass4_Sub9_4.anInt1312 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub9_4.method806();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray236[arg0];
			this.aLong69 += (long) local38 * (long) (this.anInt2056 - local32);
			this.anInt2056 = local32;
			this.aClass4_Sub9_4.anInt1312 += local12;
			return 2;
		} else {
			this.aClass4_Sub9_4.anInt1312 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)I")
	private int method1412(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub9_4.aByteArray6[this.aClass4_Sub9_4.anInt1312];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray233[arg0] = local13;
			this.aClass4_Sub9_4.anInt1312++;
		} else {
			local13 = this.anIntArray233[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1411(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub9_4.method809();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub9_4.aByteArray6[this.aClass4_Sub9_4.anInt1312] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub9_4.anInt1312++;
				this.anIntArray233[arg0] = local57;
				return this.method1411(arg0, local57);
			}
		}
		this.aClass4_Sub9_4.anInt1312 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()I")
	public int method1414() {
		return this.anIntArray235.length;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()V")
	public void method1415() {
		this.aClass4_Sub9_4.anInt1312 = -1;
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "()I")
	public int method1416() {
		@Pc(3) int local3 = this.anIntArray235.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray235[local9] >= 0 && this.anIntArray236[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray236[local9];
			}
		}
		return local5;
	}
}
