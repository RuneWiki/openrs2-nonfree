import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class16 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "Lclient!rba;")
	private final Class3_Sub28 aClass3_Sub28_1 = new Class3_Sub28((byte[]) null);

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class16() {
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([B)V")
	public Class16(@OriginalArg(0) byte[] arg0) {
		this.method385(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "()Z")
	public boolean method377() {
		@Pc(3) int local3 = this.anIntArray14.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray14[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "()Z")
	public boolean method378() {
		return this.aClass3_Sub28_1.aByteArray50 != null;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "()I")
	public int method379() {
		return this.anIntArray14.length;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)J")
	public long method380(@OriginalArg(0) int arg0) {
		return this.aLong25 + (long) arg0 * (long) this.anInt418;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
	public int method381(@OriginalArg(0) int arg0) {
		return this.method382(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
	private int method382(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub28_1.aByteArray50[this.aClass3_Sub28_1.anInt6241];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray16[arg0] = local13;
			this.aClass3_Sub28_1.anInt6241++;
		} else {
			local13 = this.anIntArray16[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method383(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub28_1.method5276();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub28_1.aByteArray50[this.aClass3_Sub28_1.anInt6241] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub28_1.anInt6241++;
				this.anIntArray16[arg0] = local57;
				return this.method383(arg0, local57);
			}
		}
		this.aClass3_Sub28_1.anInt6241 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I")
	private int method383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static26.aByteArray4[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub28_1.method5322(-61) << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub28_1.method5322(-34) << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub28_1.method5322(-85);
		local12 = this.aClass3_Sub28_1.method5276();
		if (local7 == 47) {
			this.aClass3_Sub28_1.anInt6241 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub28_1.method5307();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray15[arg0];
			this.aLong25 += (long) local38 * (long) (this.anInt418 - local32);
			this.anInt418 = local32;
			this.aClass3_Sub28_1.anInt6241 += local12;
			return 2;
		} else {
			this.aClass3_Sub28_1.anInt6241 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "()V")
	public void method384() {
		this.aClass3_Sub28_1.anInt6241 = -1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([B)V")
	public void method385(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub28_1.aByteArray50 = arg0;
		this.aClass3_Sub28_1.anInt6241 = 10;
		@Pc(12) int local12 = this.aClass3_Sub28_1.method5272();
		this.anInt417 = this.aClass3_Sub28_1.method5272();
		this.anInt418 = 500000;
		this.anIntArray17 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub28_1.method5312();
			@Pc(38) int local38 = this.aClass3_Sub28_1.method5312();
			if (local33 == 1297379947) {
				this.anIntArray17[local27] = this.aClass3_Sub28_1.anInt6241;
				local27++;
			}
			this.aClass3_Sub28_1.anInt6241 += local38;
		}
		this.aLong25 = 0L;
		this.anIntArray14 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray14[local33] = this.anIntArray17[local33];
		}
		this.anIntArray15 = new int[local12];
		this.anIntArray16 = new int[local12];
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)V")
	public void method386(@OriginalArg(0) int arg0) {
		this.aClass3_Sub28_1.anInt6241 = this.anIntArray14[arg0];
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "()V")
	public void method387() {
		this.aClass3_Sub28_1.aByteArray50 = null;
		this.anIntArray17 = null;
		this.anIntArray14 = null;
		this.anIntArray15 = null;
		this.anIntArray16 = null;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)V")
	public void method388(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub28_1.method5276();
		this.anIntArray15[arg0] += local4;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(J)V")
	public void method389(@OriginalArg(0) long arg0) {
		this.aLong25 = arg0;
		@Pc(6) int local6 = this.anIntArray14.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray15[local8] = 0;
			this.anIntArray16[local8] = 0;
			this.aClass3_Sub28_1.anInt6241 = this.anIntArray17[local8];
			this.method388(local8);
			this.anIntArray14[local8] = this.aClass3_Sub28_1.anInt6241;
		}
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "()I")
	public int method390() {
		@Pc(3) int local3 = this.anIntArray14.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray14[local9] >= 0 && this.anIntArray15[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray15[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(I)V")
	public void method392(@OriginalArg(0) int arg0) {
		this.anIntArray14[arg0] = this.aClass3_Sub28_1.anInt6241;
	}
}
