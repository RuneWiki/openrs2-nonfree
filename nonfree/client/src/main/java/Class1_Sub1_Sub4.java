import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "Lclient!bm;")
	public Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_1 = arg0;
	}
}
