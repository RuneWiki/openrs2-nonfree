import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class Class4_Sub7_Sub6 extends Class4_Sub7 {

	@OriginalMember(owner = "client!hba", name = "w", descriptor = "I")
	public final int anInt8670;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub7_Sub6(@OriginalArg(0) int arg0) {
		this.anInt8670 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(B)Z")
	public abstract boolean method7124();

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7127();
}
