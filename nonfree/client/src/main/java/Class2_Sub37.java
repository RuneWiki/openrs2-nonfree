import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public final int anInt7197;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	public final int anInt7198;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(II)V")
	public Class2_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7197 = arg0;
		this.anInt7198 = arg1;
	}
}
