import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class23 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!of;")
	private final Class1_Sub19 aClass1_Sub19_1 = new Class1_Sub19(null);

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class23() {
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
	public Class23(@OriginalArg(0) byte[] arg0) {
		this.method608(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	public int method605(@OriginalArg(0) int arg0) {
		return this.method620(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()I")
	public int method607() {
		@Pc(3) int local3 = this.anIntArray98.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray98[local9] >= 0 && this.anIntArray96[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray96[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([B)V")
	public void method608(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub19_1.aByteArray42 = arg0;
		this.aClass1_Sub19_1.anInt3111 = 10;
		@Pc(12) int local12 = this.aClass1_Sub19_1.method2051();
		this.anInt985 = this.aClass1_Sub19_1.method2051();
		this.anInt984 = 500000;
		this.anIntArray95 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub19_1.method2046();
			@Pc(38) int local38 = this.aClass1_Sub19_1.method2046();
			if (local33 == 1297379947) {
				this.anIntArray95[local27] = this.aClass1_Sub19_1.anInt3111;
				local27++;
			}
			this.aClass1_Sub19_1.anInt3111 += local38;
		}
		this.aLong60 = 0L;
		this.anIntArray98 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray98[local33] = this.anIntArray95[local33];
		}
		this.anIntArray96 = new int[local12];
		this.anIntArray97 = new int[local12];
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public void method609(@OriginalArg(0) int arg0) {
		this.anIntArray98[arg0] = this.aClass1_Sub19_1.anInt3111;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()Z")
	public boolean method610() {
		@Pc(3) int local3 = this.anIntArray98.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray98[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()I")
	public int method611() {
		return this.anIntArray98.length;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
	public void method612() {
		this.aClass1_Sub19_1.aByteArray42 = null;
		this.anIntArray95 = null;
		this.anIntArray98 = null;
		this.anIntArray96 = null;
		this.anIntArray97 = null;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "()V")
	public void method613() {
		this.aClass1_Sub19_1.anInt3111 = -1;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "()Z")
	public boolean method614() {
		return this.aClass1_Sub19_1.aByteArray42 != null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(J)V")
	public void method615(@OriginalArg(0) long arg0) {
		this.aLong60 = arg0;
		@Pc(6) int local6 = this.anIntArray98.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray96[local8] = 0;
			this.anIntArray97[local8] = 0;
			this.aClass1_Sub19_1.anInt3111 = this.anIntArray95[local8];
			this.method617(local8);
			this.anIntArray98[local8] = this.aClass1_Sub19_1.anInt3111;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)J")
	public long method616(@OriginalArg(0) int arg0) {
		return this.aLong60 + (long) arg0 * (long) this.anInt984;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public void method617(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub19_1.method2041();
		this.anIntArray96[arg0] += local4;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
	private int method618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static33.aByteArray15[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub19_1.method2072() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub19_1.method2072() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub19_1.method2072();
		local12 = this.aClass1_Sub19_1.method2041();
		if (local7 == 47) {
			this.aClass1_Sub19_1.anInt3111 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub19_1.method2048();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray96[arg0];
			this.aLong60 += (long) local38 * (long) (this.anInt984 - local32);
			this.anInt984 = local32;
			this.aClass1_Sub19_1.anInt3111 += local12;
			return 2;
		} else {
			this.aClass1_Sub19_1.anInt3111 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	public void method619(@OriginalArg(0) int arg0) {
		this.aClass1_Sub19_1.anInt3111 = this.anIntArray98[arg0];
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)I")
	private int method620(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub19_1.aByteArray42[this.aClass1_Sub19_1.anInt3111];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray97[arg0] = local13;
			this.aClass1_Sub19_1.anInt3111++;
		} else {
			local13 = this.anIntArray97[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method618(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub19_1.method2041();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub19_1.aByteArray42[this.aClass1_Sub19_1.anInt3111] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub19_1.anInt3111++;
				this.anIntArray97[arg0] = local57;
				return this.method618(arg0, local57);
			}
		}
		this.aClass1_Sub19_1.anInt3111 += local42;
		return 0;
	}
}
