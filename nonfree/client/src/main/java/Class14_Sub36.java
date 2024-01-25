import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class14_Sub36 extends Class14 {

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public final int anInt7806;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public final int anInt7802;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
	public Class14_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7806 = arg1;
		this.anInt7802 = arg0;
	}
}
