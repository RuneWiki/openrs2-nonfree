import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class17 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!ba;")
	private final Class2_Sub3 aClass2_Sub3_1 = new Class2_Sub3(null);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
	public int method643() {
		@Pc(3) int local3 = this.anIntArray96.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray96[local9] >= 0 && this.anIntArray98[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray98[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)J")
	public long method644(@OriginalArg(0) int arg0) {
		return this.aLong23 + (long) arg0 * (long) this.anInt960;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
	public int method645(@OriginalArg(0) int arg0) {
		return this.method654(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()I")
	public int method646() {
		return this.anIntArray96.length;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public void method647(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub3_1.method823();
		this.anIntArray98[arg0] += local4;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()V")
	public void method648() {
		this.aClass2_Sub3_1.aByteArray7 = null;
		this.anIntArray97 = null;
		this.anIntArray96 = null;
		this.anIntArray98 = null;
		this.anIntArray99 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([B)V")
	public void method649(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub3_1.aByteArray7 = arg0;
		this.aClass2_Sub3_1.anInt1168 = 10;
		@Pc(12) int local12 = this.aClass2_Sub3_1.method792();
		this.anInt961 = this.aClass2_Sub3_1.method792();
		this.anInt960 = 500000;
		this.anIntArray97 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(33) int local33 = this.aClass2_Sub3_1.method814();
			@Pc(38) int local38 = this.aClass2_Sub3_1.method814();
			if (local33 == 1297379947) {
				this.anIntArray97[local27] = this.aClass2_Sub3_1.anInt1168;
				local27++;
			}
			this.aClass2_Sub3_1.anInt1168 += local38;
		}
		this.anIntArray96 = (int[]) this.anIntArray97.clone();
		this.anIntArray98 = new int[local12];
		this.anIntArray99 = new int[local12];
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()Z")
	public boolean method650() {
		return this.aClass2_Sub3_1.aByteArray7 != null;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "()Z")
	public boolean method651() {
		return this.aClass2_Sub3_1.anInt1168 < 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(J)V")
	public void method652(@OriginalArg(0) long arg0) {
		this.aLong23 = arg0;
		@Pc(6) int local6 = this.anIntArray96.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray98[local8] = 0;
			this.anIntArray99[local8] = 0;
			this.aClass2_Sub3_1.anInt1168 = this.anIntArray97[local8];
			this.method647(local8);
			this.anIntArray96[local8] = this.aClass2_Sub3_1.anInt1168;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public void method653(@OriginalArg(0) int arg0) {
		this.anIntArray96[arg0] = this.aClass2_Sub3_1.anInt1168;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)I")
	private int method654(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub3_1.aByteArray7[this.aClass2_Sub3_1.anInt1168];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray99[arg0] = local13;
			this.aClass2_Sub3_1.anInt1168++;
		} else {
			local13 = this.anIntArray99[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method655(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub3_1.method823();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub3_1.aByteArray7[this.aClass2_Sub3_1.anInt1168] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub3_1.anInt1168++;
				this.anIntArray99[arg0] = local57;
				return this.method655(arg0, local57);
			}
		}
		this.aClass2_Sub3_1.anInt1168 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	private int method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static23.aByteArray6[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub3_1.method791() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub3_1.method791() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub3_1.method791();
		local12 = this.aClass2_Sub3_1.method823();
		if (local7 == 47) {
			this.aClass2_Sub3_1.anInt1168 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub3_1.method811();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray98[arg0];
			this.aLong23 += (long) local38 * (long) (this.anInt960 - local32);
			this.anInt960 = local32;
			this.aClass2_Sub3_1.anInt1168 += local12;
			return 2;
		} else {
			this.aClass2_Sub3_1.anInt1168 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "()Z")
	public boolean method656() {
		@Pc(3) int local3 = this.anIntArray96.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray96[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "()V")
	public void method657() {
		this.aClass2_Sub3_1.anInt1168 = -1;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public void method658(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_1.anInt1168 = this.anIntArray96[arg0];
	}
}
