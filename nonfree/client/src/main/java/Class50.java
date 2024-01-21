import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class50 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	private int anInt2245;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public int anInt2246;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!ka;")
	private final Class1_Sub8 aClass1_Sub8_3 = new Class1_Sub8(null);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)J")
	public long method1536(@OriginalArg(0) int arg0) {
		return this.aLong69 + (long) arg0 * (long) this.anInt2245;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public void method1537(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_3.anInt1692 = this.anIntArray345[arg0];
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)I")
	public int method1538(@OriginalArg(0) int arg0) {
		return this.method1549(arg0);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public void method1539(@OriginalArg(0) int arg0) {
		this.anIntArray345[arg0] = this.aClass1_Sub8_3.anInt1692;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
	public int method1540() {
		return this.anIntArray345.length;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([B)V")
	public void method1541(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub8_3.aByteArray24 = arg0;
		this.aClass1_Sub8_3.anInt1692 = 10;
		@Pc(12) int local12 = this.aClass1_Sub8_3.method1199();
		this.anInt2246 = this.aClass1_Sub8_3.method1199();
		this.anInt2245 = 500000;
		this.anIntArray343 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass1_Sub8_3.method1188();
			@Pc(38) int local38 = this.aClass1_Sub8_3.method1188();
			if (local33 == 1297379947) {
				this.anIntArray343[local27] = this.aClass1_Sub8_3.anInt1692;
				local27++;
			}
			this.aClass1_Sub8_3.anInt1692 += local38;
		}
		this.anIntArray345 = (int[]) this.anIntArray343.clone();
		this.anIntArray344 = new int[local12];
		this.anIntArray346 = new int[local12];
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
	public void method1542() {
		this.aClass1_Sub8_3.aByteArray24 = null;
		this.anIntArray343 = null;
		this.anIntArray345 = null;
		this.anIntArray344 = null;
		this.anIntArray346 = null;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public boolean method1543() {
		@Pc(3) int local3 = this.anIntArray345.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray345[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public boolean method1545() {
		return this.aClass1_Sub8_3.anInt1692 < 0;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public boolean method1546() {
		return this.aClass1_Sub8_3.aByteArray24 != null;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()I")
	public int method1547() {
		@Pc(3) int local3 = this.anIntArray345.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray345[local9] >= 0 && this.anIntArray344[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray344[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	private int method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static85.aByteArray29[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub8_3.method1186() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub8_3.method1186() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub8_3.method1186();
		local12 = this.aClass1_Sub8_3.method1223();
		if (local7 == 47) {
			this.aClass1_Sub8_3.anInt1692 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub8_3.method1202();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray344[arg0];
			this.aLong69 += (long) local38 * (long) (this.anInt2245 - local32);
			this.anInt2245 = local32;
			this.aClass1_Sub8_3.anInt1692 += local12;
			return 2;
		} else {
			this.aClass1_Sub8_3.anInt1692 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
	private int method1549(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub8_3.aByteArray24[this.aClass1_Sub8_3.anInt1692];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray346[arg0] = local13;
			this.aClass1_Sub8_3.anInt1692++;
		} else {
			local13 = this.anIntArray346[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1548(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub8_3.method1223();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub8_3.aByteArray24[this.aClass1_Sub8_3.anInt1692] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub8_3.anInt1692++;
				this.anIntArray346[arg0] = local57;
				return this.method1548(arg0, local57);
			}
		}
		this.aClass1_Sub8_3.anInt1692 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
	public void method1550() {
		this.aClass1_Sub8_3.anInt1692 = -1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(J)V")
	public void method1551(@OriginalArg(0) long arg0) {
		this.aLong69 = arg0;
		@Pc(6) int local6 = this.anIntArray345.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray344[local8] = 0;
			this.anIntArray346[local8] = 0;
			this.aClass1_Sub8_3.anInt1692 = this.anIntArray343[local8];
			this.method1552(local8);
			this.anIntArray345[local8] = this.aClass1_Sub8_3.anInt1692;
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public void method1552(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub8_3.method1223();
		this.anIntArray344[arg0] += local4;
	}
}
