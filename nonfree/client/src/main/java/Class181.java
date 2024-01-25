import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class181 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!tl;")
	private final Class227 aClass227_34 = new Class227(256);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!cp;")
	private final Interface2 anInterface2_5;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_34;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!nm;Lclient!cp;)V")
	public Class181(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_5 = arg1;
		this.aClass164_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lclient!hi;")
	public Class15_Sub2 method4059(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass227_34.method4863((long) arg0);
		if (local6 != null) {
			return (Class15_Sub2) local6;
		} else if (this.anInterface2_5.method4740(arg0)) {
			@Pc(26) Class98 local26 = this.anInterface2_5.method4741(arg0);
			@Pc(33) int local33 = local26.aBoolean193 ? 64 : 128;
			@Pc(80) Class15_Sub2 local80;
			if (local26.aBoolean195 && this.aClass164_Sub1_34.method5317()) {
				@Pc(91) float[] local91 = this.anInterface2_5.method4744(arg0, 0.7F, local33, local33);
				local80 = new Class15_Sub2(this.aClass164_Sub1_34, 3553, 34842, local33, local33, local26.aByte28 != 0, local91, 6408);
			} else {
				@Pc(59) int[] local59 = this.anInterface2_5.method4743(0.7F, local33, local33, arg0);
				local80 = new Class15_Sub2(this.aClass164_Sub1_34, 3553, 6408, local33, local33, local26.aByte28 != 0, local59, false);
			}
			local80.method5042(local26.aBoolean197, local26.aBoolean198);
			this.aClass227_34.method4865(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public void method4060() {
		this.aClass227_34.method4871();
	}
}
