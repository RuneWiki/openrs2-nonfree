import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class10_Sub11 extends Class10 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	public final int anInt1106;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public final int anInt1107;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V")
	public Class10_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1106 = arg1;
		this.anInt1107 = arg0;
	}
}
