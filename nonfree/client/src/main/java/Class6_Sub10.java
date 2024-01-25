import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	public final int anInt1069;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public int anInt1068;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(II)V")
	public Class6_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1069 = arg0;
		this.anInt1068 = arg1;
	}
}
