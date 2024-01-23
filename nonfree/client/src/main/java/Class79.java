import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class79 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public int anInt3890;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public int anInt3891;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public int anInt3897;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public int anInt3900;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
	public int anInt3901;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
	public abstract void method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	public abstract void method3071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
