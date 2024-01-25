import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class81_Sub1 extends Class81 {

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!b;)V")
	public Class81_Sub1(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class21_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method8297(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static488.aClass67_12.method7700(arg1 - 2, arg0, super.aClass21_5.anInt3462 + 4, super.aClass21_5.anInt3460 + 2, ((Class21_Sub1) super.aClass21_5).anInt656, 0);
		Static488.aClass67_12.method7700(arg1 - 1, arg0 - -1, super.aClass21_5.anInt3462 + 2, super.aClass21_5.anInt3460, 0, 0);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.method8296() * super.aClass21_5.anInt3462 / 10000;
		Static488.aClass67_12.aa(arg0, arg1 + 2, local13, super.aClass21_5.anInt3460 - 2, ((Class21_Sub1) super.aClass21_5).anInt652, 0);
		Static488.aClass67_12.aa(local13 + arg0, arg1 + 2, super.aClass21_5.anInt3462 - local13, super.aClass21_5.anInt3460 + -2, 0, 0);
	}
}
