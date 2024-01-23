import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "Lclient!nd;")
	public Class6_Sub4 aClass6_Sub4_1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) Class6_Sub4 arg0) {
		this.aClass6_Sub4_1 = arg0;
	}
}
