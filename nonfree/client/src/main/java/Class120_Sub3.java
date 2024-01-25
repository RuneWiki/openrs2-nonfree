import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class120_Sub3 extends Class120 {

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!ew;)V")
	public Class120_Sub3(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class103_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZIB)V")
	@Override
	protected void method8643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static582.aClass33_13.method8142(arg0 - 2, arg1, super.aClass103_5.anInt8646 + 4, super.aClass103_5.anInt8653 + 2, ((Class103_Sub1) super.aClass103_5).anInt2613, 0);
		Static582.aClass33_13.method8142(arg0 - 1, arg1 + 1, super.aClass103_5.anInt8646 + 2, super.aClass103_5.anInt8653, 0, 0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method8642(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(18) int local18 = this.method8641() * super.aClass103_5.anInt8646 / 10000;
		Static582.aClass33_13.aa(arg0, arg1 + 2, local18, super.aClass103_5.anInt8653 - 2, ((Class103_Sub1) super.aClass103_5).anInt2617, 0);
		Static582.aClass33_13.aa(arg0 + local18, arg1 + 2, super.aClass103_5.anInt8646 - local18, super.aClass103_5.anInt8653 + -2, 0, 0);
	}
}
