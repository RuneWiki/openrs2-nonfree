import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class82_Sub2 extends Class82 {

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	private final int anInt3172;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	private final int anInt3169;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	private final int anInt3168;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	private final int anInt3167;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIII)V")
	public Class82_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3172 = arg3;
		this.anInt3169 = arg2;
		this.anInt3168 = arg1;
		this.anInt3167 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt3167 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt3169 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt3168 >> 12;
		@Pc(38) int local38 = this.anInt3172 * arg0 >> 12;
		Static130.method2849(local17, local31, local24, local38, super.anInt6516);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)V")
	@Override
	public void method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
