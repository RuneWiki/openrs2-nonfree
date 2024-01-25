import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public int anInt4634;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public final int anInt4632;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(II)V")
	public Class2_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4634 = arg1;
		this.anInt4632 = arg0;
	}
}
