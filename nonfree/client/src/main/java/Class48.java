import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class48 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public int anInt1531;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	private int anInt1532;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!be;")
	private final Class2_Sub4 aClass2_Sub4_21 = new Class2_Sub4(null);

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class48() {
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V")
	public Class48(@OriginalArg(0) byte[] arg0) {
		this.method1136(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method1135(@OriginalArg(0) int arg0) {
		this.anIntArray181[arg0] = this.aClass2_Sub4_21.anInt1298;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([B)V")
	public void method1136(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub4_21.aByteArray20 = arg0;
		this.aClass2_Sub4_21.anInt1298 = 10;
		@Pc(12) int local12 = this.aClass2_Sub4_21.method896();
		this.anInt1531 = this.aClass2_Sub4_21.method896();
		this.anInt1532 = 500000;
		this.anIntArray180 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub4_21.method903();
			@Pc(38) int local38 = this.aClass2_Sub4_21.method903();
			if (local33 == 1297379947) {
				this.anIntArray180[local27] = this.aClass2_Sub4_21.anInt1298;
				local27++;
			}
			this.aClass2_Sub4_21.anInt1298 += local38;
		}
		this.aLong50 = 0L;
		this.anIntArray181 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray181[local33] = this.anIntArray180[local33];
		}
		this.anIntArray182 = new int[local12];
		this.anIntArray183 = new int[local12];
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
	public int method1138(@OriginalArg(0) int arg0) {
		return this.method1148(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public void method1139(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub4_21.method924();
		this.anIntArray182[arg0] += local4;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()Z")
	public boolean method1140() {
		return this.aClass2_Sub4_21.aByteArray20 != null;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()Z")
	public boolean method1141() {
		@Pc(3) int local3 = this.anIntArray181.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray181[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)J")
	public long method1142(@OriginalArg(0) int arg0) {
		return this.aLong50 + (long) arg0 * (long) this.anInt1532;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()V")
	public void method1143() {
		this.aClass2_Sub4_21.aByteArray20 = null;
		this.anIntArray180 = null;
		this.anIntArray181 = null;
		this.anIntArray182 = null;
		this.anIntArray183 = null;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "()I")
	public int method1144() {
		@Pc(3) int local3 = this.anIntArray181.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray181[local9] >= 0 && this.anIntArray182[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray182[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "()V")
	public void method1145() {
		this.aClass2_Sub4_21.anInt1298 = -1;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
	public void method1146(@OriginalArg(0) int arg0) {
		this.aClass2_Sub4_21.anInt1298 = this.anIntArray181[arg0];
	}

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "()I")
	public int method1147() {
		return this.anIntArray181.length;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)I")
	private int method1148(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub4_21.aByteArray20[this.aClass2_Sub4_21.anInt1298];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray183[arg0] = local13;
			this.aClass2_Sub4_21.anInt1298++;
		} else {
			local13 = this.anIntArray183[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1149(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub4_21.method924();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub4_21.aByteArray20[this.aClass2_Sub4_21.anInt1298] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub4_21.anInt1298++;
				this.anIntArray183[arg0] = local57;
				return this.method1149(arg0, local57);
			}
		}
		this.aClass2_Sub4_21.anInt1298 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
	private int method1149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static64.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub4_21.method933() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub4_21.method933() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub4_21.method933();
		local12 = this.aClass2_Sub4_21.method924();
		if (local7 == 47) {
			this.aClass2_Sub4_21.anInt1298 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub4_21.method940();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray182[arg0];
			this.aLong50 += (long) local38 * (long) (this.anInt1532 - local32);
			this.anInt1532 = local32;
			this.aClass2_Sub4_21.anInt1298 += local12;
			return 2;
		} else {
			this.aClass2_Sub4_21.anInt1298 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(J)V")
	public void method1150(@OriginalArg(0) long arg0) {
		this.aLong50 = arg0;
		@Pc(6) int local6 = this.anIntArray181.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray182[local8] = 0;
			this.anIntArray183[local8] = 0;
			this.aClass2_Sub4_21.anInt1298 = this.anIntArray180[local8];
			this.method1139(local8);
			this.anIntArray181[local8] = this.aClass2_Sub4_21.anInt1298;
		}
	}
}
