import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class14_Sub41 extends Class14 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
	public int anInt7970;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public final int anInt7971;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V")
	public Class14_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7970 = arg1;
		this.anInt7971 = arg0;
	}
}
