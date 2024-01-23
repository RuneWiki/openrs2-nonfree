import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Lclient!rc;")
	public Class2_Sub6 aClass2_Sub6_1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!rc;)V")
	public Class1_Sub3_Sub12(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aClass2_Sub6_1 = arg0;
	}
}
