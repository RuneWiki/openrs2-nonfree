import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	public final int anInt1216;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	public final int anInt1217;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
	public Class4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1216 = arg0;
		this.anInt1217 = arg1;
	}
}
