import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public int anInt6576;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public final int anInt6580;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6576 = arg1;
		this.anInt6580 = arg0;
	}
}
