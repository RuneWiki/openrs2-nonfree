import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class6_Sub29_Sub1 extends Class6_Sub29 {

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZF)V")
	@Override
	public void method6156(@OriginalArg(1) float arg0) {
		super.aFloat171 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt7308 = arg0;
		super.anInt7309 = arg2;
		super.anInt7301 = arg1;
	}
}
