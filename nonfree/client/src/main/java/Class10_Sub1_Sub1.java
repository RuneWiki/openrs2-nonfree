import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!cba;)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class6_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass24_19.method8576();
		@Pc(21) int local21 = ((Class6_Sub2_Sub1) super.aClass6_5).anInt1646 * Static623.method8625() / 10 % local7;
		super.aClass24_19.method8571(arg1 + local21 - local7, arg2, arg0 + local7 - local21, arg3);
	}
}
