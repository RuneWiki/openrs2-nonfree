import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!wga;)V")
	public Class128_Sub1(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class10_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static208.aClass65_7.method6895(arg0 - 2, arg1, super.aClass10_5.anInt10594 + 4, super.aClass10_5.anInt10595 - -2, ((Class10_Sub3) super.aClass10_5).anInt10606, 0);
		Static208.aClass65_7.method6895(arg0 - 1, arg1 + 1, super.aClass10_5.anInt10594 + 2, super.aClass10_5.anInt10595, 0, 0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method4084(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method4085() * super.aClass10_5.anInt10594 / 10000;
		Static208.aClass65_7.aa(arg0, arg1 + 2, local13, super.aClass10_5.anInt10595 - 2, ((Class10_Sub3) super.aClass10_5).anInt10603, 0);
		Static208.aClass65_7.aa(arg0 + local13, arg1 + 2, super.aClass10_5.anInt10594 - local13, super.aClass10_5.anInt10595 + -2, 0, 0);
	}
}
