import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class1_Sub5_Sub6 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "Lclient!mo;")
	public final Class25_Sub5_Sub5 aClass25_Sub5_Sub5_1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class1_Sub5_Sub6(@OriginalArg(0) Class25_Sub5_Sub5 arg0) {
		this.aClass25_Sub5_Sub5_1 = arg0;
	}
}
