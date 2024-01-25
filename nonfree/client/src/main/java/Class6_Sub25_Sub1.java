import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class6_Sub25_Sub1 extends Class6_Sub25 {

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(FB)V")
	@Override
	public void method6408(@OriginalArg(0) float arg0) {
		super.aFloat172 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt8056 = arg2;
		super.anInt8055 = arg1;
		super.anInt8053 = arg0;
	}
}
