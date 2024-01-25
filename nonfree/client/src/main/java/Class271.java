import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public class Class271 implements Interface21 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "Lclient!pu;")
	protected Class50 aClass50_30;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "Lclient!wm;")
	private final Class390 aClass390_88;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "Lclient!ib;")
	protected final Class46 aClass46_2;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!wm;Lclient!ib;)V")
	public Class271(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class46 arg1) {
		this.aClass390_88 = arg0;
		this.aClass46_2 = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7887() {
		return this.aClass390_88.method8905(this.aClass46_2.anInt777);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7886() {
		@Pc(20) int local20 = this.aClass46_2.aClass275_5.method6449(Static613.anInt10005, this.aClass50_30.method6003()) + this.aClass46_2.anInt784;
		@Pc(34) int local34 = this.aClass46_2.aClass81_3.method2034(Static10.anInt152, this.aClass50_30.method6010()) + this.aClass46_2.anInt783;
		this.aClass50_30.method5996(local20, local34);
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
	@Override
	public final void method7888() {
		this.aClass50_30 = Static144.method2605(this.aClass390_88, this.aClass46_2.anInt777);
	}
}
