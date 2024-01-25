import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public final int anInt6690;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
	protected int anInt6695;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
	protected int anInt6693;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	protected final int anInt6691;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIII)V")
	protected Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6690 = arg3;
		this.anInt6695 = arg0;
		this.anInt6693 = arg2;
		this.anInt6691 = arg1;
	}
}
