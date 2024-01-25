import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	private final int anInt3055;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	private final int anInt3051;

	@OriginalMember(owner = "client!it", name = "z", descriptor = "I")
	private final int anInt3061;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "I")
	private final int anInt3059;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "I")
	private final int anInt3057;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "I")
	private final int anInt3052;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "I")
	private final int anInt3062;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "I")
	private final int anInt3060;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class25_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3055 = arg6;
		this.anInt3051 = arg5;
		this.anInt3061 = arg2;
		this.anInt3059 = arg3;
		this.anInt3057 = arg1;
		this.anInt3052 = arg4;
		this.anInt3062 = arg7;
		this.anInt3060 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	@Override
	public void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BII)V")
	@Override
	public void method6074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(III)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3060 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3057 >> 12;
		@Pc(24) int local24 = this.anInt3061 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3059 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt3052 * arg1 >> 12;
		@Pc(48) int local48 = this.anInt3051 * arg0 >> 12;
		@Pc(55) int local55 = arg1 * this.anInt3055 >> 12;
		@Pc(62) int local62 = this.anInt3062 * arg0 >> 12;
		Static145.method2865(super.anInt7042, local24, local62, local38, local48, local10, local17, local31, local55);
	}
}
