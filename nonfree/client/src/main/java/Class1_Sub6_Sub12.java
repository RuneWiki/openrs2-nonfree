import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class Class1_Sub6_Sub12 extends Class1_Sub6 {

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
	public final int anInt9519;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub6_Sub12(@OriginalArg(0) int arg0) {
		this.anInt9519 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7761();

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "(B)Z")
	public abstract boolean method7763();
}
