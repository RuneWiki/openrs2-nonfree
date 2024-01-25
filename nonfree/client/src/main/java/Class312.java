import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class312 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Lclient!tb;")
	private final Class313 aClass313_54 = new Class313(256);

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_38;

	@OriginalMember(owner = "client!taa", name = "m", descriptor = "Lclient!fa;")
	private final Interface5 anInterface5_12;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!qj;Lclient!fa;)V")
	public Class312(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass100_Sub3_38 = arg0;
		this.anInterface5_12 = arg1;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public void method6971() {
		this.aClass313_54.method6982(5);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	public void method6972() {
		this.aClass313_54.method6977();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Lclient!pm;")
	public Class23_Sub1 method6974(@OriginalArg(0) int arg0) {
		@Pc(18) Object local18 = this.aClass313_54.method6989((long) arg0);
		if (local18 != null) {
			return (Class23_Sub1) local18;
		} else if (this.anInterface5_12.method914(arg0)) {
			@Pc(37) Class343 local37 = this.anInterface5_12.method917(arg0);
			@Pc(46) int local46 = local37.aBoolean700 ? 64 : this.aClass100_Sub3_38.anInt7655;
			@Pc(86) Class23_Sub1 local86;
			if (local37.aBoolean703 && this.aClass100_Sub3_38.method6248()) {
				@Pc(65) float[] local65 = this.anInterface5_12.method913(local46, 0.7F, local46, arg0);
				local86 = new Class23_Sub1(this.aClass100_Sub3_38, 3553, 34842, local46, local46, local37.aByte116 != 0, local65, 6408);
			} else {
				@Pc(106) int[] local106;
				if (!local37.aBoolean702 && Static242.method3760(local37.aByte117)) {
					local106 = this.anInterface5_12.method916(arg0, 0.7F, true, local46, local46);
				} else {
					local106 = this.anInterface5_12.method915(0.7F, local46, local46, arg0);
				}
				local86 = new Class23_Sub1(this.aClass100_Sub3_38, 3553, 6408, local46, local46, local37.aByte116 != 0, local106, false);
			}
			local86.method377(local37.aBoolean701, local37.aBoolean699);
			this.aClass313_54.method6980((long) arg0, local86);
			return local86;
		} else {
			return null;
		}
	}
}
