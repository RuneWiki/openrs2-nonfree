import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class Class4_Sub23 extends Linkable {

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int anInt3075;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!qe;)I")
	public abstract int method1997(@OriginalArg(0) MixerPcmStream arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	public abstract void method1998();
}
