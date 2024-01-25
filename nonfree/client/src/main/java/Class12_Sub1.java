import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!qfa;)V")
	public Class12_Sub1(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class23_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIB)V")
	@Override
	protected void method5758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.method5760() * super.aClass23_5.anInt8314 / 10000;
		Static31.aClass78_18.J(arg0, arg1 + 2, local17, super.aClass23_5.anInt8309 - 2, ((Class23_Sub2) super.aClass23_5).anInt7472, 0);
		Static31.aClass78_18.J(local17 + arg0, arg1 + 2, super.aClass23_5.anInt8314 - local17, super.aClass23_5.anInt8309 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method5757(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static31.aClass78_18.method6778(arg0 - 2, arg1, super.aClass23_5.anInt8314 + 4, super.aClass23_5.anInt8309 + 2, ((Class23_Sub2) super.aClass23_5).anInt7471, 0);
		Static31.aClass78_18.method6778(arg0 - 1, arg1 - -1, super.aClass23_5.anInt8314 + 2, super.aClass23_5.anInt8309, 0, 0);
	}
}
