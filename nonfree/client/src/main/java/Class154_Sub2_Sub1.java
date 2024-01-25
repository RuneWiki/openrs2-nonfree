import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class154_Sub2_Sub1 extends Class154_Sub2 {

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!sm;)V")
	public Class154_Sub2_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class58_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = super.aClass49_21.method8991();
		@Pc(26) int local26 = ((Class58_Sub2_Sub1) super.aClass58_5).anInt9133 * Static336.method5188() / 10 % local14;
		super.aClass49_21.method8998(local26 + arg3 - local14, arg1, arg2 + local14 - local26, arg0);
	}
}
