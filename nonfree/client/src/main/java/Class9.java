import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class9 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!wg;")
	private final Class313 aClass313_1 = new Class313(256);

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_1;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!n;")
	private final Interface8 anInterface8_4;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!re;Lclient!n;)V")
	public Class9(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Interface8 arg1) {
		this.aClass122_Sub2_1 = arg0;
		this.anInterface8_4 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lclient!gq;")
	public Interface3 method385(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass313_1.method7406((long) arg0);
		if (local10 != null) {
			return (Interface3) local10;
		} else if (this.anInterface8_4.method879(arg0)) {
			@Pc(29) Class220 local29 = this.anInterface8_4.method878(arg0);
			@Pc(38) int local38 = local29.aBoolean451 ? 64 : this.aClass122_Sub2_1.anInt6729;
			@Pc(87) Interface3 local87;
			if (local29.aBoolean454 && this.aClass122_Sub2_1.method7215()) {
				@Pc(99) float[] local99 = this.anInterface8_4.method877(local38, arg0, local38, 0.7F);
				local87 = this.aClass122_Sub2_1.method5567(local38, local99, local29.aByte83 != 0, Static542.aClass292_17, local38);
			} else {
				@Pc(73) int[] local73 = local29.aBoolean445 ? this.anInterface8_4.method880(local38, arg0, local38, 0.7F) : this.anInterface8_4.method876(arg0, true, local38, 0.7F, local38);
				local87 = this.aClass122_Sub2_1.method5661(local38, local29.aByte83 != 0, local38, local73);
			}
			local87.method7318(local29.aBoolean447, local29.aBoolean453);
			this.aClass313_1.method7399((long) arg0, local87);
			return local87;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public void method387() {
		this.aClass313_1.method7403(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public void method388() {
		this.aClass313_1.method7398();
	}
}
