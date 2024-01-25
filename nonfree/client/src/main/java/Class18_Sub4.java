import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!j", name = "y", descriptor = "I")
	private final int anInt3179;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "I")
	private final int anInt3178;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "I")
	private final int anInt3172;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	private final int anInt3171;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	private final int anInt3173;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "I")
	private final int anInt3177;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	private final int anInt3168;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	private final int anInt3167;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class18_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3179 = arg0;
		this.anInt3178 = arg3;
		this.anInt3172 = arg5;
		this.anInt3171 = arg4;
		this.anInt3173 = arg2;
		this.anInt3177 = arg6;
		this.anInt3168 = arg7;
		this.anInt3167 = arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	@Override
	public void method2849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)V")
	@Override
	public void method2850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3179 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3167 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3173 >> 12;
		@Pc(31) int local31 = this.anInt3178 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt3171 >> 12;
		@Pc(52) int local52 = arg0 * this.anInt3172 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt3177 >> 12;
		@Pc(66) int local66 = arg0 * this.anInt3168 >> 12;
		Static306.method3585(super.anInt3162, local45, local59, local10, local52, local66, local31, local24, local17);
	}
}
