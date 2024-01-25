import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public final int anInt626;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	public final int anInt629;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt626 = arg1;
		this.anInt629 = arg0;
	}
}
