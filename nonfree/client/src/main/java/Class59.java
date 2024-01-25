import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class59 {

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
	public int anInt1072;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
	public int anInt1067;

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
	public int anInt1068;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
	public int anInt1069;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1070 = arg3 * arg3;
		this.anInt1065 = arg1;
		this.anInt1075 = arg2;
		this.anInt1066 = arg0;
		this.anInt1072 = this.anInt1065 + arg6;
		this.anInt1067 = arg9 + this.anInt1075;
		this.anInt1063 = arg7 + this.anInt1065;
		this.anInt1068 = arg8 + this.anInt1075;
		this.anInt1076 = this.anInt1066 + arg4;
		this.anInt1069 = arg5 + this.anInt1066;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)Z")
	public boolean method1083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt1076 > arg2 || this.anInt1069 < arg2) {
			return false;
		} else if (arg1 < this.anInt1072 || this.anInt1063 < arg1) {
			return false;
		} else if (arg0 >= this.anInt1068 && arg0 <= this.anInt1067) {
			@Pc(66) int local66 = arg2 - this.anInt1066;
			@Pc(71) int local71 = arg0 - this.anInt1075;
			return this.anInt1070 > local71 * local71 + local66 * local66;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIZIIIII)V")
	public void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt1070 = arg0 * arg0;
		this.anInt1065 = arg6;
		this.anInt1075 = arg4;
		this.anInt1066 = arg3;
		this.anInt1069 = this.anInt1066 + arg9;
		this.anInt1076 = this.anInt1066 + arg5;
		this.anInt1063 = this.anInt1065 + arg2;
		this.anInt1068 = this.anInt1075 + arg7;
		this.anInt1072 = arg8 + this.anInt1065;
		this.anInt1067 = arg1 + this.anInt1075;
	}
}
