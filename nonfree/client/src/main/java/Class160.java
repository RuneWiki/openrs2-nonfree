import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class160 {

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!kh;")
	private final Class134 aClass134_38 = new Class134(256);

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!ga;")
	private final Interface4 anInterface4_10;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_26;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!kd;Lclient!ga;)V")
	public Class160(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_10 = arg1;
		this.aClass39_Sub2_26 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public void method3741() {
		this.aClass134_38.method3272();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!fo;")
	public Class3_Sub2 method3742(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass134_38.method3266((long) arg0);
		if (local10 != null) {
			return (Class3_Sub2) local10;
		} else if (this.anInterface4_10.method2454(arg0)) {
			@Pc(37) Class183 local37 = this.anInterface4_10.method2450(arg0);
			@Pc(46) int local46 = local37.aBoolean331 ? 64 : this.aClass39_Sub2_26.anInt3773;
			@Pc(81) Class3_Sub2 local81;
			if (local37.aBoolean334 && this.aClass39_Sub2_26.method4547()) {
				@Pc(63) float[] local63 = this.anInterface4_10.method2453(arg0, 0.7F, local46, local46);
				local81 = new Class3_Sub2(this.aClass39_Sub2_26, 3553, 34842, local46, local46, local37.aByte77 != 0, local63, 6408);
			} else {
				@Pc(102) short local102;
				@Pc(100) int[] local100;
				if (local37.aBoolean337 && Static375.method5101(local37.aByte76)) {
					local100 = this.anInterface4_10.method2451(local46, local46, arg0, 0.7F, false);
					local102 = 6407;
				} else {
					local100 = this.anInterface4_10.method2452(arg0, local46, local46, 0.7F);
					local102 = 6408;
				}
				local81 = new Class3_Sub2(this.aClass39_Sub2_26, 3553, local102, local46, local46, local37.aByte77 != 0, local100, false);
			}
			local81.method4163(local37.aBoolean335, local37.aBoolean333);
			this.aClass134_38.method3263((long) arg0, local81);
			return local81;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method3745() {
		this.aClass134_38.method3270(5);
	}
}
