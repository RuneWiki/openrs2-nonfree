import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!kia", name = "f", descriptor = "Lclient!baa;")
	public final Class10_Sub2_Sub1 aClass10_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!bi;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass10_Sub2_Sub1_3 = Static596.method8401(arg3, arg2, arg0, arg1);
		this.aClass10_Sub2_Sub1_3.method720(false, false);
	}
}
