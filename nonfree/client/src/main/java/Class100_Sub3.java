import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!io;)V")
	public Class100_Sub3(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class18_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZBII)V")
	@Override
	protected void method5521(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5520() * super.aClass18_5.anInt6645 / 10000;
		Static240.aClass14_7.C(arg0, arg1 + 2, local13, super.aClass18_5.anInt6643 - 2, ((Class18_Sub2) super.aClass18_5).anInt4272, 0);
		Static240.aClass14_7.C(arg0 + local13, arg1 + 2, super.aClass18_5.anInt6645 - local13, super.aClass18_5.anInt6643 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZZ)V")
	@Override
	protected void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static240.aClass14_7.method6875(arg1 - 2, arg0, super.aClass18_5.anInt6645 + 4, super.aClass18_5.anInt6643 + 2, ((Class18_Sub2) super.aClass18_5).anInt4269, 0);
		Static240.aClass14_7.method6875(arg1 - 1, arg0 + 1, super.aClass18_5.anInt6645 + 2, super.aClass18_5.anInt6643, 0, 0);
	}
}
