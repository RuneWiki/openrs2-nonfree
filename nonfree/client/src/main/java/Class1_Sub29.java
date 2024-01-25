import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	public final int anInt4649;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public final int anInt4648;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4649 = arg1;
		this.anInt4648 = arg0;
	}
}
