import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public final int anInt7424;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public final int anInt7422;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
	public Class2_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7424 = arg1;
		this.anInt7422 = arg0;
	}
}
