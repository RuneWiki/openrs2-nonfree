import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class190_Sub3 extends Class190 {

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!jca;)V")
	public Class190_Sub3(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class84_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZII)V")
	@Override
	protected void method5818(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static582.aClass16_12.method8146(arg1 - 2, arg0, super.aClass84_5.anInt10343 + 4, super.aClass84_5.anInt10342 - -2, ((Class84_Sub2) super.aClass84_5).anInt5118, 0);
		Static582.aClass16_12.method8146(arg1 - 1, arg0 - -1, super.aClass84_5.anInt10343 + 2, super.aClass84_5.anInt10342, 0, 0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method5816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method5819() * super.aClass84_5.anInt10343 / 10000;
		Static582.aClass16_12.aa(arg1, arg0 + 2, local13, super.aClass84_5.anInt10342 - 2, ((Class84_Sub2) super.aClass84_5).anInt5113, 0);
		Static582.aClass16_12.aa(arg1 + local13, arg0 + 2, super.aClass84_5.anInt10343 - local13, super.aClass84_5.anInt10342 + -2, 0, 0);
	}
}
