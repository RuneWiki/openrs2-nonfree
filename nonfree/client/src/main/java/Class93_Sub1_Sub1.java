import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class93_Sub1_Sub1 extends Class93_Sub1 {

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!oca;)V")
	public Class93_Sub1_Sub1(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class33_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIZII)V")
	@Override
	protected void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass43_11.method9587();
		@Pc(24) int local24 = ((Class33_Sub2_Sub1) super.aClass33_5).anInt7265 * Static281.method3944() / 10 % local12;
		super.aClass43_11.method9605(local24 + arg0 - local12, arg3, local12 + arg1 - local24, arg2);
	}
}
