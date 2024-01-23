import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
	public Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt149 = arg1;
		this.anInt148 = arg0;
	}
}
