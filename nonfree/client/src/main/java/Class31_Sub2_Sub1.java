import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class31_Sub2_Sub1 extends Class31_Sub2 {

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!ge;)V")
	public Class31_Sub2_Sub1(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class119_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method6897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass28_27.method4035();
		@Pc(24) int local24 = ((Class119_Sub1_Sub1) super.aClass119_5).anInt3106 * Static602.method8620() / 10 % local12;
		super.aClass28_27.method4047(local24 + arg1 - local12, arg3, local12 + arg0 - local24, arg2);
	}
}
