import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class100 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!co;")
	private final Class41 aClass41_35 = new Class41(256);

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_12;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!eg;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ic;Lclient!eg;)V")
	public Class100(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass48_Sub2_12 = arg0;
		this.anInterface3_3 = arg1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lclient!tr;")
	public Class81_Sub2 method2378(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass41_35.method823((long) arg0);
		if (local6 != null) {
			return (Class81_Sub2) local6;
		} else if (this.anInterface3_3.method1277(arg0)) {
			@Pc(31) Class166 local31 = this.anInterface3_3.method1278(arg0);
			@Pc(38) int local38 = local31.aBoolean346 ? 64 : 128;
			@Pc(75) Class81_Sub2 local75;
			if (local31.aBoolean340 && this.aClass48_Sub2_12.method2542()) {
				@Pc(86) float[] local86 = this.anInterface3_3.method1280(arg0, local38, 0.7F, local38);
				local75 = new Class81_Sub2(this.aClass48_Sub2_12, 3553, 34842, local38, local38, local31.aByte38 != 0, local86, 6408);
			} else {
				@Pc(55) int[] local55 = this.anInterface3_3.method1281(arg0, 0.7F, local38, local38);
				local75 = new Class81_Sub2(this.aClass48_Sub2_12, 3553, 6408, local38, local38, local31.aByte38 != 0, local55, false);
			}
			local75.method3640(local31.aBoolean344, local31.aBoolean338);
			this.aClass41_35.method832((long) arg0, local75);
			return local75;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public void method2379() {
		this.aClass41_35.method825();
	}
}
