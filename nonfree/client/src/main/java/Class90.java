import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class90 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public final int anInt7684;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public final int anInt7688;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	protected final int anInt7686;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V")
	protected Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7684 = arg1;
		this.anInt7688 = arg0;
		this.anInt7686 = arg2;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII)V")
	public abstract void method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public abstract void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZ)V")
	public abstract void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
