import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class2_Sub29_Sub1 extends Class2_Sub29 {

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt7259 = arg0;
		super.anInt7256 = arg1;
		super.anInt7261 = arg2;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BF)V")
	@Override
	public void method5688(@OriginalArg(1) float arg0) {
		super.aFloat106 = arg0;
	}
}
