import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public final int anInt3189;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
	public final int anInt3190;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
	public Class5_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3189 = arg0;
		this.anInt3190 = arg1;
	}
}
