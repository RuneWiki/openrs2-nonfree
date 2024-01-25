import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class Class114 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	protected final int anInt5079;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public final int anInt5076;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public final int anInt5078;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(III)V")
	protected Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5079 = arg2;
		this.anInt5076 = arg0;
		this.anInt5078 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	public abstract void method4461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIB)V")
	public abstract void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
	public abstract void method4466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
