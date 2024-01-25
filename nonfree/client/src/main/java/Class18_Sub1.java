import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	private final int anInt704;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	private final int anInt709;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	private final int anInt705;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	private final int anInt708;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIII)V")
	public Class18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt704 = arg3;
		this.anInt709 = arg1;
		this.anInt705 = arg0;
		this.anInt708 = arg2;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BII)V")
	@Override
	public void method2850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	@Override
	public void method2849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt705 >> 12;
		@Pc(17) int local17 = this.anInt708 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt709 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt704 >> 12;
		Static276.method4762(local24, local31, local10, local17, super.anInt3162);
	}
}
