import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Lclient!il;")
	private Class21_Sub1 aClass21_Sub1_3;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	private int anInt3388 = 0;

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
	private int anInt3392 = -1;

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
	private int anInt3395 = 0;

	@OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
	private int anInt3399 = -32768;

	@OriginalMember(owner = "client!mk", name = "W", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	public int anInt3382;

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
	public int anInt3391;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public int anInt3378;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
	public int anInt3394;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	private int anInt3384;

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
	public int anInt3393;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "Lclient!wi;")
	private Class186 aClass186_3;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class13_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3382 = arg4;
		this.anInt3391 = arg3;
		this.anInt3378 = arg2;
		this.anInt3394 = arg1;
		this.anInt3384 = arg0;
		this.anInt3393 = arg6 + arg5;
		@Pc(45) int local45 = Static32.method639(this.anInt3384).anInt3877;
		if (local45 == -1) {
			this.aBoolean218 = true;
		} else {
			this.aBoolean218 = false;
			this.aClass186_3 = Static51.method992(local45);
		}
		if (arg6 == this.anInt3393) {
			Static229.method3598(false, this.anInt3391, this.aClass186_3, this.anInt3378, this.anInt3388);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lclient!gk;")
	private Class13_Sub1 method2685() {
		@Pc(4) Class120 local4 = Static32.method639(this.anInt3384);
		@Pc(27) Class13_Sub1 local27;
		if (this.aBoolean218) {
			local27 = local4.method3158(-1, 0, -1);
		} else {
			local27 = local4.method3158(this.anInt3392, this.anInt3395, this.anInt3388);
		}
		return local27 == null ? null : local27;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)V")
	public void method2687(@OriginalArg(1) int arg0) {
		if (this.aBoolean218) {
			return;
		}
		this.anInt3395 += arg0;
		while (this.aClass186_3.anIntArray470[this.anInt3388] < this.anInt3395) {
			this.anInt3395 -= this.aClass186_3.anIntArray470[this.anInt3388];
			this.anInt3388++;
			if (this.aClass186_3.anIntArray469.length <= this.anInt3388) {
				this.aBoolean218 = true;
				break;
			}
		}
		if (!this.aBoolean218) {
			Static229.method3598(false, this.anInt3391, this.aClass186_3, this.anInt3378, this.anInt3388);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		@Pc(7) Class13_Sub1 local7 = this.method2685();
		if (local7 != null) {
			this.method2689(local7);
			local7.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_3);
			this.anInt3399 = local7.method4266();
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		return this.anInt3399;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!gk;)V")
	private void method2689(@OriginalArg(1) Class13_Sub1 arg0) {
		if (Static251.aBoolean330) {
			@Pc(50) Class13_Sub1_Sub2 local50 = (Class13_Sub1_Sub2) arg0;
			if ((this.aClass21_Sub1_3 == null || this.aClass21_Sub1_3.aBoolean152) && (local50.aClass62Array2 != null || local50.aClass88Array2 != null)) {
				this.aClass21_Sub1_3 = new Class21_Sub1(Static50.anInt1118, 1, 1);
			}
			if (this.aClass21_Sub1_3 != null) {
				this.aClass21_Sub1_3.method1974(local50.aClass62Array2, local50.aClass88Array2, false, local50.anIntArray289, local50.anIntArray286, local50.anIntArray290);
			}
		} else {
			@Pc(4) Class13_Sub1_Sub1 local4 = (Class13_Sub1_Sub1) arg0;
			if ((this.aClass21_Sub1_3 == null || this.aClass21_Sub1_3.aBoolean152) && (local4.aClass62Array1 != null || local4.aClass88Array1 != null)) {
				this.aClass21_Sub1_3 = new Class21_Sub1(Static50.anInt1118, 1, 1);
			}
			if (this.aClass21_Sub1_3 != null) {
				this.aClass21_Sub1_3.method1974(local4.aClass62Array1, local4.aClass88Array1, false, local4.anIntArray15, local4.anIntArray22, local4.anIntArray20);
			}
		}
		this.aBoolean219 = true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean219) {
			@Pc(10) Class13_Sub1 local10 = this.method2685();
			if (local10 == null) {
				return;
			}
			this.method2689(local10);
		}
		if (this.aClass21_Sub1_3 != null) {
			this.aClass21_Sub1_3.method1976(arg0, arg1, arg3, arg2, arg4);
		}
	}
}
