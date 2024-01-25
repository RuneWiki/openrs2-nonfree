import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!tn;I)V")
	public abstract void method8290(@OriginalArg(0) Class342 arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!dt;)V")
	public abstract void method8291(@OriginalArg(1) Class3_Sub4 arg0);
}
