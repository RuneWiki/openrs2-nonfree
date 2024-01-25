import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class174 {

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
	public int anInt5316;

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Lclient!ie;")
	private final Class3_Sub26 aClass3_Sub26_3 = new Class3_Sub26(null);

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "()V")
	public Class174() {
	}

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "([B)V")
	public Class174(@OriginalArg(0) byte[] arg0) {
		this.method4261(arg0);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I")
	public int method4249(@OriginalArg(0) int arg0) {
		return this.method4257(arg0);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)J")
	public long method4250(@OriginalArg(0) int arg0) {
		return this.aLong138 + (long) arg0 * (long) this.anInt5315;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "()Z")
	public boolean method4252() {
		return this.aClass3_Sub26_3.aByteArray213 != null;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V")
	public void method4253(@OriginalArg(0) int arg0) {
		this.anIntArray249[arg0] = this.aClass3_Sub26_3.anInt8703;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)V")
	public void method4254(@OriginalArg(0) int arg0) {
		this.aClass3_Sub26_3.anInt8703 = this.anIntArray249[arg0];
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "()I")
	public int method4255() {
		return this.anIntArray249.length;
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "()I")
	public int method4256() {
		@Pc(3) int local3 = this.anIntArray249.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray249[local9] >= 0 && this.anIntArray251[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray251[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "(I)I")
	private int method4257(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub26_3.aByteArray213[this.aClass3_Sub26_3.anInt8703];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray248[arg0] = local13;
			this.aClass3_Sub26_3.anInt8703++;
		} else {
			local13 = this.anIntArray248[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4263(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub26_3.method6806();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub26_3.aByteArray213[this.aClass3_Sub26_3.anInt8703] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub26_3.anInt8703++;
				this.anIntArray248[arg0] = local57;
				return this.method4263(arg0, local57);
			}
		}
		this.aClass3_Sub26_3.anInt8703 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(J)V")
	public void method4258(@OriginalArg(0) long arg0) {
		this.aLong138 = arg0;
		@Pc(6) int local6 = this.anIntArray249.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray251[local8] = 0;
			this.anIntArray248[local8] = 0;
			this.aClass3_Sub26_3.anInt8703 = this.anIntArray250[local8];
			this.method4262(local8);
			this.anIntArray249[local8] = this.aClass3_Sub26_3.anInt8703;
		}
	}

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "()V")
	public void method4259() {
		this.aClass3_Sub26_3.anInt8703 = -1;
	}

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "()Z")
	public boolean method4260() {
		@Pc(3) int local3 = this.anIntArray249.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray249[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([B)V")
	public void method4261(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub26_3.aByteArray213 = arg0;
		this.aClass3_Sub26_3.anInt8703 = 10;
		@Pc(12) int local12 = this.aClass3_Sub26_3.method6811();
		this.anInt5316 = this.aClass3_Sub26_3.method6811();
		this.anInt5315 = 500000;
		this.anIntArray250 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub26_3.method6816();
			@Pc(38) int local38 = this.aClass3_Sub26_3.method6816();
			if (local33 == 1297379947) {
				this.anIntArray250[local27] = this.aClass3_Sub26_3.anInt8703;
				local27++;
			}
			this.aClass3_Sub26_3.anInt8703 += local38;
		}
		this.aLong138 = 0L;
		this.anIntArray249 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray249[local33] = this.anIntArray250[local33];
		}
		this.anIntArray251 = new int[local12];
		this.anIntArray248 = new int[local12];
	}

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "(I)V")
	public void method4262(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub26_3.method6806();
		this.anIntArray251[arg0] += local4;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)I")
	private int method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static282.aByteArray129[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub26_3.method6814() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub26_3.method6814() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub26_3.method6814();
		local12 = this.aClass3_Sub26_3.method6806();
		if (local7 == 47) {
			this.aClass3_Sub26_3.anInt8703 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub26_3.method6830();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray251[arg0];
			this.aLong138 += (long) local38 * (long) (this.anInt5315 - local32);
			this.anInt5315 = local32;
			this.aClass3_Sub26_3.anInt8703 += local12;
			return 2;
		} else {
			this.aClass3_Sub26_3.anInt8703 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "()V")
	public void method4264() {
		this.aClass3_Sub26_3.aByteArray213 = null;
		this.anIntArray250 = null;
		this.anIntArray249 = null;
		this.anIntArray251 = null;
		this.anIntArray248 = null;
	}
}
