import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
	public final int anInt1253;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1253 = arg0;
	}
}
