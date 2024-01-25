import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class82 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!aj;")
	private final Class10 aClass10_13 = new Class10(256);

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_6;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "Lclient!fa;")
	private final Interface8 anInterface8_7;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!cf;Lclient!fa;)V")
	public Class82(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass43_Sub1_6 = arg0;
		this.anInterface8_7 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)Lclient!hi;")
	public Interface10 method2534(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass10_13.method250((long) arg0);
		if (local10 != null) {
			return (Interface10) local10;
		} else if (this.anInterface8_7.method6559(arg0)) {
			@Pc(34) Class224 local34 = this.anInterface8_7.method6560(arg0);
			@Pc(43) int local43 = local34.aBoolean490 ? 64 : this.aClass43_Sub1_6.anInt4805;
			@Pc(95) Interface10 local95;
			if (local34.aBoolean488 && this.aClass43_Sub1_6.method7216()) {
				@Pc(107) float[] local107 = this.anInterface8_7.method6558(arg0, local43, local43, 0.7F);
				local95 = this.aClass43_Sub1_6.method4236(local43, local34.aByte72 != 0, local107, local43, Static581.aClass93_14);
			} else {
				@Pc(78) int[] local78 = !local34.aBoolean492 && Static588.method2590(local34.aByte69) ? this.anInterface8_7.method6555(arg0, true, 0.7F, local43, local43) : this.anInterface8_7.method6556(arg0, local43, 0.7F, local43);
				local95 = this.aClass43_Sub1_6.method4303(local43, local78, local34.aByte72 != 0, local43);
			}
			local95.method6171(local34.aBoolean495, local34.aBoolean489);
			this.aClass10_13.method254(local95, (long) arg0);
			return local95;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public void method2536() {
		this.aClass10_13.method258(5);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method2537() {
		this.aClass10_13.method263();
	}
}
