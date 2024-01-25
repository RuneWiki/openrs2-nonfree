import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "I")
	protected int anInt6662;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "I")
	public final int anInt6661;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	protected final int anInt6656;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	protected int anInt6654;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIII)V")
	protected Class8_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6662 = arg2;
		this.anInt6661 = arg3;
		this.anInt6656 = arg1;
		this.anInt6654 = arg0;
	}
}
