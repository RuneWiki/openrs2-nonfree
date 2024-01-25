import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Lclient!cw;")
	private Class61 aClass61_15;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!uv;)V")
	public Class137_Sub2(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class69_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8642() {
		return super.method8642() ? super.aClass380_133.method8638(((Class69_Sub2) super.aClass69_5).anInt9567) : false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(17) int local17 = this.method8364() * super.aClass69_5.anInt9616 / 10000;
		@Pc(20) int[] local20 = new int[4];
		Static192.aClass95_4.K(local20);
		Static192.aClass95_4.KA(arg1, arg0 + 2, arg1 - -local17, arg0 + super.aClass69_5.anInt9604);
		this.aClass61_15.method6439(arg1, arg0 + 2, super.aClass69_5.anInt9616, super.aClass69_5.anInt9604);
		Static192.aClass95_4.KA(local20[0], local20[1], local20[2], local20[3]);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	@Override
	public void method8644() {
		super.method8644();
		this.aClass61_15 = Static87.method1309(((Class69_Sub2) super.aClass69_5).anInt9567, super.aClass380_133);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method8362(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static192.aClass95_4.method6997(arg0 - 2, arg1, super.aClass69_5.anInt9616 + 4, super.aClass69_5.anInt9604 + 2, ((Class69_Sub2) super.aClass69_5).anInt9565, 0);
		Static192.aClass95_4.method6997(arg0 - 1, arg1 + 1, super.aClass69_5.anInt9616 + 2, super.aClass69_5.anInt9604, 0, 0);
	}
}
