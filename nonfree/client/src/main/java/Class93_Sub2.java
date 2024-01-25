import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!be;)V")
	public Class93_Sub2(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class33_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method9565(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static396.aClass145_6.method9713(arg1 - 2, arg0, super.aClass33_5.anInt7246 + 4, super.aClass33_5.anInt7251 + 2, ((Class33_Sub1) super.aClass33_5).anInt577, 0);
		Static396.aClass145_6.method9713(arg1 - 1, arg0 + 1, super.aClass33_5.anInt7246 + 2, super.aClass33_5.anInt7251, 0, 0);
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IZII)V")
	@Override
	protected void method9568(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method9563() * super.aClass33_5.anInt7246 / 10000;
		Static396.aClass145_6.aa(arg0, arg1 + 2, local13, super.aClass33_5.anInt7251 - 2, ((Class33_Sub1) super.aClass33_5).anInt578, 0);
		Static396.aClass145_6.aa(local13 + arg0, arg1 - -2, super.aClass33_5.anInt7246 - local13, super.aClass33_5.anInt7251 - 2, 0, 0);
	}
}
