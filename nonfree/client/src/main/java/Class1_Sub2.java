import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!iq;")
	public final Class53_Sub2_Sub1 aClass53_Sub2_Sub1_2;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!pq;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass53_Sub2_Sub1_2 = Static655.method8906(arg1, arg3, arg0, arg2);
		this.aClass53_Sub2_Sub1_2.method3730(false, false);
	}
}
