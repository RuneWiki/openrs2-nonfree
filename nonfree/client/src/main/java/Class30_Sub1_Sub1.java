import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class30_Sub1_Sub1 extends Class30_Sub1 {

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!hi;)V")
	public Class30_Sub1_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class109_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIB)V")
	@Override
	protected void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = super.aClass4_22.method7700();
		@Pc(23) int local23 = ((Class109_Sub1_Sub1) super.aClass109_5).anInt4643 * Static506.method7278() / 10 % local11;
		super.aClass4_22.method7701(local23 + arg3 - local11, arg2, local11 + arg1 - local23, arg0);
	}
}
