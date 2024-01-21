import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class46 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private int anInt2016;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public int anInt2017;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!g;")
	private final Class2_Sub5 aClass2_Sub5_3 = new Class2_Sub5(null);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
	public int method1441() {
		@Pc(3) int local3 = this.anIntArray251.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray251[local9] >= 0 && this.anIntArray252[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray252[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public void method1442(@OriginalArg(0) int arg0) {
		this.anIntArray251[arg0] = this.aClass2_Sub5_3.anInt1772;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public void method1444(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub5_3.method1279();
		this.anIntArray252[arg0] += local4;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	private int method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static70.aByteArray18[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub5_3.method1281() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub5_3.method1281() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub5_3.method1281();
		local12 = this.aClass2_Sub5_3.method1279();
		if (local7 == 47) {
			this.aClass2_Sub5_3.anInt1772 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub5_3.method1255();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray252[arg0];
			this.aLong54 += (long) local38 * (long) (this.anInt2016 - local32);
			this.anInt2016 = local32;
			this.aClass2_Sub5_3.anInt1772 += local12;
			return 2;
		} else {
			this.aClass2_Sub5_3.anInt1772 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "()Z")
	public boolean method1446() {
		@Pc(3) int local3 = this.anIntArray251.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray251[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()I")
	public int method1447() {
		return this.anIntArray251.length;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "()V")
	public void method1448() {
		this.aClass2_Sub5_3.aByteArray16 = null;
		this.anIntArray253 = null;
		this.anIntArray251 = null;
		this.anIntArray252 = null;
		this.anIntArray250 = null;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public void method1449(@OriginalArg(0) int arg0) {
		this.aClass2_Sub5_3.anInt1772 = this.anIntArray251[arg0];
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)J")
	public long method1450(@OriginalArg(0) int arg0) {
		return this.aLong54 + (long) arg0 * (long) this.anInt2016;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)I")
	public int method1451(@OriginalArg(0) int arg0) {
		return this.method1456(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "()Z")
	public boolean method1452() {
		return this.aClass2_Sub5_3.aByteArray16 != null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(J)V")
	public void method1453(@OriginalArg(0) long arg0) {
		this.aLong54 = arg0;
		@Pc(6) int local6 = this.anIntArray251.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray252[local8] = 0;
			this.anIntArray250[local8] = 0;
			this.aClass2_Sub5_3.anInt1772 = this.anIntArray253[local8];
			this.method1444(local8);
			this.anIntArray251[local8] = this.aClass2_Sub5_3.anInt1772;
		}
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "()V")
	public void method1454() {
		this.aClass2_Sub5_3.anInt1772 = -1;
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "()Z")
	public boolean method1455() {
		return this.aClass2_Sub5_3.anInt1772 < 0;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)I")
	private int method1456(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub5_3.aByteArray16[this.aClass2_Sub5_3.anInt1772];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray250[arg0] = local13;
			this.aClass2_Sub5_3.anInt1772++;
		} else {
			local13 = this.anIntArray250[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1445(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub5_3.method1279();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub5_3.aByteArray16[this.aClass2_Sub5_3.anInt1772] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub5_3.anInt1772++;
				this.anIntArray250[arg0] = local57;
				return this.method1445(arg0, local57);
			}
		}
		this.aClass2_Sub5_3.anInt1772 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([B)V")
	public void method1457(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub5_3.aByteArray16 = arg0;
		this.aClass2_Sub5_3.anInt1772 = 10;
		@Pc(12) int local12 = this.aClass2_Sub5_3.method1273();
		this.anInt2017 = this.aClass2_Sub5_3.method1273();
		this.anInt2016 = 500000;
		this.anIntArray253 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass2_Sub5_3.method1276();
			@Pc(38) int local38 = this.aClass2_Sub5_3.method1276();
			if (local33 == 1297379947) {
				this.anIntArray253[local27] = this.aClass2_Sub5_3.anInt1772;
				local27++;
			}
			this.aClass2_Sub5_3.anInt1772 += local38;
		}
		this.anIntArray251 = (int[]) this.anIntArray253.clone();
		this.anIntArray252 = new int[local12];
		this.anIntArray250 = new int[local12];
	}
}
