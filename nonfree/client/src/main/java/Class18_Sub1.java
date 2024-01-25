import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
	private final int anInt294;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	private final int anInt289;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	private final int anInt288;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	private final int anInt290;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIII)V")
	public Class18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt294 = arg1;
		this.anInt289 = arg3;
		this.anInt288 = arg2;
		this.anInt290 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	@Override
	public void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V")
	@Override
	public void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt290 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt288 >> 12;
		@Pc(32) int local32 = this.anInt294 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt289 * arg0 >> 12;
		Static176.method2899(local39, local18, super.anInt3585, local25, local32);
	}
}
