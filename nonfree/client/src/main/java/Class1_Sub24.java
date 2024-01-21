import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public final int anInt4499;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "I")
	public final int anInt4502;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(II)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4499 = arg0;
		this.anInt4502 = arg1;
	}
}
