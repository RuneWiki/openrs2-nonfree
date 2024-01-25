import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class29_Sub3_Sub1 extends Class29_Sub3 {

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!lda;)V")
	public Class29_Sub3_Sub1(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class52_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIZI)V")
	@Override
	protected void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = super.aClass13_42.AA();
		@Pc(28) int local28 = ((Class52_Sub1_Sub1) super.aClass52_5).anInt5416 * Static44.method727() / 10 % local16;
		super.aClass13_42.method8027(arg0 + local28 - local16, arg2, arg3 + local16 - local28, arg1);
	}
}
