import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class139 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
	public int[] anIntArray496;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
	private int[] anIntArray497;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	private int anInt4249;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public int anInt4250;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!jj;")
	private Class1_Sub18 aClass1_Sub18_4 = new Class1_Sub18(null);

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class139() {
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	public Class139(@OriginalArg(0) byte[] arg0) {
		this.method3402(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)J")
	public long method3391(@OriginalArg(0) int arg0) {
		return this.aLong141 + (long) arg0 * (long) this.anInt4249;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	public int method3392(@OriginalArg(0) int arg0) {
		return this.method3400(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public void method3393(@OriginalArg(0) int arg0) {
		this.anIntArray497[arg0] = this.aClass1_Sub18_4.anInt3911;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public void method3394() {
		this.aClass1_Sub18_4.anInt3911 = -1;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()Z")
	public boolean method3395() {
		@Pc(3) int local3 = this.anIntArray497.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray497[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()I")
	public int method3396() {
		@Pc(3) int local3 = this.anIntArray497.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray497[local9] >= 0 && this.anIntArray496[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray496[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	public void method3398(@OriginalArg(0) int arg0) {
		this.aClass1_Sub18_4.anInt3911 = this.anIntArray497[arg0];
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "()V")
	public void method3399() {
		this.aClass1_Sub18_4.aByteArray71 = null;
		this.anIntArray499 = null;
		this.anIntArray497 = null;
		this.anIntArray496 = null;
		this.anIntArray498 = null;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)I")
	private int method3400(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub18_4.aByteArray71[this.aClass1_Sub18_4.anInt3911];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray498[arg0] = local13;
			this.aClass1_Sub18_4.anInt3911++;
		} else {
			local13 = this.anIntArray498[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3403(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub18_4.method3059();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub18_4.aByteArray71[this.aClass1_Sub18_4.anInt3911] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub18_4.anInt3911++;
				this.anIntArray498[arg0] = local57;
				return this.method3403(arg0, local57);
			}
		}
		this.aClass1_Sub18_4.anInt3911 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V")
	public void method3401(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub18_4.method3059();
		this.anIntArray496[arg0] += local4;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([B)V")
	public void method3402(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub18_4.aByteArray71 = arg0;
		this.aClass1_Sub18_4.anInt3911 = 10;
		@Pc(12) int local12 = this.aClass1_Sub18_4.method3107();
		this.anInt4250 = this.aClass1_Sub18_4.method3107();
		this.anInt4249 = 500000;
		this.anIntArray499 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub18_4.method3074();
			@Pc(40) int local40 = this.aClass1_Sub18_4.method3074();
			if (local35 == 1297379947) {
				this.anIntArray499[local27] = this.aClass1_Sub18_4.anInt3911;
				local27++;
			}
			this.aClass1_Sub18_4.anInt3911 += local40;
		}
		this.aLong141 = 0L;
		this.anIntArray497 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray497[local27] = this.anIntArray499[local27];
		}
		this.anIntArray496 = new int[local12];
		this.anIntArray498 = new int[local12];
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
	private int method3403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static215.aByteArray73[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub18_4.method3122() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub18_4.method3122() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub18_4.method3122();
		local12 = this.aClass1_Sub18_4.method3059();
		if (local7 == 47) {
			this.aClass1_Sub18_4.anInt3911 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub18_4.method3109();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray496[arg0];
			this.aLong141 += (long) local38 * (long) (this.anInt4249 - local32);
			this.anInt4249 = local32;
			this.aClass1_Sub18_4.anInt3911 += local12;
			return 2;
		} else {
			this.aClass1_Sub18_4.anInt3911 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "()I")
	public int method3404() {
		return this.anIntArray497.length;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "()Z")
	public boolean method3405() {
		return this.aClass1_Sub18_4.aByteArray71 != null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(J)V")
	public void method3406(@OriginalArg(0) long arg0) {
		this.aLong141 = arg0;
		@Pc(6) int local6 = this.anIntArray497.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray496[local8] = 0;
			this.anIntArray498[local8] = 0;
			this.aClass1_Sub18_4.anInt3911 = this.anIntArray499[local8];
			this.method3401(local8);
			this.anIntArray497[local8] = this.aClass1_Sub18_4.anInt3911;
		}
	}
}
