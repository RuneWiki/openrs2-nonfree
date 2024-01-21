import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class102 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt4004;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	private int anInt4005;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!ra;")
	private final Class2_Sub3 aClass2_Sub3_4 = new Class2_Sub3(null);

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class102() {
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
	public Class102(@OriginalArg(0) byte[] arg0) {
		this.method3064(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public void method3057(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_4.anInt340 = this.anIntArray398[arg0];
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()Z")
	public boolean method3058() {
		@Pc(3) int local3 = this.anIntArray398.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray398[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()I")
	public int method3059() {
		return this.anIntArray398.length;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	private int method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static202.aByteArray57[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub3_4.method260() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub3_4.method260() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub3_4.method260();
		local12 = this.aClass2_Sub3_4.method235();
		if (local7 == 47) {
			this.aClass2_Sub3_4.anInt340 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub3_4.method261();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray395[arg0];
			this.aLong139 += (long) local38 * (long) (this.anInt4005 - local32);
			this.anInt4005 = local32;
			this.aClass2_Sub3_4.anInt340 += local12;
			return 2;
		} else {
			this.aClass2_Sub3_4.anInt340 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)I")
	private int method3061(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub3_4.aByteArray2[this.aClass2_Sub3_4.anInt340];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray396[arg0] = local13;
			this.aClass2_Sub3_4.anInt340++;
		} else {
			local13 = this.anIntArray396[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3060(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub3_4.method235();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub3_4.aByteArray2[this.aClass2_Sub3_4.anInt340] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub3_4.anInt340++;
				this.anIntArray396[arg0] = local57;
				return this.method3060(arg0, local57);
			}
		}
		this.aClass2_Sub3_4.anInt340 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "()Z")
	public boolean method3062() {
		return this.aClass2_Sub3_4.aByteArray2 != null;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
	public int method3063(@OriginalArg(0) int arg0) {
		return this.method3061(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([B)V")
	public void method3064(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub3_4.aByteArray2 = arg0;
		this.aClass2_Sub3_4.anInt340 = 10;
		@Pc(12) int local12 = this.aClass2_Sub3_4.method269();
		this.anInt4004 = this.aClass2_Sub3_4.method269();
		this.anInt4005 = 500000;
		this.anIntArray397 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub3_4.method248();
			@Pc(38) int local38 = this.aClass2_Sub3_4.method248();
			if (local33 == 1297379947) {
				this.anIntArray397[local27] = this.aClass2_Sub3_4.anInt340;
				local27++;
			}
			this.aClass2_Sub3_4.anInt340 += local38;
		}
		this.aLong139 = 0L;
		this.anIntArray398 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray398[local33] = this.anIntArray397[local33];
		}
		this.anIntArray395 = new int[local12];
		this.anIntArray396 = new int[local12];
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "()I")
	public int method3065() {
		@Pc(3) int local3 = this.anIntArray398.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray398[local9] >= 0 && this.anIntArray395[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray395[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(J)V")
	public void method3066(@OriginalArg(0) long arg0) {
		this.aLong139 = arg0;
		@Pc(6) int local6 = this.anIntArray398.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray395[local8] = 0;
			this.anIntArray396[local8] = 0;
			this.aClass2_Sub3_4.anInt340 = this.anIntArray397[local8];
			this.method3068(local8);
			this.anIntArray398[local8] = this.aClass2_Sub3_4.anInt340;
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	public void method3067(@OriginalArg(0) int arg0) {
		this.anIntArray398[arg0] = this.aClass2_Sub3_4.anInt340;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public void method3068(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub3_4.method235();
		this.anIntArray395[arg0] += local4;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
	public void method3069() {
		this.aClass2_Sub3_4.aByteArray2 = null;
		this.anIntArray397 = null;
		this.anIntArray398 = null;
		this.anIntArray395 = null;
		this.anIntArray396 = null;
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "()V")
	public void method3070() {
		this.aClass2_Sub3_4.anInt340 = -1;
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)J")
	public long method3072(@OriginalArg(0) int arg0) {
		return this.aLong139 + (long) arg0 * (long) this.anInt4005;
	}
}
