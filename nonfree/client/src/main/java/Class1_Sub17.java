import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	public final int anInt3393;

	@OriginalMember(owner = "client!q", name = "B", descriptor = "I")
	public final int anInt3395;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3393 = arg0;
		this.anInt3395 = arg1;
	}
}
