import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	public final int anInt1388;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	public final int anInt1385;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1388 = arg0;
		this.anInt1385 = arg1;
	}
}
