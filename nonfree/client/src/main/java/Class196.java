import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class196 {

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	public final int anInt4756;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public final int anInt4754;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	public final int anInt4752;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
	public final int anInt4755;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIII)V")
	public Class196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4756 = arg2;
		this.anInt4754 = arg3;
		this.anInt4752 = arg1;
		this.anInt4755 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lclient!kp;")
	public Class196 method4349(@OriginalArg(0) int arg0) {
		return new Class196(this.anInt4755, arg0, this.anInt4756, this.anInt4754);
	}
}
