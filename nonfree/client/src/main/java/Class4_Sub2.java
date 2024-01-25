import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!kba;)V")
	public Class4_Sub2(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class22_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7043() * super.aClass22_5.anInt5441 / 10000;
		Static162.aClass100_7.aa(arg0, arg1 + 2, local13, super.aClass22_5.anInt5435 - 2, ((Class22_Sub3) super.aClass22_5).anInt5445, 0);
		Static162.aClass100_7.aa(arg0 + local13, arg1 + 2, super.aClass22_5.anInt5441 - local13, super.aClass22_5.anInt5435 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZBI)V")
	@Override
	protected void method7045(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static162.aClass100_7.method8845(arg0 - 2, arg1, super.aClass22_5.anInt5441 + 4, super.aClass22_5.anInt5435 + 2, ((Class22_Sub3) super.aClass22_5).anInt5442, 0);
		Static162.aClass100_7.method8845(arg0 - 1, arg1 + 1, super.aClass22_5.anInt5441 + 2, super.aClass22_5.anInt5435, 0, 0);
	}
}
