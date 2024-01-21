import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class22 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
	public int[] anIntArray136;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!hb;")
	private final Class5_Sub9 aClass5_Sub9_1 = new Class5_Sub9(null);

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class22() {
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
	public Class22(@OriginalArg(0) byte[] arg0) {
		this.method583(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
	public void method571() {
		this.aClass5_Sub9_1.anInt2140 = -1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public void method572(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub9_1.method1406();
		this.anIntArray136[arg0] += local4;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)J")
	public long method573(@OriginalArg(0) int arg0) {
		return this.aLong48 + (long) arg0 * (long) this.anInt806;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
	private int method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static26.aByteArray19[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub9_1.method1408() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub9_1.method1408() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub9_1.method1408();
		local12 = this.aClass5_Sub9_1.method1406();
		if (local7 == 47) {
			this.aClass5_Sub9_1.anInt2140 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub9_1.method1409();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray136[arg0];
			this.aLong48 += (long) local38 * (long) (this.anInt806 - local32);
			this.anInt806 = local32;
			this.aClass5_Sub9_1.anInt2140 += local12;
			return 2;
		} else {
			this.aClass5_Sub9_1.anInt2140 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
	public void method575() {
		this.aClass5_Sub9_1.aByteArray28 = null;
		this.anIntArray135 = null;
		this.anIntArray137 = null;
		this.anIntArray136 = null;
		this.anIntArray134 = null;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public void method576(@OriginalArg(0) int arg0) {
		this.anIntArray137[arg0] = this.aClass5_Sub9_1.anInt2140;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()Z")
	public boolean method577() {
		return this.aClass5_Sub9_1.aByteArray28 != null;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I")
	public int method578(@OriginalArg(0) int arg0) {
		return this.method579(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
	private int method579(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub9_1.aByteArray28[this.aClass5_Sub9_1.anInt2140];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray134[arg0] = local13;
			this.aClass5_Sub9_1.anInt2140++;
		} else {
			local13 = this.anIntArray134[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method574(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub9_1.method1406();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub9_1.aByteArray28[this.aClass5_Sub9_1.anInt2140] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub9_1.anInt2140++;
				this.anIntArray134[arg0] = local57;
				return this.method574(arg0, local57);
			}
		}
		this.aClass5_Sub9_1.anInt2140 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(J)V")
	public void method580(@OriginalArg(0) long arg0) {
		this.aLong48 = arg0;
		@Pc(6) int local6 = this.anIntArray137.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray136[local8] = 0;
			this.anIntArray134[local8] = 0;
			this.aClass5_Sub9_1.anInt2140 = this.anIntArray135[local8];
			this.method572(local8);
			this.anIntArray137[local8] = this.aClass5_Sub9_1.anInt2140;
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()I")
	public int method581() {
		@Pc(3) int local3 = this.anIntArray137.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray137[local9] >= 0 && this.anIntArray136[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray136[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public void method582(@OriginalArg(0) int arg0) {
		this.aClass5_Sub9_1.anInt2140 = this.anIntArray137[arg0];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([B)V")
	public void method583(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub9_1.aByteArray28 = arg0;
		this.aClass5_Sub9_1.anInt2140 = 10;
		@Pc(12) int local12 = this.aClass5_Sub9_1.method1418();
		this.anInt805 = this.aClass5_Sub9_1.method1418();
		this.anInt806 = 500000;
		this.anIntArray135 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub9_1.method1434();
			@Pc(38) int local38 = this.aClass5_Sub9_1.method1434();
			if (local33 == 1297379947) {
				this.anIntArray135[local27] = this.aClass5_Sub9_1.anInt2140;
				local27++;
			}
			this.aClass5_Sub9_1.anInt2140 += local38;
		}
		this.aLong48 = 0L;
		this.anIntArray137 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray137[local33] = this.anIntArray135[local33];
		}
		this.anIntArray136 = new int[local12];
		this.anIntArray134 = new int[local12];
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "()I")
	public int method584() {
		return this.anIntArray137.length;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "()Z")
	public boolean method585() {
		@Pc(3) int local3 = this.anIntArray137.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray137[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
