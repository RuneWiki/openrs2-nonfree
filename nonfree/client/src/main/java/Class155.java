import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class155 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!af;")
	private final Class10 aClass10_19 = new Class10(256);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!d;")
	private final Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_20;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!pq;Lclient!d;)V")
	public Class155(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Interface6 arg1) {
		this.anInterface6_4 = arg1;
		this.aClass132_Sub3_20 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lclient!rq;")
	public Class53_Sub2 method3591(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass10_19.method373((long) arg0);
		if (local12 != null) {
			return (Class53_Sub2) local12;
		} else if (this.anInterface6_4.method7090(arg0)) {
			@Pc(36) Class294 local36 = this.anInterface6_4.method7088(arg0);
			@Pc(45) int local45 = local36.aBoolean574 ? 64 : this.aClass132_Sub3_20.anInt7877;
			@Pc(106) Class53_Sub2 local106;
			if (local36.aBoolean568 && this.aClass132_Sub3_20.method7466()) {
				@Pc(118) float[] local118 = this.anInterface6_4.method7086(0.7F, local45, local45, arg0);
				local106 = new Class53_Sub2(this.aClass132_Sub3_20, 3553, 34842, local45, local45, local36.aByte119 != 0, local118, 6408);
			} else {
				@Pc(71) int[] local71;
				if (local36.anInt8333 != 2 && Static588.method8145(local36.aByte120)) {
					local71 = this.anInterface6_4.method7085(local45, true, arg0, 0.7F, local45);
				} else {
					local71 = this.anInterface6_4.method7089(arg0, 0.7F, local45, local45);
				}
				local106 = new Class53_Sub2(this.aClass132_Sub3_20, 3553, 6408, local45, local45, local36.aByte119 != 0, local71, 0, 0, false);
			}
			local106.method3730(local36.aBoolean570, local36.aBoolean569);
			this.aClass10_19.method366(local106, (long) arg0);
			return local106;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method3593() {
		this.aClass10_19.method375();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public void method3594() {
		this.aClass10_19.method369(5);
	}
}
