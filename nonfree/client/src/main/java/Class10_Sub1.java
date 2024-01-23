import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!an", name = "U", descriptor = "Lclient!em;")
	private Class47_Sub1 aClass47_Sub1_1;

	@OriginalMember(owner = "client!an", name = "I", descriptor = "I")
	private int anInt278 = 0;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "I")
	private int anInt266 = -1;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!an", name = "B", descriptor = "I")
	private int anInt273 = 0;

	@OriginalMember(owner = "client!an", name = "K", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!an", name = "L", descriptor = "I")
	private int anInt280 = -32768;

	@OriginalMember(owner = "client!an", name = "z", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!an", name = "N", descriptor = "I")
	public int anInt282;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "I")
	public int anInt281;

	@OriginalMember(owner = "client!an", name = "E", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!an", name = "J", descriptor = "I")
	public int anInt279;

	@OriginalMember(owner = "client!an", name = "P", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!an", name = "V", descriptor = "Lclient!bg;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIIIII)V")
	public Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt271 = arg3;
		this.anInt282 = arg5 + arg6;
		this.anInt281 = arg4;
		this.anInt275 = arg1;
		this.anInt279 = arg2;
		this.anInt284 = arg0;
		@Pc(45) int local45 = Static297.method1843(this.anInt284).anInt5489;
		if (local45 == -1) {
			this.aBoolean20 = true;
		} else {
			this.aBoolean20 = false;
			this.aClass15_1 = Static253.method4288(local45);
		}
		if (this.anInt282 == arg6) {
			Static158.method2622(this.anInt279, this.anInt278, this.aClass15_1, false, this.anInt271);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		return this.anInt280;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!hm;)V")
	private void method223(@OriginalArg(1) Class10_Sub4 arg0) {
		if (Static283.aBoolean393) {
			@Pc(4) Class10_Sub4_Sub1 local4 = (Class10_Sub4_Sub1) arg0;
			if ((this.aClass47_Sub1_1 == null || this.aClass47_Sub1_1.aBoolean103) && (local4.aClass190Array2 != null || local4.aClass67Array2 != null)) {
				this.aClass47_Sub1_1 = new Class47_Sub1(Static124.anInt2371, 1, 1);
			}
			if (this.aClass47_Sub1_1 != null) {
				this.aClass47_Sub1_1.method1089(local4.aClass190Array2, local4.aClass67Array2, false, local4.anIntArray174, local4.anIntArray177, local4.anIntArray173);
			}
		} else {
			@Pc(52) Class10_Sub4_Sub2 local52 = (Class10_Sub4_Sub2) arg0;
			if ((this.aClass47_Sub1_1 == null || this.aClass47_Sub1_1.aBoolean103) && (local52.aClass190Array3 != null || local52.aClass67Array3 != null)) {
				this.aClass47_Sub1_1 = new Class47_Sub1(Static124.anInt2371, 1, 1);
			}
			if (this.aClass47_Sub1_1 != null) {
				this.aClass47_Sub1_1.method1089(local52.aClass190Array3, local52.aClass67Array3, false, local52.anIntArray239, local52.anIntArray233, local52.anIntArray245);
			}
		}
		this.aBoolean21 = true;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Lclient!hm;")
	private Class10_Sub4 method226() {
		@Pc(8) Class173 local8 = Static297.method1843(this.anInt284);
		@Pc(27) Class10_Sub4 local27;
		if (this.aBoolean20) {
			local27 = local8.method4451(-1, -1, 0);
		} else {
			local27 = local8.method4451(this.anInt278, this.anInt266, this.anInt273);
		}
		return local27 == null ? null : local27;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		@Pc(7) Class10_Sub4 local7 = this.method226();
		if (local7 != null) {
			this.method223(local7);
			local7.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_1);
			this.anInt280 = local7.method4973();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)V")
	public void method228(@OriginalArg(0) int arg0) {
		if (this.aBoolean20) {
			return;
		}
		this.anInt273 += arg0;
		while (this.anInt273 > this.aClass15_1.anIntArray36[this.anInt278]) {
			this.anInt273 -= this.aClass15_1.anIntArray36[this.anInt278];
			this.anInt278++;
			if (this.anInt278 >= this.aClass15_1.anIntArray35.length) {
				this.aBoolean20 = true;
				break;
			}
		}
		if (!this.aBoolean20) {
			Static158.method2622(this.anInt279, this.anInt278, this.aClass15_1, false, this.anInt271);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean21) {
			@Pc(10) Class10_Sub4 local10 = this.method226();
			if (local10 == null) {
				return;
			}
			this.method223(local10);
		}
		if (this.aClass47_Sub1_1 != null) {
			this.aClass47_Sub1_1.method1093(arg0, arg1, arg3, arg2, arg4);
		}
	}
}
