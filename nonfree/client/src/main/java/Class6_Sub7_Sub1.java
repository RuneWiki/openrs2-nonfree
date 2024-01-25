import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class6_Sub7_Sub1 extends Class6_Sub7 {

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BIII)V")
	@Override
	public void method4290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt4949 = arg2;
		super.anInt4951 = arg1;
		super.anInt4947 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(FZ)V")
	@Override
	public void method4289(@OriginalArg(0) float arg0) {
		super.aFloat115 = arg0;
	}
}
