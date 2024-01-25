import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt8611 = arg1;
		super.anInt8609 = arg0;
		super.anInt8612 = arg2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(FI)V")
	@Override
	public void method7424(@OriginalArg(0) float arg0) {
		super.aFloat165 = arg0;
	}
}
