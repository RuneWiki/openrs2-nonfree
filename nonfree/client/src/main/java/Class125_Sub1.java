import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fha")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!fha", name = "w", descriptor = "I")
	private final int anInt2879;

	@OriginalMember(owner = "client!fha", name = "r", descriptor = "I")
	private final int anInt2885;

	@OriginalMember(owner = "client!fha", name = "s", descriptor = "I")
	private final int anInt2877;

	@OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
	private final int anInt2881;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIIIII)V")
	public Class125_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2879 = arg3;
		this.anInt2885 = arg1;
		this.anInt2877 = arg2;
		this.anInt2881 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2881 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2877 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2885 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt2879 * arg0 >> 12;
		Static147.method2069(local31, local17, local10, super.anInt10752, super.anInt10751, local24);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2881 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2877 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt2885 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2879 >> 12;
		Static649.method5107(local31, local10, super.anInt10751, super.anInt10754, local17, super.anInt10752, local24);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ZII)V")
	@Override
	public void method9263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2881 >> 12;
		@Pc(17) int local17 = this.anInt2877 * arg0 >> 12;
		@Pc(34) int local34 = this.anInt2885 * arg1 >> 12;
		@Pc(41) int local41 = this.anInt2879 * arg1 >> 12;
		Static439.method6497(super.anInt10754, local17, local34, local41, local10);
	}
}
