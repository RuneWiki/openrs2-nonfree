import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class3_Sub3_Sub8 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "Lclient!lf;")
	public final Class26_Sub4 aClass26_Sub4_1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class3_Sub3_Sub8(@OriginalArg(0) Class26_Sub4 arg0) {
		this.aClass26_Sub4_1 = arg0;
	}
}
