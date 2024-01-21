import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Lclient!dj;")
	public final Class8_Sub4 aClass8_Sub4_1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!dj;)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class8_Sub4 arg0) {
		this.aClass8_Sub4_1 = arg0;
	}
}
