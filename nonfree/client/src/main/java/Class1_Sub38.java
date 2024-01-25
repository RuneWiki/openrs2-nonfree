import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public final int anInt7117;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public int anInt7119;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(II)V")
	public Class1_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7117 = arg0;
		this.anInt7119 = arg1;
	}
}
