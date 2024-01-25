import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt4961 = arg1;
		super.anInt4955 = arg2;
		super.anInt4963 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FI)V")
	@Override
	public void method4166(@OriginalArg(0) float arg0) {
		super.aFloat112 = arg0;
	}
}
