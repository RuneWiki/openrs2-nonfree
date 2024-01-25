import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
	public final int anInt725;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	public final int anInt722;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt725 = arg1;
		this.anInt722 = arg0;
	}
}
