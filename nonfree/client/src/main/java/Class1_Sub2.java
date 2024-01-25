import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!gda;")
	public final Class32_Sub1_Sub1 aClass32_Sub1_Sub1_5;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ffa;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass32_Sub1_Sub1_5 = Static218.method3126(arg0, arg2, arg1, arg3);
		this.aClass32_Sub1_Sub1_5.method2721(false, false);
	}
}
