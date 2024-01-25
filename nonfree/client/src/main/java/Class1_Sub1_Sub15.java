import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!db;")
	public final Class49_Sub2_Sub1 aClass49_Sub2_Sub1_1;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!db;)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) Class49_Sub2_Sub1 arg0) {
		this.aClass49_Sub2_Sub1_1 = arg0;
	}
}
