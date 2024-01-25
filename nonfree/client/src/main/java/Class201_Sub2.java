import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class201_Sub2 extends Class201 {

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!r;")
	public final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_5;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!qi;II[B)V")
	public Class201_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass7_Sub1_Sub1_5 = Static402.method4750(arg2, arg0, arg3, arg1);
		this.aClass7_Sub1_Sub1_5.method4749(false, false);
	}
}
