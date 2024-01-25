import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class86 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
	public final int anInt11131;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	protected final int anInt11132;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	public final int anInt11134;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(III)V")
	protected Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt11131 = arg1;
		this.anInt11132 = arg2;
		this.anInt11134 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
	public abstract void method9263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)V")
	public abstract void method9264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(III)V")
	public abstract void method9265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
