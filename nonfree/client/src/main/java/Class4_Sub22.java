import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
	public final int anInt3533;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	public final int anInt3530;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(II)V")
	public Class4_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3533 = arg0;
		this.anInt3530 = arg1;
	}
}
