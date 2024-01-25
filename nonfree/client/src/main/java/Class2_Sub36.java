import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
	public final int anInt5696;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	public final int anInt5697;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V")
	public Class2_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5696 = arg1;
		this.anInt5697 = arg0;
	}
}
