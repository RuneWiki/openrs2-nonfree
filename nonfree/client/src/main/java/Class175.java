import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class175 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!of;")
	private final Class236 aClass236_53 = new Class236(256);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_8;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_12;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!ln;Lclient!d;)V")
	public Class175(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_8 = arg1;
		this.aClass16_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!oq;")
	public Interface20 method4717(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass236_53.method6242((long) arg0);
		if (local12 != null) {
			return (Interface20) local12;
		} else if (this.anInterface2_8.method4025(arg0)) {
			@Pc(38) Class218 local38 = this.anInterface2_8.method4027(arg0);
			@Pc(47) int local47 = local38.aBoolean476 ? 64 : this.aClass16_Sub1_12.anInt4921;
			@Pc(106) Interface20 local106;
			if (local38.aBoolean477 && this.aClass16_Sub1_12.method6079()) {
				@Pc(118) float[] local118 = this.anInterface2_8.method4029(arg0, local47, local47, 0.7F);
				local106 = this.aClass16_Sub1_12.method3886(local38.aByte65 != 0, local47, Static456.aClass366_9, local118, local47);
			} else {
				@Pc(75) int[] local75;
				if (local38.anInt6842 != 2 && Static634.method7625(local38.aByte66)) {
					local75 = this.anInterface2_8.method4026(true, local47, arg0, 0.7F, local47);
				} else {
					local75 = this.anInterface2_8.method4028(0.7F, local47, arg0, local47);
				}
				local106 = this.aClass16_Sub1_12.method3948(local75, local47, local47, local38.aByte65 != 0);
			}
			local106.method6623(local38.aBoolean472, local38.aBoolean478);
			this.aClass236_53.method6241((long) arg0, local106);
			return local106;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method4718() {
		this.aClass236_53.method6243(5);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public void method4719() {
		this.aClass236_53.method6253();
	}
}
