import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!wq;")
	public final Class59_Sub3_Sub1 aClass59_Sub3_Sub1_3;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!vd;II[B)V")
	public Class119_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass59_Sub3_Sub1_3 = Static413.method5191(arg1, arg2, arg0, arg3);
		this.aClass59_Sub3_Sub1_3.method5770(false, false);
	}
}
