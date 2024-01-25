import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class3_Sub5_Sub6 extends Class3_Sub5 {

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "Lclient!eha;")
	public final Class34_Sub1_Sub1_Sub3 aClass34_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class3_Sub5_Sub6(@OriginalArg(0) Class34_Sub1_Sub1_Sub3 arg0) {
		this.aClass34_Sub1_Sub1_Sub3_1 = arg0;
	}
}
