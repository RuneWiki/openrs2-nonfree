import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class68 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	private int anInt2662;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public int anInt2663;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!qe;")
	private final Class5_Sub11 aClass5_Sub11_5 = new Class5_Sub11(null);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method1756(@OriginalArg(0) int arg0) {
		this.aClass5_Sub11_5.anInt2233 = this.anIntArray277[arg0];
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public void method1757(@OriginalArg(0) int arg0) {
		this.anIntArray277[arg0] = this.aClass5_Sub11_5.anInt2233;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public void method1758() {
		this.aClass5_Sub11_5.aByteArray23 = null;
		this.anIntArray276 = null;
		this.anIntArray277 = null;
		this.anIntArray275 = null;
		this.anIntArray274 = null;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()Z")
	public boolean method1759() {
		return this.aClass5_Sub11_5.aByteArray23 != null;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()Z")
	public boolean method1760() {
		@Pc(3) int local3 = this.anIntArray277.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray277[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()Z")
	public boolean method1761() {
		return this.aClass5_Sub11_5.anInt2233 < 0;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	private int method1762(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub11_5.aByteArray23[this.aClass5_Sub11_5.anInt2233];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray274[arg0] = local13;
			this.aClass5_Sub11_5.anInt2233++;
		} else {
			local13 = this.anIntArray274[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1772(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub11_5.method1508();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub11_5.aByteArray23[this.aClass5_Sub11_5.anInt2233] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub11_5.anInt2233++;
				this.anIntArray274[arg0] = local57;
				return this.method1772(arg0, local57);
			}
		}
		this.aClass5_Sub11_5.anInt2233 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()I")
	public int method1763() {
		@Pc(3) int local3 = this.anIntArray277.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray277[local9] >= 0 && this.anIntArray275[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray275[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public void method1764(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub11_5.method1508();
		this.anIntArray275[arg0] += local4;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)J")
	public long method1765(@OriginalArg(0) int arg0) {
		return this.aLong103 + (long) arg0 * (long) this.anInt2662;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([B)V")
	public void method1766(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub11_5.aByteArray23 = arg0;
		this.aClass5_Sub11_5.anInt2233 = 10;
		@Pc(12) int local12 = this.aClass5_Sub11_5.method1543();
		this.anInt2663 = this.aClass5_Sub11_5.method1543();
		this.anInt2662 = 500000;
		this.anIntArray276 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub11_5.method1540();
			@Pc(38) int local38 = this.aClass5_Sub11_5.method1540();
			if (local33 == 1297379947) {
				this.anIntArray276[local27] = this.aClass5_Sub11_5.anInt2233;
				local27++;
			}
			this.aClass5_Sub11_5.anInt2233 += local38;
		}
		this.anIntArray277 = new int[this.anIntArray276.length];
		for (local33 = 0; local33 < this.anIntArray277.length; local33++) {
			this.anIntArray277[local33] = this.anIntArray276[local33];
		}
		this.anIntArray275 = new int[local12];
		this.anIntArray274 = new int[local12];
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
	public void method1767() {
		this.aClass5_Sub11_5.anInt2233 = -1;
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "()I")
	public int method1768() {
		return this.anIntArray277.length;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(J)V")
	public void method1769(@OriginalArg(0) long arg0) {
		this.aLong103 = arg0;
		@Pc(6) int local6 = this.anIntArray277.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray275[local8] = 0;
			this.anIntArray274[local8] = 0;
			this.aClass5_Sub11_5.anInt2233 = this.anIntArray276[local8];
			this.method1764(local8);
			this.anIntArray277[local8] = this.aClass5_Sub11_5.anInt2233;
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)I")
	public int method1771(@OriginalArg(0) int arg0) {
		return this.method1762(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
	private int method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static113.aByteArray27[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub11_5.method1546() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub11_5.method1546() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub11_5.method1546();
		local12 = this.aClass5_Sub11_5.method1508();
		if (local7 == 47) {
			this.aClass5_Sub11_5.anInt2233 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub11_5.method1530();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray275[arg0];
			this.aLong103 += (long) local38 * (long) (this.anInt2662 - local32);
			this.anInt2662 = local32;
			this.aClass5_Sub11_5.anInt2233 += local12;
			return 2;
		} else {
			this.aClass5_Sub11_5.anInt2233 += local12;
			return 3;
		}
	}
}
