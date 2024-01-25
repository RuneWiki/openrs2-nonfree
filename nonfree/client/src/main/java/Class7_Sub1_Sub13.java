import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class7_Sub1_Sub13 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Lclient!sf;")
	public final Class22_Sub2_Sub4 aClass22_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class7_Sub1_Sub13(@OriginalArg(0) Class22_Sub2_Sub4 arg0) {
		this.aClass22_Sub2_Sub4_1 = arg0;
	}
}
