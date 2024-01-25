import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	public final int anInt3007;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3006 = arg1;
		this.anInt3007 = arg0;
	}
}
