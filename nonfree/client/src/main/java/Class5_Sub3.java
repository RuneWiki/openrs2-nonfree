import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public final int anInt419;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3(@OriginalArg(0) int arg0) {
		this.anInt419 = arg0;
	}
}
