import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class5_Sub6_Sub2 extends Class5_Sub6 {

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	private int anInt1327 = -1;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method9152(@OriginalArg(0) Class5_Sub55 arg0) {
		arg0.method9194(this.anInt1327);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public void method9154(@OriginalArg(0) Class5_Sub36 arg0) {
		this.anInt1327 = arg0.method7333();
		arg0.method7291();
		if (arg0.method7291() != 255) {
			arg0.anInt8456--;
			arg0.method7304();
		}
	}
}
