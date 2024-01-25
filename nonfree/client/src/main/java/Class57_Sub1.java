import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	private final int anInt1518;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	private final int anInt1526;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	private final int anInt1517;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	private final int anInt1524;

	static {
		new Class134("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIII)V")
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1518 = arg3;
		this.anInt1526 = arg0;
		this.anInt1517 = arg1;
		this.anInt1524 = arg2;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	@Override
	public void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1526 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt1524 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt1517 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1518 >> 12;
		Static434.method5457(local29, local22, local36, local10, super.anInt6157);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1526 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1524 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1517 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt1518 >> 12;
		Static360.method4747(super.anInt6156, local24, local36, local17, local10, super.anInt6158, super.anInt6157);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(III)V")
	@Override
	public void method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1526 >> 12;
		@Pc(17) int local17 = this.anInt1524 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt1517 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt1518 >> 12;
		Static65.method965(local17, super.anInt6158, local39, local10, local32, super.anInt6156);
	}
}
