import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class183 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	private int anInt5204;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
	public int anInt5205;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Lclient!ji;")
	private final Class6_Sub21 aClass6_Sub21_4 = new Class6_Sub21(null);

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class183() {
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([B)V")
	public Class183(@OriginalArg(0) byte[] arg0) {
		this.method4479(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(J)V")
	public void method4477(@OriginalArg(0) long arg0) {
		this.aLong142 = arg0;
		@Pc(6) int local6 = this.anIntArray391.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray388[local8] = 0;
			this.anIntArray390[local8] = 0;
			this.aClass6_Sub21_4.anInt7338 = this.anIntArray389[local8];
			this.method4484(local8);
			this.anIntArray391[local8] = this.aClass6_Sub21_4.anInt7338;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([B)V")
	public void method4479(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub21_4.aByteArray93 = arg0;
		this.aClass6_Sub21_4.anInt7338 = 10;
		@Pc(12) int local12 = this.aClass6_Sub21_4.method6003();
		this.anInt5205 = this.aClass6_Sub21_4.method6003();
		this.anInt5204 = 500000;
		this.anIntArray389 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub21_4.method6036();
			@Pc(38) int local38 = this.aClass6_Sub21_4.method6036();
			if (local33 == 1297379947) {
				this.anIntArray389[local27] = this.aClass6_Sub21_4.anInt7338;
				local27++;
			}
			this.aClass6_Sub21_4.anInt7338 += local38;
		}
		this.aLong142 = 0L;
		this.anIntArray391 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray391[local33] = this.anIntArray389[local33];
		}
		this.anIntArray388 = new int[local12];
		this.anIntArray390 = new int[local12];
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "()Z")
	public boolean method4480() {
		@Pc(3) int local3 = this.anIntArray391.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray391[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
	private int method4481(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub21_4.aByteArray93[this.aClass6_Sub21_4.anInt7338];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray390[arg0] = local13;
			this.aClass6_Sub21_4.anInt7338++;
		} else {
			local13 = this.anIntArray390[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4491(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub21_4.method6027();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub21_4.aByteArray93[this.aClass6_Sub21_4.anInt7338] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub21_4.anInt7338++;
				this.anIntArray390[arg0] = local57;
				return this.method4491(arg0, local57);
			}
		}
		this.aClass6_Sub21_4.anInt7338 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "()I")
	public int method4482() {
		@Pc(3) int local3 = this.anIntArray391.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray391[local9] >= 0 && this.anIntArray388[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray388[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "()Z")
	public boolean method4483() {
		return this.aClass6_Sub21_4.aByteArray93 != null;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	public void method4484(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub21_4.method6027();
		this.anIntArray388[arg0] += local4;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	public void method4485(@OriginalArg(0) int arg0) {
		this.aClass6_Sub21_4.anInt7338 = this.anIntArray391[arg0];
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "()V")
	public void method4486() {
		this.aClass6_Sub21_4.aByteArray93 = null;
		this.anIntArray389 = null;
		this.anIntArray391 = null;
		this.anIntArray388 = null;
		this.anIntArray390 = null;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)J")
	public long method4487(@OriginalArg(0) int arg0) {
		return this.aLong142 + (long) arg0 * (long) this.anInt5204;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V")
	public void method4488(@OriginalArg(0) int arg0) {
		this.anIntArray391[arg0] = this.aClass6_Sub21_4.anInt7338;
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)I")
	public int method4489(@OriginalArg(0) int arg0) {
		return this.method4481(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "()V")
	public void method4490() {
		this.aClass6_Sub21_4.anInt7338 = -1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I")
	private int method4491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static271.aByteArray58[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub21_4.method6069() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub21_4.method6069() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub21_4.method6069();
		local12 = this.aClass6_Sub21_4.method6027();
		if (local7 == 47) {
			this.aClass6_Sub21_4.anInt7338 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub21_4.method6031();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray388[arg0];
			this.aLong142 += (long) local38 * (long) (this.anInt5204 - local32);
			this.anInt5204 = local32;
			this.aClass6_Sub21_4.anInt7338 += local12;
			return 2;
		} else {
			this.aClass6_Sub21_4.anInt7338 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "()I")
	public int method4492() {
		return this.anIntArray391.length;
	}
}
