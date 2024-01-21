import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public final int anInt80;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	public final int anInt83;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt80 = arg1;
		this.anInt83 = arg0;
	}
}
