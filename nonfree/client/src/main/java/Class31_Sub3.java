import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	protected int anInt2832;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
	protected int anInt2833;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	protected final int anInt2835;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	public final int anInt2831;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIII)V")
	protected Class31_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2832 = arg0;
		this.anInt2833 = arg2;
		this.anInt2835 = arg1;
		this.anInt2831 = arg3;
	}
}
