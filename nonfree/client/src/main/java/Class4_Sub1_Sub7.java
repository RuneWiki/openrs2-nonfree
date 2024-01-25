import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class4_Sub1_Sub7 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "B")
	private byte aByte97;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
	private int anInt6927 = -1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt6927 = arg0.method8859();
		this.aByte97 = arg0.method8861();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5940(this.anInt6927, this.aByte97);
	}
}
