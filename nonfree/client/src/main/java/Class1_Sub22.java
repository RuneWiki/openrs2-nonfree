import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	public final int anInt3716;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	public final int anInt3719;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3716 = arg0;
		this.anInt3719 = arg1;
	}
}
