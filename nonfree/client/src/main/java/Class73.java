import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class Class73 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	public int anInt2953;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public int anInt2954;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public int anInt2956;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	public int anInt2959;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public int anInt2960;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public int anInt2962;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class73() {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public abstract void method2267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public abstract void method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
