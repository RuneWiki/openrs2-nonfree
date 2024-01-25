import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class5_Sub27_Sub1 extends Class5_Sub27 {

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt7110 = arg2;
		super.anInt7112 = arg0;
		super.anInt7105 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(FI)V")
	@Override
	public void method6337(@OriginalArg(0) float arg0) {
		super.aFloat150 = arg0;
	}
}
