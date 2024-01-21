import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RXQASTJV")
public final class Class33 {

	@OriginalMember(owner = "client!RXQASTJV", name = "a", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!RXQASTJV", name = "b", descriptor = "[Lclient!DJXGSHIT;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!RXQASTJV", name = "<init>", descriptor = "(II)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt598 = arg0;
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				@Pc(26) Class1 local26 = this.aClass1Array1[local16] = new Class1();
				local26.aClass1_41 = local26;
				local26.aClass1_42 = local26;
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("30069, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RXQASTJV", name = "a", descriptor = "(J)Lclient!DJXGSHIT;")
	public Class1 method484(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt598 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong25 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!RXQASTJV", name = "a", descriptor = "(ILclient!DJXGSHIT;J)V")
	public void method485(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method544();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt598 - 1))];
			arg0.aClass1_42 = local18.aClass1_42;
			arg0.aClass1_41 = local18;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
			arg0.aLong25 = arg1;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("78573, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}
}
