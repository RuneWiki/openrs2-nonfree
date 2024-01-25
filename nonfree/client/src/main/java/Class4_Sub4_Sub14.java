import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class4_Sub4_Sub14 extends Class4_Sub4 {

	@OriginalMember(owner = "client!re", name = "C", descriptor = "Lclient!wn;")
	public final Class8_Sub1_Sub5 aClass8_Sub1_Sub5_1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!wn;)V")
	public Class4_Sub4_Sub14(@OriginalArg(0) Class8_Sub1_Sub5 arg0) {
		this.aClass8_Sub1_Sub5_1 = arg0;
	}
}
