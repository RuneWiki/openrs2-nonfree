import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class41 {

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "Lclient!fba;")
	private final Class102 aClass102_5 = new Class102(256);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!d;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_5;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!kw;Lclient!d;)V")
	public Class41(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_4 = arg1;
		this.aClass5_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
	public void method1575() {
		this.aClass102_5.method2668(5);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	public void method1576() {
		this.aClass102_5.method2681();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lclient!ol;")
	public Class76_Sub3 method1577(@OriginalArg(1) int arg0) {
		@Pc(14) Object local14 = this.aClass102_5.method2677((long) arg0);
		if (local14 != null) {
			return (Class76_Sub3) local14;
		} else if (this.anInterface7_4.method8115(arg0)) {
			@Pc(33) Class195 local33 = this.anInterface7_4.method8118(arg0);
			@Pc(42) int local42 = local33.aBoolean364 ? 64 : this.aClass5_Sub2_5.anInt5643;
			@Pc(103) Class76_Sub3 local103;
			if (local33.aBoolean367 && this.aClass5_Sub2_5.method7516()) {
				@Pc(115) float[] local115 = this.anInterface7_4.method8114(arg0, 0.7F, local42, local42);
				local103 = new Class76_Sub3(this.aClass5_Sub2_5, 3553, 34842, local42, local42, local33.aByte78 != 0, local115, 6408);
			} else {
				@Pc(68) int[] local68;
				if (local33.anInt5424 != 2 && Static433.method6773(local33.aByte83)) {
					local68 = this.anInterface7_4.method8116(true, local42, arg0, local42, 0.7F);
				} else {
					local68 = this.anInterface7_4.method8117(local42, 0.7F, local42, arg0);
				}
				local103 = new Class76_Sub3(this.aClass5_Sub2_5, 3553, 6408, local42, local42, local33.aByte78 != 0, local68, 0, 0, false);
			}
			local103.method6412(local33.aBoolean366, local33.aBoolean363);
			this.aClass102_5.method2674((long) arg0, local103);
			return local103;
		} else {
			return null;
		}
	}
}
