import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class4_Sub9_Sub3 extends Class4_Sub9 {

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	private int anInt7683 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!es;I)V")
	@Override
	public void method7843(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt7683 = arg0.method8859();
		arg0.method8865();
		if (arg0.method8865() != 255) {
			arg0.anInt10466--;
			arg0.method8830();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method7845(@OriginalArg(0) Class4_Sub55 arg0) {
		arg0.method8968(this.anInt7683);
	}
}
