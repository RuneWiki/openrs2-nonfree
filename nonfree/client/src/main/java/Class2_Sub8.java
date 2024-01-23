import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt550 = arg1;
		this.anInt552 = arg0;
	}
}
