import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BF)V")
	@Override
	public void method2431(@OriginalArg(1) float arg0) {
		super.aFloat34 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method2433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt2818 = arg1;
		super.anInt2820 = arg2;
		super.anInt2813 = arg0;
	}
}
