import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public abstract class Class2_Sub6_Sub5 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qia", name = "w", descriptor = "I")
	public final int anInt7977;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub6_Sub5(@OriginalArg(0) int arg0) {
		this.anInt7977 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6810();

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "(I)Z")
	public abstract boolean method6812();
}
