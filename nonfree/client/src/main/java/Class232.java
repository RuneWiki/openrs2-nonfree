import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class232 {

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!wf;")
	private final Class316 aClass316_50 = new Class316(256);

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!n;")
	private final Interface8 anInterface8_9;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_13;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!cb;Lclient!n;)V")
	public Class232(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_9 = arg1;
		this.aClass9_Sub1_13 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	public void method5718() {
		this.aClass316_50.method7791(5);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Lclient!jb;")
	public Interface5 method5721(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass316_50.method7799((long) arg0);
		if (local10 != null) {
			return (Interface5) local10;
		} else if (this.anInterface8_9.method7084(arg0)) {
			@Pc(29) Class175 local29 = this.anInterface8_9.method7085(arg0);
			@Pc(38) int local38 = local29.aBoolean354 ? 64 : this.aClass9_Sub1_13.anInt9227;
			@Pc(82) Interface5 local82;
			if (local29.aBoolean352 && this.aClass9_Sub1_13.method7591()) {
				@Pc(94) float[] local94 = this.anInterface8_9.method7083(arg0, 0.7F, local38, local38);
				local82 = this.aClass9_Sub1_13.method7765(local38, Static72.aClass16_3, local94, local38, local29.aByte55 != 0);
			} else {
				@Pc(68) int[] local68 = local29.aBoolean353 ? this.anInterface8_9.method7086(local38, local38, arg0, 0.7F) : this.anInterface8_9.method7088(local38, true, local38, 0.7F, arg0);
				local82 = this.aClass9_Sub1_13.method7711(local38, local68, local29.aByte55 != 0, local38);
			}
			local82.method7967(local29.aBoolean358, local29.aBoolean357);
			this.aClass316_50.method7792((long) arg0, local82);
			return local82;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public void method5722() {
		this.aClass316_50.method7794();
	}
}
