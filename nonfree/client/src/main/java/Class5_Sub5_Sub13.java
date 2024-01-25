import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class5_Sub5_Sub13 extends Class5_Sub5 {

	@OriginalMember(owner = "client!jfa", name = "u", descriptor = "Lclient!dga;")
	public final Class8_Sub1_Sub3_Sub1 aClass8_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!dga;)V")
	public Class5_Sub5_Sub13(@OriginalArg(0) Class8_Sub1_Sub3_Sub1 arg0) {
		this.aClass8_Sub1_Sub3_Sub1_1 = arg0;
	}
}
