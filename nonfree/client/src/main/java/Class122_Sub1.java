import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!kr;")
	private Class20 aClass20_7;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!ada;)V")
	public Class122_Sub1(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class8_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBZI)V")
	@Override
	protected void method7101(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7099() * super.aClass8_5.anInt5334 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static600.aClass87_15.K(local16);
		Static600.aClass87_15.KA(arg0, arg1 + 2, arg0 + local13, arg1 + super.aClass8_5.anInt5330);
		this.aClass20_7.method4584(arg0, arg1 + 2, super.aClass8_5.anInt5334, super.aClass8_5.anInt5330);
		Static600.aClass87_15.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8023() {
		return super.method8023() ? super.aClass97_127.method2564(((Class8_Sub1) super.aClass8_5).anInt113) : false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7105(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static600.aClass87_15.method7954(arg1 - 2, arg0, super.aClass8_5.anInt5334 + 4, super.aClass8_5.anInt5330 + 2, ((Class8_Sub1) super.aClass8_5).anInt116, 0);
		Static600.aClass87_15.method7954(arg1 - 1, arg0 - -1, super.aClass8_5.anInt5334 + 2, super.aClass8_5.anInt5330, 0, 0);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public void method8024() {
		super.method8024();
		this.aClass20_7 = Static385.method5796(super.aClass97_127, ((Class8_Sub1) super.aClass8_5).anInt113);
	}
}
