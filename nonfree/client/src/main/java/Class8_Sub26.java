import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class8_Sub26 extends Class8 {

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
	public int anInt4771;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
	public int anInt4773;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
	public Class8_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4771 = arg1;
		this.anInt4773 = arg0;
	}
}
