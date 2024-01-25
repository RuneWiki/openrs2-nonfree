import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class97 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!rl;")
	private final Class317 aClass317_15 = new Class317(256);

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_5;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!he;Lclient!d;)V")
	public Class97(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_1 = arg1;
		this.aClass144_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void method2027() {
		this.aClass317_15.method7873();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lclient!gka;")
	public Interface9 method2029(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass317_15.method7882((long) arg0);
		if (local12 != null) {
			return (Interface9) local12;
		} else if (this.anInterface4_1.method8974(arg0)) {
			@Pc(33) Class69 local33 = this.anInterface4_1.method8975(arg0);
			@Pc(43) int local43 = local33.aBoolean113 ? 64 : this.aClass144_Sub1_5.anInt6512;
			@Pc(105) Interface9 local105;
			if (local33.aBoolean115 && this.aClass144_Sub1_5.method6898()) {
				@Pc(117) float[] local117 = this.anInterface4_1.method8978(0.7F, local43, local43, arg0);
				local105 = this.aClass144_Sub1_5.method5646(local43, local43, Static641.aClass260_12, local117, local33.aByte21 != 0);
			} else {
				@Pc(75) int[] local75;
				if (local33.anInt1679 != 2 && Static319.method5045(local33.aByte19)) {
					local75 = this.anInterface4_1.method8977(0.7F, arg0, local43, local43, true);
				} else {
					local75 = this.anInterface4_1.method8979(local43, 0.7F, arg0, local43);
				}
				local105 = this.aClass144_Sub1_5.method5687(local43, local33.aByte21 != 0, local43, local75);
			}
			local105.method4773(local33.aBoolean117, local33.aBoolean112);
			this.aClass317_15.method7875((long) arg0, local105);
			return local105;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public void method2030() {
		this.aClass317_15.method7870(5);
	}
}
