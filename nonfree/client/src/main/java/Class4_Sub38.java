import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public final int anInt7346;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public int anInt7347;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(II)V")
	public Class4_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7346 = arg0;
		this.anInt7347 = arg1;
	}
}
