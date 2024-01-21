import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	public final int anInt383;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public final int anInt379;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt383 = arg0;
		this.anInt379 = arg1;
	}
}
