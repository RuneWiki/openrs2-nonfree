import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public final int anInt2260;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public final int anInt2263;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2260 = arg0;
		this.anInt2263 = arg1;
	}
}
