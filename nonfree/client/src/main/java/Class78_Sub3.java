import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
	private final int anInt5728;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	private final int anInt5721;

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
	private final int anInt5736;

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
	private final int anInt5734;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
	private final int anInt5722;

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
	private final int anInt5731;

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
	private final int anInt5727;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
	private final int anInt5723;

	static {
		new Class119("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		new Class119(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class78_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5728 = arg5;
		this.anInt5721 = arg6;
		this.anInt5736 = arg2;
		this.anInt5734 = arg3;
		this.anInt5722 = arg7;
		this.anInt5731 = arg1;
		this.anInt5727 = arg0;
		this.anInt5723 = arg4;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
	@Override
	public void method5065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5727 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5731 >> 12;
		@Pc(24) int local24 = this.anInt5736 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5734 >> 12;
		@Pc(38) int local38 = this.anInt5723 * arg0 >> 12;
		@Pc(45) int local45 = this.anInt5728 * arg1 >> 12;
		@Pc(57) int local57 = arg0 * this.anInt5721 >> 12;
		@Pc(64) int local64 = this.anInt5722 * arg1 >> 12;
		Static95.method1491(local38, super.anInt6427, local10, local64, local24, local57, local17, local45, local31);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(III)V")
	@Override
	public void method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
