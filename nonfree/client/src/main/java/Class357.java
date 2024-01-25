import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class357 {

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "Lclient!nga;")
	private final Class233 aClass233_60 = new Class233(256);

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "Lclient!d;")
	private final Interface6 anInterface6_12;

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_42;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!oea;Lclient!d;)V")
	public Class357(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Interface6 arg1) {
		this.anInterface6_12 = arg1;
		this.aClass87_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	public void method8216() {
		this.aClass233_60.method5663();
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	public void method8217() {
		this.aClass233_60.method5664(5);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)Lclient!me;")
	public Class88_Sub2 method8220(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass233_60.method5669((long) arg0);
		if (local10 != null) {
			return (Class88_Sub2) local10;
		} else if (this.anInterface6_12.method6355(arg0)) {
			@Pc(29) Class199 local29 = this.anInterface6_12.method6357(arg0);
			@Pc(43) int local43 = local29.aBoolean428 ? 64 : this.aClass87_Sub2_42.anInt7359;
			@Pc(81) Class88_Sub2 local81;
			if (local29.aBoolean424 && this.aClass87_Sub2_42.method7914()) {
				@Pc(60) float[] local60 = this.anInterface6_12.method6356(arg0, 0.7F, local43, local43);
				local81 = new Class88_Sub2(this.aClass87_Sub2_42, 3553, 34842, local43, local43, local29.aByte85 != 0, local60, 6408);
			} else {
				@Pc(103) int[] local103;
				if (local29.anInt5691 != 2 && Static404.method788(local29.aByte86)) {
					local103 = this.anInterface6_12.method6354(0.7F, local43, true, arg0, local43);
				} else {
					local103 = this.anInterface6_12.method6358(local43, arg0, 0.7F, local43);
				}
				local81 = new Class88_Sub2(this.aClass87_Sub2_42, 3553, 6408, local43, local43, local29.aByte85 != 0, local103, 0, 0, false);
			}
			local81.method5202(local29.aBoolean426, local29.aBoolean425);
			this.aClass233_60.method5662(local81, (long) arg0);
			return local81;
		} else {
			return null;
		}
	}
}
