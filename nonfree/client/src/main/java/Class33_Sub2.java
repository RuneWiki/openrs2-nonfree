import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
	private final int anInt1251;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
	private final int anInt1252;

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
	private final int anInt1258;

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
	private final int anInt1254;

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
	private final int anInt1253;

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
	private final int anInt1257;

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
	private final int anInt1255;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	private final int anInt1250;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class33_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1251 = arg7;
		this.anInt1252 = arg6;
		this.anInt1258 = arg5;
		this.anInt1254 = arg2;
		this.anInt1253 = arg3;
		this.anInt1257 = arg4;
		this.anInt1255 = arg0;
		this.anInt1250 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)V")
	@Override
	public void method6288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
	@Override
	public void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1255 >> 12;
		@Pc(17) int local17 = this.anInt1250 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt1254 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt1253 * arg0 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt1257 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt1258 >> 12;
		@Pc(60) int local60 = this.anInt1252 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt1251 * arg0 >> 12;
		Static335.method4848(local67, super.anInt7489, local24, local39, local17, local10, local53, local60, local46);
	}
}
