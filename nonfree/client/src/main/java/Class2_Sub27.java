import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	public int anInt4715;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public final int anInt4717;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4715 = arg1;
		this.anInt4717 = arg0;
	}
}
