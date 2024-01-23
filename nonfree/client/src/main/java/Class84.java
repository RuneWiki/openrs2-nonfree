import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class84 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	private int anInt2304;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!sb;")
	private Class1_Sub14 aClass1_Sub14_5 = new Class1_Sub14(null);

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class84() {
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V")
	public Class84(@OriginalArg(0) byte[] arg0) {
		this.method1847(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()Z")
	public boolean method1844() {
		return this.aClass1_Sub14_5.aByteArray34 != null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)J")
	public long method1845(@OriginalArg(0) int arg0) {
		return this.aLong83 + (long) arg0 * (long) this.anInt2304;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([B)V")
	public void method1847(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub14_5.aByteArray34 = arg0;
		this.aClass1_Sub14_5.anInt3290 = 10;
		@Pc(12) int local12 = this.aClass1_Sub14_5.method2593();
		this.anInt2305 = this.aClass1_Sub14_5.method2593();
		this.anInt2304 = 500000;
		this.anIntArray190 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub14_5.method2647();
			@Pc(40) int local40 = this.aClass1_Sub14_5.method2647();
			if (local35 == 1297379947) {
				this.anIntArray190[local27] = this.aClass1_Sub14_5.anInt3290;
				local27++;
			}
			this.aClass1_Sub14_5.anInt3290 += local40;
		}
		this.aLong83 = 0L;
		this.anIntArray192 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray192[local27] = this.anIntArray190[local27];
		}
		this.anIntArray189 = new int[local12];
		this.anIntArray191 = new int[local12];
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "()V")
	public void method1848() {
		this.aClass1_Sub14_5.aByteArray34 = null;
		this.anIntArray190 = null;
		this.anIntArray192 = null;
		this.anIntArray189 = null;
		this.anIntArray191 = null;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "()Z")
	public boolean method1849() {
		@Pc(3) int local3 = this.anIntArray192.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray192[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "()V")
	public void method1850() {
		this.aClass1_Sub14_5.anInt3290 = -1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	private int method1851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static116.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub14_5.method2595() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub14_5.method2595() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub14_5.method2595();
		local12 = this.aClass1_Sub14_5.method2628();
		if (local7 == 47) {
			this.aClass1_Sub14_5.anInt3290 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub14_5.method2588();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray189[arg0];
			this.aLong83 += (long) local38 * (long) (this.anInt2304 - local32);
			this.anInt2304 = local32;
			this.aClass1_Sub14_5.anInt3290 += local12;
			return 2;
		} else {
			this.aClass1_Sub14_5.anInt3290 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	public void method1852(@OriginalArg(0) int arg0) {
		this.aClass1_Sub14_5.anInt3290 = this.anIntArray192[arg0];
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	public void method1853(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub14_5.method2628();
		this.anIntArray189[arg0] += local4;
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "()I")
	public int method1854() {
		@Pc(3) int local3 = this.anIntArray192.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray192[local9] >= 0 && this.anIntArray189[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray189[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I")
	private int method1855(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub14_5.aByteArray34[this.aClass1_Sub14_5.anInt3290];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray191[arg0] = local13;
			this.aClass1_Sub14_5.anInt3290++;
		} else {
			local13 = this.anIntArray191[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1851(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub14_5.method2628();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub14_5.aByteArray34[this.aClass1_Sub14_5.anInt3290] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub14_5.anInt3290++;
				this.anIntArray191[arg0] = local57;
				return this.method1851(arg0, local57);
			}
		}
		this.aClass1_Sub14_5.anInt3290 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	public void method1856(@OriginalArg(0) int arg0) {
		this.anIntArray192[arg0] = this.aClass1_Sub14_5.anInt3290;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(J)V")
	public void method1857(@OriginalArg(0) long arg0) {
		this.aLong83 = arg0;
		@Pc(6) int local6 = this.anIntArray192.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray189[local8] = 0;
			this.anIntArray191[local8] = 0;
			this.aClass1_Sub14_5.anInt3290 = this.anIntArray190[local8];
			this.method1853(local8);
			this.anIntArray192[local8] = this.aClass1_Sub14_5.anInt3290;
		}
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)I")
	public int method1858(@OriginalArg(0) int arg0) {
		return this.method1855(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "()I")
	public int method1859() {
		return this.anIntArray192.length;
	}
}
