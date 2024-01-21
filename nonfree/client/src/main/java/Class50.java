import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class50 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt3096;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt3097;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!og;")
	private final Class2_Sub3 aClass2_Sub3_3 = new Class2_Sub3(null);

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
	public Class50(@OriginalArg(0) byte[] arg0) {
		this.method2435(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	private int method2429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static109.aByteArray37[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub3_3.method218() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub3_3.method218() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub3_3.method218();
		local12 = this.aClass2_Sub3_3.method210();
		if (local7 == 47) {
			this.aClass2_Sub3_3.anInt273 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub3_3.method239();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray353[arg0];
			this.aLong103 += (long) local38 * (long) (this.anInt3096 - local32);
			this.anInt3096 = local32;
			this.aClass2_Sub3_3.anInt273 += local12;
			return 2;
		} else {
			this.aClass2_Sub3_3.anInt273 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method2430(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_3.anInt273 = this.anIntArray352[arg0];
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method2431() {
		this.aClass2_Sub3_3.aByteArray4 = null;
		this.anIntArray351 = null;
		this.anIntArray352 = null;
		this.anIntArray353 = null;
		this.anIntArray354 = null;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()Z")
	public boolean method2433() {
		@Pc(3) int local3 = this.anIntArray352.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray352[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V")
	public void method2434(@OriginalArg(0) long arg0) {
		this.aLong103 = arg0;
		@Pc(6) int local6 = this.anIntArray352.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray353[local8] = 0;
			this.anIntArray354[local8] = 0;
			this.aClass2_Sub3_3.anInt273 = this.anIntArray351[local8];
			this.method2444(local8);
			this.anIntArray352[local8] = this.aClass2_Sub3_3.anInt273;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
	public void method2435(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub3_3.aByteArray4 = arg0;
		this.aClass2_Sub3_3.anInt273 = 10;
		@Pc(12) int local12 = this.aClass2_Sub3_3.method234();
		this.anInt3097 = this.aClass2_Sub3_3.method234();
		this.anInt3096 = 500000;
		this.anIntArray351 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub3_3.method206();
			@Pc(38) int local38 = this.aClass2_Sub3_3.method206();
			if (local33 == 1297379947) {
				this.anIntArray351[local27] = this.aClass2_Sub3_3.anInt273;
				local27++;
			}
			this.aClass2_Sub3_3.anInt273 += local38;
		}
		this.aLong103 = 0L;
		this.anIntArray352 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray352[local33] = this.anIntArray351[local33];
		}
		this.anIntArray353 = new int[local12];
		this.anIntArray354 = new int[local12];
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	public int method2436(@OriginalArg(0) int arg0) {
		return this.method2438(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()I")
	public int method2437() {
		@Pc(3) int local3 = this.anIntArray352.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray352[local9] >= 0 && this.anIntArray353[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray353[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	private int method2438(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub3_3.aByteArray4[this.aClass2_Sub3_3.anInt273];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray354[arg0] = local13;
			this.aClass2_Sub3_3.anInt273++;
		} else {
			local13 = this.anIntArray354[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2429(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub3_3.method210();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub3_3.aByteArray4[this.aClass2_Sub3_3.anInt273] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub3_3.anInt273++;
				this.anIntArray354[arg0] = local57;
				return this.method2429(arg0, local57);
			}
		}
		this.aClass2_Sub3_3.anInt273 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method2439() {
		return this.anIntArray352.length;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method2440(@OriginalArg(0) int arg0) {
		this.anIntArray352[arg0] = this.aClass2_Sub3_3.anInt273;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()V")
	public void method2441() {
		this.aClass2_Sub3_3.anInt273 = -1;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)J")
	public long method2442(@OriginalArg(0) int arg0) {
		return this.aLong103 + (long) arg0 * (long) this.anInt3096;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()Z")
	public boolean method2443() {
		return this.aClass2_Sub3_3.aByteArray4 != null;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public void method2444(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub3_3.method210();
		this.anIntArray353[arg0] += local4;
	}
}
