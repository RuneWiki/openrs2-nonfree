import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public abstract class Class5 {

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "I")
	public final int anInt7726;

	@OriginalMember(owner = "client!cha", name = "f", descriptor = "I")
	public final int anInt7728;

	@OriginalMember(owner = "client!cha", name = "j", descriptor = "I")
	protected final int anInt7731;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(III)V")
	protected Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7726 = arg0;
		this.anInt7728 = arg1;
		this.anInt7731 = arg2;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIZ)V")
	public abstract void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)V")
	public abstract void method6416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIB)V")
	public abstract void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
