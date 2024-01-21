import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class81 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public int anInt3631;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	private int anInt3632;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!rd;")
	private final Class3_Sub4 aClass3_Sub4_5 = new Class3_Sub4(null);

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class81() {
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([B)V")
	public Class81(@OriginalArg(0) byte[] arg0) {
		this.method2628(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method2613(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub4_5.method169();
		this.anIntArray410[arg0] += local4;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
	private int method2614(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub4_5.aByteArray5[this.aClass3_Sub4_5.anInt232];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray413[arg0] = local13;
			this.aClass3_Sub4_5.anInt232++;
		} else {
			local13 = this.anIntArray413[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2625(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub4_5.method169();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub4_5.aByteArray5[this.aClass3_Sub4_5.anInt232] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub4_5.anInt232++;
				this.anIntArray413[arg0] = local57;
				return this.method2625(arg0, local57);
			}
		}
		this.aClass3_Sub4_5.anInt232 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()I")
	public int method2615() {
		@Pc(3) int local3 = this.anIntArray412.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray412[local9] >= 0 && this.anIntArray410[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray410[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(J)V")
	public void method2616(@OriginalArg(0) long arg0) {
		this.aLong129 = arg0;
		@Pc(6) int local6 = this.anIntArray412.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray410[local8] = 0;
			this.anIntArray413[local8] = 0;
			this.aClass3_Sub4_5.anInt232 = this.anIntArray411[local8];
			this.method2613(local8);
			this.anIntArray412[local8] = this.aClass3_Sub4_5.anInt232;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "()V")
	public void method2617() {
		this.aClass3_Sub4_5.anInt232 = -1;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "()V")
	public void method2618() {
		this.aClass3_Sub4_5.aByteArray5 = null;
		this.anIntArray411 = null;
		this.anIntArray412 = null;
		this.anIntArray410 = null;
		this.anIntArray413 = null;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public void method2619(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4_5.anInt232 = this.anIntArray412[arg0];
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "()Z")
	public boolean method2620() {
		@Pc(3) int local3 = this.anIntArray412.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray412[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "()I")
	public int method2621() {
		return this.anIntArray412.length;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
	public int method2623(@OriginalArg(0) int arg0) {
		return this.method2614(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)J")
	public long method2624(@OriginalArg(0) int arg0) {
		return this.aLong129 + (long) arg0 * (long) this.anInt3632;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
	private int method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static164.aByteArray47[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub4_5.method191() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub4_5.method191() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub4_5.method191();
		local12 = this.aClass3_Sub4_5.method169();
		if (local7 == 47) {
			this.aClass3_Sub4_5.anInt232 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub4_5.method197();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray410[arg0];
			this.aLong129 += (long) local38 * (long) (this.anInt3632 - local32);
			this.anInt3632 = local32;
			this.aClass3_Sub4_5.anInt232 += local12;
			return 2;
		} else {
			this.aClass3_Sub4_5.anInt232 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
	public void method2626(@OriginalArg(0) int arg0) {
		this.anIntArray412[arg0] = this.aClass3_Sub4_5.anInt232;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "()Z")
	public boolean method2627() {
		return this.aClass3_Sub4_5.aByteArray5 != null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([B)V")
	public void method2628(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub4_5.aByteArray5 = arg0;
		this.aClass3_Sub4_5.anInt232 = 10;
		@Pc(12) int local12 = this.aClass3_Sub4_5.method208();
		this.anInt3631 = this.aClass3_Sub4_5.method208();
		this.anInt3632 = 500000;
		this.anIntArray411 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub4_5.method213();
			@Pc(38) int local38 = this.aClass3_Sub4_5.method213();
			if (local33 == 1297379947) {
				this.anIntArray411[local27] = this.aClass3_Sub4_5.anInt232;
				local27++;
			}
			this.aClass3_Sub4_5.anInt232 += local38;
		}
		this.aLong129 = 0L;
		this.anIntArray412 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray412[local33] = this.anIntArray411[local33];
		}
		this.anIntArray410 = new int[local12];
		this.anIntArray413 = new int[local12];
	}
}
