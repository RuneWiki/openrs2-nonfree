import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class Class2_Sub10_Sub5 extends Class2_Sub10 {

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public final int anInt6494;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub10_Sub5(@OriginalArg(0) int arg0) {
		this.anInt6494 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5575();

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)Z")
	public abstract boolean method5576();
}
