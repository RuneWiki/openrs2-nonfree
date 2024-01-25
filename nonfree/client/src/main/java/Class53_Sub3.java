import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class53_Sub3 extends Class53 {

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Lclient!mi;")
	private Class46 aClass46_28;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!kh;)V")
	public Class53_Sub3(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class110_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZBI)V")
	@Override
	protected void method9234(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static186.aClass20_4.method7231(arg0 - 2, arg1, super.aClass110_5.anInt7743 + 4, super.aClass110_5.anInt7736 + 2, ((Class110_Sub2) super.aClass110_5).anInt6190, 0);
		Static186.aClass20_4.method7231(arg0 - 1, arg1 + 1, super.aClass110_5.anInt7743 + 2, super.aClass110_5.anInt7736, 0, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9232() {
		return super.method9232() ? super.aClass157_310.method4575(((Class110_Sub2) super.aClass110_5).anInt6192) : false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	@Override
	public void method9231() {
		super.method9231();
		this.aClass46_28 = Static166.method3585(((Class110_Sub2) super.aClass110_5).anInt6192, super.aClass157_310);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method9238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method9239() * super.aClass110_5.anInt7743 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static186.aClass20_4.K(local16);
		Static186.aClass20_4.KA(arg1, arg0 + 2, arg1 - -local13, arg0 + super.aClass110_5.anInt7736);
		this.aClass46_28.method6211(arg1, arg0 + 2, super.aClass110_5.anInt7743, super.aClass110_5.anInt7736);
		Static186.aClass20_4.KA(local16[0], local16[1], local16[2], local16[3]);
	}
}
