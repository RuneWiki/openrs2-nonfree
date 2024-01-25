import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class128 {

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "Lclient!gw;")
	private final Class136 aClass136_25 = new Class136(256);

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_21;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!d;")
	private final Interface5 anInterface5_5;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!dw;Lclient!d;)V")
	public Class128(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass82_Sub1_21 = arg0;
		this.anInterface5_5 = arg1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public void method2983() {
		this.aClass136_25.method3142();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Lclient!fba;")
	public Class94_Sub2 method2984(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass136_25.method3134((long) arg0);
		if (local12 != null) {
			return (Class94_Sub2) local12;
		} else if (this.anInterface5_5.method4130(arg0)) {
			@Pc(37) Class355 local37 = this.anInterface5_5.method4129(arg0);
			@Pc(46) int local46 = local37.aBoolean741 ? 64 : this.aClass82_Sub1_21.anInt2460;
			@Pc(109) Class94_Sub2 local109;
			if (local37.aBoolean746 && this.aClass82_Sub1_21.method6103()) {
				@Pc(121) float[] local121 = this.anInterface5_5.method4132(0.7F, arg0, local46, local46);
				local109 = new Class94_Sub2(this.aClass82_Sub1_21, 3553, 34842, local46, local46, local37.aByte123 != 0, local121, 6408);
			} else {
				@Pc(74) int[] local74;
				if (local37.anInt9790 != 2 && Static28.method383(local37.aByte119)) {
					local74 = this.anInterface5_5.method4127(arg0, 0.7F, local46, local46, true);
				} else {
					local74 = this.anInterface5_5.method4131(local46, local46, arg0, 0.7F);
				}
				local109 = new Class94_Sub2(this.aClass82_Sub1_21, 3553, 6408, local46, local46, local37.aByte123 != 0, local74, 0, 0, false);
			}
			local109.method3120(local37.aBoolean747, local37.aBoolean744);
			this.aClass136_25.method3135(local109, (long) arg0);
			return local109;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method2985() {
		this.aClass136_25.method3132(5);
	}
}
