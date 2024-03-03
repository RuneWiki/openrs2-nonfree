import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public static final int anInt5743 = 1337;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_120 = new Class79("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
	public abstract int method5243();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
	public abstract int method5244();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)I")
	public abstract int method5248();

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)J")
	public abstract long method5249();
}
