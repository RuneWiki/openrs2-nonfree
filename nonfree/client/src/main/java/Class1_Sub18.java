import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public final int anInt2166;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	public final int anInt2164;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2166 = arg0;
		this.anInt2164 = arg1;
	}
}
