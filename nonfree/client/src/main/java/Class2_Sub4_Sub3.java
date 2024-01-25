import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class2_Sub4_Sub3 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt9749 = arg0;
		super.anInt9751 = arg1;
		super.anInt9753 = arg2;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(FI)V")
	@Override
	public void method8149(@OriginalArg(0) float arg0) {
		super.aFloat219 = arg0;
	}
}
