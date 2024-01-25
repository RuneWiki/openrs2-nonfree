import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public final class Class3_Sub55 extends Class3 {

	@OriginalMember(owner = "client!tja", name = "t", descriptor = "I")
	public final int anInt9673;

	@OriginalMember(owner = "client!tja", name = "l", descriptor = "I")
	public final int anInt9671;

	@OriginalMember(owner = "client!tja", name = "v", descriptor = "I")
	private final int anInt9681;

	@OriginalMember(owner = "client!tja", name = "A", descriptor = "I")
	private final int anInt9679;

	@OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
	private final int anInt9675;

	@OriginalMember(owner = "client!tja", name = "x", descriptor = "I")
	public final int anInt9677;

	@OriginalMember(owner = "client!tja", name = "n", descriptor = "I")
	private final int anInt9678;

	@OriginalMember(owner = "client!tja", name = "r", descriptor = "I")
	public final int anInt9668;

	@OriginalMember(owner = "client!tja", name = "y", descriptor = "I")
	private final int anInt9672;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9673 = arg6;
		this.anInt9671 = arg5;
		this.anInt9681 = arg4;
		this.anInt9679 = arg1;
		this.anInt9675 = arg0;
		this.anInt9677 = arg7;
		this.anInt9678 = arg2;
		this.anInt9668 = arg8;
		this.anInt9672 = arg3;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(III[I)V")
	public void method8232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt9675;
		arg2[2] = arg0 + this.anInt9678 - this.anInt9673;
		arg2[1] = this.anInt9679 + arg1 - this.anInt9671;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IIZI)Z")
	public boolean method8234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt9675 && this.anInt9679 <= arg0 && arg0 <= this.anInt9672 && arg2 >= this.anInt9678 && this.anInt9681 >= arg2;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZII)Z")
	public boolean method8235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt9671 && arg1 <= this.anInt9677 && arg0 >= this.anInt9673 && arg0 <= this.anInt9668;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(III)Z")
	public boolean method8236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt9679 && arg0 <= this.anInt9672 && arg1 >= this.anInt9678 && arg1 <= this.anInt9681;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([IIII)V")
	public void method8238(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt9673 + arg2 - this.anInt9678;
		arg0[0] = 0;
		arg0[1] = this.anInt9671 + arg1 - this.anInt9679;
	}
}
