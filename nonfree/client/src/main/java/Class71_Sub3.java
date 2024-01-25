import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!sc;)V")
	public Class71_Sub3(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class110_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.method6933() * super.aClass110_5.anInt8729 / 10000;
		Static563.aClass143_13.aa(arg1, arg0 + 2, local15, super.aClass110_5.anInt8731 - 2, ((Class110_Sub3) super.aClass110_5).anInt8741, 0);
		Static563.aClass143_13.aa(arg1 + local15, arg0 + 2, super.aClass110_5.anInt8729 - local15, super.aClass110_5.anInt8731 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6932(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static563.aClass143_13.method6229(arg0 - 2, arg1, super.aClass110_5.anInt8729 + 4, super.aClass110_5.anInt8731 + 2, ((Class110_Sub3) super.aClass110_5).anInt8743, 0);
		Static563.aClass143_13.method6229(arg0 - 1, arg1 + 1, super.aClass110_5.anInt8729 + 2, super.aClass110_5.anInt8731, 0, 0);
	}
}
