import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class287 {

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "Lclient!me;")
	private final Class211 aClass211_55 = new Class211(256);

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_32;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Lclient!e;")
	private final Interface4 anInterface4_13;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!ji;Lclient!e;)V")
	public Class287(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass15_Sub3_32 = arg0;
		this.anInterface4_13 = arg1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	public void method7071() {
		this.aClass211_55.method5538(5);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	public void method7073() {
		this.aClass211_55.method5535();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Lclient!vga;")
	public Class11_Sub2 method7074(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass211_55.method5534((long) arg0);
		if (local10 != null) {
			return (Class11_Sub2) local10;
		} else if (this.anInterface4_13.method3090(arg0)) {
			@Pc(29) Class178 local29 = this.anInterface4_13.method3088(arg0);
			@Pc(38) int local38 = local29.aBoolean486 ? 64 : this.aClass15_Sub3_32.anInt5317;
			@Pc(76) Class11_Sub2 local76;
			if (local29.aBoolean487 && this.aClass15_Sub3_32.method5325()) {
				@Pc(55) float[] local55 = this.anInterface4_13.method3085(0.7F, local38, arg0, local38);
				local76 = new Class11_Sub2(this.aClass15_Sub3_32, 3553, 34842, local38, local38, local29.aByte53 != 0, local55, 6408);
			} else {
				@Pc(90) int[] local90;
				if (local29.aBoolean494) {
					local90 = this.anInterface4_13.method3089(local38, arg0, local38, 0.7F);
				} else {
					local90 = this.anInterface4_13.method3086(local38, true, 0.7F, local38, arg0);
				}
				local76 = new Class11_Sub2(this.aClass15_Sub3_32, 3553, 6408, local38, local38, local29.aByte53 != 0, local90, false);
			}
			local76.method1633(local29.aBoolean492, local29.aBoolean491);
			this.aClass211_55.method5529((long) arg0, local76);
			return local76;
		} else {
			return null;
		}
	}
}
