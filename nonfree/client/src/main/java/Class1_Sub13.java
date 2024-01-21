import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public final int anInt2269;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	public final int anInt2265;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
	public Class1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2269 = arg1;
		this.anInt2265 = arg0;
	}
}
