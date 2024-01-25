import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class132 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Lclient!vg;")
	private final Class342 aClass342_80 = new Class342(256);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_8;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "Lclient!fa;")
	private final Interface4 anInterface4_6;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!rr;Lclient!fa;)V")
	public Class132(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass31_Sub1_8 = arg0;
		this.anInterface4_6 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lclient!mca;")
	public Interface12 method3504(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass342_80.method7684((long) arg0);
		if (local10 != null) {
			return (Interface12) local10;
		} else if (this.anInterface4_6.method7227(arg0)) {
			@Pc(34) Class172 local34 = this.anInterface4_6.method7229(arg0);
			@Pc(43) int local43 = local34.aBoolean358 ? 64 : this.aClass31_Sub1_8.anInt9120;
			@Pc(78) Interface12 local78;
			if (local34.aBoolean356 && this.aClass31_Sub1_8.method8085()) {
				@Pc(60) float[] local60 = this.anInterface4_6.method7230(local43, local43, 0.7F, arg0);
				local78 = this.aClass31_Sub1_8.method7125(local34.aByte59 != 0, local43, Static18.aClass245_3, local43, local60);
			} else {
				@Pc(110) int[] local110 = !local34.aBoolean351 && Static537.method7342(local34.aByte62) ? this.anInterface4_6.method7226(local43, arg0, true, local43, 0.7F) : this.anInterface4_6.method7228(0.7F, arg0, local43, local43);
				local78 = this.aClass31_Sub1_8.method7089(local110, local43, local34.aByte59 != 0, local43);
			}
			local78.method2990(local34.aBoolean353, local34.aBoolean354);
			this.aClass342_80.method7683(local78, (long) arg0);
			return local78;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	public void method3506() {
		this.aClass342_80.method7693();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
	public void method3507() {
		this.aClass342_80.method7697(5);
	}
}
