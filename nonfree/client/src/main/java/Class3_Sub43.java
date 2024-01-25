import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public final int anInt8131;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public final int anInt8133;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class3_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8131 = arg0;
		this.anInt8133 = arg1;
	}
}
