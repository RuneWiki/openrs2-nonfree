import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class1_Sub5_Sub11 extends Class1_Sub5 {

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "Lclient!uk;")
	public Class11_Sub7 aClass11_Sub7_1;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!uk;)V")
	public Class1_Sub5_Sub11(@OriginalArg(0) Class11_Sub7 arg0) {
		this.aClass11_Sub7_1 = arg0;
	}
}
