import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	private final int anInt2840;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
	private final int anInt2844;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
	private final int anInt2846;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	private final int anInt2845;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIII)V")
	public Class78_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2840 = arg1;
		this.anInt2844 = arg3;
		this.anInt2846 = arg0;
		this.anInt2845 = arg2;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	@Override
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2846 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2845 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2840 >> 12;
		@Pc(31) int local31 = this.anInt2844 * arg1 >> 12;
		Static401.method5668(local31, local17, local10, super.anInt7671, local24);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2846 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2845 >> 12;
		@Pc(28) int local28 = this.anInt2840 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt2844 * arg1 >> 12;
		Static565.method7631(super.anInt7670, local17, super.anInt7671, local28, super.anInt7669, local35, local10);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V")
	@Override
	public void method6316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt2846 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt2845 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt2840 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt2844 >> 12;
		Static544.method7386(local37, local16, super.anInt7670, local30, super.anInt7669, local23);
	}
}
