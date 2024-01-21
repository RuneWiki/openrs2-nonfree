import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class3_Sub3_Sub13 extends Class3_Sub3 {

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!ld;")
	public final Class26_Sub3 aClass26_Sub3_1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ld;)V")
	public Class3_Sub3_Sub13(@OriginalArg(0) Class26_Sub3 arg0) {
		this.aClass26_Sub3_1 = arg0;
	}
}
