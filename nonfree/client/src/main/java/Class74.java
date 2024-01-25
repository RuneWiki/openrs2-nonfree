import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class74 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public int anInt1916;

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
	private int anInt1917;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!rp;")
	private final Class3_Sub5 aClass3_Sub5_4 = new Class3_Sub5(null);

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class74() {
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "([B)V")
	public Class74(@OriginalArg(0) byte[] arg0) {
		this.method1559(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "()Z")
	public boolean method1551() {
		@Pc(3) int local3 = this.anIntArray191.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray191[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public void method1552(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub5_4.method2730();
		this.anIntArray190[arg0] += local4;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)J")
	public long method1553(@OriginalArg(0) int arg0) {
		return this.aLong67 + (long) arg0 * (long) this.anInt1917;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "()Z")
	public boolean method1554() {
		return this.aClass3_Sub5_4.aByteArray42 != null;
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
	public void method1555(@OriginalArg(0) int arg0) {
		this.aClass3_Sub5_4.anInt3121 = this.anIntArray191[arg0];
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(J)V")
	public void method1557(@OriginalArg(0) long arg0) {
		this.aLong67 = arg0;
		@Pc(6) int local6 = this.anIntArray191.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray190[local8] = 0;
			this.anIntArray188[local8] = 0;
			this.aClass3_Sub5_4.anInt3121 = this.anIntArray189[local8];
			this.method1552(local8);
			this.anIntArray191[local8] = this.aClass3_Sub5_4.anInt3121;
		}
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(I)I")
	private int method1558(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub5_4.aByteArray42[this.aClass3_Sub5_4.anInt3121];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray188[arg0] = local13;
			this.aClass3_Sub5_4.anInt3121++;
		} else {
			local13 = this.anIntArray188[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1565(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub5_4.method2730();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub5_4.aByteArray42[this.aClass3_Sub5_4.anInt3121] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub5_4.anInt3121++;
				this.anIntArray188[arg0] = local57;
				return this.method1565(arg0, local57);
			}
		}
		this.aClass3_Sub5_4.anInt3121 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([B)V")
	public void method1559(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub5_4.aByteArray42 = arg0;
		this.aClass3_Sub5_4.anInt3121 = 10;
		@Pc(12) int local12 = this.aClass3_Sub5_4.method2767();
		this.anInt1916 = this.aClass3_Sub5_4.method2767();
		this.anInt1917 = 500000;
		this.anIntArray189 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub5_4.method2726();
			@Pc(38) int local38 = this.aClass3_Sub5_4.method2726();
			if (local33 == 1297379947) {
				this.anIntArray189[local27] = this.aClass3_Sub5_4.anInt3121;
				local27++;
			}
			this.aClass3_Sub5_4.anInt3121 += local38;
		}
		this.aLong67 = 0L;
		this.anIntArray191 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray191[local33] = this.anIntArray189[local33];
		}
		this.anIntArray190 = new int[local12];
		this.anIntArray188 = new int[local12];
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "()I")
	public int method1560() {
		return this.anIntArray191.length;
	}

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "()V")
	public void method1561() {
		this.aClass3_Sub5_4.aByteArray42 = null;
		this.anIntArray189 = null;
		this.anIntArray191 = null;
		this.anIntArray190 = null;
		this.anIntArray188 = null;
	}

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)I")
	public int method1562(@OriginalArg(0) int arg0) {
		return this.method1558(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "()V")
	public void method1563() {
		this.aClass3_Sub5_4.anInt3121 = -1;
	}

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "()I")
	public int method1564() {
		@Pc(3) int local3 = this.anIntArray191.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray191[local9] >= 0 && this.anIntArray190[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray190[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
	private int method1565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static94.aByteArray33[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub5_4.method2739() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub5_4.method2739() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub5_4.method2739();
		local12 = this.aClass3_Sub5_4.method2730();
		if (local7 == 47) {
			this.aClass3_Sub5_4.anInt3121 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub5_4.method2786();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray190[arg0];
			this.aLong67 += (long) local38 * (long) (this.anInt1917 - local32);
			this.anInt1917 = local32;
			this.aClass3_Sub5_4.anInt3121 += local12;
			return 2;
		} else {
			this.aClass3_Sub5_4.anInt3121 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V")
	public void method1566(@OriginalArg(0) int arg0) {
		this.anIntArray191[arg0] = this.aClass3_Sub5_4.anInt3121;
	}
}
