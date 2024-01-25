import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	public final int anInt469;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt469 = arg0;
		this.anInt468 = arg1;
	}
}
