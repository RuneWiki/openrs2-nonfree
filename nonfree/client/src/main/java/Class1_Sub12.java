import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!i", name = "v", descriptor = "I")
	public int anInt2239;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ef;)I")
	public abstract int method1654(@OriginalArg(0) Class1_Sub8_Sub1 arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	public abstract void method1655();
}
