import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	protected int anInt5699;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	protected int anInt5704;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public final int anInt5701;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	protected final int anInt5703;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIII)V")
	protected Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5699 = arg0;
		this.anInt5704 = arg2;
		this.anInt5701 = arg3;
		this.anInt5703 = arg1;
	}
}
