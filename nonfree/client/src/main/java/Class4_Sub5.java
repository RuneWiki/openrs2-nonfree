import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
	public final int anInt5036;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(I)V")
	public Class4_Sub5(@OriginalArg(0) int arg0) {
		this.anInt5036 = arg0;
	}
}
