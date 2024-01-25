import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class91 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public int anInt2051;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private int anInt2052;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!wm;")
	private final Class1_Sub19 aClass1_Sub19_3 = new Class1_Sub19(null);

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class91() {
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
	public Class91(@OriginalArg(0) byte[] arg0) {
		this.method1665(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public int method1661(@OriginalArg(0) int arg0) {
		return this.method1672(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(J)V")
	public void method1662(@OriginalArg(0) long arg0) {
		this.aLong66 = arg0;
		@Pc(6) int local6 = this.anIntArray177.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray175[local8] = 0;
			this.anIntArray174[local8] = 0;
			this.aClass1_Sub19_3.anInt3698 = this.anIntArray176[local8];
			this.method1668(local8);
			this.anIntArray177[local8] = this.aClass1_Sub19_3.anInt3698;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
	public int method1663() {
		return this.anIntArray177.length;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
	private int method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static131.aByteArray22[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub19_3.method2915() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub19_3.method2915() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub19_3.method2915();
		local12 = this.aClass1_Sub19_3.method2878();
		if (local7 == 47) {
			this.aClass1_Sub19_3.anInt3698 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub19_3.method2881();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray175[arg0];
			this.aLong66 += (long) local38 * (long) (this.anInt2052 - local32);
			this.anInt2052 = local32;
			this.aClass1_Sub19_3.anInt3698 += local12;
			return 2;
		} else {
			this.aClass1_Sub19_3.anInt3698 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([B)V")
	public void method1665(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub19_3.aByteArray38 = arg0;
		this.aClass1_Sub19_3.anInt3698 = 10;
		@Pc(12) int local12 = this.aClass1_Sub19_3.method2896();
		this.anInt2051 = this.aClass1_Sub19_3.method2896();
		this.anInt2052 = 500000;
		this.anIntArray176 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub19_3.method2877();
			@Pc(38) int local38 = this.aClass1_Sub19_3.method2877();
			if (local33 == 1297379947) {
				this.anIntArray176[local27] = this.aClass1_Sub19_3.anInt3698;
				local27++;
			}
			this.aClass1_Sub19_3.anInt3698 += local38;
		}
		this.aLong66 = 0L;
		this.anIntArray177 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray177[local33] = this.anIntArray176[local33];
		}
		this.anIntArray175 = new int[local12];
		this.anIntArray174 = new int[local12];
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)J")
	public long method1666(@OriginalArg(0) int arg0) {
		return this.aLong66 + (long) arg0 * (long) this.anInt2052;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()I")
	public int method1667() {
		@Pc(3) int local3 = this.anIntArray177.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray177[local9] >= 0 && this.anIntArray175[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray175[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public void method1668(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub19_3.method2878();
		this.anIntArray175[arg0] += local4;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "()V")
	public void method1669() {
		this.aClass1_Sub19_3.aByteArray38 = null;
		this.anIntArray176 = null;
		this.anIntArray177 = null;
		this.anIntArray175 = null;
		this.anIntArray174 = null;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()Z")
	public boolean method1670() {
		@Pc(3) int local3 = this.anIntArray177.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray177[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z")
	public boolean method1671() {
		return this.aClass1_Sub19_3.aByteArray38 != null;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	private int method1672(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub19_3.aByteArray38[this.aClass1_Sub19_3.anInt3698];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray174[arg0] = local13;
			this.aClass1_Sub19_3.anInt3698++;
		} else {
			local13 = this.anIntArray174[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1664(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub19_3.method2878();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub19_3.aByteArray38[this.aClass1_Sub19_3.anInt3698] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub19_3.anInt3698++;
				this.anIntArray174[arg0] = local57;
				return this.method1664(arg0, local57);
			}
		}
		this.aClass1_Sub19_3.anInt3698 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public void method1673(@OriginalArg(0) int arg0) {
		this.anIntArray177[arg0] = this.aClass1_Sub19_3.anInt3698;
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "()V")
	public void method1675() {
		this.aClass1_Sub19_3.anInt3698 = -1;
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	public void method1676(@OriginalArg(0) int arg0) {
		this.aClass1_Sub19_3.anInt3698 = this.anIntArray177[arg0];
	}
}
