import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public abstract class Class69 {

	@OriginalMember(owner = "client!uha", name = "k", descriptor = "I")
	public final int anInt6646;

	@OriginalMember(owner = "client!uha", name = "g", descriptor = "I")
	protected final int anInt6642;

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
	public final int anInt6639;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(III)V")
	protected Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6646 = arg1;
		this.anInt6642 = arg2;
		this.anInt6639 = arg0;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)V")
	public abstract void method5702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(III)V")
	public abstract void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uha", name = "e", descriptor = "(III)V")
	public abstract void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
