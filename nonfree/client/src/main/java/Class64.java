import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class Class64 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public int anInt2360;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public int anInt2361;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	public int anInt2365;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	protected Class64() {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public abstract void method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public abstract void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
