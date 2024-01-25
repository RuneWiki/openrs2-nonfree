import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tw", name = "C", descriptor = "Lclient!si;")
	private Class335 aClass335_44;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!ol;)V")
	public void method8892(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5203();
			if (local5 == 0) {
				return;
			}
			this.method8893(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!ol;IB)V")
	private void method8893(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method5203();
		@Pc(19) int local19;
		if (this.aClass335_44 == null) {
			local19 = Static432.method7064(local12);
			this.aClass335_44 = new Class335(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(38) boolean local38 = arg0.method5203() == 1;
			@Pc(42) int local42 = arg0.method5161();
			@Pc(51) Class2 local51;
			if (local38) {
				local51 = new Class2_Sub19(arg0.method5178());
			} else {
				local51 = new Class2_Sub14(arg0.method5172());
			}
			this.aClass335_44.method8356(local51, (long) local42);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIZ)I")
	public int method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass335_44 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub14 local16 = (Class2_Sub14) this.aClass335_44.method8357((long) arg0);
			return local16 == null ? arg1 : local16.anInt1303;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
	public String method8896(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass335_44 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub19 local21 = (Class2_Sub19) this.aClass335_44.method8357((long) arg1);
			return local21 == null ? arg0 : local21.aString21;
		}
	}
}
