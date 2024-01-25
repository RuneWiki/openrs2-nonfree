import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
	public final int anInt7193;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub3_Sub6(@OriginalArg(0) int arg0) {
		this.anInt7193 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
	public abstract boolean method5932();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method5933();
}
