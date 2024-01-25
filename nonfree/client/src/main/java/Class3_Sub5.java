import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	protected final int anInt6515;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	protected int anInt6510;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public final int anInt6517;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	protected int anInt6512;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIII)V")
	protected Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6515 = arg1;
		this.anInt6510 = arg2;
		this.anInt6517 = arg3;
		this.anInt6512 = arg0;
	}
}
