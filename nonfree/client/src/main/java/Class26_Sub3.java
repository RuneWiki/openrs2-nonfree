import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	private final int anInt1997;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	private final int anInt1998;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	private final int anInt1999;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	private final int anInt2001;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class26_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1997 = arg2;
		this.anInt1998 = arg1;
		this.anInt1999 = arg3;
		this.anInt2001 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2001 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt1997 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1998 >> 12;
		@Pc(31) int local31 = this.anInt1999 * arg0 >> 12;
		Static437.method7112(local24, local10, local31, super.anInt4744, local17);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt2001 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt1997 >> 12;
		@Pc(32) int local32 = this.anInt1998 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt1999 * arg0 >> 12;
		Static292.method4858(local18, local25, local32, super.anInt4746, local39, super.anInt4744, super.anInt4745);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2001 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt1997 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt1998 * arg0 >> 12;
		@Pc(42) int local42 = arg0 * this.anInt1999 >> 12;
		Static44.method943(super.anInt4745, local42, super.anInt4746, local35, local28, local10);
	}
}
