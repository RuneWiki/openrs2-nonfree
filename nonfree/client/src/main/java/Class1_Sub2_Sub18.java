import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Lclient!bf;")
	public Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_1 = arg0;
	}
}
