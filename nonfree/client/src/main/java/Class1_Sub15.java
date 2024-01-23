import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public int anInt1636;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	public int anInt1634;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1636 = arg0;
		this.anInt1634 = arg1;
	}
}
