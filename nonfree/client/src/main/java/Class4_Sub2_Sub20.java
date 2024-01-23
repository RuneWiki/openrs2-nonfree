import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class4_Sub2_Sub20 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "Lclient!kj;")
	public Class12_Sub4 aClass12_Sub4_1;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!kj;)V")
	public Class4_Sub2_Sub20(@OriginalArg(0) Class12_Sub4 arg0) {
		this.aClass12_Sub4_1 = arg0;
	}
}
