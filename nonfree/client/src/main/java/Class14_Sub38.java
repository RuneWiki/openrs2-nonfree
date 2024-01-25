import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class14_Sub38 extends Class14 {

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
	public final int anInt8488;

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
	public final int anInt8490;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(II)V")
	public Class14_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8488 = arg1;
		this.anInt8490 = arg0;
	}
}
