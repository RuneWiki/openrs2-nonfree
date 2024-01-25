import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class14_Sub44 extends Class14 {

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "Lclient!av;")
	public final Class12_Sub2_Sub2_Sub1_Sub1 aClass12_Sub2_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!av;)V")
	public Class14_Sub44(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub1 arg0) {
		this.aClass12_Sub2_Sub2_Sub1_Sub1_2 = arg0;
	}
}
