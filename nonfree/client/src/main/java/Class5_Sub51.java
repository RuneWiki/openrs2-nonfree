import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class5_Sub51 extends Class5 {

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public int anInt9060;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	public final int anInt9059;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(II)V")
	public Class5_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9060 = arg1;
		this.anInt9059 = arg0;
	}
}
