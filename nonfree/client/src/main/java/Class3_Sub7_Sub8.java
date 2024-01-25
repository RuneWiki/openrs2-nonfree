import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public abstract class Class3_Sub7_Sub8 extends Class3_Sub7 {

	@OriginalMember(owner = "client!mia", name = "q", descriptor = "I")
	public final int anInt2840;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub7_Sub8(@OriginalArg(0) int arg0) {
		this.anInt2840 = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)Z")
	public abstract boolean method2599();

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2600();
}
