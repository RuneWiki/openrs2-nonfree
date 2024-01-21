import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
	public abstract void method238();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!qb;)I")
	public abstract int method239(@OriginalArg(0) Class1_Sub8_Sub3 arg0);
}
