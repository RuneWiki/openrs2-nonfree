import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class12_Sub4_Sub12 extends Class12_Sub4 {

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!tt;")
	public final Class30_Sub1_Sub5 aClass30_Sub1_Sub5_1;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class12_Sub4_Sub12(@OriginalArg(0) Class30_Sub1_Sub5 arg0) {
		this.aClass30_Sub1_Sub5_1 = arg0;
	}
}
