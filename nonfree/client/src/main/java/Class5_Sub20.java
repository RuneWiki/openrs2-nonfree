import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	public final int anInt2605;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
	public Class5_Sub20(@OriginalArg(0) int arg0) {
		this.anInt2605 = arg0;
	}
}
