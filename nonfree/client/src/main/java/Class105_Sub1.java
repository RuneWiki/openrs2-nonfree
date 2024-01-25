import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	private final int anInt2703;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	private final int anInt2709;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	private final int anInt2702;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	private final int anInt2706;

	static {
		new Class231(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIII)V")
	public Class105_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2703 = arg2;
		this.anInt2709 = arg1;
		this.anInt2702 = arg0;
		this.anInt2706 = arg3;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2702 >> 12;
		@Pc(17) int local17 = this.anInt2703 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2709 >> 12;
		@Pc(31) int local31 = this.anInt2706 * arg1 >> 12;
		Static158.method2345(local24, super.anInt7370, local31, super.anInt7368, super.anInt7373, local10, local17);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2702 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2703 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2709 >> 12;
		@Pc(35) int local35 = this.anInt2706 * arg1 >> 12;
		Static161.method2387(local35, local17, super.anInt7373, local10, super.anInt7370, local24);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2702 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2703 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt2709 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt2706 >> 12;
		Static382.method5259(local32, super.anInt7368, local39, local17, local10);
	}
}
