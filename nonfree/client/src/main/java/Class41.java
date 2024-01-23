import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class41 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt1262;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public int anInt1263;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!fh;")
	private Class1_Sub13 aClass1_Sub13_3 = new Class1_Sub13(null);

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class41() {
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
	public Class41(@OriginalArg(0) byte[] arg0) {
		this.method1064(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)J")
	public long method1054(@OriginalArg(0) int arg0) {
		return this.aLong49 + (long) arg0 * (long) this.anInt1262;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public void method1055(@OriginalArg(0) int arg0) {
		this.anIntArray99[arg0] = this.aClass1_Sub13_3.anInt2018;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()V")
	public void method1057() {
		this.aClass1_Sub13_3.aByteArray63 = null;
		this.anIntArray102 = null;
		this.anIntArray99 = null;
		this.anIntArray100 = null;
		this.anIntArray101 = null;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public void method1058(@OriginalArg(0) int arg0) {
		this.aClass1_Sub13_3.anInt2018 = this.anIntArray99[arg0];
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
	private int method1059(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub13_3.aByteArray63[this.aClass1_Sub13_3.anInt2018];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray101[arg0] = local13;
			this.aClass1_Sub13_3.anInt2018++;
		} else {
			local13 = this.anIntArray101[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1060(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub13_3.method1863();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub13_3.aByteArray63[this.aClass1_Sub13_3.anInt2018] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub13_3.anInt2018++;
				this.anIntArray101[arg0] = local57;
				return this.method1060(arg0, local57);
			}
		}
		this.aClass1_Sub13_3.anInt2018 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	private int method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static60.aByteArray43[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub13_3.method1853() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub13_3.method1853() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub13_3.method1853();
		local12 = this.aClass1_Sub13_3.method1863();
		if (local7 == 47) {
			this.aClass1_Sub13_3.anInt2018 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub13_3.method1878();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray100[arg0];
			this.aLong49 += (long) local38 * (long) (this.anInt1262 - local32);
			this.anInt1262 = local32;
			this.aClass1_Sub13_3.anInt2018 += local12;
			return 2;
		} else {
			this.aClass1_Sub13_3.anInt2018 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Z")
	public boolean method1061() {
		return this.aClass1_Sub13_3.aByteArray63 != null;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I")
	public int method1062(@OriginalArg(0) int arg0) {
		return this.method1059(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()V")
	public void method1063() {
		this.aClass1_Sub13_3.anInt2018 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V")
	public void method1064(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub13_3.aByteArray63 = arg0;
		this.aClass1_Sub13_3.anInt2018 = 10;
		@Pc(12) int local12 = this.aClass1_Sub13_3.method1879();
		this.anInt1263 = this.aClass1_Sub13_3.method1879();
		this.anInt1262 = 500000;
		this.anIntArray102 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub13_3.method1860();
			@Pc(40) int local40 = this.aClass1_Sub13_3.method1860();
			if (local35 == 1297379947) {
				this.anIntArray102[local27] = this.aClass1_Sub13_3.anInt2018;
				local27++;
			}
			this.aClass1_Sub13_3.anInt2018 += local40;
		}
		this.aLong49 = 0L;
		this.anIntArray99 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray99[local27] = this.anIntArray102[local27];
		}
		this.anIntArray100 = new int[local12];
		this.anIntArray101 = new int[local12];
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "()Z")
	public boolean method1065() {
		@Pc(3) int local3 = this.anIntArray99.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray99[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(J)V")
	public void method1066(@OriginalArg(0) long arg0) {
		this.aLong49 = arg0;
		@Pc(6) int local6 = this.anIntArray99.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray100[local8] = 0;
			this.anIntArray101[local8] = 0;
			this.aClass1_Sub13_3.anInt2018 = this.anIntArray102[local8];
			this.method1069(local8);
			this.anIntArray99[local8] = this.aClass1_Sub13_3.anInt2018;
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "()I")
	public int method1067() {
		return this.anIntArray99.length;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "()I")
	public int method1068() {
		@Pc(3) int local3 = this.anIntArray99.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray99[local9] >= 0 && this.anIntArray100[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray100[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	public void method1069(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub13_3.method1863();
		this.anIntArray100[arg0] += local4;
	}
}
