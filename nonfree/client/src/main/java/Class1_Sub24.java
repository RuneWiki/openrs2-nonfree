import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	public int anInt4545;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4545 = arg0;
	}
}
