import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!av", name = "B", descriptor = "I")
	public final int anInt6848;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub1_Sub2(@OriginalArg(0) int arg0) {
		this.anInt6848 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5314();

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(I)Z")
	public abstract boolean method5315();
}
