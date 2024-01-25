import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!paa", name = "A", descriptor = "I")
	private final int anInt7462;

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
	public final int anInt7454;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
	public final int anInt7451;

	@OriginalMember(owner = "client!paa", name = "y", descriptor = "I")
	private final int anInt7460;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
	public final int anInt7452;

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
	public final int anInt7458;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
	private final int anInt7447;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
	private final int anInt7450;

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
	private final int anInt7455;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7462 = arg2;
		this.anInt7454 = arg6;
		this.anInt7451 = arg7;
		this.anInt7460 = arg4;
		this.anInt7452 = arg8;
		this.anInt7458 = arg5;
		this.anInt7447 = arg3;
		this.anInt7450 = arg0;
		this.anInt7455 = arg1;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIB)Z")
	public boolean method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt7455 && this.anInt7447 >= arg1 && this.anInt7462 <= arg0 && this.anInt7460 >= arg0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)Z")
	public boolean method6447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt7458 && this.anInt7451 >= arg0 && this.anInt7454 <= arg1 && this.anInt7452 >= arg1;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIII)Z")
	public boolean method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt7450 == arg0 && arg2 >= this.anInt7455 && arg2 <= this.anInt7447 && this.anInt7462 <= arg1 && this.anInt7460 >= arg1;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([IIIZ)V")
	public void method6449(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[1] = this.anInt7455 + arg1 - this.anInt7458;
		arg0[2] = arg2 + this.anInt7462 - this.anInt7454;
		arg0[0] = this.anInt7450;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([IIBI)V")
	public void method6451(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = 0;
		arg0[1] = this.anInt7458 + arg1 - this.anInt7455;
		arg0[2] = this.anInt7454 + arg2 - this.anInt7462;
	}
}
