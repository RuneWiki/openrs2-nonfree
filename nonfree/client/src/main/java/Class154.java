import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class154 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public int anInt4386;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
	private int anInt4387;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!vt;")
	private final Class2_Sub24 aClass2_Sub24_2 = new Class2_Sub24(null);

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class154() {
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V")
	public Class154(@OriginalArg(0) byte[] arg0) {
		this.method3869(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "()I")
	public int method3859() {
		@Pc(3) int local3 = this.anIntArray317.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray317[local9] >= 0 && this.anIntArray316[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray316[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public void method3860(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub24_2.method5769();
		this.anIntArray316[arg0] += local4;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
	private int method3861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static216.aByteArray59[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub24_2.method5732() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub24_2.method5732() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub24_2.method5732();
		local12 = this.aClass2_Sub24_2.method5769();
		if (local7 == 47) {
			this.aClass2_Sub24_2.anInt6669 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub24_2.method5736();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray316[arg0];
			this.aLong130 += (long) local38 * (long) (this.anInt4387 - local32);
			this.anInt4387 = local32;
			this.aClass2_Sub24_2.anInt6669 += local12;
			return 2;
		} else {
			this.aClass2_Sub24_2.anInt6669 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(J)V")
	public void method3862(@OriginalArg(0) long arg0) {
		this.aLong130 = arg0;
		@Pc(6) int local6 = this.anIntArray317.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray316[local8] = 0;
			this.anIntArray319[local8] = 0;
			this.aClass2_Sub24_2.anInt6669 = this.anIntArray318[local8];
			this.method3860(local8);
			this.anIntArray317[local8] = this.aClass2_Sub24_2.anInt6669;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "()V")
	public void method3863() {
		this.aClass2_Sub24_2.aByteArray100 = null;
		this.anIntArray318 = null;
		this.anIntArray317 = null;
		this.anIntArray316 = null;
		this.anIntArray319 = null;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "()I")
	public int method3864() {
		return this.anIntArray317.length;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I")
	public int method3865(@OriginalArg(0) int arg0) {
		return this.method3866(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	private int method3866(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub24_2.aByteArray100[this.aClass2_Sub24_2.anInt6669];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray319[arg0] = local13;
			this.aClass2_Sub24_2.anInt6669++;
		} else {
			local13 = this.anIntArray319[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3861(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub24_2.method5769();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub24_2.aByteArray100[this.aClass2_Sub24_2.anInt6669] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub24_2.anInt6669++;
				this.anIntArray319[arg0] = local57;
				return this.method3861(arg0, local57);
			}
		}
		this.aClass2_Sub24_2.anInt6669 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
	public void method3867(@OriginalArg(0) int arg0) {
		this.aClass2_Sub24_2.anInt6669 = this.anIntArray317[arg0];
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)V")
	public void method3868(@OriginalArg(0) int arg0) {
		this.anIntArray317[arg0] = this.aClass2_Sub24_2.anInt6669;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([B)V")
	public void method3869(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub24_2.aByteArray100 = arg0;
		this.aClass2_Sub24_2.anInt6669 = 10;
		@Pc(12) int local12 = this.aClass2_Sub24_2.method5753();
		this.anInt4386 = this.aClass2_Sub24_2.method5753();
		this.anInt4387 = 500000;
		this.anIntArray318 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub24_2.method5776();
			@Pc(38) int local38 = this.aClass2_Sub24_2.method5776();
			if (local33 == 1297379947) {
				this.anIntArray318[local27] = this.aClass2_Sub24_2.anInt6669;
				local27++;
			}
			this.aClass2_Sub24_2.anInt6669 += local38;
		}
		this.aLong130 = 0L;
		this.anIntArray317 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray317[local33] = this.anIntArray318[local33];
		}
		this.anIntArray316 = new int[local12];
		this.anIntArray319 = new int[local12];
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "()Z")
	public boolean method3870() {
		@Pc(3) int local3 = this.anIntArray317.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray317[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "()Z")
	public boolean method3871() {
		return this.aClass2_Sub24_2.aByteArray100 != null;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "()V")
	public void method3873() {
		this.aClass2_Sub24_2.anInt6669 = -1;
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)J")
	public long method3874(@OriginalArg(0) int arg0) {
		return this.aLong130 + (long) arg0 * (long) this.anInt4387;
	}
}
