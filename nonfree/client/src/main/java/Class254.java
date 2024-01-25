import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class254 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	private int anInt7142;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "Lclient!jc;")
	private final Class14_Sub21 aClass14_Sub21_7 = new Class14_Sub21((byte[]) null);

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class254() {
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V")
	public Class254(@OriginalArg(0) byte[] arg0) {
		this.method6247(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	private int method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static414.aByteArray77[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass14_Sub21_7.method7695(110) << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass14_Sub21_7.method7695(106) << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass14_Sub21_7.method7695(95);
		local12 = this.aClass14_Sub21_7.method7741();
		if (local7 == 47) {
			this.aClass14_Sub21_7.anInt8936 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass14_Sub21_7.method7719();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray364[arg0];
			this.aLong197 += (long) local38 * (long) (this.anInt7142 - local32);
			this.anInt7142 = local32;
			this.aClass14_Sub21_7.anInt8936 += local12;
			return 2;
		} else {
			this.aClass14_Sub21_7.anInt8936 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "()V")
	public void method6236() {
		this.aClass14_Sub21_7.anInt8936 = -1;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()Z")
	public boolean method6237() {
		@Pc(3) int local3 = this.anIntArray362.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray362[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(J)V")
	public void method6238(@OriginalArg(0) long arg0) {
		this.aLong197 = arg0;
		@Pc(6) int local6 = this.anIntArray362.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray364[local8] = 0;
			this.anIntArray365[local8] = 0;
			this.aClass14_Sub21_7.anInt8936 = this.anIntArray363[local8];
			this.method6239(local8);
			this.anIntArray362[local8] = this.aClass14_Sub21_7.anInt8936;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public void method6239(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass14_Sub21_7.method7741();
		this.anIntArray364[arg0] += local4;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)I")
	private int method6240(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass14_Sub21_7.aByteArray99[this.aClass14_Sub21_7.anInt8936];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray365[arg0] = local13;
			this.aClass14_Sub21_7.anInt8936++;
		} else {
			local13 = this.anIntArray365[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6235(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass14_Sub21_7.method7741();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass14_Sub21_7.aByteArray99[this.aClass14_Sub21_7.anInt8936] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass14_Sub21_7.anInt8936++;
				this.anIntArray365[arg0] = local57;
				return this.method6235(arg0, local57);
			}
		}
		this.aClass14_Sub21_7.anInt8936 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)J")
	public long method6241(@OriginalArg(0) int arg0) {
		return this.aLong197 + (long) arg0 * (long) this.anInt7142;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "()I")
	public int method6243() {
		@Pc(3) int local3 = this.anIntArray362.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray362[local9] >= 0 && this.anIntArray364[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray364[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public void method6244(@OriginalArg(0) int arg0) {
		this.anIntArray362[arg0] = this.aClass14_Sub21_7.anInt8936;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)I")
	public int method6245(@OriginalArg(0) int arg0) {
		return this.method6240(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "()V")
	public void method6246() {
		this.aClass14_Sub21_7.aByteArray99 = null;
		this.anIntArray363 = null;
		this.anIntArray362 = null;
		this.anIntArray364 = null;
		this.anIntArray365 = null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([B)V")
	public void method6247(@OriginalArg(0) byte[] arg0) {
		this.aClass14_Sub21_7.aByteArray99 = arg0;
		this.aClass14_Sub21_7.anInt8936 = 10;
		@Pc(12) int local12 = this.aClass14_Sub21_7.method7717(-1978450544);
		this.anInt7143 = this.aClass14_Sub21_7.method7717(-1978450544);
		this.anInt7142 = 500000;
		this.anIntArray363 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass14_Sub21_7.method7748();
			@Pc(38) int local38 = this.aClass14_Sub21_7.method7748();
			if (local33 == 1297379947) {
				this.anIntArray363[local27] = this.aClass14_Sub21_7.anInt8936;
				local27++;
			}
			this.aClass14_Sub21_7.anInt8936 += local38;
		}
		this.aLong197 = 0L;
		this.anIntArray362 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray362[local33] = this.anIntArray363[local33];
		}
		this.anIntArray364 = new int[local12];
		this.anIntArray365 = new int[local12];
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
	public void method6248(@OriginalArg(0) int arg0) {
		this.aClass14_Sub21_7.anInt8936 = this.anIntArray362[arg0];
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()I")
	public int method6249() {
		return this.anIntArray362.length;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()Z")
	public boolean method6250() {
		return this.aClass14_Sub21_7.aByteArray99 != null;
	}
}
