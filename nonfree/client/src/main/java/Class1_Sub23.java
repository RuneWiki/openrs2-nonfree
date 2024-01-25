import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public final int anInt4240;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public final int anInt4239;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V")
	public Class1_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4240 = arg0;
		this.anInt4239 = arg1;
	}
}
