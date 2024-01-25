import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class4_Sub21_Sub1 extends Class4_Sub21 {

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt3866 = arg1;
		super.anInt3856 = arg2;
		super.anInt3860 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IF)V")
	@Override
	public void method3158(@OriginalArg(1) float arg0) {
		super.aFloat125 = arg0;
	}
}
