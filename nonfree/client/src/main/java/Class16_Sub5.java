import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class Class16_Sub5 extends Class16 {

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
	protected int anInt6552;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	protected int anInt6550;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	protected final int anInt6554;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public final int anInt6551;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIII)V")
	protected Class16_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6552 = arg2;
		this.anInt6550 = arg0;
		this.anInt6554 = arg1;
		this.anInt6551 = arg3;
	}
}
