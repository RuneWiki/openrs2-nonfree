import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class12_Sub7_Sub2 extends Class12_Sub7 {

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIIF)V")
	public Class12_Sub7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6116 = arg2;
		super.anInt6110 = arg1;
		super.anInt6115 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(FB)V")
	@Override
	public void method5121(@OriginalArg(0) float arg0) {
		super.aFloat127 = arg0;
	}
}
