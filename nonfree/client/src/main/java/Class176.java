import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class176 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	private int anInt5045;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	private int[] anIntArray543;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
	public int[] anIntArray545;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public int anInt5046;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!ec;")
	private final Class6_Sub10 aClass6_Sub10_6 = new Class6_Sub10(null);

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class176() {
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
	public Class176(@OriginalArg(0) byte[] arg0) {
		this.method4616(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
	private int method4602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static272.aByteArray80[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub10_6.method3972() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub10_6.method3972() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub10_6.method3972();
		local12 = this.aClass6_Sub10_6.method3982();
		if (local7 == 47) {
			this.aClass6_Sub10_6.anInt4188 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub10_6.method3996();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray545[arg0];
			this.aLong168 += (long) local38 * (long) (this.anInt5045 - local32);
			this.anInt5045 = local32;
			this.aClass6_Sub10_6.anInt4188 += local12;
			return 2;
		} else {
			this.aClass6_Sub10_6.anInt4188 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
	public int method4603() {
		return this.anIntArray543.length;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
	public void method4605() {
		this.aClass6_Sub10_6.aByteArray67 = null;
		this.anIntArray544 = null;
		this.anIntArray543 = null;
		this.anIntArray545 = null;
		this.anIntArray546 = null;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()Z")
	public boolean method4606() {
		@Pc(3) int local3 = this.anIntArray543.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray543[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "()Z")
	public boolean method4607() {
		return this.aClass6_Sub10_6.aByteArray67 != null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method4608(@OriginalArg(0) int arg0) {
		this.anIntArray543[arg0] = this.aClass6_Sub10_6.anInt4188;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "()V")
	public void method4609() {
		this.aClass6_Sub10_6.anInt4188 = -1;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method4610(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub10_6.method3982();
		this.anIntArray545[arg0] += local4;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)J")
	public long method4611(@OriginalArg(0) int arg0) {
		return this.aLong168 + (long) arg0 * (long) this.anInt5045;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
	public void method4612(@OriginalArg(0) int arg0) {
		this.aClass6_Sub10_6.anInt4188 = this.anIntArray543[arg0];
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(J)V")
	public void method4613(@OriginalArg(0) long arg0) {
		this.aLong168 = arg0;
		@Pc(6) int local6 = this.anIntArray543.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray545[local8] = 0;
			this.anIntArray546[local8] = 0;
			this.aClass6_Sub10_6.anInt4188 = this.anIntArray544[local8];
			this.method4610(local8);
			this.anIntArray543[local8] = this.aClass6_Sub10_6.anInt4188;
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)I")
	private int method4614(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub10_6.aByteArray67[this.aClass6_Sub10_6.anInt4188];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray546[arg0] = local13;
			this.aClass6_Sub10_6.anInt4188++;
		} else {
			local13 = this.anIntArray546[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4602(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub10_6.method3982();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub10_6.aByteArray67[this.aClass6_Sub10_6.anInt4188] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub10_6.anInt4188++;
				this.anIntArray546[arg0] = local57;
				return this.method4602(arg0, local57);
			}
		}
		this.aClass6_Sub10_6.anInt4188 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I")
	public int method4615(@OriginalArg(0) int arg0) {
		return this.method4614(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([B)V")
	public void method4616(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub10_6.aByteArray67 = arg0;
		this.aClass6_Sub10_6.anInt4188 = 10;
		@Pc(12) int local12 = this.aClass6_Sub10_6.method4021();
		this.anInt5046 = this.aClass6_Sub10_6.method4021();
		this.anInt5045 = 500000;
		this.anIntArray544 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub10_6.method3979();
			@Pc(38) int local38 = this.aClass6_Sub10_6.method3979();
			if (local33 == 1297379947) {
				this.anIntArray544[local27] = this.aClass6_Sub10_6.anInt4188;
				local27++;
			}
			this.aClass6_Sub10_6.anInt4188 += local38;
		}
		this.aLong168 = 0L;
		this.anIntArray543 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray543[local33] = this.anIntArray544[local33];
		}
		this.anIntArray545 = new int[local12];
		this.anIntArray546 = new int[local12];
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "()I")
	public int method4617() {
		@Pc(3) int local3 = this.anIntArray543.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray543[local9] >= 0 && this.anIntArray545[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray545[local9];
			}
		}
		return local5;
	}
}
