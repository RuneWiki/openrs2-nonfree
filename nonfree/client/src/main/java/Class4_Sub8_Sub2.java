import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class4_Sub8_Sub2 extends Class4_Sub8 {

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt7363 = arg0;
		super.anInt7368 = arg2;
		super.anInt7367 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(FI)V")
	@Override
	public void method5671(@OriginalArg(0) float arg0) {
		super.aFloat216 = arg0;
	}
}
