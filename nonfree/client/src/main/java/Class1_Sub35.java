import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public final int anInt6126;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	public final int anInt6125;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V")
	public Class1_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6126 = arg1;
		this.anInt6125 = arg0;
	}
}
