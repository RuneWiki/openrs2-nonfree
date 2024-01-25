import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	public final int anInt3141;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
	public final int anInt3142;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V")
	public Class4_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3141 = arg0;
		this.anInt3142 = arg1;
	}
}
