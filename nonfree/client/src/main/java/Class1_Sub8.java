import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	public int anInt1328;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ec;)I")
	public abstract int method1054(@OriginalArg(0) Class1_Sub6_Sub1 arg0);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	public abstract void method1055();
}
