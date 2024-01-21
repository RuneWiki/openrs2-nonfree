import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class3 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!ab;")
	private final Class2_Sub2 aClass2_Sub2_1 = new Class2_Sub2(null);

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class3() {
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "([B)V")
	public Class3(@OriginalArg(0) byte[] arg0) {
		this.method230(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([B)V")
	public void method230(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub2_1.aByteArray35 = arg0;
		this.aClass2_Sub2_1.anInt2385 = 10;
		@Pc(12) int local12 = this.aClass2_Sub2_1.method1680();
		this.anInt376 = this.aClass2_Sub2_1.method1680();
		this.anInt375 = 500000;
		this.anIntArray21 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub2_1.method1690();
			@Pc(38) int local38 = this.aClass2_Sub2_1.method1690();
			if (local33 == 1297379947) {
				this.anIntArray21[local27] = this.aClass2_Sub2_1.anInt2385;
				local27++;
			}
			this.aClass2_Sub2_1.anInt2385 += local38;
		}
		this.aLong11 = 0L;
		this.anIntArray23 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray23[local33] = this.anIntArray21[local33];
		}
		this.anIntArray22 = new int[local12];
		this.anIntArray20 = new int[local12];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
	public void method231() {
		this.aClass2_Sub2_1.anInt2385 = -1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public void method232(@OriginalArg(0) int arg0) {
		this.anIntArray23[arg0] = this.aClass2_Sub2_1.anInt2385;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
	public int method233() {
		return this.anIntArray23.length;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
	private int method234(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub2_1.aByteArray35[this.aClass2_Sub2_1.anInt2385];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray20[arg0] = local13;
			this.aClass2_Sub2_1.anInt2385++;
		} else {
			local13 = this.anIntArray20[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method240(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub2_1.method1657();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub2_1.aByteArray35[this.aClass2_Sub2_1.anInt2385] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub2_1.anInt2385++;
				this.anIntArray20[arg0] = local57;
				return this.method240(arg0, local57);
			}
		}
		this.aClass2_Sub2_1.anInt2385 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(J)V")
	public void method235(@OriginalArg(0) long arg0) {
		this.aLong11 = arg0;
		@Pc(6) int local6 = this.anIntArray23.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray22[local8] = 0;
			this.anIntArray20[local8] = 0;
			this.aClass2_Sub2_1.anInt2385 = this.anIntArray21[local8];
			this.method244(local8);
			this.anIntArray23[local8] = this.aClass2_Sub2_1.anInt2385;
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
	public void method236() {
		this.aClass2_Sub2_1.aByteArray35 = null;
		this.anIntArray21 = null;
		this.anIntArray23 = null;
		this.anIntArray22 = null;
		this.anIntArray20 = null;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)I")
	public int method237(@OriginalArg(0) int arg0) {
		return this.method234(arg0);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public void method239(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2_1.anInt2385 = this.anIntArray23[arg0];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	private int method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static7.aByteArray4[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub2_1.method1698() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub2_1.method1698() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub2_1.method1698();
		local12 = this.aClass2_Sub2_1.method1657();
		if (local7 == 47) {
			this.aClass2_Sub2_1.anInt2385 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub2_1.method1654();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray22[arg0];
			this.aLong11 += (long) local38 * (long) (this.anInt375 - local32);
			this.anInt375 = local32;
			this.aClass2_Sub2_1.anInt2385 += local12;
			return 2;
		} else {
			this.aClass2_Sub2_1.anInt2385 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "()Z")
	public boolean method241() {
		return this.aClass2_Sub2_1.aByteArray35 != null;
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "()Z")
	public boolean method242() {
		@Pc(3) int local3 = this.anIntArray23.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray23[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "()I")
	public int method243() {
		@Pc(3) int local3 = this.anIntArray23.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray23[local9] >= 0 && this.anIntArray22[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray22[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	public void method244(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub2_1.method1657();
		this.anIntArray22[arg0] += local4;
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)J")
	public long method245(@OriginalArg(0) int arg0) {
		return this.aLong11 + (long) arg0 * (long) this.anInt375;
	}
}
