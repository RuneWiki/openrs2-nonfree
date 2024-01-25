import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class138_Sub3 extends Class138 {

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!pca;)V")
	public Class138_Sub3(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class21_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7395(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(22) int local22 = this.method7400() * super.aClass21_5.anInt9572 / 10000;
		Static119.aClass95_4.aa(arg0, arg1 + 2, local22, super.aClass21_5.anInt9574 - 2, ((Class21_Sub2) super.aClass21_5).anInt7274, 0);
		Static119.aClass95_4.aa(arg0 + local22, arg1 - -2, super.aClass21_5.anInt9572 - local22, super.aClass21_5.anInt9574 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7396(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static119.aClass95_4.method8062(arg0 - 2, arg1, super.aClass21_5.anInt9572 + 4, super.aClass21_5.anInt9574 + 2, ((Class21_Sub2) super.aClass21_5).anInt7277, 0);
		Static119.aClass95_4.method8062(arg0 - 1, arg1 + 1, super.aClass21_5.anInt9572 + 2, super.aClass21_5.anInt9574, 0, 0);
	}
}
