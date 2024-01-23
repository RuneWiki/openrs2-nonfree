import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class104 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "J")
	private long aLong121;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private int anInt3314;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!pi;")
	private Class4_Sub24 aClass4_Sub24_28 = new Class4_Sub24(null);

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class104() {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
	public Class104(@OriginalArg(0) byte[] arg0) {
		this.method2620(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	private int method2613(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub24_28.aByteArray47[this.aClass4_Sub24_28.anInt3822];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray273[arg0] = local13;
			this.aClass4_Sub24_28.anInt3822++;
		} else {
			local13 = this.anIntArray273[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2619(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub24_28.method3077();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub24_28.aByteArray47[this.aClass4_Sub24_28.anInt3822] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub24_28.anInt3822++;
				this.anIntArray273[arg0] = local57;
				return this.method2619(arg0, local57);
			}
		}
		this.aClass4_Sub24_28.anInt3822 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()I")
	public int method2614() {
		@Pc(3) int local3 = this.anIntArray274.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray274[local9] >= 0 && this.anIntArray276[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray276[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V")
	public void method2615(@OriginalArg(0) long arg0) {
		this.aLong121 = arg0;
		@Pc(6) int local6 = this.anIntArray274.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray276[local8] = 0;
			this.anIntArray273[local8] = 0;
			this.aClass4_Sub24_28.anInt3822 = this.anIntArray275[local8];
			this.method2617(local8);
			this.anIntArray274[local8] = this.aClass4_Sub24_28.anInt3822;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method2617(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub24_28.method3077();
		this.anIntArray276[arg0] += local4;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method2618(@OriginalArg(0) int arg0) {
		this.aClass4_Sub24_28.anInt3822 = this.anIntArray274[arg0];
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	private int method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static164.aByteArray42[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub24_28.method3110() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub24_28.method3110() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub24_28.method3110();
		local12 = this.aClass4_Sub24_28.method3077();
		if (local7 == 47) {
			this.aClass4_Sub24_28.anInt3822 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub24_28.method3063();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray276[arg0];
			this.aLong121 += (long) local38 * (long) (this.anInt3314 - local32);
			this.anInt3314 = local32;
			this.aClass4_Sub24_28.anInt3822 += local12;
			return 2;
		} else {
			this.aClass4_Sub24_28.anInt3822 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
	public void method2620(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub24_28.aByteArray47 = arg0;
		this.aClass4_Sub24_28.anInt3822 = 10;
		@Pc(12) int local12 = this.aClass4_Sub24_28.method3085();
		this.anInt3315 = this.aClass4_Sub24_28.method3085();
		this.anInt3314 = 500000;
		this.anIntArray275 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass4_Sub24_28.method3084();
			@Pc(40) int local40 = this.aClass4_Sub24_28.method3084();
			if (local35 == 1297379947) {
				this.anIntArray275[local27] = this.aClass4_Sub24_28.anInt3822;
				local27++;
			}
			this.aClass4_Sub24_28.anInt3822 += local40;
		}
		this.aLong121 = 0L;
		this.anIntArray274 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray274[local27] = this.anIntArray275[local27];
		}
		this.anIntArray276 = new int[local12];
		this.anIntArray273 = new int[local12];
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
	public int method2621(@OriginalArg(0) int arg0) {
		return this.method2613(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
	public void method2622() {
		this.aClass4_Sub24_28.aByteArray47 = null;
		this.anIntArray275 = null;
		this.anIntArray274 = null;
		this.anIntArray276 = null;
		this.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
	public void method2623() {
		this.aClass4_Sub24_28.anInt3822 = -1;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)J")
	public long method2624(@OriginalArg(0) int arg0) {
		return this.aLong121 + (long) arg0 * (long) this.anInt3314;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()Z")
	public boolean method2625() {
		return this.aClass4_Sub24_28.aByteArray47 != null;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public void method2626(@OriginalArg(0) int arg0) {
		this.anIntArray274[arg0] = this.aClass4_Sub24_28.anInt3822;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()Z")
	public boolean method2627() {
		@Pc(3) int local3 = this.anIntArray274.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray274[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method2628() {
		return this.anIntArray274.length;
	}
}
