import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
	public final int anInt3767;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
	public final int anInt3766;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(II)V")
	public Class5_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3767 = arg0;
		this.anInt3766 = arg1;
	}
}
