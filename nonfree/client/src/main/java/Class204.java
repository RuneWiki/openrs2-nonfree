import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class204 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!nj;")
	private final Class171 aClass171_46 = new Class171(256);

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!ga;")
	private final Interface4 anInterface4_7;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_34;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ef;Lclient!ga;)V")
	public Class204(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_7 = arg1;
		this.aClass49_Sub2_34 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public void method4530() {
		this.aClass171_46.method3936();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lclient!ml;")
	public Class55_Sub3 method4531(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass171_46.method3941((long) arg0);
		if (local12 != null) {
			return (Class55_Sub3) local12;
		} else if (this.anInterface4_7.method3792(arg0)) {
			@Pc(33) Class140 local33 = this.anInterface4_7.method3794(arg0);
			@Pc(42) int local42 = local33.aBoolean286 ? 64 : this.aClass49_Sub2_34.anInt1995;
			@Pc(77) Class55_Sub3 local77;
			if (local33.aBoolean288 && this.aClass49_Sub2_34.method4431()) {
				@Pc(59) float[] local59 = this.anInterface4_7.method3793(0.7F, local42, arg0, local42);
				local77 = new Class55_Sub3(this.aClass49_Sub2_34, 3553, 34842, local42, local42, local33.aByte64 != 0, local59, 6408);
			} else {
				@Pc(89) short local89;
				@Pc(99) int[] local99;
				if (local33.aBoolean290 && Static343.method4716(local33.aByte62)) {
					local99 = this.anInterface4_7.method3790(local42, arg0, 0.7F, false, local42);
					local89 = 6407;
				} else {
					local89 = 6408;
					local99 = this.anInterface4_7.method3791(local42, arg0, 0.7F, local42);
				}
				local77 = new Class55_Sub3(this.aClass49_Sub2_34, 3553, local89, local42, local42, local33.aByte64 != 0, local99, false);
			}
			local77.method5116(local33.aBoolean294, local33.aBoolean291);
			this.aClass171_46.method3940((long) arg0, local77);
			return local77;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public void method4532() {
		this.aClass171_46.method3933(5);
	}
}
