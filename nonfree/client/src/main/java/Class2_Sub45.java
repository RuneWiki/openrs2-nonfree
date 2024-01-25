import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
	public final int anInt7831;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
	public int anInt7832;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(II)V")
	public Class2_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7831 = arg0;
		this.anInt7832 = arg1;
	}
}
