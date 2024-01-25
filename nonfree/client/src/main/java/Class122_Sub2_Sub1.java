import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class122_Sub2_Sub1 extends Class122_Sub2 {

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!hl;)V")
	public Class122_Sub2_Sub1(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class8_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass20_24.method4588();
		@Pc(19) int local19 = ((Class8_Sub2_Sub1) super.aClass8_5).anInt4433 * Static438.method6518() / 10 % local7;
		super.aClass20_24.method4584(arg0 + local19 - local7, arg3, arg2 + local7 - local19, arg1);
	}
}
