import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	public final int anInt2967;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	public int anInt2968;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V")
	public Class1_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2967 = arg0;
		this.anInt2968 = arg1;
	}
}
