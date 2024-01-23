import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class Class58 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public int anInt5022;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public int anInt5023;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public int anInt5026;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public int anInt5027;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	protected Class58() {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public abstract void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public abstract void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
