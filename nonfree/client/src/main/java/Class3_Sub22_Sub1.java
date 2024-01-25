import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class3_Sub22_Sub1 extends Class3_Sub22 {

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7940 = arg1;
		super.anInt7943 = arg2;
		super.anInt7939 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(FB)V")
	@Override
	public void method6723(@OriginalArg(0) float arg0) {
		super.aFloat162 = arg0;
	}
}
