import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public final int anInt2315;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3(@OriginalArg(0) int arg0) {
		this.anInt2315 = arg0;
	}
}
