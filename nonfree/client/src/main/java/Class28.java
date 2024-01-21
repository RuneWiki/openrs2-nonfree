import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class28 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	private int anInt1783;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public int anInt1784;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!pd;")
	private final Class2_Sub6 aClass2_Sub6_4 = new Class2_Sub6(null);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method1136(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub6_4.method636();
		this.anIntArray262[arg0] += local4;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)J")
	public long method1137(@OriginalArg(0) int arg0) {
		return this.aLong48 + (long) arg0 * (long) this.anInt1783;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
	public void method1138() {
		this.aClass2_Sub6_4.aByteArray11 = null;
		this.anIntArray263 = null;
		this.anIntArray265 = null;
		this.anIntArray262 = null;
		this.anIntArray264 = null;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "()Z")
	public boolean method1139() {
		@Pc(3) int local3 = this.anIntArray265.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray265[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
	private int method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static52.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub6_4.method665() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub6_4.method665() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub6_4.method665();
		local12 = this.aClass2_Sub6_4.method636();
		if (local7 == 47) {
			this.aClass2_Sub6_4.anInt952 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub6_4.method639();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray262[arg0];
			this.aLong48 += (long) local38 * (long) (this.anInt1783 - local32);
			this.anInt1783 = local32;
			this.aClass2_Sub6_4.anInt952 += local12;
			return 2;
		} else {
			this.aClass2_Sub6_4.anInt952 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
	public int method1141(@OriginalArg(0) int arg0) {
		return this.method1149(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public void method1143(@OriginalArg(0) int arg0) {
		this.anIntArray265[arg0] = this.aClass2_Sub6_4.anInt952;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	public void method1144(@OriginalArg(0) int arg0) {
		this.aClass2_Sub6_4.anInt952 = this.anIntArray265[arg0];
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "()Z")
	public boolean method1145() {
		return this.aClass2_Sub6_4.aByteArray11 != null;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "()I")
	public int method1146() {
		return this.anIntArray265.length;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "()I")
	public int method1147() {
		@Pc(3) int local3 = this.anIntArray265.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray265[local9] >= 0 && this.anIntArray262[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray262[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([B)V")
	public void method1148(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub6_4.aByteArray11 = arg0;
		this.aClass2_Sub6_4.anInt952 = 10;
		@Pc(12) int local12 = this.aClass2_Sub6_4.method627();
		this.anInt1784 = this.aClass2_Sub6_4.method627();
		this.anInt1783 = 500000;
		this.anIntArray263 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass2_Sub6_4.method629();
			@Pc(38) int local38 = this.aClass2_Sub6_4.method629();
			if (local33 == 1297379947) {
				this.anIntArray263[local27] = this.aClass2_Sub6_4.anInt952;
				local27++;
			}
			this.aClass2_Sub6_4.anInt952 += local38;
		}
		this.anIntArray265 = (int[]) this.anIntArray263.clone();
		this.anIntArray262 = new int[local12];
		this.anIntArray264 = new int[local12];
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)I")
	private int method1149(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub6_4.aByteArray11[this.aClass2_Sub6_4.anInt952];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray264[arg0] = local13;
			this.aClass2_Sub6_4.anInt952++;
		} else {
			local13 = this.anIntArray264[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1140(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub6_4.method636();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub6_4.aByteArray11[this.aClass2_Sub6_4.anInt952] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub6_4.anInt952++;
				this.anIntArray264[arg0] = local57;
				return this.method1140(arg0, local57);
			}
		}
		this.aClass2_Sub6_4.anInt952 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "()V")
	public void method1150() {
		this.aClass2_Sub6_4.anInt952 = -1;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "()Z")
	public boolean method1151() {
		return this.aClass2_Sub6_4.anInt952 < 0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(J)V")
	public void method1152(@OriginalArg(0) long arg0) {
		this.aLong48 = arg0;
		@Pc(6) int local6 = this.anIntArray265.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray262[local8] = 0;
			this.anIntArray264[local8] = 0;
			this.aClass2_Sub6_4.anInt952 = this.anIntArray263[local8];
			this.method1136(local8);
			this.anIntArray265[local8] = this.aClass2_Sub6_4.anInt952;
		}
	}
}
