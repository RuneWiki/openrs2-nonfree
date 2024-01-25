import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class12_Sub4_Sub15 extends Class12_Sub4 {

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "Lclient!nr;")
	public final Class30_Sub1_Sub4 aClass30_Sub1_Sub4_1;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!nr;)V")
	public Class12_Sub4_Sub15(@OriginalArg(0) Class30_Sub1_Sub4 arg0) {
		this.aClass30_Sub1_Sub4_1 = arg0;
	}
}
