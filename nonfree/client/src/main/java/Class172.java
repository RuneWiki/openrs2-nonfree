import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class172 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!me;")
	private final Class211 aClass211_39 = new Class211(256);

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!e;")
	private final Interface4 anInterface4_10;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_7;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!fc;Lclient!e;)V")
	public Class172(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_10 = arg1;
		this.aClass15_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method4473() {
		this.aClass211_39.method5538(5);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lclient!qaa;")
	public Interface14 method4474(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass211_39.method5534((long) arg0);
		if (local10 != null) {
			return (Interface14) local10;
		} else if (this.anInterface4_10.method3090(arg0)) {
			@Pc(29) Class178 local29 = this.anInterface4_10.method3088(arg0);
			@Pc(38) int local38 = local29.aBoolean486 ? 64 : this.aClass15_Sub2_7.anInt6539;
			@Pc(72) Interface14 local72;
			if (local29.aBoolean487 && this.aClass15_Sub2_7.method5325()) {
				@Pc(57) float[] local57 = this.anInterface4_10.method3085(0.7F, local38, arg0, local38);
				local72 = this.aClass15_Sub2_7.method5448(local38, local29.aByte53 != 0, local57, local38, Static492.aClass261_14);
			} else {
				@Pc(97) int[] local97 = local29.aBoolean494 ? this.anInterface4_10.method3089(local38, arg0, local38, 0.7F) : this.anInterface4_10.method3086(local38, true, 0.7F, local38, arg0);
				local72 = this.aClass15_Sub2_7.method5385(local97, local38, local38, local29.aByte53 != 0);
			}
			local72.method8238(local29.aBoolean491, local29.aBoolean492);
			this.aClass211_39.method5529((long) arg0, local72);
			return local72;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public void method4478() {
		this.aClass211_39.method5535();
	}
}
