import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "Lclient!sc;")
	public Class107 aClass107_816;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class1_Sub19() {
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!sc;)V")
	public Class1_Sub19(@OriginalArg(0) Class107 arg0) {
		this.aClass107_816 = arg0;
	}
}
