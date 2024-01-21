import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class21 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!oa;")
	private final Class2_Sub18 aClass2_Sub18_25 = new Class2_Sub18(null);

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class21() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
	public Class21(@OriginalArg(0) byte[] arg0) {
		this.method713(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([B)V")
	public void method713(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub18_25.aByteArray39 = arg0;
		this.aClass2_Sub18_25.anInt3423 = 10;
		@Pc(12) int local12 = this.aClass2_Sub18_25.method2353();
		this.anInt1045 = this.aClass2_Sub18_25.method2353();
		this.anInt1046 = 500000;
		this.anIntArray162 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub18_25.method2382();
			@Pc(38) int local38 = this.aClass2_Sub18_25.method2382();
			if (local33 == 1297379947) {
				this.anIntArray162[local27] = this.aClass2_Sub18_25.anInt3423;
				local27++;
			}
			this.aClass2_Sub18_25.anInt3423 += local38;
		}
		this.aLong35 = 0L;
		this.anIntArray164 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray164[local33] = this.anIntArray162[local33];
		}
		this.anIntArray163 = new int[local12];
		this.anIntArray161 = new int[local12];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
	public int method715(@OriginalArg(0) int arg0) {
		return this.method720(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
	public void method716() {
		this.aClass2_Sub18_25.aByteArray39 = null;
		this.anIntArray162 = null;
		this.anIntArray164 = null;
		this.anIntArray163 = null;
		this.anIntArray161 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	private int method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static35.aByteArray10[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub18_25.method2387() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub18_25.method2387() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub18_25.method2387();
		local12 = this.aClass2_Sub18_25.method2343();
		if (local7 == 47) {
			this.aClass2_Sub18_25.anInt3423 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub18_25.method2341();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray163[arg0];
			this.aLong35 += (long) local38 * (long) (this.anInt1046 - local32);
			this.anInt1046 = local32;
			this.aClass2_Sub18_25.anInt3423 += local12;
			return 2;
		} else {
			this.aClass2_Sub18_25.anInt3423 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
	public int method718() {
		@Pc(3) int local3 = this.anIntArray164.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray164[local9] >= 0 && this.anIntArray163[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray163[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(J)V")
	public void method719(@OriginalArg(0) long arg0) {
		this.aLong35 = arg0;
		@Pc(6) int local6 = this.anIntArray164.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray163[local8] = 0;
			this.anIntArray161[local8] = 0;
			this.aClass2_Sub18_25.anInt3423 = this.anIntArray162[local8];
			this.method727(local8);
			this.anIntArray164[local8] = this.aClass2_Sub18_25.anInt3423;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
	private int method720(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub18_25.aByteArray39[this.aClass2_Sub18_25.anInt3423];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray161[arg0] = local13;
			this.aClass2_Sub18_25.anInt3423++;
		} else {
			local13 = this.anIntArray161[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method717(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub18_25.method2343();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub18_25.aByteArray39[this.aClass2_Sub18_25.anInt3423] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub18_25.anInt3423++;
				this.anIntArray161[arg0] = local57;
				return this.method717(arg0, local57);
			}
		}
		this.aClass2_Sub18_25.anInt3423 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)J")
	public long method721(@OriginalArg(0) int arg0) {
		return this.aLong35 + (long) arg0 * (long) this.anInt1046;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public void method722(@OriginalArg(0) int arg0) {
		this.anIntArray164[arg0] = this.aClass2_Sub18_25.anInt3423;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public void method723(@OriginalArg(0) int arg0) {
		this.aClass2_Sub18_25.anInt3423 = this.anIntArray164[arg0];
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()Z")
	public boolean method724() {
		return this.aClass2_Sub18_25.aByteArray39 != null;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "()Z")
	public boolean method725() {
		@Pc(3) int local3 = this.anIntArray164.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray164[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "()I")
	public int method726() {
		return this.anIntArray164.length;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public void method727(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub18_25.method2343();
		this.anIntArray163[arg0] += local4;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "()V")
	public void method728() {
		this.aClass2_Sub18_25.anInt3423 = -1;
	}
}
