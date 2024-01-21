import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
	public final int anInt178;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.anInt178 = arg0;
	}
}
