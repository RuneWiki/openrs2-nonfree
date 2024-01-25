import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class2_Sub24_Sub2 extends Class2_Sub24 {

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub24_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IF)V")
	@Override
	public void method6310(@OriginalArg(1) float arg0) {
		super.aFloat149 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBII)V")
	@Override
	public void method6309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7460 = arg0;
		super.anInt7450 = arg1;
		super.anInt7449 = arg2;
	}
}
