import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public final int anInt1909;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public int anInt1908;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1909 = arg0;
		this.anInt1908 = arg1;
	}
}
