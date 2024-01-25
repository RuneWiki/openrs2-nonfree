import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class182 {

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
	public int anInt5391;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
	private int anInt5392;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "Lclient!ia;")
	private final Class1_Sub3 aClass1_Sub3_6 = new Class1_Sub3(null);

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class182() {
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "([B)V")
	public Class182(@OriginalArg(0) byte[] arg0) {
		this.method4130(arg0);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "()Z")
	public boolean method4122() {
		@Pc(3) int local3 = this.anIntArray505.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray505[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public void method4123(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub3_6.method1214();
		this.anIntArray504[arg0] += local4;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)I")
	private int method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static281.aByteArray69[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub3_6.method1171() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub3_6.method1171() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub3_6.method1171();
		local12 = this.aClass1_Sub3_6.method1214();
		if (local7 == 47) {
			this.aClass1_Sub3_6.anInt1710 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub3_6.method1226();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray504[arg0];
			this.aLong146 += (long) local38 * (long) (this.anInt5392 - local32);
			this.anInt5392 = local32;
			this.aClass1_Sub3_6.anInt1710 += local12;
			return 2;
		} else {
			this.aClass1_Sub3_6.anInt1710 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "()V")
	public void method4125() {
		this.aClass1_Sub3_6.anInt1710 = -1;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	public void method4126(@OriginalArg(0) int arg0) {
		this.anIntArray505[arg0] = this.aClass1_Sub3_6.anInt1710;
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "()I")
	public int method4127() {
		return this.anIntArray505.length;
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "()V")
	public void method4128() {
		this.aClass1_Sub3_6.aByteArray14 = null;
		this.anIntArray503 = null;
		this.anIntArray505 = null;
		this.anIntArray504 = null;
		this.anIntArray506 = null;
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)J")
	public long method4129(@OriginalArg(0) int arg0) {
		return this.aLong146 + (long) arg0 * (long) this.anInt5392;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([B)V")
	public void method4130(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub3_6.aByteArray14 = arg0;
		this.aClass1_Sub3_6.anInt1710 = 10;
		@Pc(12) int local12 = this.aClass1_Sub3_6.method1177();
		this.anInt5391 = this.aClass1_Sub3_6.method1177();
		this.anInt5392 = 500000;
		this.anIntArray503 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub3_6.method1188();
			@Pc(38) int local38 = this.aClass1_Sub3_6.method1188();
			if (local33 == 1297379947) {
				this.anIntArray503[local27] = this.aClass1_Sub3_6.anInt1710;
				local27++;
			}
			this.aClass1_Sub3_6.anInt1710 += local38;
		}
		this.aLong146 = 0L;
		this.anIntArray505 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray505[local33] = this.anIntArray503[local33];
		}
		this.anIntArray504 = new int[local12];
		this.anIntArray506 = new int[local12];
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I")
	private int method4131(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub3_6.aByteArray14[this.aClass1_Sub3_6.anInt1710];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray506[arg0] = local13;
			this.aClass1_Sub3_6.anInt1710++;
		} else {
			local13 = this.anIntArray506[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4124(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub3_6.method1214();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub3_6.aByteArray14[this.aClass1_Sub3_6.anInt1710] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub3_6.anInt1710++;
				this.anIntArray506[arg0] = local57;
				return this.method4124(arg0, local57);
			}
		}
		this.aClass1_Sub3_6.anInt1710 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
	public void method4132(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3_6.anInt1710 = this.anIntArray505[arg0];
	}

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "()Z")
	public boolean method4134() {
		return this.aClass1_Sub3_6.aByteArray14 != null;
	}

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)I")
	public int method4135(@OriginalArg(0) int arg0) {
		return this.method4131(arg0);
	}

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "()I")
	public int method4136() {
		@Pc(3) int local3 = this.anIntArray505.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray505[local9] >= 0 && this.anIntArray504[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray504[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(J)V")
	public void method4137(@OriginalArg(0) long arg0) {
		this.aLong146 = arg0;
		@Pc(6) int local6 = this.anIntArray505.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray504[local8] = 0;
			this.anIntArray506[local8] = 0;
			this.aClass1_Sub3_6.anInt1710 = this.anIntArray503[local8];
			this.method4123(local8);
			this.anIntArray505[local8] = this.aClass1_Sub3_6.anInt1710;
		}
	}
}
