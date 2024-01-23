import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!j", name = "x", descriptor = "I")
	public int anInt2070;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public int anInt2068;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2070 = arg1;
		this.anInt2068 = arg0;
	}
}
