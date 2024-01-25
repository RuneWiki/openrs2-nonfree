import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class111 {

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Lclient!rl;")
	private final Class317 aClass317_18 = new Class317(256);

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_8;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_2;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!pi;Lclient!d;)V")
	public Class111(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass144_Sub3_8 = arg0;
		this.anInterface4_2 = arg1;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)V")
	public void method2233() {
		this.aClass317_18.method7873();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
	public void method2234() {
		this.aClass317_18.method7870(5);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)Lclient!sb;")
	public Class161_Sub1 method2236(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass317_18.method7882((long) arg0);
		if (local10 != null) {
			return (Class161_Sub1) local10;
		} else if (this.anInterface4_2.method8974(arg0)) {
			@Pc(33) Class69 local33 = this.anInterface4_2.method8975(arg0);
			@Pc(43) int local43 = local33.aBoolean113 ? 64 : this.aClass144_Sub3_8.anInt8050;
			@Pc(107) Class161_Sub1 local107;
			if (local33.aBoolean115 && this.aClass144_Sub3_8.method6898()) {
				@Pc(118) float[] local118 = this.anInterface4_2.method8978(0.7F, local43, local43, arg0);
				local107 = new Class161_Sub1(this.aClass144_Sub3_8, 3553, 34842, local43, local43, local33.aByte21 != 0, local118, 6408);
			} else {
				@Pc(75) int[] local75;
				if (local33.anInt1679 != 2 && Static319.method5045(local33.aByte19)) {
					local75 = this.anInterface4_2.method8977(0.7F, arg0, local43, local43, true);
				} else {
					local75 = this.anInterface4_2.method8979(local43, 0.7F, arg0, local43);
				}
				local107 = new Class161_Sub1(this.aClass144_Sub3_8, 3553, 6408, local43, local43, local33.aByte21 != 0, local75, 0, 0, false);
			}
			local107.method3971(local33.aBoolean117, local33.aBoolean112);
			this.aClass317_18.method7875((long) arg0, local107);
			return local107;
		} else {
			return null;
		}
	}
}
