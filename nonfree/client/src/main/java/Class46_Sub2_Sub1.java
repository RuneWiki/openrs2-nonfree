import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class46_Sub2_Sub1 extends Class46_Sub2 {

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!mja;)V")
	public Class46_Sub2_Sub1(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class132_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIB)V")
	@Override
	protected void method6773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = super.aClass155_27.method7206();
		@Pc(26) int local26 = ((Class132_Sub1_Sub1) super.aClass132_5).anInt6053 * Static616.method8458() / 10 % local7;
		super.aClass155_27.method7204(arg3 + local26 - local7, arg2, arg0 + local7 - local26, arg1);
	}
}
