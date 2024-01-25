import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public abstract class Class61 {

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	protected final int anInt5305;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
	public final int anInt5306;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
	public final int anInt5307;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(III)V")
	protected Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5305 = arg2;
		this.anInt5306 = arg1;
		this.anInt5307 = arg0;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)V")
	public abstract void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBI)V")
	public abstract void method4109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(IBI)V")
	public abstract void method4110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
