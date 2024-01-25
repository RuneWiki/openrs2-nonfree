import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	private int anInt7896;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "Lclient!xa;")
	private Class71 aClass71_47;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lclient!pj;")
	private final Class248 aClass248_87;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!pj;Lclient!daa;)V")
	public Class40_Sub3(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class65_Sub1 arg1) {
		super(arg1);
		this.aClass248_87 = arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		return this.aClass248_87.method5804(((Class65_Sub1) super.aClass65_4).anInt1484);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method6298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static554.aClass90_12.method7494(arg1 - 2, arg0, super.aClass65_4.anInt4919 + 4, super.aClass65_4.anInt4916 + 2, ((Class65_Sub1) super.aClass65_4).anInt1486, 0);
		Static554.aClass90_12.method7494(arg1 - 1, arg0 + 1, super.aClass65_4.anInt4919 + 2, super.aClass65_4.anInt4916, 0, 0);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZB)V")
	@Override
	protected void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7896 = Static473.anInt8332;
		@Pc(20) int local20 = super.aClass65_4.anInt4919 * Static473.anInt8332 / 100;
		@Pc(23) int[] local23 = new int[4];
		Static554.aClass90_12.A(local23);
		Static554.aClass90_12.ca(arg0, arg1 + 2, arg0 - -local20, super.aClass65_4.anInt4916 + arg1);
		this.aClass71_47.method7776(arg0, arg1 + 2, super.aClass65_4.anInt4919, super.aClass65_4.anInt4916);
		Static554.aClass90_12.ca(local23[0], local23[1], local23[2], local23[3]);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
		this.aClass71_47 = Static535.method7285(this.aClass248_87.method5795(((Class65_Sub1) super.aClass65_4).anInt1484));
		this.method6771();
	}
}
