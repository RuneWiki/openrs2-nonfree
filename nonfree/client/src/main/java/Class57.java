import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class57 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public int anInt3762;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	public int anInt3763;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public int anInt3766;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	public int anInt3768;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public int anInt3769;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
	public int anInt3770;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
	public abstract void method3328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
	public abstract void method3330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
