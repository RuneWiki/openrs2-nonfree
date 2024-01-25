import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public final int anInt790;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt790 = arg0;
		this.anInt789 = arg1;
	}
}
