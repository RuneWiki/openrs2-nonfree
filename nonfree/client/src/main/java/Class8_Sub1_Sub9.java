import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class8_Sub1_Sub9 extends Class8_Sub1 {

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Lclient!s;")
	public Class36_Sub6 aClass36_Sub6_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!s;)V")
	public Class8_Sub1_Sub9(@OriginalArg(0) Class36_Sub6 arg0) {
		this.aClass36_Sub6_1 = arg0;
	}
}
