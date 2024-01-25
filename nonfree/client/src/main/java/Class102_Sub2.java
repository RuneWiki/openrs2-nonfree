import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!cda;)V")
	public Class102_Sub2(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class50_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.method8156() * super.aClass50_5.anInt7637 / 10000;
		Static39.aClass7_2.J(arg0, arg1 + 2, local13, super.aClass50_5.anInt7630 - 2, ((Class50_Sub1) super.aClass50_5).anInt1574, 0);
		Static39.aClass7_2.J(local13 + arg0, arg1 + 2, super.aClass50_5.anInt7637 - local13, super.aClass50_5.anInt7630 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method8154(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static39.aClass7_2.method7824(arg1 - 2, arg0, super.aClass50_5.anInt7637 + 4, super.aClass50_5.anInt7630 + 2, ((Class50_Sub1) super.aClass50_5).anInt1576, 0);
		Static39.aClass7_2.method7824(arg1 - 1, arg0 + 1, super.aClass50_5.anInt7637 + 2, super.aClass50_5.anInt7630, 0, 0);
	}
}
