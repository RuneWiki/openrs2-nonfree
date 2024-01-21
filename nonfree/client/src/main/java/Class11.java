import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class11 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!ff;")
	private final Class3_Sub12 aClass3_Sub12_2 = new Class3_Sub12(null);

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class11() {
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
	public Class11(@OriginalArg(0) byte[] arg0) {
		this.method316(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Z")
	public boolean method301() {
		@Pc(3) int local3 = this.anIntArray29.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray29[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	private int method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static18.aByteArray3[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub12_2.method1354() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub12_2.method1354() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub12_2.method1354();
		local12 = this.aClass3_Sub12_2.method1351();
		if (local7 == 47) {
			this.aClass3_Sub12_2.anInt1793 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub12_2.method1376();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray30[arg0];
			this.aLong29 += (long) local38 * (long) (this.anInt437 - local32);
			this.anInt437 = local32;
			this.aClass3_Sub12_2.anInt1793 += local12;
			return 2;
		} else {
			this.aClass3_Sub12_2.anInt1793 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public int method303() {
		@Pc(3) int local3 = this.anIntArray29.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray29[local9] >= 0 && this.anIntArray30[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray30[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
	public void method305() {
		this.aClass3_Sub12_2.anInt1793 = -1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public void method306(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub12_2.method1351();
		this.anIntArray30[arg0] += local4;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
	public int method307(@OriginalArg(0) int arg0) {
		return this.method310(arg0);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public void method308(@OriginalArg(0) int arg0) {
		this.anIntArray29[arg0] = this.aClass3_Sub12_2.anInt1793;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()I")
	public int method309() {
		return this.anIntArray29.length;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
	private int method310(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub12_2.aByteArray16[this.aClass3_Sub12_2.anInt1793];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray28[arg0] = local13;
			this.aClass3_Sub12_2.anInt1793++;
		} else {
			local13 = this.anIntArray28[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method302(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub12_2.method1351();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub12_2.aByteArray16[this.aClass3_Sub12_2.anInt1793] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub12_2.anInt1793++;
				this.anIntArray28[arg0] = local57;
				return this.method302(arg0, local57);
			}
		}
		this.aClass3_Sub12_2.anInt1793 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)J")
	public long method311(@OriginalArg(0) int arg0) {
		return this.aLong29 + (long) arg0 * (long) this.anInt437;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "()Z")
	public boolean method312() {
		return this.aClass3_Sub12_2.aByteArray16 != null;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public void method313(@OriginalArg(0) int arg0) {
		this.aClass3_Sub12_2.anInt1793 = this.anIntArray29[arg0];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(J)V")
	public void method314(@OriginalArg(0) long arg0) {
		this.aLong29 = arg0;
		@Pc(6) int local6 = this.anIntArray29.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray30[local8] = 0;
			this.anIntArray28[local8] = 0;
			this.aClass3_Sub12_2.anInt1793 = this.anIntArray31[local8];
			this.method306(local8);
			this.anIntArray29[local8] = this.aClass3_Sub12_2.anInt1793;
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "()V")
	public void method315() {
		this.aClass3_Sub12_2.aByteArray16 = null;
		this.anIntArray31 = null;
		this.anIntArray29 = null;
		this.anIntArray30 = null;
		this.anIntArray28 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([B)V")
	public void method316(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub12_2.aByteArray16 = arg0;
		this.aClass3_Sub12_2.anInt1793 = 10;
		@Pc(12) int local12 = this.aClass3_Sub12_2.method1359();
		this.anInt438 = this.aClass3_Sub12_2.method1359();
		this.anInt437 = 500000;
		this.anIntArray31 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub12_2.method1373();
			@Pc(38) int local38 = this.aClass3_Sub12_2.method1373();
			if (local33 == 1297379947) {
				this.anIntArray31[local27] = this.aClass3_Sub12_2.anInt1793;
				local27++;
			}
			this.aClass3_Sub12_2.anInt1793 += local38;
		}
		this.aLong29 = 0L;
		this.anIntArray29 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray29[local33] = this.anIntArray31[local33];
		}
		this.anIntArray30 = new int[local12];
		this.anIntArray28 = new int[local12];
	}
}
