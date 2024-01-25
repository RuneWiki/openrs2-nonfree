import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private final int anInt7820;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	private final int anInt7824;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	private final int anInt7823;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	private final int anInt7813;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	private final int anInt7819;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	private final int anInt7812;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	private final int anInt7818;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	private final int anInt7817;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class35_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7820 = arg3;
		this.anInt7824 = arg6;
		this.anInt7823 = arg4;
		this.anInt7813 = arg1;
		this.anInt7819 = arg5;
		this.anInt7812 = arg0;
		this.anInt7818 = arg2;
		this.anInt7817 = arg7;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
	@Override
	public void method7551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
	@Override
	public void method7552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt7812 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt7813 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt7818 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7820 >> 12;
		@Pc(46) int local46 = this.anInt7823 * arg1 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt7819 >> 12;
		@Pc(60) int local60 = arg1 * this.anInt7824 >> 12;
		@Pc(67) int local67 = arg0 * this.anInt7817 >> 12;
		Static238.method4330(local32, local18, local46, local53, local39, local67, super.anInt9243, local25, local60);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
