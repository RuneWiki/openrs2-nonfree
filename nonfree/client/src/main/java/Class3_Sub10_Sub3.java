import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class3_Sub10_Sub3 extends Class3_Sub10 {

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub10_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FI)V")
	@Override
	public void method6012(@OriginalArg(0) float arg0) {
		super.aFloat143 = arg0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt7186 = arg2;
		super.anInt7188 = arg0;
		super.anInt7179 = arg1;
	}
}
