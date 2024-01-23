import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public int anInt2670;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "I")
	public int anInt2674;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2670 = arg0;
		this.anInt2674 = arg1;
	}
}
