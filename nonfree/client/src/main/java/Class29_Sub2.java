import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "Lclient!xa;")
	private Class13 aClass13_21;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!kr;)V")
	public Class29_Sub2(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class52_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	@Override
	public void method7804() {
		super.method7804();
		this.aClass13_21 = Static484.method7810(super.aClass31_120, ((Class52_Sub2) super.aClass52_5).anInt5260);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIIZ)V")
	@Override
	protected void method7812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static185.aClass66_14.method6786(arg1 - 2, arg0, super.aClass52_5.anInt8822 + 4, super.aClass52_5.anInt8828 + 2, ((Class52_Sub2) super.aClass52_5).anInt5262, 0);
		Static185.aClass66_14.method6786(arg1 - 1, arg0 + 1, super.aClass52_5.anInt8822 + 2, super.aClass52_5.anInt8828, 0, 0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7806() {
		return super.method7806() ? super.aClass31_120.method679(((Class52_Sub2) super.aClass52_5).anInt5260) : false;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7813() * super.aClass52_5.anInt8822 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static185.aClass66_14.A(local16);
		Static185.aClass66_14.ca(arg1, arg0 + 2, local13 + arg1, super.aClass52_5.anInt8828 + arg0);
		this.aClass13_21.method8027(arg1, arg0 + 2, super.aClass52_5.anInt8822, super.aClass52_5.anInt8828);
		Static185.aClass66_14.ca(local16[0], local16[1], local16[2], local16[3]);
	}
}
