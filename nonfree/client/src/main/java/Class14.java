import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class14 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
	public int[] anIntArray74;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!nc;")
	private Class1_Sub9 aClass1_Sub9_1 = new Class1_Sub9(null);

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class14() {
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V")
	public Class14(@OriginalArg(0) byte[] arg0) {
		this.method344(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()Z")
	public boolean method334() {
		return this.aClass1_Sub9_1.aByteArray20 != null;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()Z")
	public boolean method335() {
		@Pc(3) int local3 = this.anIntArray75.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray75[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
	public int method336() {
		@Pc(3) int local3 = this.anIntArray75.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray75[local9] >= 0 && this.anIntArray74[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray74[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(J)V")
	public void method337(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(6) int local6 = this.anIntArray75.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray74[local8] = 0;
			this.anIntArray77[local8] = 0;
			this.aClass1_Sub9_1.anInt1192 = this.anIntArray76[local8];
			this.method340(local8);
			this.anIntArray75[local8] = this.aClass1_Sub9_1.anInt1192;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	private int method338(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub9_1.aByteArray20[this.aClass1_Sub9_1.anInt1192];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray77[arg0] = local13;
			this.aClass1_Sub9_1.anInt1192++;
		} else {
			local13 = this.anIntArray77[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method347(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub9_1.method945();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub9_1.aByteArray20[this.aClass1_Sub9_1.anInt1192] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub9_1.anInt1192++;
				this.anIntArray77[arg0] = local57;
				return this.method347(arg0, local57);
			}
		}
		this.aClass1_Sub9_1.anInt1192 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)J")
	public long method339(@OriginalArg(0) int arg0) {
		return this.aLong14 + (long) arg0 * (long) this.anInt475;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	public void method340(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub9_1.method945();
		this.anIntArray74[arg0] += local4;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
	public void method342(@OriginalArg(0) int arg0) {
		this.aClass1_Sub9_1.anInt1192 = this.anIntArray75[arg0];
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "()V")
	public void method343() {
		this.aClass1_Sub9_1.aByteArray20 = null;
		this.anIntArray76 = null;
		this.anIntArray75 = null;
		this.anIntArray74 = null;
		this.anIntArray77 = null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V")
	public void method344(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub9_1.aByteArray20 = arg0;
		this.aClass1_Sub9_1.anInt1192 = 10;
		@Pc(12) int local12 = this.aClass1_Sub9_1.method946();
		this.anInt476 = this.aClass1_Sub9_1.method946();
		this.anInt475 = 500000;
		this.anIntArray76 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub9_1.method915();
			@Pc(38) int local38 = this.aClass1_Sub9_1.method915();
			if (local33 == 1297379947) {
				this.anIntArray76[local27] = this.aClass1_Sub9_1.anInt1192;
				local27++;
			}
			this.aClass1_Sub9_1.anInt1192 += local38;
		}
		this.aLong14 = 0L;
		this.anIntArray75 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray75[local33] = this.anIntArray76[local33];
		}
		this.anIntArray74 = new int[local12];
		this.anIntArray77 = new int[local12];
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
	public int method345(@OriginalArg(0) int arg0) {
		return this.method338(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	public void method346(@OriginalArg(0) int arg0) {
		this.anIntArray75[arg0] = this.aClass1_Sub9_1.anInt1192;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
	private int method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static20.aByteArray15[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub9_1.method895() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub9_1.method895() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub9_1.method895();
		local12 = this.aClass1_Sub9_1.method945();
		if (local7 == 47) {
			this.aClass1_Sub9_1.anInt1192 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub9_1.method920();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray74[arg0];
			this.aLong14 += (long) local38 * (long) (this.anInt475 - local32);
			this.anInt475 = local32;
			this.aClass1_Sub9_1.anInt1192 += local12;
			return 2;
		} else {
			this.aClass1_Sub9_1.anInt1192 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
	public void method348() {
		this.aClass1_Sub9_1.anInt1192 = -1;
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "()I")
	public int method349() {
		return this.anIntArray75.length;
	}
}
