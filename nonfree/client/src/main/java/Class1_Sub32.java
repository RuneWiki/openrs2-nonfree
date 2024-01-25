import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public final int anInt4852;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public int anInt4854;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4852 = arg0;
		this.anInt4854 = arg1;
	}
}
