import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class57 {

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	protected final int anInt7560;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public final int anInt7558;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	public final int anInt7559;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(III)V")
	protected Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7560 = arg2;
		this.anInt7558 = arg1;
		this.anInt7559 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)V")
	public abstract void method5861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public abstract void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public abstract void method5863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
