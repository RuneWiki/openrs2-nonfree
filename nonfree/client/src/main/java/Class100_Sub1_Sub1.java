import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class100_Sub1_Sub1 extends Class100_Sub1 {

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!oq;)V")
	public Class100_Sub1_Sub1(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class18_Sub3_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBIII)V")
	@Override
	protected void method2859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = super.aClass58_15.AA();
		@Pc(27) int local27 = ((Class18_Sub3_Sub1) super.aClass18_5).anInt6662 * Static532.method7232() / 10 % local15;
		super.aClass58_15.method7661(arg1 + local27 - local15, arg0, arg2 + local15 - local27, arg3);
	}
}
