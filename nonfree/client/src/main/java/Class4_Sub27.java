import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public int anInt4968;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	private Class4_Sub27() {
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(I)V")
	public Class4_Sub27(@OriginalArg(0) int arg0) {
		this.anInt4968 = arg0;
	}
}
