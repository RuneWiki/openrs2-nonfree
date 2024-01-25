import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class Class2_Sub13_Sub12 extends Class2_Sub13 {

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	public final int anInt7935;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub13_Sub12(@OriginalArg(0) int arg0) {
		this.anInt7935 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
	public abstract boolean method6642();

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method6647();
}
