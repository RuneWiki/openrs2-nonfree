import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public final int anInt1462;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public int anInt1460;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V")
	public Class1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1462 = arg0;
		this.anInt1460 = arg1;
	}
}
