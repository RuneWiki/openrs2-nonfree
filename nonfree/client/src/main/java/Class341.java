import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class341 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!pa;")
	private final Class265 aClass265_61 = new Class265(256);

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_12;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_38;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!kv;Lclient!d;)V")
	public Class341(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_12 = arg1;
		this.aClass143_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public void method7845() {
		this.aClass265_61.method6568();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	public void method7846() {
		this.aClass265_61.method6570(5);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Lclient!ho;")
	public Class44_Sub1 method7847(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass265_61.method6577((long) arg0);
		if (local10 != null) {
			return (Class44_Sub1) local10;
		} else if (this.anInterface3_12.method8500(arg0)) {
			@Pc(35) Class331 local35 = this.anInterface3_12.method8501(arg0);
			@Pc(44) int local44 = local35.aBoolean659 ? 64 : this.aClass143_Sub2_38.anInt5817;
			@Pc(103) Class44_Sub1 local103;
			if (local35.aBoolean661 && this.aClass143_Sub2_38.method6224()) {
				@Pc(114) float[] local114 = this.anInterface3_12.method8498(arg0, 0.7F, local44, local44);
				local103 = new Class44_Sub1(this.aClass143_Sub2_38, 3553, 34842, local44, local44, local35.aByte119 != 0, local114, 6408);
			} else {
				@Pc(72) int[] local72;
				if (local35.anInt9140 != 2 && Static670.method8733(local35.aByte117)) {
					local72 = this.anInterface3_12.method8499(arg0, local44, true, 0.7F, local44);
				} else {
					local72 = this.anInterface3_12.method8497(arg0, local44, 0.7F, local44);
				}
				local103 = new Class44_Sub1(this.aClass143_Sub2_38, 3553, 6408, local44, local44, local35.aByte119 != 0, local72, 0, 0, false);
			}
			local103.method794(local35.aBoolean663, local35.aBoolean662);
			this.aClass265_61.method6566(local103, (long) arg0);
			return local103;
		} else {
			return null;
		}
	}
}
