import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BF)V")
	@Override
	public void method3329(@OriginalArg(1) float arg0) {
		super.aFloat75 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIII)V")
	@Override
	public void method3332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt3996 = arg1;
		super.anInt3998 = arg0;
		super.anInt3991 = arg2;
	}
}
