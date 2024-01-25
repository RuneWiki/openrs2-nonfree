import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class6_Sub6_Sub1 extends Class6_Sub6 {

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZF)V")
	@Override
	public void method1165(@OriginalArg(1) float arg0) {
		super.aFloat35 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method1171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt1302 = arg0;
		super.anInt1297 = arg2;
		super.anInt1295 = arg1;
	}
}
