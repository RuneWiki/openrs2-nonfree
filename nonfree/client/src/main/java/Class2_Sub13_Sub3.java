import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class2_Sub13_Sub3 extends Class2_Sub13 {

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub13_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IF)V")
	@Override
	public void method9415(@OriginalArg(1) float arg0) {
		super.aFloat202 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt10996 = arg1;
		super.anInt10998 = arg0;
		super.anInt11009 = arg2;
	}
}
