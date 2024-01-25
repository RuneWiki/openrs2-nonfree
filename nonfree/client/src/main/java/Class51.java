import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class51 {

	@OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public int anInt1412;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	private int anInt1413;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!fb;")
	private final Class3_Sub4 aClass3_Sub4_1 = new Class3_Sub4(null);

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class51() {
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
	public Class51(@OriginalArg(0) byte[] arg0) {
		this.method1099(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
	private int method1095(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub4_1.aByteArray70[this.aClass3_Sub4_1.anInt4268];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray89[arg0] = local13;
			this.aClass3_Sub4_1.anInt4268++;
		} else {
			local13 = this.anIntArray89[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1107(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub4_1.method3669();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub4_1.aByteArray70[this.aClass3_Sub4_1.anInt4268] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub4_1.anInt4268++;
				this.anIntArray89[arg0] = local57;
				return this.method1107(arg0, local57);
			}
		}
		this.aClass3_Sub4_1.anInt4268 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
	public int method1096() {
		return this.anIntArray91.length;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
	public boolean method1097() {
		return this.aClass3_Sub4_1.aByteArray70 != null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(J)V")
	public void method1098(@OriginalArg(0) long arg0) {
		this.aLong59 = arg0;
		@Pc(6) int local6 = this.anIntArray91.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray92[local8] = 0;
			this.anIntArray89[local8] = 0;
			this.aClass3_Sub4_1.anInt4268 = this.anIntArray90[local8];
			this.method1104(local8);
			this.anIntArray91[local8] = this.aClass3_Sub4_1.anInt4268;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([B)V")
	public void method1099(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub4_1.aByteArray70 = arg0;
		this.aClass3_Sub4_1.anInt4268 = 10;
		@Pc(12) int local12 = this.aClass3_Sub4_1.method3649();
		this.anInt1412 = this.aClass3_Sub4_1.method3649();
		this.anInt1413 = 500000;
		this.anIntArray90 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub4_1.method3642();
			@Pc(38) int local38 = this.aClass3_Sub4_1.method3642();
			if (local33 == 1297379947) {
				this.anIntArray90[local27] = this.aClass3_Sub4_1.anInt4268;
				local27++;
			}
			this.aClass3_Sub4_1.anInt4268 += local38;
		}
		this.aLong59 = 0L;
		this.anIntArray91 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray91[local33] = this.anIntArray90[local33];
		}
		this.anIntArray92 = new int[local12];
		this.anIntArray89 = new int[local12];
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public void method1100(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4_1.anInt4268 = this.anIntArray91[arg0];
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
	public int method1101(@OriginalArg(0) int arg0) {
		return this.method1095(arg0);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()Z")
	public boolean method1102() {
		@Pc(3) int local3 = this.anIntArray91.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray91[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	public void method1103() {
		this.aClass3_Sub4_1.anInt4268 = -1;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public void method1104(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub4_1.method3669();
		this.anIntArray92[arg0] += local4;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "()V")
	public void method1105() {
		this.aClass3_Sub4_1.aByteArray70 = null;
		this.anIntArray90 = null;
		this.anIntArray91 = null;
		this.anIntArray92 = null;
		this.anIntArray89 = null;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public void method1106(@OriginalArg(0) int arg0) {
		this.anIntArray91[arg0] = this.aClass3_Sub4_1.anInt4268;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	private int method1107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static70.aByteArray28[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub4_1.method3643() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub4_1.method3643() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub4_1.method3643();
		local12 = this.aClass3_Sub4_1.method3669();
		if (local7 == 47) {
			this.aClass3_Sub4_1.anInt4268 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub4_1.method3659();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray92[arg0];
			this.aLong59 += (long) local38 * (long) (this.anInt1413 - local32);
			this.anInt1413 = local32;
			this.aClass3_Sub4_1.anInt4268 += local12;
			return 2;
		} else {
			this.aClass3_Sub4_1.anInt4268 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)J")
	public long method1108(@OriginalArg(0) int arg0) {
		return this.aLong59 + (long) arg0 * (long) this.anInt1413;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "()I")
	public int method1109() {
		@Pc(3) int local3 = this.anIntArray91.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray91[local9] >= 0 && this.anIntArray92[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray92[local9];
			}
		}
		return local5;
	}
}
