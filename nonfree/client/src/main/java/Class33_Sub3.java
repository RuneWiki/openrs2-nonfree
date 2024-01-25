import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
	private final int anInt5822;

	@OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
	private final int anInt5826;

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
	private final int anInt5827;

	@OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
	private final int anInt5824;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(IIIIIII)V")
	public Class33_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5822 = arg0;
		this.anInt5826 = arg3;
		this.anInt5827 = arg1;
		this.anInt5824 = arg2;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(III)V")
	@Override
	public void method6288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt5822 >> 12;
		@Pc(25) int local25 = this.anInt5824 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt5827 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt5826 >> 12;
		Static382.method5375(local32, local25, local18, super.anInt7490, local39);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5822 >> 12;
		@Pc(23) int local23 = this.anInt5824 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt5827 * arg1 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5826 >> 12;
		Static657.method8786(super.anInt7489, local37, super.anInt7492, local23, local10, super.anInt7490, local30);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V")
	@Override
	public void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
