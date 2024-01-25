import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class94_Sub2_Sub1 extends Class94_Sub2 {

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!ht;)V")
	public Class94_Sub2_Sub1(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class92_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIBI)V")
	@Override
	protected void method3772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass20_22.method7394();
		@Pc(19) int local19 = ((Class92_Sub1_Sub1) super.aClass92_5).anInt4241 * Static121.method2073() / 10 % local7;
		super.aClass20_22.method7414(arg0 + local19 - local7, arg1, local7 + arg3 - local19, arg2);
	}
}
