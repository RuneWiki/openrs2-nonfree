import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
	public final int anInt4478;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	public final int anInt4480;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4478 = arg1;
		this.anInt4480 = arg0;
	}
}
