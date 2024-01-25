import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class222_Sub2_Sub1 extends Class222_Sub2 {

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!gn;)V")
	public Class222_Sub2_Sub1(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class94_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass46_27.A();
		@Pc(24) int local24 = ((Class94_Sub1_Sub1) super.aClass94_5).anInt3453 * Static100.method2161() / 10 % local12;
		super.aClass46_27.method7612(local24 + arg3 - local12, arg2, arg1 + local12 - local24, arg0);
	}
}
