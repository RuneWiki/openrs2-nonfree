import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class139_Sub2 extends Class139 {

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!pe;)V")
	public Class139_Sub2(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class132_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method8824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = this.method8826() * super.aClass132_5.anInt9737 / 10000;
		Static103.aClass144_3.aa(arg0, arg1 + 2, local21, super.aClass132_5.anInt9742 - 2, ((Class132_Sub2) super.aClass132_5).anInt7711, 0);
		Static103.aClass144_3.aa(local21 + arg0, arg1 - -2, super.aClass132_5.anInt9737 - local21, super.aClass132_5.anInt9742 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZIIZ)V")
	@Override
	protected void method8823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static103.aClass144_3.method6923(arg1 - 2, arg0, super.aClass132_5.anInt9737 + 4, super.aClass132_5.anInt9742 + 2, ((Class132_Sub2) super.aClass132_5).anInt7712, 0);
		Static103.aClass144_3.method6923(arg1 - 1, arg0 + 1, super.aClass132_5.anInt9737 + 2, super.aClass132_5.anInt9742, 0, 0);
	}
}
