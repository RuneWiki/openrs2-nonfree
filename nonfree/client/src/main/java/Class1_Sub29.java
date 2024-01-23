import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	public int anInt4881;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4881 = arg0;
		this.anInt4886 = arg1;
	}
}
