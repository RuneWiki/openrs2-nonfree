import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public final int anInt837;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9(@OriginalArg(0) int arg0) {
		this.anInt837 = arg0;
	}
}
