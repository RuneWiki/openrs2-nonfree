import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class154_Sub3 extends Class154 {

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "Lclient!tb;")
	private Class49 aClass49_36;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!vm;)V")
	public Class154_Sub3(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class58_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	@Override
	public void method8040() {
		super.method8040();
		this.aClass49_36 = Static527.method7563(super.aClass223_109, ((Class58_Sub3) super.aClass58_5).anInt10063);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static202.aClass75_5.method6701(arg0 - 2, arg1, super.aClass58_5.anInt10052 + 4, super.aClass58_5.anInt10050 + 2, ((Class58_Sub3) super.aClass58_5).anInt10062, 0);
		Static202.aClass75_5.method6701(arg0 - 1, arg1 + 1, super.aClass58_5.anInt10052 + 2, super.aClass58_5.anInt10050, 0, 0);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8038() {
		return super.method8038() ? super.aClass223_109.method5285(((Class58_Sub3) super.aClass58_5).anInt10063) : false;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BIZI)V")
	@Override
	protected void method8042(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method8043() * super.aClass58_5.anInt10052 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static202.aClass75_5.K(local16);
		Static202.aClass75_5.KA(arg1, arg0 + 2, local13 + arg1, arg0 + super.aClass58_5.anInt10050);
		this.aClass49_36.method8998(arg1, arg0 + 2, super.aClass58_5.anInt10052, super.aClass58_5.anInt10050);
		Static202.aClass75_5.KA(local16[0], local16[1], local16[2], local16[3]);
	}
}
