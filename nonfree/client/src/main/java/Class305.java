import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class305 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public int anInt8229;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	private int anInt8230;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
	private int[] anIntArray587;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
	private int[] anIntArray589;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!es;")
	private final Class2_Sub15 aClass2_Sub15_5 = new Class2_Sub15(null);

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class305() {
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "([B)V")
	public Class305(@OriginalArg(0) byte[] arg0) {
		this.method6823(arg0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
	public int method6811() {
		return this.anIntArray588.length;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "()I")
	public int method6812() {
		@Pc(3) int local3 = this.anIntArray588.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray588[local9] >= 0 && this.anIntArray586[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray586[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public void method6813(@OriginalArg(0) int arg0) {
		this.aClass2_Sub15_5.anInt5241 = this.anIntArray588[arg0];
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "()Z")
	public boolean method6814() {
		return this.aClass2_Sub15_5.aByteArray62 != null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
	private int method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static486.aByteArray81[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub15_5.method4325() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub15_5.method4325() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub15_5.method4325();
		local12 = this.aClass2_Sub15_5.method4315();
		if (local7 == 47) {
			this.aClass2_Sub15_5.anInt5241 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub15_5.method4341();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray586[arg0];
			this.aLong222 += (long) local38 * (long) (this.anInt8230 - local32);
			this.anInt8230 = local32;
			this.aClass2_Sub15_5.anInt5241 += local12;
			return 2;
		} else {
			this.aClass2_Sub15_5.anInt5241 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "()Z")
	public boolean method6817() {
		@Pc(3) int local3 = this.anIntArray588.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray588[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public void method6818(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub15_5.method4315();
		this.anIntArray586[arg0] += local4;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	public void method6819(@OriginalArg(0) int arg0) {
		this.anIntArray588[arg0] = this.aClass2_Sub15_5.anInt5241;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)I")
	private int method6820(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub15_5.aByteArray62[this.aClass2_Sub15_5.anInt5241];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray587[arg0] = local13;
			this.aClass2_Sub15_5.anInt5241++;
		} else {
			local13 = this.anIntArray587[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6815(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub15_5.method4315();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub15_5.aByteArray62[this.aClass2_Sub15_5.anInt5241] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub15_5.anInt5241++;
				this.anIntArray587[arg0] = local57;
				return this.method6815(arg0, local57);
			}
		}
		this.aClass2_Sub15_5.anInt5241 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "()V")
	public void method6821() {
		this.aClass2_Sub15_5.aByteArray62 = null;
		this.anIntArray589 = null;
		this.anIntArray588 = null;
		this.anIntArray586 = null;
		this.anIntArray587 = null;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)I")
	public int method6822(@OriginalArg(0) int arg0) {
		return this.method6820(arg0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([B)V")
	public void method6823(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub15_5.aByteArray62 = arg0;
		this.aClass2_Sub15_5.anInt5241 = 10;
		@Pc(12) int local12 = this.aClass2_Sub15_5.method4294();
		this.anInt8229 = this.aClass2_Sub15_5.method4294();
		this.anInt8230 = 500000;
		this.anIntArray589 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub15_5.method4307();
			@Pc(38) int local38 = this.aClass2_Sub15_5.method4307();
			if (local33 == 1297379947) {
				this.anIntArray589[local27] = this.aClass2_Sub15_5.anInt5241;
				local27++;
			}
			this.aClass2_Sub15_5.anInt5241 += local38;
		}
		this.aLong222 = 0L;
		this.anIntArray588 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray588[local33] = this.anIntArray589[local33];
		}
		this.anIntArray586 = new int[local12];
		this.anIntArray587 = new int[local12];
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(J)V")
	public void method6824(@OriginalArg(0) long arg0) {
		this.aLong222 = arg0;
		@Pc(6) int local6 = this.anIntArray588.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray586[local8] = 0;
			this.anIntArray587[local8] = 0;
			this.aClass2_Sub15_5.anInt5241 = this.anIntArray589[local8];
			this.method6818(local8);
			this.anIntArray588[local8] = this.aClass2_Sub15_5.anInt5241;
		}
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)J")
	public long method6825(@OriginalArg(0) int arg0) {
		return this.aLong222 + (long) arg0 * (long) this.anInt8230;
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "()V")
	public void method6826() {
		this.aClass2_Sub15_5.anInt5241 = -1;
	}
}
