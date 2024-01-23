import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class7 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
	public int anInt5425;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public int anInt5426;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	public int anInt5429;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	public int anInt5432;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public int anInt5433;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	public abstract void method4258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public abstract void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
