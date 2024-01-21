import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class35 {

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	protected final int anInt4073;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public final int anInt4070;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public final int anInt4071;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4073 = arg2;
		this.anInt4070 = arg0;
		this.anInt4071 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
	public abstract void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
	public abstract void method3114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public abstract void method3115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
