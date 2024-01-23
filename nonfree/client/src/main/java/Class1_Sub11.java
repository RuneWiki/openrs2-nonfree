import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
	public int anInt1463;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1463 = arg1;
		this.anInt1467 = arg0;
	}
}
