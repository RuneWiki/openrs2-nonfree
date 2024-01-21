import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
	public final int anInt654;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class4_Sub5(@OriginalArg(0) int arg0) {
		this.anInt654 = arg0;
	}
}
