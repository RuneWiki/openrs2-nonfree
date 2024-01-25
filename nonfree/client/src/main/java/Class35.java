import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class35 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Lclient!ad;")
	private final Class5 aClass5_8 = new Class5(256);

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!m;")
	private final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_3;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!gk;Lclient!m;)V")
	public Class35(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_1 = arg1;
		this.aClass75_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method1063() {
		this.aClass5_8.method116();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lclient!sr;")
	public Class42_Sub1 method1065(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass5_8.method104((long) arg0);
		if (local10 != null) {
			return (Class42_Sub1) local10;
		} else if (this.anInterface7_1.method2132(arg0)) {
			@Pc(29) Class62 local29 = this.anInterface7_1.method2131(arg0);
			@Pc(46) int local46 = local29.aBoolean142 ? 64 : this.aClass75_Sub2_3.anInt3076;
			@Pc(104) Class42_Sub1 local104;
			if (local29.aBoolean146 && this.aClass75_Sub2_3.method2609()) {
				@Pc(115) float[] local115 = this.anInterface7_1.method2130(0.7F, local46, local46, arg0);
				local104 = new Class42_Sub1(this.aClass75_Sub2_3, 3553, 34842, local46, local46, local29.aByte25 != 0, local115, 6408);
			} else {
				@Pc(73) short local73;
				@Pc(71) int[] local71;
				if (local29.aBoolean148 && Static86.method1485(local29.aByte28)) {
					local73 = 6407;
					local71 = this.anInterface7_1.method2129(0.7F, local46, local46, false, arg0);
				} else {
					local71 = this.anInterface7_1.method2128(local46, 0.7F, arg0, local46);
					local73 = 6408;
				}
				local104 = new Class42_Sub1(this.aClass75_Sub2_3, 3553, local73, local46, local46, local29.aByte25 != 0, local71, false);
			}
			local104.method1269(local29.aBoolean149, local29.aBoolean145);
			this.aClass5_8.method114((long) arg0, local104);
			return local104;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public void method1066() {
		this.aClass5_8.method106(5);
	}
}
