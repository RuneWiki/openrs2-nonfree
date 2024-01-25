import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!hha;)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class22_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method6597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass32_25.method5080();
		@Pc(19) int local19 = ((Class22_Sub1_Sub1) super.aClass22_5).anInt4159 * Static56.method1020() / 10 % local7;
		super.aClass32_25.method5092(local19 + arg2 - local7, arg0, local7 + arg1 - local19, arg3);
	}
}
