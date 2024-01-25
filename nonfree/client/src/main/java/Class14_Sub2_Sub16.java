import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class14_Sub2_Sub16 extends Class14_Sub2 {

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "Lclient!fw;")
	private Class125 aClass125_38;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method7998(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7695(109);
			if (local3 == 0) {
				return;
			}
			this.method8002(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)I")
	public int method7999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass125_38 == null) {
			return arg0;
		} else {
			@Pc(17) Class14_Sub30 local17 = (Class14_Sub30) this.aClass125_38.method2630((long) arg1);
			return local17 == null ? arg0 : local17.anInt6793;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLclient!jc;)V")
	private void method8002(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(11) int local11 = arg1.method7695(96);
		@Pc(18) int local18;
		if (this.aClass125_38 == null) {
			local18 = Static255.method4294(local11);
			this.aClass125_38 = new Class125(local18);
		}
		for (local18 = 0; local18 < local11; local18++) {
			@Pc(37) boolean local37 = arg1.method7695(104) == 1;
			@Pc(41) int local41 = arg1.method7719();
			@Pc(50) Class14 local50;
			if (local37) {
				local50 = new Class14_Sub45(arg1.method7703(0));
			} else {
				local50 = new Class14_Sub30(arg1.method7748());
			}
			this.aClass125_38.method2626(local50, (long) local41);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method8004(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass125_38 == null) {
			return arg0;
		} else {
			@Pc(24) Class14_Sub45 local24 = (Class14_Sub45) this.aClass125_38.method2630((long) arg1);
			return local24 == null ? arg0 : local24.aString109;
		}
	}
}
