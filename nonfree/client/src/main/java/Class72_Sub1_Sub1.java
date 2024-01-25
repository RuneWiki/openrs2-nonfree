import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class72_Sub1_Sub1 extends Class72_Sub1 {

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!wl;)V")
	public Class72_Sub1_Sub1(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class175_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass10_21.A();
		@Pc(24) int local24 = ((Class175_Sub1_Sub1) super.aClass175_5).anInt9489 * Static550.method7487() / 10 % local12;
		super.aClass10_21.method7681(local24 + arg0 - local12, arg2, arg1 + local12 - local24, arg3);
	}
}
