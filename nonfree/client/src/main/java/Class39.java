import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class39 {

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "Lclient!h;")
	private final Class125 aClass125_4 = new Class125(256);

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_4;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!n;")
	private final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!wr;Lclient!n;)V")
	public Class39(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass42_Sub1_4 = arg0;
		this.anInterface11_3 = arg1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public void method861() {
		this.aClass125_4.method3447(5);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Lclient!wn;")
	public Interface20 method862(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass125_4.method3446((long) arg0);
		if (local10 != null) {
			return (Interface20) local10;
		} else if (this.anInterface11_3.method6213(arg0)) {
			@Pc(36) Class278 local36 = this.anInterface11_3.method6215(arg0);
			@Pc(45) int local45 = local36.aBoolean567 ? 64 : this.aClass42_Sub1_4.anInt7113;
			@Pc(80) Interface20 local80;
			if (local36.aBoolean575 && this.aClass42_Sub1_4.method5836()) {
				@Pc(62) float[] local62 = this.anInterface11_3.method6212(arg0, local45, local45, 0.7F);
				local80 = this.aClass42_Sub1_4.method5953(Static306.aClass72_5, local45, local62, local45, local36.aByte86 != 0);
			} else {
				@Pc(105) int[] local105 = local36.aBoolean569 ? this.anInterface11_3.method6210(0.7F, local45, arg0, local45) : this.anInterface11_3.method6211(true, arg0, local45, local45, 0.7F);
				local80 = this.aClass42_Sub1_4.method5960(local45, local105, local45, local36.aByte86 != 0);
			}
			local80.method6988(local36.aBoolean570, local36.aBoolean574);
			this.aClass125_4.method3437(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
	public void method866() {
		this.aClass125_4.method3440();
	}
}
