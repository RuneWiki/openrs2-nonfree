import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class35 {

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
	public final int anInt9246;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
	protected final int anInt9245;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public final int anInt9243;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(III)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9246 = arg0;
		this.anInt9245 = arg2;
		this.anInt9243 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	public abstract void method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)V")
	public abstract void method7551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BII)V")
	public abstract void method7552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
