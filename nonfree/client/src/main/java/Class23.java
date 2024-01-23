import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class23 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public int anInt4468;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public int anInt4469;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public int anInt4470;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public int anInt4472;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public int anInt4473;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public int anInt4476;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	protected Class23() {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	public abstract void method3907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public abstract void method3909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
