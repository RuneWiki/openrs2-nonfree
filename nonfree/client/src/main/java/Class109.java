import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class109 {

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "Lclient!gw;")
	private final Class136 aClass136_21 = new Class136(256);

	@OriginalMember(owner = "client!fja", name = "f", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_8;

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "Lclient!d;")
	private final Interface5 anInterface5_4;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!rl;Lclient!d;)V")
	public Class109(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass82_Sub3_8 = arg0;
		this.anInterface5_4 = arg1;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(B)V")
	public void method2755() {
		this.aClass136_21.method3142();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)V")
	public void method2756() {
		this.aClass136_21.method3132(5);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(II)Lclient!dg;")
	public Interface6 method2757(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass136_21.method3134((long) arg0);
		if (local12 != null) {
			return (Interface6) local12;
		} else if (this.anInterface5_4.method4130(arg0)) {
			@Pc(36) Class355 local36 = this.anInterface5_4.method4129(arg0);
			@Pc(45) int local45 = local36.aBoolean741 ? 64 : this.aClass82_Sub3_8.bf;
			@Pc(101) Interface6 local101;
			if (local36.aBoolean746 && this.aClass82_Sub3_8.method6103()) {
				@Pc(115) float[] local115 = this.anInterface5_4.method4132(0.7F, arg0, local45, local45);
				local101 = this.aClass82_Sub3_8.method4913(Static95.aClass168_2, local115, local45, local36.aByte123 != 0, local45);
			} else {
				@Pc(75) int[] local75;
				if (local36.anInt9790 != 2 && Static28.method383(local36.aByte119)) {
					local75 = this.anInterface5_4.method4127(arg0, 0.7F, local45, local45, true);
				} else {
					local75 = this.anInterface5_4.method4131(local45, local45, arg0, 0.7F);
				}
				local101 = this.aClass82_Sub3_8.method5022(local75, local45, local36.aByte123 != 0, local45);
			}
			local101.method8506(local36.aBoolean747, local36.aBoolean744);
			this.aClass136_21.method3135(local101, (long) arg0);
			return local101;
		} else {
			return null;
		}
	}
}
