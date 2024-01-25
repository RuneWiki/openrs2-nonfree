import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	private int anInt5429 = -1;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5960(this.anInt5429);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt5429 = arg0.method8859();
	}
}
