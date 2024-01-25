import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class99 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!ph;")
	private final Class154 aClass154_47 = new Class154(256);

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!al;")
	private final Interface1 anInterface1_2;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_18;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!ql;Lclient!al;)V")
	public Class99(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_2 = arg1;
		this.aClass92_Sub2_18 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lclient!jo;")
	public Class70_Sub4 method2713(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass154_47.method4222((long) arg0);
		if (local6 != null) {
			return (Class70_Sub4) local6;
		} else if (this.anInterface1_2.method5637(arg0)) {
			@Pc(25) Class135 local25 = this.anInterface1_2.method5634(arg0);
			@Pc(32) int local32 = local25.aBoolean360 ? 64 : 128;
			@Pc(72) Class70_Sub4 local72;
			if (local25.aBoolean365 && this.aClass92_Sub2_18.method4461()) {
				@Pc(83) float[] local83 = this.anInterface1_2.method5635(local32, 0.7F, local32, arg0);
				local72 = new Class70_Sub4(this.aClass92_Sub2_18, 3553, 34842, local32, local32, local25.aByte48 != 0, local83, 6408);
			} else {
				@Pc(49) int[] local49 = this.anInterface1_2.method5636(0.7F, arg0, local32, local32);
				local72 = new Class70_Sub4(this.aClass92_Sub2_18, 3553, 6408, local32, local32, local25.aByte48 != 0, local49, false);
			}
			local72.method1991(local25.aBoolean361, local25.aBoolean366);
			this.aClass154_47.method4221((long) arg0, local72);
			return local72;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method2714() {
		this.aClass154_47.method4219();
	}
}
