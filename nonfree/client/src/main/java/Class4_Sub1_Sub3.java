import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	private int anInt2260 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5946(this.anInt2260);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt2260 = arg0.method8859();
	}
}
