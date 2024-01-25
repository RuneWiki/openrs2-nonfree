import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public final int anInt4072;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public final int anInt4070;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
	public Class2_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4072 = arg0;
		this.anInt4070 = arg1;
	}
}
