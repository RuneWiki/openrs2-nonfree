import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!at", name = "A", descriptor = "Lclient!io;")
	public final Class9_Sub2_Sub1_Sub4 aClass9_Sub2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!io;)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) Class9_Sub2_Sub1_Sub4 arg0) {
		this.aClass9_Sub2_Sub1_Sub4_1 = arg0;
	}
}
