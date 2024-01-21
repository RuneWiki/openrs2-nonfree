import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!id", name = "V", descriptor = "Lclient!e;")
	public final Class8 aClass8_3;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class1_Sub3_Sub9(@OriginalArg(0) Class8 arg0) {
		this.aClass8_3 = arg0;
	}
}
