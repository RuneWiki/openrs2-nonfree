import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!og;")
	public final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_5;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!bv;II[B)V")
	public Class57_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass1_Sub3_Sub1_5 = Static205.method2945(arg1, arg3, arg2, arg0);
		this.aClass1_Sub3_Sub1_5.method3964(false, false);
	}
}
