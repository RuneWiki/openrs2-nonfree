import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class Class81 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public int anInt2796;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public int anInt2797;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public int anInt2798;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public int anInt2801;

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
	public int anInt2802;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	protected Class81() {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public abstract void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
	public abstract void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
