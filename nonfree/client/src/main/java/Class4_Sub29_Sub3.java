import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class4_Sub29_Sub3 extends Class4_Sub29 {

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub29_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IF)V")
	@Override
	public void method7625(@OriginalArg(1) float arg0) {
		super.aFloat204 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BIII)V")
	@Override
	public void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt8928 = arg2;
		super.anInt8935 = arg0;
		super.anInt8924 = arg1;
	}
}
