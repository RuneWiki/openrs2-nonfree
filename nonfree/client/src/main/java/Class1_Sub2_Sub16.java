import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qj", name = "W", descriptor = "Lclient!hd;")
	private Class50 aClass50_21;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!vf;)V")
	public void method2801(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2945();
			if (local17 == 0) {
				return;
			}
			this.method2804(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I")
	public int method2803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass50_21 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub5 local16 = (Class1_Sub5) this.aClass50_21.method1364((long) arg0);
			return local16 == null ? arg1 : local16.anInt782;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILclient!vf;)V")
	private void method2804(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(19) int local19 = arg1.method2945();
		@Pc(26) int local26;
		if (this.aClass50_21 == null) {
			local26 = Static156.method2529(local19);
			this.aClass50_21 = new Class50(local26);
		}
		for (local26 = 0; local26 < local19; local26++) {
			@Pc(47) boolean local47 = arg1.method2945() == 1;
			@Pc(51) int local51 = arg1.method2937();
			@Pc(60) Class1 local60;
			if (local47) {
				local60 = new Class1_Sub19(arg1.method2978());
			} else {
				local60 = new Class1_Sub5(arg1.method2958());
			}
			this.aClass50_21.method1362((long) local51, local60);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!sc;II)Lclient!sc;")
	public Class107 method2805(@OriginalArg(0) Class107 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass50_21 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub19 local21 = (Class1_Sub19) this.aClass50_21.method1364((long) arg1);
			return local21 == null ? arg0 : local21.aClass107_816;
		}
	}
}
