import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "Lclient!od;")
	public Class5_Sub5 aClass5_Sub5_1;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class2_Sub3_Sub5(@OriginalArg(0) Class5_Sub5 arg0) {
		this.aClass5_Sub5_1 = arg0;
	}
}
