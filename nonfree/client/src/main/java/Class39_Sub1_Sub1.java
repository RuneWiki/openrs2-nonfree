import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class39_Sub1_Sub1 extends Class39_Sub1 {

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!uv;)V")
	public Class39_Sub1_Sub1(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class41_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass5_16.method7589();
		@Pc(21) int local21 = ((Class41_Sub1_Sub1) super.aClass41_5).anInt9791 * Static280.method4954() / 10 % local7;
		super.aClass5_16.method7598(arg0 + local21 - local7, arg3, arg2 + local7 - local21, arg1);
	}
}
