import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class3_Sub7_Sub16 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pba", name = "E", descriptor = "Lclient!rca;")
	public final Class41_Sub2_Sub1_Sub5 aClass41_Sub2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!rca;)V")
	public Class3_Sub7_Sub16(@OriginalArg(0) Class41_Sub2_Sub1_Sub5 arg0) {
		this.aClass41_Sub2_Sub1_Sub5_1 = arg0;
	}
}
