import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class287 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "J")
	private long aLong348;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
	private int anInt7886;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
	private int[] anIntArray523;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "[I")
	public int[] anIntArray525;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
	public int anInt7887;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Lclient!io;")
	private final Class1_Sub20 aClass1_Sub20_5 = new Class1_Sub20(null);

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class287() {
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([B)V")
	public Class287(@OriginalArg(0) byte[] arg0) {
		this.method6564(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "()Z")
	public boolean method6560() {
		return this.aClass1_Sub20_5.aByteArray52 != null;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "()I")
	public int method6561() {
		@Pc(3) int local3 = this.anIntArray523.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray523[local9] >= 0 && this.anIntArray525[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray525[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public void method6562(@OriginalArg(0) int arg0) {
		this.aClass1_Sub20_5.anInt5238 = this.anIntArray523[arg0];
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "()Z")
	public boolean method6563() {
		@Pc(3) int local3 = this.anIntArray523.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray523[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([B)V")
	public void method6564(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub20_5.aByteArray52 = arg0;
		this.aClass1_Sub20_5.anInt5238 = 10;
		@Pc(12) int local12 = this.aClass1_Sub20_5.method4426();
		this.anInt7887 = this.aClass1_Sub20_5.method4426();
		this.anInt7886 = 500000;
		this.anIntArray522 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub20_5.method4371();
			@Pc(38) int local38 = this.aClass1_Sub20_5.method4371();
			if (local33 == 1297379947) {
				this.anIntArray522[local27] = this.aClass1_Sub20_5.anInt5238;
				local27++;
			}
			this.aClass1_Sub20_5.anInt5238 += local38;
		}
		this.aLong348 = 0L;
		this.anIntArray523 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray523[local33] = this.anIntArray522[local33];
		}
		this.anIntArray525 = new int[local12];
		this.anIntArray524 = new int[local12];
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
	private int method6565(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub20_5.aByteArray52[this.aClass1_Sub20_5.anInt5238];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray524[arg0] = local13;
			this.aClass1_Sub20_5.anInt5238++;
		} else {
			local13 = this.anIntArray524[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6571(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub20_5.method4390();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub20_5.aByteArray52[this.aClass1_Sub20_5.anInt5238] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub20_5.anInt5238++;
				this.anIntArray524[arg0] = local57;
				return this.method6571(arg0, local57);
			}
		}
		this.aClass1_Sub20_5.anInt5238 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)I")
	public int method6566(@OriginalArg(0) int arg0) {
		return this.method6565(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "()I")
	public int method6567() {
		return this.anIntArray523.length;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(J)V")
	public void method6568(@OriginalArg(0) long arg0) {
		this.aLong348 = arg0;
		@Pc(6) int local6 = this.anIntArray523.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray525[local8] = 0;
			this.anIntArray524[local8] = 0;
			this.aClass1_Sub20_5.anInt5238 = this.anIntArray522[local8];
			this.method6573(local8);
			this.anIntArray523[local8] = this.aClass1_Sub20_5.anInt5238;
		}
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
	public void method6569(@OriginalArg(0) int arg0) {
		this.anIntArray523[arg0] = this.aClass1_Sub20_5.anInt5238;
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)J")
	public long method6570(@OriginalArg(0) int arg0) {
		return this.aLong348 + (long) arg0 * (long) this.anInt7886;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
	private int method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static462.aByteArray81[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub20_5.method4393() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub20_5.method4393() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub20_5.method4393();
		local12 = this.aClass1_Sub20_5.method4390();
		if (local7 == 47) {
			this.aClass1_Sub20_5.anInt5238 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub20_5.method4396();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray525[arg0];
			this.aLong348 += (long) local38 * (long) (this.anInt7886 - local32);
			this.anInt7886 = local32;
			this.aClass1_Sub20_5.anInt5238 += local12;
			return 2;
		} else {
			this.aClass1_Sub20_5.anInt5238 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "()V")
	public void method6572() {
		this.aClass1_Sub20_5.anInt5238 = -1;
	}

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V")
	public void method6573(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub20_5.method4390();
		this.anIntArray525[arg0] += local4;
	}

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "()V")
	public void method6574() {
		this.aClass1_Sub20_5.aByteArray52 = null;
		this.anIntArray522 = null;
		this.anIntArray523 = null;
		this.anIntArray525 = null;
		this.anIntArray524 = null;
	}
}
