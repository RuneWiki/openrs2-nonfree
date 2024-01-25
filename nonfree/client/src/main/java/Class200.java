import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class200 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!wm;")
	private final Class267 aClass267_54 = new Class267(256);

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_31;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!l;")
	private final Interface7 anInterface7_5;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!da;Lclient!l;)V")
	public Class200(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass50_Sub1_31 = arg0;
		this.anInterface7_5 = arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lclient!sq;")
	public Class4_Sub1 method4456(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass267_54.method6014((long) arg0);
		if (local12 != null) {
			return (Class4_Sub1) local12;
		} else if (this.anInterface7_5.method4450(arg0)) {
			@Pc(39) Class259 local39 = this.anInterface7_5.method4447(arg0);
			@Pc(48) int local48 = local39.aBoolean474 ? 64 : this.aClass50_Sub1_31.anInt1398;
			@Pc(110) Class4_Sub1 local110;
			if (local39.aBoolean472 && this.aClass50_Sub1_31.method5882()) {
				@Pc(122) float[] local122 = this.anInterface7_5.method4449(0.7F, arg0, local48, local48);
				local110 = new Class4_Sub1(this.aClass50_Sub1_31, 3553, 34842, local48, local48, local39.aByte103 != 0, local122, 6408);
			} else {
				@Pc(65) short local65;
				@Pc(75) int[] local75;
				if (local39.aBoolean475 && Static81.method1530(local39.aByte100)) {
					local75 = this.anInterface7_5.method4448(false, local48, 0.7F, arg0, local48);
					local65 = 6407;
				} else {
					local65 = 6408;
					local75 = this.anInterface7_5.method4451(local48, arg0, 0.7F, local48);
				}
				local110 = new Class4_Sub1(this.aClass50_Sub1_31, 3553, local65, local48, local48, local39.aByte103 != 0, local75, false);
			}
			local110.method154(local39.aBoolean477, local39.aBoolean480);
			this.aClass267_54.method6008(local110, (long) arg0);
			return local110;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public void method4457() {
		this.aClass267_54.method6007(5);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method4461() {
		this.aClass267_54.method6011();
	}
}
