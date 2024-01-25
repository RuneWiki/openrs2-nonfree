import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	public final int anInt5047;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public final int anInt5046;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
	public Class2_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5047 = arg0;
		this.anInt5046 = arg1;
	}
}
