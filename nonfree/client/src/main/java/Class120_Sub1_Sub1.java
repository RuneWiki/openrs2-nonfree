import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class120_Sub1_Sub1 extends Class120_Sub1 {

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!ro;)V")
	public Class120_Sub1_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class103_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = super.aClass17_40.method5256();
		@Pc(25) int local25 = ((Class103_Sub2_Sub1) super.aClass103_5).anInt8173 * Static617.method8312() / 10 % local11;
		super.aClass17_40.method5261(local25 + arg3 - local11, arg2, local11 + arg0 - local25, arg1);
	}
}
