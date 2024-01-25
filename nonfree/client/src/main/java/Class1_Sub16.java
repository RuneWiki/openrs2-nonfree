import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
	public final int anInt2504;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public final int anInt2505;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2504 = arg1;
		this.anInt2505 = arg0;
	}
}
