import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
	public final int anInt2439;

	@OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
	public final int anInt2437;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2439 = arg1;
		this.anInt2437 = arg0;
	}
}
