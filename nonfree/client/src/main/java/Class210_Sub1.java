import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!kk;)V")
	public Class210_Sub1(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class9_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIZI)V")
	@Override
	protected void method7020(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7022() * super.aClass9_5.anInt5034 / 10000;
		Static307.aClass100_6.J(arg1, arg0 + 2, local13, super.aClass9_5.anInt5030 - 2, ((Class9_Sub3) super.aClass9_5).anInt5041, 0);
		Static307.aClass100_6.J(arg1 + local13, arg0 + 2, super.aClass9_5.anInt5034 - local13, super.aClass9_5.anInt5030 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7019(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static307.aClass100_6.method6212(arg0 - 2, arg1, super.aClass9_5.anInt5034 + 4, super.aClass9_5.anInt5030 + 2, ((Class9_Sub3) super.aClass9_5).anInt5040, 0);
		Static307.aClass100_6.method6212(arg0 - 1, arg1 + 1, super.aClass9_5.anInt5034 + 2, super.aClass9_5.anInt5030, 0, 0);
	}
}
