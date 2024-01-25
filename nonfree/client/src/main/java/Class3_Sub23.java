import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
	public final int anInt3717;

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
	public final int anInt3718;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(II)V")
	public Class3_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3717 = arg0;
		this.anInt3718 = arg1;
	}
}
