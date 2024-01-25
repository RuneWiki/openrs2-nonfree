import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!iaa;")
	public final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ac;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass2_Sub1_Sub1_3 = Static197.method5043(arg2, arg0, arg3, arg1);
		this.aClass2_Sub1_Sub1_3.method4205(false, false);
	}
}
