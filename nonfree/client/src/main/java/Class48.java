import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class48 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	private int anInt1442;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public int anInt1443;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!dg;")
	private final Class2_Sub10 aClass2_Sub10_1 = new Class2_Sub10(null);

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class48() {
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class48(@OriginalArg(0) byte[] arg0) {
		this.method1506(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
	public int method1504() {
		@Pc(3) int local3 = this.anIntArray147.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray147[local9] >= 0 && this.anIntArray150[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray150[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	public int method1505(@OriginalArg(0) int arg0) {
		return this.method1511(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([B)V")
	public void method1506(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub10_1.aByteArray57 = arg0;
		this.aClass2_Sub10_1.anInt4807 = 10;
		@Pc(12) int local12 = this.aClass2_Sub10_1.method4464();
		this.anInt1443 = this.aClass2_Sub10_1.method4464();
		this.anInt1442 = 500000;
		this.anIntArray149 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub10_1.method4444();
			@Pc(38) int local38 = this.aClass2_Sub10_1.method4444();
			if (local33 == 1297379947) {
				this.anIntArray149[local27] = this.aClass2_Sub10_1.anInt4807;
				local27++;
			}
			this.aClass2_Sub10_1.anInt4807 += local38;
		}
		this.aLong41 = 0L;
		this.anIntArray147 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray147[local33] = this.anIntArray149[local33];
		}
		this.anIntArray150 = new int[local12];
		this.anIntArray148 = new int[local12];
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()Z")
	public boolean method1507() {
		return this.aClass2_Sub10_1.aByteArray57 != null;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()I")
	public int method1508() {
		return this.anIntArray147.length;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
	private int method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static67.aByteArray22[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub10_1.method4421() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub10_1.method4421() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub10_1.method4421();
		local12 = this.aClass2_Sub10_1.method4429();
		if (local7 == 47) {
			this.aClass2_Sub10_1.anInt4807 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub10_1.method4463();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray150[arg0];
			this.aLong41 += (long) local38 * (long) (this.anInt1442 - local32);
			this.anInt1442 = local32;
			this.aClass2_Sub10_1.anInt4807 += local12;
			return 2;
		} else {
			this.aClass2_Sub10_1.anInt4807 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	private int method1511(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub10_1.aByteArray57[this.aClass2_Sub10_1.anInt4807];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray148[arg0] = local13;
			this.aClass2_Sub10_1.anInt4807++;
		} else {
			local13 = this.anIntArray148[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1509(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub10_1.method4429();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub10_1.aByteArray57[this.aClass2_Sub10_1.anInt4807] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub10_1.anInt4807++;
				this.anIntArray148[arg0] = local57;
				return this.method1509(arg0, local57);
			}
		}
		this.aClass2_Sub10_1.anInt4807 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "()V")
	public void method1512() {
		this.aClass2_Sub10_1.aByteArray57 = null;
		this.anIntArray149 = null;
		this.anIntArray147 = null;
		this.anIntArray150 = null;
		this.anIntArray148 = null;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public void method1513(@OriginalArg(0) int arg0) {
		this.aClass2_Sub10_1.anInt4807 = this.anIntArray147[arg0];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(J)V")
	public void method1514(@OriginalArg(0) long arg0) {
		this.aLong41 = arg0;
		@Pc(6) int local6 = this.anIntArray147.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray150[local8] = 0;
			this.anIntArray148[local8] = 0;
			this.aClass2_Sub10_1.anInt4807 = this.anIntArray149[local8];
			this.method1517(local8);
			this.anIntArray147[local8] = this.aClass2_Sub10_1.anInt4807;
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)J")
	public long method1515(@OriginalArg(0) int arg0) {
		return this.aLong41 + (long) arg0 * (long) this.anInt1442;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "()Z")
	public boolean method1516() {
		@Pc(3) int local3 = this.anIntArray147.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray147[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public void method1517(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub10_1.method4429();
		this.anIntArray150[arg0] += local4;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "()V")
	public void method1518() {
		this.aClass2_Sub10_1.anInt4807 = -1;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	public void method1519(@OriginalArg(0) int arg0) {
		this.anIntArray147[arg0] = this.aClass2_Sub10_1.anInt4807;
	}
}
