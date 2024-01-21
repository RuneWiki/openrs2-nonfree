import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class18 {

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BII)V")
	public abstract void method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
	public abstract void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public abstract void method492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
