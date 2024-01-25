import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class3_Sub16_Sub1 extends Class3_Sub16 {

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BIII)V")
	@Override
	public void method4784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt5325 = arg0;
		super.anInt5332 = arg2;
		super.anInt5326 = arg1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FI)V")
	@Override
	public void method4780(@OriginalArg(0) float arg0) {
		super.aFloat107 = arg0;
	}
}
