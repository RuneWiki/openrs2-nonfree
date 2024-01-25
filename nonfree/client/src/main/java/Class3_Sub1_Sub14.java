import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public abstract class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tia", name = "v", descriptor = "I")
	public final int anInt9225;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt9225 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7617();

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "(I)Z")
	public abstract boolean method7618();
}
