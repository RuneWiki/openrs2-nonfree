import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class45_Sub2_Sub1 extends Class45_Sub2 {

	@OriginalMember(owner = "client!paa", name = "X", descriptor = "I")
	public int anInt7643;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class45_Sub2_Sub1(@OriginalArg(0) Class9_Sub1 arg0) {
		super(arg0, false);
	}
}
