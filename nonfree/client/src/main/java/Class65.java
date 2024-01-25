import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class Class65 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public final int anInt5511;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	public final int anInt5514;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	protected final int anInt5512;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(III)V")
	protected Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5511 = arg0;
		this.anInt5514 = arg1;
		this.anInt5512 = arg2;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	public abstract void method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)V")
	public abstract void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(III)V")
	public abstract void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
