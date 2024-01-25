import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class106_Sub2_Sub1 extends Class106_Sub2 {

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!go;)V")
	public Class106_Sub2_Sub1(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class6_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIBI)V")
	@Override
	protected void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass21_21.method5779();
		@Pc(24) int local24 = ((Class6_Sub2_Sub1) super.aClass6_5).anInt4305 * Static415.method6519() / 10 % local12;
		super.aClass21_21.method5789(local24 + arg0 - local12, arg2, arg3 + local12 - local24, arg1);
	}
}
