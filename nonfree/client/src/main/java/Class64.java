import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class64 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public int anInt2595;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	private int anInt2596;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!rc;")
	private final Class1_Sub5 aClass1_Sub5_11 = new Class1_Sub5(null);

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()Z")
	public boolean method1676() {
		return this.aClass1_Sub5_11.anInt1266 < 0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()Z")
	public boolean method1677() {
		@Pc(3) int local3 = this.anIntArray349.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray349[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method1678(@OriginalArg(0) int arg0) {
		this.aClass1_Sub5_11.anInt1266 = this.anIntArray349[arg0];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([B)V")
	public void method1679(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub5_11.aByteArray6 = arg0;
		this.aClass1_Sub5_11.anInt1266 = 10;
		@Pc(12) int local12 = this.aClass1_Sub5_11.method715();
		this.anInt2595 = this.aClass1_Sub5_11.method715();
		this.anInt2596 = 500000;
		this.anIntArray352 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub5_11.method692();
			@Pc(38) int local38 = this.aClass1_Sub5_11.method692();
			if (local33 == 1297379947) {
				this.anIntArray352[local27] = this.aClass1_Sub5_11.anInt1266;
				local27++;
			}
			this.aClass1_Sub5_11.anInt1266 += local38;
		}
		this.anIntArray349 = new int[this.anIntArray352.length];
		for (local33 = 0; local33 < this.anIntArray349.length; local33++) {
			this.anIntArray349[local33] = this.anIntArray352[local33];
		}
		this.anIntArray351 = new int[local12];
		this.anIntArray350 = new int[local12];
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
	public long method1680(@OriginalArg(0) int arg0) {
		return this.aLong77 + (long) arg0 * (long) this.anInt2596;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(J)V")
	public void method1681(@OriginalArg(0) long arg0) {
		this.aLong77 = arg0;
		@Pc(6) int local6 = this.anIntArray349.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray351[local8] = 0;
			this.anIntArray350[local8] = 0;
			this.aClass1_Sub5_11.anInt1266 = this.anIntArray352[local8];
			this.method1691(local8);
			this.anIntArray349[local8] = this.aClass1_Sub5_11.anInt1266;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
	public void method1682() {
		this.aClass1_Sub5_11.aByteArray6 = null;
		this.anIntArray352 = null;
		this.anIntArray349 = null;
		this.anIntArray351 = null;
		this.anIntArray350 = null;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()I")
	public int method1683() {
		return this.anIntArray349.length;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
	public void method1684() {
		this.aClass1_Sub5_11.anInt1266 = -1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	private int method1685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static101.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub5_11.method716() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub5_11.method716() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub5_11.method716();
		local12 = this.aClass1_Sub5_11.method714();
		if (local7 == 47) {
			this.aClass1_Sub5_11.anInt1266 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub5_11.method688();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray351[arg0];
			this.aLong77 += (long) local38 * (long) (this.anInt2596 - local32);
			this.anInt2596 = local32;
			this.aClass1_Sub5_11.anInt1266 += local12;
			return 2;
		} else {
			this.aClass1_Sub5_11.anInt1266 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
	private int method1686(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub5_11.aByteArray6[this.aClass1_Sub5_11.anInt1266];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray350[arg0] = local13;
			this.aClass1_Sub5_11.anInt1266++;
		} else {
			local13 = this.anIntArray350[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1685(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub5_11.method714();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub5_11.aByteArray6[this.aClass1_Sub5_11.anInt1266] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub5_11.anInt1266++;
				this.anIntArray350[arg0] = local57;
				return this.method1685(arg0, local57);
			}
		}
		this.aClass1_Sub5_11.anInt1266 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "()I")
	public int method1687() {
		@Pc(3) int local3 = this.anIntArray349.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray349[local9] >= 0 && this.anIntArray351[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray351[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public void method1688(@OriginalArg(0) int arg0) {
		this.anIntArray349[arg0] = this.aClass1_Sub5_11.anInt1266;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I")
	public int method1689(@OriginalArg(0) int arg0) {
		return this.method1686(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "()Z")
	public boolean method1690() {
		return this.aClass1_Sub5_11.aByteArray6 != null;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public void method1691(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub5_11.method714();
		this.anIntArray351[arg0] += local4;
	}
}
