import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "Lclient!cea;")
	public final Class50_Sub1_Sub1 aClass50_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!er;II[B)V")
	public Class53_Sub2(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass50_Sub1_Sub1_3 = Static392.method5564(arg1, arg3, arg2, arg0);
		this.aClass50_Sub1_Sub1_3.method1507(false, false);
	}
}
