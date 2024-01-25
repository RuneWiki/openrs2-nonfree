import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class8_Sub3_Sub3_Sub3 extends Class8_Sub3_Sub3 {

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lclient!mca;")
	private Class8_Sub7 aClass8_Sub7_5;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
	private int anInt5389 = 0;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	private int anInt5381 = 0;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
	private int anInt5394 = 0;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
	private final int anInt5400 = -1;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
	private int anInt5406 = 0;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
	private int anInt5407 = 0;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
	public final int anInt5388;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
	private final int anInt5386;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "Lclient!rk;")
	private Class290 aClass290_3;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class8_Sub3_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5388 = arg1 + arg2;
		this.anInt5394 = arg12;
		this.anInt5386 = arg0;
		@Pc(53) Class60 local53 = Static107.aClass200_3.method3956(this.anInt5386);
		@Pc(56) int local56 = local53.anInt1383;
		if (local56 == -1) {
			this.aBoolean432 = true;
		} else {
			this.aClass290_3 = Static192.aClass211_1.method4277(local56);
			this.aBoolean432 = false;
		}
		if (this.anInt5388 == arg2) {
			Static137.method2090(this.aClass290_3, super.anInt9365, this.anInt5406, false, super.anInt9370, super.aByte123);
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.anInt5389;
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub7_5 != null) {
			this.aClass8_Sub7_5.method4397();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method4377() {
		if (this.aClass8_Sub7_5 != null) {
			this.aClass8_Sub7_5.method4397();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 <= 39) {
			Static315.method4375(-31, -65, -80);
		}
		return this.anInt5381;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method4379(@OriginalArg(0) int arg0) {
		if (this.aBoolean432) {
			return;
		}
		this.anInt5407 += arg0;
		while (this.anInt5407 > this.aClass290_3.anIntArray603[this.anInt5406]) {
			this.anInt5407 -= this.aClass290_3.anIntArray603[this.anInt5406];
			this.anInt5406++;
			if (this.aClass290_3.anIntArray604.length <= this.anInt5406) {
				this.aBoolean432 = true;
				break;
			}
		}
		if (!this.aBoolean432) {
			Static137.method2090(this.aClass290_3, super.anInt9365, this.anInt5406, false, super.anInt9370, super.aByte123);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!r;BI)Lclient!da;")
	private Class63 method4380(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class60 local8 = Static107.aClass200_3.method3956(arg2);
		@Pc(13) Class47 local13 = Static216.aClass47Array2[super.aByte123];
		@Pc(28) Class47 local28 = super.aByte124 < 3 ? Static216.aClass47Array2[super.aByte124 + 1] : null;
		return this.aBoolean432 ? local8.method1224(arg0, super.anInt9361, -1, local28, -1, arg1, 0, super.anInt9370, super.anInt9365, local13, Static192.aClass211_1) : local8.method1224(arg0, super.anInt9361, this.anInt5400, local28, this.anInt5406, arg1, this.anInt5407, super.anInt9370, super.anInt9365, local13, Static192.aClass211_1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aBoolean434;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		@Pc(11) Class63 local11 = this.method4380(0, arg0, this.anInt5386);
		if (local11 != null) {
			@Pc(16) Class113 local16 = arg0.method6963();
			local16.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			this.method4381(local16, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		@Pc(23) Class63 local23 = this.method4380((this.anInt5394 == 0 ? 0 : 5) | 0x800, arg0, this.anInt5386);
		if (local23 == null) {
			return null;
		}
		if (this.anInt5394 != 0) {
			local23.M(this.anInt5394 * 2048);
		}
		@Pc(39) Class113 local39 = arg0.method6963();
		local39.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		this.method4381(local39, arg0, local23);
		if (Static181.aBoolean242) {
			local23.method7420(local39, null, Static40.anInt631, 0);
		} else {
			local23.method7429(local39, null, 0);
		}
		if (this.aClass8_Sub7_5 != null) {
			@Pc(75) Class343 local75 = this.aClass8_Sub7_5.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local75, Static40.anInt631);
			} else {
				arg0.method6940(local75);
			}
		}
		this.aBoolean434 = local23.LA();
		this.anInt5389 = local23.J();
		this.anInt5381 = local23.RA();
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!q;Lclient!r;Lclient!da;I)V")
	private void method4381(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class63 arg2) {
		arg2.method7409(arg0);
		@Pc(15) Class206[] local15 = arg2.method7421();
		@Pc(18) Class158[] local18 = arg2.method7413();
		if ((this.aClass8_Sub7_5 == null || this.aClass8_Sub7_5.aBoolean436) && (local15 != null || local18 != null)) {
			this.aClass8_Sub7_5 = Static318.method4392(Static301.anInt5197, true);
		}
		if (this.aClass8_Sub7_5 != null) {
			this.aClass8_Sub7_5.method4399(arg1, (long) Static301.anInt5197, local15, local18);
			this.aClass8_Sub7_5.method4396(super.aByte123, super.aShort132, super.aShort133, super.aShort131, super.aShort130);
		}
	}
}
