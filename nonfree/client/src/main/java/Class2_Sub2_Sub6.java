import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public abstract class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gaa", name = "w", descriptor = "I")
	public final int anInt6538;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub2_Sub6(@OriginalArg(0) int arg0) {
		this.anInt6538 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5442();

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "(I)Z")
	public abstract boolean method5445();
}
