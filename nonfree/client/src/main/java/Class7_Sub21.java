import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class7_Sub21 extends Class7 {

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
	public final int anInt2987;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
	public final int anInt2989;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(II)V")
	public Class7_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2987 = arg1;
		this.anInt2989 = arg0;
	}
}
