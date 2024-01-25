import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class4_Sub32_Sub2 extends Class4_Sub32 {

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub32_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BIII)V")
	@Override
	public void method6623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt8010 = arg0;
		super.anInt8016 = arg1;
		super.anInt8014 = arg2;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(FB)V")
	@Override
	public void method6624(@OriginalArg(0) float arg0) {
		super.aFloat163 = arg0;
	}
}
