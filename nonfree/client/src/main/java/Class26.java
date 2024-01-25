import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class Class26 {

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
	public final int anInt6415;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	protected final int anInt6412;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	public final int anInt6410;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(III)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6415 = arg1;
		this.anInt6412 = arg2;
		this.anInt6410 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	public abstract void method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)V")
	public abstract void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)V")
	public abstract void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
