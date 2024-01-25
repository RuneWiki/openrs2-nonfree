import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZF)V")
	@Override
	public void method4083(@OriginalArg(1) float arg0) {
		super.aFloat73 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt5167 = arg2;
		super.anInt5162 = arg0;
		super.anInt5173 = arg1;
	}
}
