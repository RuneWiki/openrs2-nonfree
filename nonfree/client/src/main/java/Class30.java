import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class Class30 {

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
	public final int anInt9990;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	protected final int anInt9989;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
	public final int anInt9988;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(III)V")
	protected Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9990 = arg0;
		this.anInt9989 = arg2;
		this.anInt9988 = arg1;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V")
	public abstract void method7659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)V")
	public abstract void method7660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIZ)V")
	public abstract void method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
