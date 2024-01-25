import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public final int anInt5953;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public int anInt5954;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(II)V")
	public Class2_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5953 = arg0;
		this.anInt5954 = arg1;
	}
}
