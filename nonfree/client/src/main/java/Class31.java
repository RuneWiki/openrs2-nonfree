import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class Class31 {

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public final int anInt6939;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	protected final int anInt6934;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public final int anInt6936;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(III)V")
	protected Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6939 = arg1;
		this.anInt6934 = arg2;
		this.anInt6936 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
	public abstract void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
	public abstract void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)V")
	public abstract void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
