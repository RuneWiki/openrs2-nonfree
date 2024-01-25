import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class193 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
	private int[] anIntArray531;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public int anInt5987;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
	private int anInt5988;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
	public int[] anIntArray532;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!rt;")
	private final Class3_Sub27 aClass3_Sub27_7 = new Class3_Sub27(null);

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class193() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V")
	public Class193(@OriginalArg(0) byte[] arg0) {
		this.method5007(arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method4999(@OriginalArg(0) int arg0) {
		this.anIntArray533[arg0] = this.aClass3_Sub27_7.anInt9191;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method5000(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub27_7.method7552();
		this.anIntArray532[arg0] += local4;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()I")
	public int method5001() {
		@Pc(3) int local3 = this.anIntArray533.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray533[local9] >= 0 && this.anIntArray532[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray532[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()Z")
	public boolean method5002() {
		return this.aClass3_Sub27_7.aByteArray114 != null;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I")
	private int method5003(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub27_7.aByteArray114[this.aClass3_Sub27_7.anInt9191];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray531[arg0] = local13;
			this.aClass3_Sub27_7.anInt9191++;
		} else {
			local13 = this.anIntArray531[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5013(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub27_7.method7552();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub27_7.aByteArray114[this.aClass3_Sub27_7.anInt9191] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub27_7.anInt9191++;
				this.anIntArray531[arg0] = local57;
				return this.method5013(arg0, local57);
			}
		}
		this.aClass3_Sub27_7.anInt9191 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()I")
	public int method5004() {
		return this.anIntArray533.length;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public void method5005(@OriginalArg(0) int arg0) {
		this.aClass3_Sub27_7.anInt9191 = this.anIntArray533[arg0];
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	public void method5006() {
		this.aClass3_Sub27_7.aByteArray114 = null;
		this.anIntArray534 = null;
		this.anIntArray533 = null;
		this.anIntArray532 = null;
		this.anIntArray531 = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([B)V")
	public void method5007(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub27_7.aByteArray114 = arg0;
		this.aClass3_Sub27_7.anInt9191 = 10;
		@Pc(12) int local12 = this.aClass3_Sub27_7.method7591();
		this.anInt5987 = this.aClass3_Sub27_7.method7591();
		this.anInt5988 = 500000;
		this.anIntArray534 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub27_7.method7549();
			@Pc(38) int local38 = this.aClass3_Sub27_7.method7549();
			if (local33 == 1297379947) {
				this.anIntArray534[local27] = this.aClass3_Sub27_7.anInt9191;
				local27++;
			}
			this.aClass3_Sub27_7.anInt9191 += local38;
		}
		this.aLong163 = 0L;
		this.anIntArray533 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray533[local33] = this.anIntArray534[local33];
		}
		this.anIntArray532 = new int[local12];
		this.anIntArray531 = new int[local12];
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)I")
	public int method5008(@OriginalArg(0) int arg0) {
		return this.method5003(arg0);
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()Z")
	public boolean method5009() {
		@Pc(3) int local3 = this.anIntArray533.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray533[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "()V")
	public void method5010() {
		this.aClass3_Sub27_7.anInt9191 = -1;
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)J")
	public long method5011(@OriginalArg(0) int arg0) {
		return this.aLong163 + (long) arg0 * (long) this.anInt5988;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(J)V")
	public void method5012(@OriginalArg(0) long arg0) {
		this.aLong163 = arg0;
		@Pc(6) int local6 = this.anIntArray533.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray532[local8] = 0;
			this.anIntArray531[local8] = 0;
			this.aClass3_Sub27_7.anInt9191 = this.anIntArray534[local8];
			this.method5000(local8);
			this.anIntArray533[local8] = this.aClass3_Sub27_7.anInt9191;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
	private int method5013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static304.aByteArray58[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub27_7.method7548() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub27_7.method7548() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub27_7.method7548();
		local12 = this.aClass3_Sub27_7.method7552();
		if (local7 == 47) {
			this.aClass3_Sub27_7.anInt9191 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub27_7.method7551();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray532[arg0];
			this.aLong163 += (long) local38 * (long) (this.anInt5988 - local32);
			this.anInt5988 = local32;
			this.aClass3_Sub27_7.anInt9191 += local12;
			return 2;
		} else {
			this.aClass3_Sub27_7.anInt9191 += local12;
			return 3;
		}
	}
}
