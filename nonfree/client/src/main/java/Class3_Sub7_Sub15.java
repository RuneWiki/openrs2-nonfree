import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public abstract class Class3_Sub7_Sub15 extends Class3_Sub7 {

	@OriginalMember(owner = "client!mga", name = "A", descriptor = "I")
	public final int anInt7879;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub7_Sub15(@OriginalArg(0) int arg0) {
		this.anInt7879 = arg0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6553();

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "(I)Z")
	public abstract boolean method6554();
}
