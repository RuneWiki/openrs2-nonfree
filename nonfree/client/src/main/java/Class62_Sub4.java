import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class62_Sub4 extends Class62 {

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
	protected int anInt6410;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	protected final int anInt6402;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	protected int anInt6403;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	public final int anInt6405;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIII)V")
	protected Class62_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6410 = arg2;
		this.anInt6402 = arg1;
		this.anInt6403 = arg0;
		this.anInt6405 = arg3;
	}
}
