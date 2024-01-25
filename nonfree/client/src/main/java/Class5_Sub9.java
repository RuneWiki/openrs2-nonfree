import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public final int anInt1273;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
	public final int anInt1277;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V")
	public Class5_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1273 = arg1;
		this.anInt1277 = arg0;
	}
}
