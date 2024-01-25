import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class71_Sub2_Sub1 extends Class71_Sub2 {

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!hha;)V")
	public Class71_Sub2_Sub1(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class110_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = super.aClass59_28.method8053();
		@Pc(19) int local19 = ((Class110_Sub1_Sub1) super.aClass110_5).anInt3565 * Static265.method3767() / 10 % local7;
		super.aClass59_28.method8063(local19 + arg3 - local7, arg1, local7 + arg2 - local19, arg0);
	}
}
