import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public final int anInt5871;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	public int anInt5869;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
	public Class5_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5871 = arg0;
		this.anInt5869 = arg1;
	}
}
