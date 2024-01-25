import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class138 {

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lclient!pja;")
	private final Class279 aClass279_17 = new Class279(256);

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "Lclient!d;")
	private final Interface5 anInterface5_6;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_16;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!hk;Lclient!d;)V")
	public Class138(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Interface5 arg1) {
		this.anInterface5_6 = arg1;
		this.aClass16_Sub2_16 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	public void method3001() {
		this.aClass279_17.method6630(5);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	public void method3002() {
		this.aClass279_17.method6638();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)Lclient!kf;")
	public Class39_Sub4 method3004(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass279_17.method6631((long) arg0);
		if (local12 != null) {
			return (Class39_Sub4) local12;
		} else if (this.anInterface5_6.method5197(arg0)) {
			@Pc(37) Class342 local37 = this.anInterface5_6.method5193(arg0);
			@Pc(46) int local46 = local37.aBoolean695 ? 64 : this.aClass16_Sub2_16.anInt4362;
			@Pc(109) Class39_Sub4 local109;
			if (local37.aBoolean689 && this.aClass16_Sub2_16.method8186()) {
				@Pc(121) float[] local121 = this.anInterface5_6.method5196(arg0, local46, 0.7F, local46);
				local109 = new Class39_Sub4(this.aClass16_Sub2_16, 3553, 34842, local46, local46, local37.aByte125 != 0, local121, 6408);
			} else {
				@Pc(74) int[] local74;
				if (local37.anInt9280 != 2 && Static402.method5742(local37.aByte129)) {
					local74 = this.anInterface5_6.method5192(0.7F, local46, true, arg0, local46);
				} else {
					local74 = this.anInterface5_6.method5195(local46, arg0, 0.7F, local46);
				}
				local109 = new Class39_Sub4(this.aClass16_Sub2_16, 3553, 6408, local46, local46, local37.aByte125 != 0, local74, 0, 0, false);
			}
			local109.method8469(local37.aBoolean692, local37.aBoolean696);
			this.aClass279_17.method6635(local109, (long) arg0);
			return local109;
		} else {
			return null;
		}
	}
}
