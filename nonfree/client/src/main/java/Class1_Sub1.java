import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt6596;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	protected final int anInt6595;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	protected int anInt6597;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public final int anInt6592;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IIII)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6596 = arg2;
		this.anInt6595 = arg1;
		this.anInt6597 = arg0;
		this.anInt6592 = arg3;
	}
}
