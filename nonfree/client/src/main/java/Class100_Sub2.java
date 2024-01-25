import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "Lclient!xa;")
	private Class58 aClass58_28;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!eo;)V")
	public Class100_Sub2(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class18_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7572() {
		return super.method7572() ? super.aClass251_87.method5782(((Class18_Sub1) super.aClass18_5).anInt2821) : false;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZBII)V")
	@Override
	protected void method5521(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5520() * super.aClass18_5.anInt6645 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static240.aClass14_7.A(local16);
		Static240.aClass14_7.ca(arg0, arg1 + 2, local13 + arg0, super.aClass18_5.anInt6643 + arg1);
		this.aClass58_28.method7661(arg0, arg1 + 2, super.aClass18_5.anInt6645, super.aClass18_5.anInt6643);
		Static240.aClass14_7.ca(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	@Override
	public void method7570() {
		super.method7570();
		this.aClass58_28 = Static588.method1984(super.aClass251_87, ((Class18_Sub1) super.aClass18_5).anInt2821);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZZ)V")
	@Override
	protected void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static240.aClass14_7.method6875(arg1 - 2, arg0, super.aClass18_5.anInt6645 + 4, super.aClass18_5.anInt6643 + 2, ((Class18_Sub1) super.aClass18_5).anInt2820, 0);
		Static240.aClass14_7.method6875(arg1 - 1, arg0 + 1, super.aClass18_5.anInt6645 + 2, super.aClass18_5.anInt6643, 0, 0);
	}
}
