import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class79_Sub2 extends Class79 {

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
	private final int anInt3030;

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
	private final int anInt3034;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	private final int anInt3023;

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
	private final int anInt3029;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
	private final int anInt3031;

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
	private final int anInt3026;

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
	private final int anInt3025;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
	private final int anInt3028;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class79_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3030 = arg4;
		this.anInt3034 = arg3;
		this.anInt3023 = arg6;
		this.anInt3029 = arg7;
		this.anInt3031 = arg1;
		this.anInt3026 = arg2;
		this.anInt3025 = arg0;
		this.anInt3028 = arg5;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3025 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3031 >> 12;
		@Pc(24) int local24 = this.anInt3026 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt3034 * arg0 >> 12;
		@Pc(42) int local42 = arg1 * this.anInt3030 >> 12;
		@Pc(49) int local49 = this.anInt3028 * arg0 >> 12;
		@Pc(56) int local56 = arg1 * this.anInt3023 >> 12;
		@Pc(63) int local63 = arg0 * this.anInt3029 >> 12;
		Static144.method2805(local56, super.anInt9202, local24, local63, local31, local42, local17, local49, local10);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)V")
	@Override
	public void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
