import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class182_Sub4 extends Class182 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	private final int anInt7957;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	private final int anInt7948;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	private final int anInt7955;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	private final int anInt7956;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	private final int anInt7945;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	private final int anInt7949;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	private final int anInt7954;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
	private final int anInt7959;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class182_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7957 = arg1;
		this.anInt7948 = arg3;
		this.anInt7955 = arg4;
		this.anInt7956 = arg6;
		this.anInt7945 = arg7;
		this.anInt7949 = arg0;
		this.anInt7954 = arg2;
		this.anInt7959 = arg5;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	@Override
	public void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt7949 * arg1 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt7957 >> 12;
		@Pc(32) int local32 = this.anInt7954 * arg1 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7948 >> 12;
		@Pc(46) int local46 = this.anInt7955 * arg1 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt7959 >> 12;
		@Pc(60) int local60 = this.anInt7956 * arg1 >> 12;
		@Pc(67) int local67 = arg0 * this.anInt7945 >> 12;
		Static30.method7987(local25, super.anInt7941, local18, local67, local32, local60, local46, local39, local53);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
