import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
	public final int anInt5936;

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
	public final int anInt5941;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(II)V")
	public Class1_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5936 = arg1;
		this.anInt5941 = arg0;
	}
}
