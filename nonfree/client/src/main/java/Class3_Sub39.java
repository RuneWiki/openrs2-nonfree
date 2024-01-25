import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public final int anInt8232;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	public final int anInt8234;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(II)V")
	public Class3_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8232 = arg1;
		this.anInt8234 = arg0;
	}
}
