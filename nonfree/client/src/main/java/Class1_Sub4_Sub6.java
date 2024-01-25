import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class1_Sub4_Sub6 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "Lclient!lj;")
	public final Class17_Sub1_Sub2 aClass17_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class1_Sub4_Sub6(@OriginalArg(0) Class17_Sub1_Sub2 arg0) {
		this.aClass17_Sub1_Sub2_1 = arg0;
	}
}
