import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "Lclient!qda;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!je;)V")
	public Class71_Sub1(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class110_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V")
	@Override
	public void method8562() {
		super.method8562();
		this.aClass59_2 = Static231.method799(((Class110_Sub2) super.aClass110_5).anInt4269, super.aClass50_134);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6932(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static563.aClass143_13.method6229(arg0 - 2, arg1, super.aClass110_5.anInt8729 + 4, super.aClass110_5.anInt8731 + 2, ((Class110_Sub2) super.aClass110_5).anInt4266, 0);
		Static563.aClass143_13.method6229(arg0 - 1, arg1 + 1, super.aClass110_5.anInt8729 + 2, super.aClass110_5.anInt8731, 0, 0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.method6933() * super.aClass110_5.anInt8729 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static563.aClass143_13.K(local16);
		Static563.aClass143_13.KA(arg1, arg0 + 2, local13 + arg1, arg0 + super.aClass110_5.anInt8731);
		this.aClass59_2.method8063(arg1, arg0 + 2, super.aClass110_5.anInt8729, super.aClass110_5.anInt8731);
		Static563.aClass143_13.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8563() {
		return super.method8563() ? super.aClass50_134.method897(((Class110_Sub2) super.aClass110_5).anInt4269) : false;
	}
}
