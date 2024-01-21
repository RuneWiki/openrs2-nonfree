import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public final int anInt1020;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public final int anInt1021;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
	public Class3_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1020 = arg0;
		this.anInt1021 = arg1;
	}
}
