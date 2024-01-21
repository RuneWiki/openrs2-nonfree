import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class40 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	private int anInt1390;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public int anInt1391;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!ic;")
	private final Class2_Sub10 aClass2_Sub10_35 = new Class2_Sub10(null);

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class40() {
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class40(@OriginalArg(0) byte[] arg0) {
		this.method972(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	private int method967(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub10_35.aByteArray27[this.aClass2_Sub10_35.anInt2187];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray167[arg0] = local13;
			this.aClass2_Sub10_35.anInt2187++;
		} else {
			local13 = this.anIntArray167[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method968(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub10_35.method1528();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub10_35.aByteArray27[this.aClass2_Sub10_35.anInt2187] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub10_35.anInt2187++;
				this.anIntArray167[arg0] = local57;
				return this.method968(arg0, local57);
			}
		}
		this.aClass2_Sub10_35.anInt2187 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	private int method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static60.aByteArray10[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub10_35.method1514() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub10_35.method1514() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub10_35.method1514();
		local12 = this.aClass2_Sub10_35.method1528();
		if (local7 == 47) {
			this.aClass2_Sub10_35.anInt2187 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub10_35.method1489();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray169[arg0];
			this.aLong56 += (long) local38 * (long) (this.anInt1390 - local32);
			this.anInt1390 = local32;
			this.aClass2_Sub10_35.anInt2187 += local12;
			return 2;
		} else {
			this.aClass2_Sub10_35.anInt2187 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()Z")
	public boolean method969() {
		@Pc(3) int local3 = this.anIntArray168.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray168[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public void method970(@OriginalArg(0) int arg0) {
		this.aClass2_Sub10_35.anInt2187 = this.anIntArray168[arg0];
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)I")
	public int method971(@OriginalArg(0) int arg0) {
		return this.method967(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([B)V")
	public void method972(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub10_35.aByteArray27 = arg0;
		this.aClass2_Sub10_35.anInt2187 = 10;
		@Pc(12) int local12 = this.aClass2_Sub10_35.method1517();
		this.anInt1391 = this.aClass2_Sub10_35.method1517();
		this.anInt1390 = 500000;
		this.anIntArray170 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub10_35.method1532();
			@Pc(38) int local38 = this.aClass2_Sub10_35.method1532();
			if (local33 == 1297379947) {
				this.anIntArray170[local27] = this.aClass2_Sub10_35.anInt2187;
				local27++;
			}
			this.aClass2_Sub10_35.anInt2187 += local38;
		}
		this.aLong56 = 0L;
		this.anIntArray168 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray168[local33] = this.anIntArray170[local33];
		}
		this.anIntArray169 = new int[local12];
		this.anIntArray167 = new int[local12];
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public void method973(@OriginalArg(0) int arg0) {
		this.anIntArray168[arg0] = this.aClass2_Sub10_35.anInt2187;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()Z")
	public boolean method974() {
		return this.aClass2_Sub10_35.aByteArray27 != null;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	public void method975(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub10_35.method1528();
		this.anIntArray169[arg0] += local4;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()I")
	public int method976() {
		return this.anIntArray168.length;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()V")
	public void method977() {
		this.aClass2_Sub10_35.aByteArray27 = null;
		this.anIntArray170 = null;
		this.anIntArray168 = null;
		this.anIntArray169 = null;
		this.anIntArray167 = null;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "()I")
	public int method979() {
		@Pc(3) int local3 = this.anIntArray168.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray168[local9] >= 0 && this.anIntArray169[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray169[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "()V")
	public void method980() {
		this.aClass2_Sub10_35.anInt2187 = -1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(J)V")
	public void method981(@OriginalArg(0) long arg0) {
		this.aLong56 = arg0;
		@Pc(6) int local6 = this.anIntArray168.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray169[local8] = 0;
			this.anIntArray167[local8] = 0;
			this.aClass2_Sub10_35.anInt2187 = this.anIntArray170[local8];
			this.method975(local8);
			this.anIntArray168[local8] = this.aClass2_Sub10_35.anInt2187;
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)J")
	public long method982(@OriginalArg(0) int arg0) {
		return this.aLong56 + (long) arg0 * (long) this.anInt1390;
	}
}
