import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class6_Sub47 extends Class6 {

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	public final int anInt8769;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	public final int anInt8771;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(II)V")
	public Class6_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8769 = arg0;
		this.anInt8771 = arg1;
	}
}
