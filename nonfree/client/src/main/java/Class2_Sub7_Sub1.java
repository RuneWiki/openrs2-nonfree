import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BIII)V")
	@Override
	public void method2998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt3740 = arg1;
		super.anInt3741 = arg0;
		super.anInt3739 = arg2;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IF)V")
	@Override
	public void method2995(@OriginalArg(1) float arg0) {
		super.aFloat123 = arg0;
	}
}
