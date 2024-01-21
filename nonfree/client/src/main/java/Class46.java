import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class46 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt1907;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt1908;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!va;")
	private final Class2_Sub11 aClass2_Sub11_4 = new Class2_Sub11(null);

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class46() {
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
	public Class46(@OriginalArg(0) byte[] arg0) {
		this.method1339(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	private int method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static84.aByteArray22[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub11_4.method1461() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub11_4.method1461() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub11_4.method1461();
		local12 = this.aClass2_Sub11_4.method1437();
		if (local7 == 47) {
			this.aClass2_Sub11_4.anInt2077 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub11_4.method1436();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray209[arg0];
			this.aLong64 += (long) local38 * (long) (this.anInt1908 - local32);
			this.anInt1908 = local32;
			this.aClass2_Sub11_4.anInt2077 += local12;
			return 2;
		} else {
			this.aClass2_Sub11_4.anInt2077 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Z")
	public boolean method1330() {
		return this.aClass2_Sub11_4.aByteArray24 != null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	public int method1331(@OriginalArg(0) int arg0) {
		return this.method1344(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	public void method1333() {
		this.aClass2_Sub11_4.aByteArray24 = null;
		this.anIntArray207 = null;
		this.anIntArray210 = null;
		this.anIntArray209 = null;
		this.anIntArray208 = null;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()Z")
	public boolean method1334() {
		@Pc(3) int local3 = this.anIntArray210.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray210[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "()I")
	public int method1335() {
		return this.anIntArray210.length;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(J)V")
	public void method1336(@OriginalArg(0) long arg0) {
		this.aLong64 = arg0;
		@Pc(6) int local6 = this.anIntArray210.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray209[local8] = 0;
			this.anIntArray208[local8] = 0;
			this.aClass2_Sub11_4.anInt2077 = this.anIntArray207[local8];
			this.method1343(local8);
			this.anIntArray210[local8] = this.aClass2_Sub11_4.anInt2077;
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)J")
	public long method1337(@OriginalArg(0) int arg0) {
		return this.aLong64 + (long) arg0 * (long) this.anInt1908;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "()V")
	public void method1338() {
		this.aClass2_Sub11_4.anInt2077 = -1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([B)V")
	public void method1339(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub11_4.aByteArray24 = arg0;
		this.aClass2_Sub11_4.anInt2077 = 10;
		@Pc(12) int local12 = this.aClass2_Sub11_4.method1456();
		this.anInt1907 = this.aClass2_Sub11_4.method1456();
		this.anInt1908 = 500000;
		this.anIntArray207 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub11_4.method1449();
			@Pc(38) int local38 = this.aClass2_Sub11_4.method1449();
			if (local33 == 1297379947) {
				this.anIntArray207[local27] = this.aClass2_Sub11_4.anInt2077;
				local27++;
			}
			this.aClass2_Sub11_4.anInt2077 += local38;
		}
		this.aLong64 = 0L;
		this.anIntArray210 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray210[local33] = this.anIntArray207[local33];
		}
		this.anIntArray209 = new int[local12];
		this.anIntArray208 = new int[local12];
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "()I")
	public int method1340() {
		@Pc(3) int local3 = this.anIntArray210.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray210[local9] >= 0 && this.anIntArray209[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray209[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public void method1341(@OriginalArg(0) int arg0) {
		this.anIntArray210[arg0] = this.aClass2_Sub11_4.anInt2077;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public void method1342(@OriginalArg(0) int arg0) {
		this.aClass2_Sub11_4.anInt2077 = this.anIntArray210[arg0];
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	public void method1343(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub11_4.method1437();
		this.anIntArray209[arg0] += local4;
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
	private int method1344(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub11_4.aByteArray24[this.aClass2_Sub11_4.anInt2077];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray208[arg0] = local13;
			this.aClass2_Sub11_4.anInt2077++;
		} else {
			local13 = this.anIntArray208[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1329(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub11_4.method1437();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub11_4.aByteArray24[this.aClass2_Sub11_4.anInt2077] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub11_4.anInt2077++;
				this.anIntArray208[arg0] = local57;
				return this.method1329(arg0, local57);
			}
		}
		this.aClass2_Sub11_4.anInt2077 += local42;
		return 0;
	}
}
