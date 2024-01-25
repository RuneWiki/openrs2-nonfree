import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class4_Sub7_Sub1 extends Class4_Sub7 {

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt5489 = arg2;
		super.anInt5490 = arg0;
		super.anInt5496 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(FI)V")
	@Override
	public void method4453(@OriginalArg(0) float arg0) {
		super.aFloat66 = arg0;
	}
}
