import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class137_Sub3 extends Class137 {

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!vc;)V")
	public Class137_Sub3(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class69_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method8364() * super.aClass69_5.anInt9616 / 10000;
		Static192.aClass95_4.aa(arg1, arg0 + 2, local13, super.aClass69_5.anInt9604 - 2, ((Class69_Sub3) super.aClass69_5).anInt9621, 0);
		Static192.aClass95_4.aa(local13 + arg1, arg0 + 2, super.aClass69_5.anInt9616 - local13, super.aClass69_5.anInt9604 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method8362(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static192.aClass95_4.method6997(arg0 - 2, arg1, super.aClass69_5.anInt9616 + 4, super.aClass69_5.anInt9604 + 2, ((Class69_Sub3) super.aClass69_5).anInt9619, 0);
		Static192.aClass95_4.method6997(arg0 - 1, arg1 + 1, super.aClass69_5.anInt9616 + 2, super.aClass69_5.anInt9604, 0, 0);
	}
}
