import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	public final int anInt2144;

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
	public final int anInt2150;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(II)V")
	public Class3_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2144 = arg0;
		this.anInt2150 = arg1;
	}
}
