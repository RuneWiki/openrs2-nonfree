import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class3_Sub7_Sub17 extends Class3_Sub7 {

	@OriginalMember(owner = "client!we", name = "x", descriptor = "Lclient!th;")
	public final Class28_Sub1_Sub5 aClass28_Sub1_Sub5_1;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!th;)V")
	public Class3_Sub7_Sub17(@OriginalArg(0) Class28_Sub1_Sub5 arg0) {
		this.aClass28_Sub1_Sub5_1 = arg0;
	}
}
