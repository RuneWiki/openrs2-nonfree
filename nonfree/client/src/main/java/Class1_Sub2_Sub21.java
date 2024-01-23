import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "Lclient!cd;")
	private Class22 aClass22_22;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZILclient!jj;)V")
	private void method4319(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(18) int local18 = arg1.method3122();
		@Pc(26) int local26;
		if (this.aClass22_22 == null) {
			local26 = Static182.method2762(local18);
			this.aClass22_22 = new Class22(local26);
		}
		for (local26 = 0; local26 < local18; local26++) {
			@Pc(48) boolean local48 = arg1.method3122() == 1;
			@Pc(52) int local52 = arg1.method3109();
			@Pc(61) Class1 local61;
			if (local48) {
				local61 = new Class1_Sub27(arg1.method3101());
			} else {
				local61 = new Class1_Sub30(arg1.method3074());
			}
			this.aClass22_22.method643((long) local52, local61);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!jj;)V")
	public void method4320(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3122();
			if (local9 == 0) {
				return;
			}
			this.method4319(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)I")
	public int method4322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass22_22 == null) {
			return arg1;
		} else {
			@Pc(25) Class1_Sub30 local25 = (Class1_Sub30) this.aClass22_22.method633((long) arg0);
			return local25 == null ? arg1 : local25.anInt5344;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4326(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass22_22 == null) {
			return arg0;
		} else {
			@Pc(22) Class1_Sub27 local22 = (Class1_Sub27) this.aClass22_22.method633((long) arg1);
			return local22 == null ? arg0 : local22.aString162;
		}
	}
}
