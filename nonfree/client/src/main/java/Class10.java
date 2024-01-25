import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class Class10 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	protected final int anInt5380;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	public final int anInt5381;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	public final int anInt5386;

	static {
		new Class156(64);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
	protected Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5380 = arg2;
		this.anInt5381 = arg1;
		this.anInt5386 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V")
	public abstract void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BII)V")
	public abstract void method4800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(III)V")
	public abstract void method4801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
