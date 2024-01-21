import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!h", name = "z", descriptor = "I")
	public final int anInt956;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7(@OriginalArg(0) int arg0) {
		this.anInt956 = arg0;
	}
}
