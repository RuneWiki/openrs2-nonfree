import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class14_Sub42 extends Class14 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	public int anInt6627;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	public final int anInt6628;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(II)V")
	public Class14_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6627 = arg1;
		this.anInt6628 = arg0;
	}
}
