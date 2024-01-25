import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	private final int anInt968;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	private final int anInt970;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	private final int anInt973;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIII)V")
	public Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt965 = arg3;
		this.anInt968 = arg0;
		this.anInt970 = arg2;
		this.anInt973 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)V")
	@Override
	public void method6074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt968 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt970 >> 12;
		@Pc(32) int local32 = this.anInt973 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt965 * arg0 >> 12;
		Static239.method4428(local39, local10, local32, local25, super.anInt7041);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	@Override
	public void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt968 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt970 >> 12;
		@Pc(31) int local31 = this.anInt973 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt965 * arg0 >> 12;
		Static34.method878(super.anInt7041, local10, super.anInt7042, local31, super.anInt7038, local24, local38);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt968 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt970 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt973 * arg0 >> 12;
		@Pc(44) int local44 = this.anInt965 * arg0 >> 12;
		Static9.method293(local44, local17, local10, super.anInt7038, local37, super.anInt7042);
	}
}
