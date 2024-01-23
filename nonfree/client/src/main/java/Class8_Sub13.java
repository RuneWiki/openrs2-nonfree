import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public abstract class Class8_Sub13 extends Class8 {

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	public int anInt2361;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public abstract void method1864();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!dg;)I")
	public abstract int method1865(@OriginalArg(0) Class8_Sub8_Sub1 arg0);
}
