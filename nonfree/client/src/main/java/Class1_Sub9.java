import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt1834;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1835 = arg1;
		this.anInt1834 = arg0;
	}
}
