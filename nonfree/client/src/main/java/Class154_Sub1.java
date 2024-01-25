import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!cja;)V")
	public Class154_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class58_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BIZI)V")
	@Override
	protected void method8042(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(20) int local20 = this.method8043() * super.aClass58_5.anInt10052 / 10000;
		Static202.aClass75_5.aa(arg1, arg0 + 2, local20, super.aClass58_5.anInt10050 - 2, ((Class58_Sub1) super.aClass58_5).anInt1067, 0);
		Static202.aClass75_5.aa(local20 + arg1, arg0 + 2, super.aClass58_5.anInt10052 - local20, super.aClass58_5.anInt10050 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static202.aClass75_5.method6701(arg0 - 2, arg1, super.aClass58_5.anInt10052 + 4, super.aClass58_5.anInt10050 - -2, ((Class58_Sub1) super.aClass58_5).anInt1068, 0);
		Static202.aClass75_5.method6701(arg0 - 1, arg1 + 1, super.aClass58_5.anInt10052 + 2, super.aClass58_5.anInt10050, 0, 0);
	}
}
