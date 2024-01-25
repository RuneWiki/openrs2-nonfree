import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class31_Sub3_Sub1 extends Class31_Sub3 {

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!ml;)V")
	public Class31_Sub3_Sub1(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class96_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method8466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = super.aClass44_35.method5313();
		@Pc(23) int local23 = ((Class96_Sub1_Sub1) super.aClass96_5).anInt6351 * Static450.method6699() / 10 % local11;
		super.aClass44_35.method5326(local23 + arg3 - local11, arg0, arg2 + local11 - local23, arg1);
	}
}
