import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	public final int anInt4004;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
	public final int anInt4011;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V")
	public Class2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4004 = arg0;
		this.anInt4011 = arg1;
	}
}
