import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class Class3_Sub11_Sub7 extends Class3_Sub11 {

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	public final int anInt4843;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub11_Sub7(@OriginalArg(0) int arg0) {
		this.anInt4843 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4483();

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
	public abstract boolean method4486();
}
