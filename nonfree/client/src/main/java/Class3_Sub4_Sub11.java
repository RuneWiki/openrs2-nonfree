import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "Lclient!go;")
	public final Class7_Sub2_Sub5 aClass7_Sub2_Sub5_1;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!go;)V")
	public Class3_Sub4_Sub11(@OriginalArg(0) Class7_Sub2_Sub5 arg0) {
		this.aClass7_Sub2_Sub5_1 = arg0;
	}
}
