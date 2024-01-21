import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public final int anInt1402;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public final int anInt1403;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
	public Class2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1402 = arg1;
		this.anInt1403 = arg0;
	}
}
