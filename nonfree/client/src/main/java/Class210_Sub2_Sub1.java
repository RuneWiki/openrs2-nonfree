import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class210_Sub2_Sub1 extends Class210_Sub2 {

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!aea;)V")
	public Class210_Sub2_Sub1(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class9_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IBIII)V")
	@Override
	protected void method5244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass39_20.A();
		@Pc(24) int local24 = ((Class9_Sub1_Sub1) super.aClass9_5).anInt414 * Static504.method7010() / 10 % local7;
		super.aClass39_20.method7860(local24 + arg1 - local7, arg2, local7 + arg3 - local24, arg0);
	}
}
