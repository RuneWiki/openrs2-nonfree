import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public final int anInt437;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	public final int anInt438;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V")
	public Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt437 = arg0;
		this.anInt438 = arg1;
	}
}
