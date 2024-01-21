import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class Class9 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	public abstract void method810();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public abstract void method811();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZII)I")
	public abstract int method812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
