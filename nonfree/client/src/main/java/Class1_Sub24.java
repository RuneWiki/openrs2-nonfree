import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	public int anInt4025;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	public int anInt4022;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4025 = arg0;
		this.anInt4022 = arg1;
	}
}
