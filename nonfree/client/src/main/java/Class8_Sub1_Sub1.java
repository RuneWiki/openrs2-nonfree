import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIIF)V")
	public Class8_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IF)V")
	@Override
	public void method5199(@OriginalArg(1) float arg0) {
		super.aFloat125 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIII)V")
	@Override
	public void method5204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6405 = arg2;
		super.anInt6408 = arg0;
		super.anInt6407 = arg1;
	}
}
