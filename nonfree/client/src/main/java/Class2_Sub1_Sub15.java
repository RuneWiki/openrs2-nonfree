import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
	public final int anInt7993;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub1_Sub15(@OriginalArg(0) int arg0) {
		this.anInt7993 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7148();

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "(I)Z")
	public abstract boolean method7150();
}
