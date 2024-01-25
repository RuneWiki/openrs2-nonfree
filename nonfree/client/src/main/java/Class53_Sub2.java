import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!ou;)V")
	public Class53_Sub2(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class110_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZBI)V")
	@Override
	protected void method9234(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static186.aClass20_4.method7231(arg0 - 2, arg1, super.aClass110_5.anInt7743 + 4, super.aClass110_5.anInt7736 + 2, ((Class110_Sub3) super.aClass110_5).anInt7744, 0);
		Static186.aClass20_4.method7231(arg0 - 1, arg1 + 1, super.aClass110_5.anInt7743 + 2, super.aClass110_5.anInt7736, 0, 0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method9238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = this.method9239() * super.aClass110_5.anInt7743 / 10000;
		Static186.aClass20_4.aa(arg1, arg0 + 2, local21, super.aClass110_5.anInt7736 - 2, ((Class110_Sub3) super.aClass110_5).anInt7748, 0);
		Static186.aClass20_4.aa(local21 + arg1, arg0 + 2, super.aClass110_5.anInt7743 - local21, super.aClass110_5.anInt7736 - 2, 0, 0);
	}
}
