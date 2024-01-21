import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class50 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public int anInt1992;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	private int anInt1993;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!ka;")
	private final Class1_Sub8 aClass1_Sub8_2 = new Class1_Sub8(null);

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V")
	public Class50(@OriginalArg(0) byte[] arg0) {
		this.method1520(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
	public int method1514() {
		@Pc(3) int local3 = this.anIntArray222.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray222[local9] >= 0 && this.anIntArray225[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray225[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public void method1515(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub8_2.method310();
		this.anIntArray225[arg0] += local4;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(J)V")
	public void method1516(@OriginalArg(0) long arg0) {
		this.aLong74 = arg0;
		@Pc(6) int local6 = this.anIntArray222.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray225[local8] = 0;
			this.anIntArray224[local8] = 0;
			this.aClass1_Sub8_2.anInt446 = this.anIntArray223[local8];
			this.method1515(local8);
			this.anIntArray222[local8] = this.aClass1_Sub8_2.anInt446;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()Z")
	public boolean method1517() {
		return this.aClass1_Sub8_2.aByteArray3 != null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
	private int method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static91.aByteArray17[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub8_2.method336() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub8_2.method336() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub8_2.method336();
		local12 = this.aClass1_Sub8_2.method310();
		if (local7 == 47) {
			this.aClass1_Sub8_2.anInt446 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub8_2.method316();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray225[arg0];
			this.aLong74 += (long) local38 * (long) (this.anInt1993 - local32);
			this.anInt1993 = local32;
			this.aClass1_Sub8_2.anInt446 += local12;
			return 2;
		} else {
			this.aClass1_Sub8_2.anInt446 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()V")
	public void method1519() {
		this.aClass1_Sub8_2.aByteArray3 = null;
		this.anIntArray223 = null;
		this.anIntArray222 = null;
		this.anIntArray225 = null;
		this.anIntArray224 = null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([B)V")
	public void method1520(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub8_2.aByteArray3 = arg0;
		this.aClass1_Sub8_2.anInt446 = 10;
		@Pc(12) int local12 = this.aClass1_Sub8_2.method359();
		this.anInt1992 = this.aClass1_Sub8_2.method359();
		this.anInt1993 = 500000;
		this.anIntArray223 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub8_2.method347();
			@Pc(38) int local38 = this.aClass1_Sub8_2.method347();
			if (local33 == 1297379947) {
				this.anIntArray223[local27] = this.aClass1_Sub8_2.anInt446;
				local27++;
			}
			this.aClass1_Sub8_2.anInt446 += local38;
		}
		this.aLong74 = 0L;
		this.anIntArray222 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray222[local33] = this.anIntArray223[local33];
		}
		this.anIntArray225 = new int[local12];
		this.anIntArray224 = new int[local12];
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
	public int method1521() {
		return this.anIntArray222.length;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public void method1522(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_2.anInt446 = this.anIntArray222[arg0];
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "()V")
	public void method1524() {
		this.aClass1_Sub8_2.anInt446 = -1;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	public void method1525(@OriginalArg(0) int arg0) {
		this.anIntArray222[arg0] = this.aClass1_Sub8_2.anInt446;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)I")
	private int method1526(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub8_2.aByteArray3[this.aClass1_Sub8_2.anInt446];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray224[arg0] = local13;
			this.aClass1_Sub8_2.anInt446++;
		} else {
			local13 = this.anIntArray224[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1518(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub8_2.method310();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub8_2.aByteArray3[this.aClass1_Sub8_2.anInt446] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub8_2.anInt446++;
				this.anIntArray224[arg0] = local57;
				return this.method1518(arg0, local57);
			}
		}
		this.aClass1_Sub8_2.anInt446 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)J")
	public long method1527(@OriginalArg(0) int arg0) {
		return this.aLong74 + (long) arg0 * (long) this.anInt1993;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
	public int method1528(@OriginalArg(0) int arg0) {
		return this.method1526(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "()Z")
	public boolean method1529() {
		@Pc(3) int local3 = this.anIntArray222.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray222[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
