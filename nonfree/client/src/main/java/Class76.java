import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class76 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!iha;")
	private final Class168 aClass168_16 = new Class168(256);

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!d;")
	private final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_7;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!vf;Lclient!d;)V")
	public Class76(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_1 = arg1;
		this.aClass100_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public void method1400() {
		this.aClass168_16.method3852(5);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public void method1402() {
		this.aClass168_16.method3862();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Lclient!kia;")
	public Class29_Sub3 method1407(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass168_16.method3860((long) arg0);
		if (local12 != null) {
			return (Class29_Sub3) local12;
		} else if (this.anInterface7_1.method7421(arg0)) {
			@Pc(41) Class44 local41 = this.anInterface7_1.method7423(arg0);
			@Pc(51) int local51 = local41.aBoolean62 ? 64 : this.aClass100_Sub3_7.anInt10238;
			@Pc(89) Class29_Sub3 local89;
			if (local41.aBoolean57 && this.aClass100_Sub3_7.method8656()) {
				@Pc(70) float[] local70 = this.anInterface7_1.method7422(local51, arg0, 0.7F, local51);
				local89 = new Class29_Sub3(this.aClass100_Sub3_7, 3553, 34842, local51, local51, local41.aByte21 != 0, local70, 6408);
			} else {
				@Pc(116) int[] local116;
				if (local41.anInt809 != 2 && Static662.method9084(local41.aByte23)) {
					local116 = this.anInterface7_1.method7424(local51, true, local51, arg0, 0.7F);
				} else {
					local116 = this.anInterface7_1.method7419(arg0, 0.7F, local51, local51);
				}
				local89 = new Class29_Sub3(this.aClass100_Sub3_7, 3553, 6408, local51, local51, local41.aByte21 != 0, local116, 0, 0, false);
			}
			local89.method8174(local41.aBoolean60, local41.aBoolean63);
			this.aClass168_16.method3853((long) arg0, local89);
			return local89;
		} else {
			return null;
		}
	}
}
