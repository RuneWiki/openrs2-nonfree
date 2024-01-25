import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "Lclient!oh;")
	public final Class5_Sub3_Sub4 aClass5_Sub3_Sub4_1;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!oh;)V")
	public Class1_Sub1_Sub14(@OriginalArg(0) Class5_Sub3_Sub4 arg0) {
		this.aClass5_Sub3_Sub4_1 = arg0;
	}
}
