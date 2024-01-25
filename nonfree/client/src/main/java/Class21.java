import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class21 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!bg;")
	private final Class1_Sub8 aClass1_Sub8_2 = new Class1_Sub8(null);

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class21() {
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
	public Class21(@OriginalArg(0) byte[] arg0) {
		this.method717(arg0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	public int method702(@OriginalArg(0) int arg0) {
		return this.method703(arg0);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
	private int method703(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub8_2.aByteArray81[this.aClass1_Sub8_2.anInt5182];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray85[arg0] = local13;
			this.aClass1_Sub8_2.anInt5182++;
		} else {
			local13 = this.anIntArray85[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method713(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub8_2.method4535();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub8_2.aByteArray81[this.aClass1_Sub8_2.anInt5182] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub8_2.anInt5182++;
				this.anIntArray85[arg0] = local57;
				return this.method713(arg0, local57);
			}
		}
		this.aClass1_Sub8_2.anInt5182 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()Z")
	public boolean method704() {
		return this.aClass1_Sub8_2.aByteArray81 != null;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()V")
	public void method705() {
		this.aClass1_Sub8_2.aByteArray81 = null;
		this.anIntArray86 = null;
		this.anIntArray84 = null;
		this.anIntArray83 = null;
		this.anIntArray85 = null;
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "()V")
	public void method707() {
		this.aClass1_Sub8_2.anInt5182 = -1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(J)V")
	public void method708(@OriginalArg(0) long arg0) {
		this.aLong29 = arg0;
		@Pc(6) int local6 = this.anIntArray84.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray83[local8] = 0;
			this.anIntArray85[local8] = 0;
			this.aClass1_Sub8_2.anInt5182 = this.anIntArray86[local8];
			this.method714(local8);
			this.anIntArray84[local8] = this.aClass1_Sub8_2.anInt5182;
		}
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "()I")
	public int method709() {
		@Pc(3) int local3 = this.anIntArray84.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray84[local9] >= 0 && this.anIntArray83[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray83[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public void method710(@OriginalArg(0) int arg0) {
		this.anIntArray84[arg0] = this.aClass1_Sub8_2.anInt5182;
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public void method711(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_2.anInt5182 = this.anIntArray84[arg0];
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "()Z")
	public boolean method712() {
		@Pc(3) int local3 = this.anIntArray84.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray84[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
	private int method713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static25.aByteArray11[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub8_2.method4532() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub8_2.method4532() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub8_2.method4532();
		local12 = this.aClass1_Sub8_2.method4535();
		if (local7 == 47) {
			this.aClass1_Sub8_2.anInt5182 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub8_2.method4514();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray83[arg0];
			this.aLong29 += (long) local38 * (long) (this.anInt955 - local32);
			this.anInt955 = local32;
			this.aClass1_Sub8_2.anInt5182 += local12;
			return 2;
		} else {
			this.aClass1_Sub8_2.anInt5182 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
	public void method714(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub8_2.method4535();
		this.anIntArray83[arg0] += local4;
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "()I")
	public int method715() {
		return this.anIntArray84.length;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)J")
	public long method716(@OriginalArg(0) int arg0) {
		return this.aLong29 + (long) arg0 * (long) this.anInt955;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([B)V")
	public void method717(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub8_2.aByteArray81 = arg0;
		this.aClass1_Sub8_2.anInt5182 = 10;
		@Pc(12) int local12 = this.aClass1_Sub8_2.method4556();
		this.anInt956 = this.aClass1_Sub8_2.method4556();
		this.anInt955 = 500000;
		this.anIntArray86 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub8_2.method4545();
			@Pc(38) int local38 = this.aClass1_Sub8_2.method4545();
			if (local33 == 1297379947) {
				this.anIntArray86[local27] = this.aClass1_Sub8_2.anInt5182;
				local27++;
			}
			this.aClass1_Sub8_2.anInt5182 += local38;
		}
		this.aLong29 = 0L;
		this.anIntArray84 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray84[local33] = this.anIntArray86[local33];
		}
		this.anIntArray83 = new int[local12];
		this.anIntArray85 = new int[local12];
	}
}
