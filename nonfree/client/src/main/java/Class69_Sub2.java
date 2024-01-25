import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	private final int anInt5674;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private final int anInt5673;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	private final int anInt5671;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private final int anInt5669;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class69_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5674 = arg3;
		this.anInt5673 = arg2;
		this.anInt5671 = arg0;
		this.anInt5669 = arg1;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(III)V")
	@Override
	public void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5671 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5673 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5669 >> 12;
		@Pc(35) int local35 = this.anInt5674 * arg1 >> 12;
		Static606.method7453(super.anInt6639, local10, super.anInt6646, local17, local35, local24, super.anInt6642);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)V")
	@Override
	public void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5671 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5673 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5669 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5674 >> 12;
		Static612.method7506(super.anInt6642, local10, super.anInt6646, local31, local24, local17);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	@Override
	public void method5702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5671 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5673 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt5669 >> 12;
		@Pc(39) int local39 = this.anInt5674 * arg1 >> 12;
		Static364.method5768(local32, local17, local10, local39, super.anInt6639);
	}
}
