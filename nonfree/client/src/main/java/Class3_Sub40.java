import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
	public final int anInt8431;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public final int anInt8433;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(II)V")
	public Class3_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8431 = arg0;
		this.anInt8433 = arg1;
	}
}
