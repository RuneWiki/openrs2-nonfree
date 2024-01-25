import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	public int anInt2298;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	private Class2_Sub19() {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!nj;)I")
	public abstract int method2126(@OriginalArg(0) Class2_Sub11_Sub3 arg0);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	public abstract void method2127();
}
