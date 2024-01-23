import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "Lclient!kb;")
	public Class12_Sub7 aClass12_Sub7_1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class2_Sub2_Sub23(@OriginalArg(0) Class12_Sub7 arg0) {
		this.aClass12_Sub7_1 = arg0;
	}
}
