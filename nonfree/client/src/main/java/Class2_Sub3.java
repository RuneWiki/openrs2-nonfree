import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	public final int anInt130;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.anInt130 = arg0;
	}
}
