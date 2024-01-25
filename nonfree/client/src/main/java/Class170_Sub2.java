import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class170_Sub2 extends Class170 {

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	private final int anInt7050;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	private final int anInt7055;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	private final int anInt7048;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	private final int anInt7052;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class170_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7050 = arg1;
		this.anInt7055 = arg0;
		this.anInt7048 = arg2;
		this.anInt7052 = arg3;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)V")
	@Override
	public void method6128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt7055 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt7048 >> 12;
		@Pc(32) int local32 = this.anInt7050 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt7052 * arg1 >> 12;
		Static90.method2060(local32, local18, super.anInt7390, super.anInt7392, local39, super.anInt7389, local25);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7055 >> 12;
		@Pc(17) int local17 = this.anInt7048 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt7050 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt7052 >> 12;
		Static477.method6636(local10, local17, local37, super.anInt7390, local30);
	}
}
