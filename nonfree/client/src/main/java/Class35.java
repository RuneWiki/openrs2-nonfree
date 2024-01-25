import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class35 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "Lclient!bt;")
	private final Class21 aClass21_48 = new Class21(256);

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!ic;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_11;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!ks;Lclient!ic;)V")
	public Class35(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_2 = arg1;
		this.aClass63_Sub1_11 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lclient!qb;")
	public Class19_Sub3 method1409(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass21_48.method854((long) arg0);
		if (local6 != null) {
			return (Class19_Sub3) local6;
		} else if (this.anInterface3_2.method5485(arg0)) {
			@Pc(26) Class178 local26 = this.anInterface3_2.method5486(arg0);
			@Pc(33) int local33 = local26.aBoolean395 ? 64 : 128;
			@Pc(73) Class19_Sub3 local73;
			if (local26.aBoolean397 && this.aClass63_Sub1_11.method4657()) {
				@Pc(84) float[] local84 = this.anInterface3_2.method5484(local33, arg0, 0.7F, local33);
				local73 = new Class19_Sub3(this.aClass63_Sub1_11, 3553, 34842, local33, local33, local26.aByte53 != 0, local84, 6408);
			} else {
				@Pc(50) int[] local50 = this.anInterface3_2.method5488(arg0, local33, local33, 0.7F);
				local73 = new Class19_Sub3(this.aClass63_Sub1_11, 3553, 6408, local33, local33, local26.aByte53 != 0, local50, false);
			}
			local73.method3681(local26.aBoolean394, local26.aBoolean392);
			this.aClass21_48.method843(local73, (long) arg0);
			return local73;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public void method1410() {
		this.aClass21_48.method857();
	}
}
