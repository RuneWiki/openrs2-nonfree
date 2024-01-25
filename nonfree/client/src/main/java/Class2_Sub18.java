import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
	public final int anInt3546;

	@OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
	public final int anInt3544;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(II)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3546 = arg0;
		this.anInt3544 = arg1;
	}
}
