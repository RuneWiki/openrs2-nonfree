import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class17_Sub4 extends Class17 {

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	protected int anInt4675;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	protected final int anInt4679;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	protected int anInt4674;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	public final int anInt4680;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIII)V")
	protected Class17_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4675 = arg2;
		this.anInt4679 = arg1;
		this.anInt4674 = arg0;
		this.anInt4680 = arg3;
	}
}
