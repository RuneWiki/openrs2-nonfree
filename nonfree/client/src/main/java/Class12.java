import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class12 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt5020;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt5021;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt5022;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt5026;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	protected Class12() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public abstract void method3922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public abstract void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
