import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class14_Sub43 extends Class14 {

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
	public final int anInt9586;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
	public int anInt9585;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(II)V")
	public Class14_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9586 = arg0;
		this.anInt9585 = arg1;
	}
}
