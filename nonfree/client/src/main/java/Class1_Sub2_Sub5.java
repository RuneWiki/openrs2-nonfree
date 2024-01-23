import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "Lclient!sf;")
	public Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class6_Sub7 arg0) {
		this.aClass6_Sub7_1 = arg0;
	}
}
