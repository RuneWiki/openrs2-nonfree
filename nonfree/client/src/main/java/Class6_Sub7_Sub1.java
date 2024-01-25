import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class6_Sub7_Sub1 extends Class6_Sub7 {

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	private int anInt1064 = -1;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!gga;B)V")
	@Override
	public void method6993(@OriginalArg(0) Class6_Sub23 arg0) {
		this.anInt1064 = arg0.method8363();
		arg0.method8374();
		if (arg0.method8374() != 255) {
			arg0.anInt9901--;
			arg0.method8381();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ag;I)V")
	@Override
	public void method6990(@OriginalArg(0) Class6_Sub2 arg0) {
		arg0.method408(this.anInt1064);
	}
}
