import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public final int anInt1794;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public final int anInt1797;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
	public Class2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1794 = arg0;
		this.anInt1797 = arg1;
	}
}
