import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public int anInt1270;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	public abstract void method921();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!se;)I")
	public abstract int method922(@OriginalArg(0) Class3_Sub5_Sub3 arg0);
}
