import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class3_Sub3_Sub10 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "Lclient!ud;")
	public final Class26_Sub7 aClass26_Sub7_1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class3_Sub3_Sub10(@OriginalArg(0) Class26_Sub7 arg0) {
		this.aClass26_Sub7_1 = arg0;
	}
}
