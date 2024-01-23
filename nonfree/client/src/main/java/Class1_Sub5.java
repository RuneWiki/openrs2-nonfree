import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public int anInt495;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt497 = arg1;
		this.anInt495 = arg0;
	}
}
