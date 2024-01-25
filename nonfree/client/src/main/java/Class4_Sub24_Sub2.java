import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class4_Sub24_Sub2 extends Class4_Sub24 {

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub24_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BF)V")
	@Override
	public void method7148(@OriginalArg(1) float arg0) {
		super.aFloat216 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZ)V")
	@Override
	public void method7146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt8755 = arg2;
		super.anInt8753 = arg0;
		super.anInt8752 = arg1;
	}
}
