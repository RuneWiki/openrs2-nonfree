import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public final class Class3_Sub13_Sub3 extends Class3_Sub13 {

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub13_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(BIII)V")
	@Override
	public void method5964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7095 = arg0;
		super.anInt7100 = arg2;
		super.anInt7099 = arg1;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IF)V")
	@Override
	public void method5965(@OriginalArg(1) float arg0) {
		super.aFloat139 = arg0;
	}
}
