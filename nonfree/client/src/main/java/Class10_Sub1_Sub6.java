import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class10_Sub1_Sub6 extends Class10_Sub1 {

	@OriginalMember(owner = "client!he", name = "A", descriptor = "Lclient!ia;")
	public final Class24_Sub3_Sub1 aClass24_Sub3_Sub1_1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class10_Sub1_Sub6(@OriginalArg(0) Class24_Sub3_Sub1 arg0) {
		this.aClass24_Sub3_Sub1_1 = arg0;
	}
}
