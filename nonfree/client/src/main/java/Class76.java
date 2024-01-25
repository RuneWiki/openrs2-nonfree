import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class76 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
	public int anInt2129;

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
	private int anInt2130;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "Lclient!fca;")
	private final Class3_Sub17 aClass3_Sub17_2 = new Class3_Sub17((byte[]) null);

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "([B)V")
	public Class76(@OriginalArg(0) byte[] arg0) {
		this.method1971(arg0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	public void method1970(@OriginalArg(0) int arg0) {
		this.aClass3_Sub17_2.lb = this.anIntArray145[arg0];
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([B)V")
	public void method1971(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub17_2.aByteArray59 = arg0;
		this.aClass3_Sub17_2.lb = 10;
		@Pc(12) int local12 = this.aClass3_Sub17_2.method4858();
		this.anInt2129 = this.aClass3_Sub17_2.method4858();
		this.anInt2130 = 500000;
		this.anIntArray144 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub17_2.method4868();
			@Pc(38) int local38 = this.aClass3_Sub17_2.method4868();
			if (local33 == 1297379947) {
				this.anIntArray144[local27] = this.aClass3_Sub17_2.lb;
				local27++;
			}
			this.aClass3_Sub17_2.lb += local38;
		}
		this.aLong60 = 0L;
		this.anIntArray145 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray145[local33] = this.anIntArray144[local33];
		}
		this.anIntArray143 = new int[local12];
		this.anIntArray146 = new int[local12];
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I")
	public int method1972(@OriginalArg(0) int arg0) {
		return this.method1982(arg0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)I")
	private int method1973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static100.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub17_2.method4888() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub17_2.method4888() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub17_2.method4888();
		local12 = this.aClass3_Sub17_2.method4859();
		if (local7 == 47) {
			this.aClass3_Sub17_2.lb += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub17_2.method4862();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray143[arg0];
			this.aLong60 += (long) local38 * (long) (this.anInt2130 - local32);
			this.anInt2130 = local32;
			this.aClass3_Sub17_2.lb += local12;
			return 2;
		} else {
			this.aClass3_Sub17_2.lb += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "()V")
	public void method1974() {
		this.aClass3_Sub17_2.lb = -1;
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)J")
	public long method1975(@OriginalArg(0) int arg0) {
		return this.aLong60 + (long) arg0 * (long) this.anInt2130;
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "()Z")
	public boolean method1976() {
		return this.aClass3_Sub17_2.aByteArray59 != null;
	}

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)V")
	public void method1977(@OriginalArg(0) int arg0) {
		this.anIntArray145[arg0] = this.aClass3_Sub17_2.lb;
	}

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "()I")
	public int method1978() {
		return this.anIntArray145.length;
	}

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "()V")
	public void method1979() {
		this.aClass3_Sub17_2.aByteArray59 = null;
		this.anIntArray144 = null;
		this.anIntArray145 = null;
		this.anIntArray143 = null;
		this.anIntArray146 = null;
	}

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "()I")
	public int method1980() {
		@Pc(3) int local3 = this.anIntArray145.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray145[local9] >= 0 && this.anIntArray143[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray143[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "()Z")
	public boolean method1981() {
		@Pc(3) int local3 = this.anIntArray145.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray145[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "(I)I")
	private int method1982(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub17_2.aByteArray59[this.aClass3_Sub17_2.lb];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray146[arg0] = local13;
			this.aClass3_Sub17_2.lb++;
		} else {
			local13 = this.anIntArray146[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1973(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub17_2.method4859();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub17_2.aByteArray59[this.aClass3_Sub17_2.lb] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub17_2.lb++;
				this.anIntArray146[arg0] = local57;
				return this.method1973(arg0, local57);
			}
		}
		this.aClass3_Sub17_2.lb += local42;
		return 0;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(J)V")
	public void method1983(@OriginalArg(0) long arg0) {
		this.aLong60 = arg0;
		@Pc(6) int local6 = this.anIntArray145.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray143[local8] = 0;
			this.anIntArray146[local8] = 0;
			this.aClass3_Sub17_2.lb = this.anIntArray144[local8];
			this.method1984(local8);
			this.anIntArray145[local8] = this.aClass3_Sub17_2.lb;
		}
	}

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "(I)V")
	public void method1984(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub17_2.method4859();
		this.anIntArray143[arg0] += local4;
	}
}
